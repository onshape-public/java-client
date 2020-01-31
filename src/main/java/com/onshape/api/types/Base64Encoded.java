/*
 * The MIT License
 *
 * Copyright 2018 Onshape Inc.
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
import com.onshape.api.types.Base64Encoded.Base64EncodedDeserializer;
import com.onshape.api.types.Base64Encoded.Base64EncodedSerializer;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Objects;
import org.glassfish.jersey.media.multipart.ContentDisposition;

/**
 * Represents binary data encoded as Base64. This is serialized as a String in
 * JSON.
 *
 * @author Peter Harman peter.harman@cae.tech
 */
@JsonSerialize(using = Base64EncodedSerializer.class)
@JsonDeserialize(using = Base64EncodedDeserializer.class)
public class Base64Encoded extends AbstractBlob {

    private final String base64String;

    public Base64Encoded(File file) throws IOException {
        this(fromFile(file));
    }

    public Base64Encoded(Path path) throws IOException {
        this(fromPath(path));
    }

    public Base64Encoded(byte[] data) {
        this(Base64.getEncoder().encodeToString(data));
    }

    public Base64Encoded(String base64String) {
        super(ContentDisposition.type("attachement").build());
        this.base64String = base64String;
    }

    public String getBase64String() {
        return base64String;
    }

    @Override
    public byte[] getData() {
        return Base64.getDecoder().decode(base64String);
    }

    @Override
    public String toString() {
        return base64String;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.base64String);
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
        final Base64Encoded other = (Base64Encoded) obj;
        return Objects.equals(this.base64String, other.base64String);
    }

    static class Base64EncodedSerializer extends JsonSerializer<Base64Encoded> {

        @Override
        public void serialize(Base64Encoded t, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
            jg.writeString(t.getBase64String());
        }

    }

    static class Base64EncodedDeserializer extends JsonDeserializer<Base64Encoded> {

        @Override
        public Base64Encoded deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {
            return new Base64Encoded(jp.getText());
        }

    }
}
