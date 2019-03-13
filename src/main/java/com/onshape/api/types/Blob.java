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

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.onshape.api.types.Blob.BlobDeserializer;
import com.onshape.api.types.Blob.BlobSerializer;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Represents binary data as byte array.
 *
 * @author Peter Harman peter.harman@cae.tech
 */
@JsonSerialize(using = BlobSerializer.class)
@JsonDeserialize(using = BlobDeserializer.class)
public final class Blob extends AbstractBlob {

    private final byte[] data;

    public Blob(File file) throws IOException {
        this(fromFile(file));
    }

    public Blob(Path path) throws IOException {
        this(fromPath(path));
    }

    public Blob(InputStream is) throws IOException {
        this(fromInputStream(is));
    }

    public Blob(byte[] data) {
        this.data = data;
    }

    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public String toString() {
        return "byte[" + Integer.toString(data.length) + "]";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Arrays.hashCode(this.data);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Blob other = (Blob) obj;
        return Arrays.equals(this.data, other.data);
    }

    static class BlobSerializer extends JsonSerializer<Blob> {

        @Override
        public void serialize(Blob t, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
            jg.writeBinary(t.getData());
        }

    }

    static class BlobDeserializer extends JsonDeserializer<Blob> {

        @Override
        public Blob deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {
            return new Blob(jp.getBinaryValue());
        }

    }
}
