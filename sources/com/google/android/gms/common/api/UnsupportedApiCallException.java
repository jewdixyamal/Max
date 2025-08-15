package com.google.android.gms.common.api;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final pe5 a;

    public UnsupportedApiCallException(pe5 pe5) {
        this.a = pe5;
    }

    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
