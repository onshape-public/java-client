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
import java.util.Date;
import org.glassfish.jersey.media.multipart.ContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

/**
 * Base class for binary data.
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public abstract class AbstractBlob {

    private final ContentDisposition contentDisposition;

    protected AbstractBlob(ContentDisposition contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    /**
     * Get the contents of this Blob as a byte array
     * @return byte[] of contents
     */
    public abstract byte[] getData();

    /**
     * Write the contents of this Blob to a File
     * 
     * @param f File to write to
     * @throws IOException If writing fails
     */
    public final void toFile(File f) throws IOException {
        toFile(f.toPath());
    }

    /**
     * Write the contents of this Blob to a File
     * 
     * @param p Path to write to
     * @throws IOException If writing fails
     */
    public final void toFile(Path p) throws IOException {
        Files.write(p, getData());
    }

    /**
     * Get an InputStream to read the contents of this Blob
     * @return An InputStream
     */
    public final InputStream toInputStream() {
        return new ByteArrayInputStream(getData());
    }

    /**
     * Get the name, if any, associated with this Blob
     * @return String of filename or null
     */
    public final String getFileName() {
        return contentDisposition.getFileName();
    }

    /**
     * Get the creation date, if any, associated with this Blob
     * @return Date of creation or null
     */
    public final Date getCreationDate() {
        return contentDisposition.getCreationDate();
    }

    /**
     * Get the last modified date, if any, associated with this Blob
     * @return Date of modification or null
     */
    public final Date getModificationDate() {
        return contentDisposition.getModificationDate();
    }

    /**
     * Create a FormDataContentDisposition suitable for submitting this Blob
     * as part of a multipart form submission
     * 
     * @param name Name of the blob field
     * @return A FormDataContentDisposition
     */
    public final FormDataContentDisposition getFormDataContentDisposition(String name) {
        return FormDataContentDisposition.name(name).creationDate(contentDisposition.getCreationDate())
                .modificationDate(contentDisposition.getModificationDate())
                .fileName(contentDisposition.getFileName())
                .readDate(contentDisposition.getReadDate())
                .size(contentDisposition.getSize()).build();
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
