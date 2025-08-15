package com.fasterxml.jackson.core;

public class JsonProcessingException extends JacksonException {
    public final wa7 a;

    public JsonProcessingException(String str, wa7 wa7, NumberFormatException numberFormatException) {
        super(str, numberFormatException);
        this.a = wa7;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        wa7 wa7 = this.a;
        if (wa7 == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (wa7 != null) {
            sb.append("\n at ");
            sb.append(wa7.toString());
        }
        return sb.toString();
    }

    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
