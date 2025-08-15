package defpackage;

/* renamed from: x42  reason: default package */
public final class x42 {
    public final String a;
    public final x42 b;
    public final int c;

    public x42(String str, x42 x42) {
        this.a = str;
        this.b = x42;
        this.c = x42 != null ? 1 + x42.c : 1;
    }
}
