package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class StreamReadException extends JsonProcessingException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamReadException(ab7 ab7, String str) {
        super(str, ab7 == null ? null : ab7.o(), (NumberFormatException) null);
    }
}
