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
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import org.glassfish.jersey.media.multipart.ContentDisposition;

/**
 * Represents binary data as byte array.
 *
 * @author Peter Harman peter.harman@cae.tech
 */
@JsonSerialize(using = BlobSerializer.class)
@JsonDeserialize(using = BlobDeserializer.class)
public final class Blob extends AbstractBlob {

    private final byte[] data;

    /**
     * Creates a new Blob from a File
     *
     * @param file The File instance
     * @throws IOException if reading fails
     */
    public Blob(File file) throws IOException {
        this(fromFile(file), ContentDisposition.type("attachment")
                .fileName(file.getName())
                .modificationDate(new Date(file.lastModified()))
                .size(file.length()).build());
    }

    /**
     * Creates a new Blob from a File
     *
     * @param path The Path instance
     * @throws IOException if reading fails
     */
    public Blob(Path path) throws IOException {
        this(fromPath(path), ContentDisposition.type("attachment")
                .fileName(path.getFileName().toString())
                .modificationDate(new Date(Files.getLastModifiedTime(path).toMillis()))
                .size(Files.size(path)).build());
    }

    /**
     * Creates a new Blob from an InputStream
     *
     * @param is The stream to read from
     * @throws IOException if reading fails
     */
    public Blob(InputStream is) throws IOException {
        this(fromInputStream(is));
    }

    /**
     * Creates a new Blob from an InputStream and the contents of a
     * Content-Disposition header
     *
     * @param is The stream to read from
     * @param contentDispositionHeader String of the Content-Disposition header
     * @throws IOException if reading fails
     */
    public Blob(InputStream is, String contentDispositionHeader) throws IOException {
        this(fromInputStream(is), parseHeader(contentDispositionHeader));
    }

    static ContentDisposition parseHeader(String contentDispositionHeader) {
        try {
            return new ContentDisposition(contentDispositionHeader);
        } catch (ParseException ex) {
            return ContentDisposition.type("attachment").build();
        }
    }

    /**
     * Creates a new Blob from an byte array
     *
     * @param data The byte array to wrap
     */
    public Blob(byte[] data) {
        this(data, ContentDisposition.type("attachment").build());
    }

    Blob(byte[] data, ContentDisposition contentDisposition) {
        super(contentDisposition);
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
