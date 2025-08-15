package ru.ok.android.api.json;

public final class JsonStateException extends IllegalStateException {
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException a(int i) {
        return new IllegalStateException("Expected " + z7.U(93) + " was " + z7.U(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException b(int i) {
        return new IllegalStateException("Expected " + z7.U(125) + " was " + z7.U(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException c(int i) {
        return new IllegalStateException("Expected " + z7.U(39) + " was " + z7.U(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException d(int i) {
        return new IllegalStateException("Expected value was ".concat(z7.U(i)));
    }
}
