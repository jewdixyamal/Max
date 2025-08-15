package ru.ok.tamtam.errors;

public class TamErrorException extends Exception {
    public final pke a;

    public TamErrorException(pke pke) {
        super(pke.b);
        this.a = pke;
    }
}
