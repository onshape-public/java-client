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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Base class for binary data.
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public abstract class AbstractBlob {

    public abstract byte[] getData();

    public final void toFile(File f) throws IOException {
        toFile(f.toPath());
    }

    public final void toFile(Path p) throws IOException {
        Files.write(p, getData());
    }

    public final InputStream toInputStream() {
        return new ByteArrayInputStream(getData());
    }

    protected static byte[] fromFile(File file) throws IOException {
        return fromPath(file.toPath());
    }

    protected static byte[] fromPath(Path path) throws IOException {
        return Files.readAllBytes(path);
    }

    protected static byte[] fromInputStream(InputStream is) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            int n;
            byte[] buffer = new byte[1024];
            while ((n = is.read(buffer)) > -1) {
                baos.write(buffer, 0, n);
            }
            baos.flush();
            return baos.toByteArray();
        }
    }
}
