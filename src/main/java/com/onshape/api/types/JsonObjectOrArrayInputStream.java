/*
 * The MIT License
 *
 * Copyright 2019 Onshape Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.onshape.api.types;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.stream.Stream;
import javax.validation.constraints.NotNull;

/**
 * InputStream that modifies a wrapped stream in the case where an array of JSON
 * is returned but is to be deserialized to an array field within an object.
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public class JsonObjectOrArrayInputStream extends InputStream {

    private final InputStream stream;

    public JsonObjectOrArrayInputStream(Class<?> serializationType, InputStream stream) throws IOException {
        // Create a pushback stream so we can check and pushback the first character
        PushbackInputStream pushbackStream = new PushbackInputStream(stream, 1);
        int first = pushbackStream.read();
        pushbackStream.unread(first);
        // Check the first character in the stream
        boolean streamIsArray = first == '[';
        // Check the type we are deserializing to
        boolean typeIsArray = serializationType.isArray();
        // Determine a possible array field to serialize to
        String singleNonOptionalArrayField = streamIsArray && !typeIsArray
                ? singleNonOptionalArrayField(serializationType)
                : null;
        // Stream is array but type isn't or vice versa
        if (streamIsArray && !(typeIsArray || singleNonOptionalArrayField != null)) {
            throw new IOException("Attempting to map array response to object type");
        }
        if (!streamIsArray && typeIsArray) {
            throw new IOException("Attempting to map object response to array type");
        }
        if (streamIsArray && singleNonOptionalArrayField != null) {
            // Stream modified to wrap array element
            this.stream = new SequenceInputStream(
                    new ByteArrayInputStream(("{\"" + singleNonOptionalArrayField + "\":").getBytes("UTF-8")),
                    new SequenceInputStream(
                            pushbackStream,
                            new ByteArrayInputStream(("}").getBytes("UTF-8"))));
        } else {
            // Stream should be returned as-is
            this.stream = pushbackStream;
        }
    }

    static String singleNonOptionalArrayField(Class<?> serializationType) {
        switch (serializationType.getDeclaredFields().length) {
            case 0:
                return null;
            case 1:
                // If there is only 1 field and it is an array return that
                if (serializationType.getDeclaredFields()[0].getType().isArray()) {
                    return serializationType.getDeclaredFields()[0].getName();
                }
                return null;
            default:
                // If there is only 1 required field and it is an array return that
                return Stream.of(serializationType.getDeclaredFields())
                        .filter(field -> field.getAnnotation(NotNull.class) != null)
                        .reduce((a, b) -> null)
                        .filter(field -> field.getType().isArray())
                        .map(field -> field.getName()).orElse(null);
        }
    }

    @Override
    public int read() throws IOException {
        return stream.read();
    }

    @Override
    public int read(byte[] b) throws IOException {
        return stream.read(b);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        return stream.read(b, off, len);
    }

    @Override
    public long skip(long n) throws IOException {
        return stream.skip(n);
    }

    @Override
    public int available() throws IOException {
        return stream.available();
    }

    @Override
    public void close() throws IOException {
        stream.close();
    }

    @Override
    public synchronized void mark(int readlimit) {
        stream.mark(readlimit);
    }

    @Override
    public synchronized void reset() throws IOException {
        stream.reset();
    }

    @Override
    public boolean markSupported() {
        return stream.markSupported();
    }

}
