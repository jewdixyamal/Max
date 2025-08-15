package defpackage;

/* renamed from: ts7  reason: default package */
public final class ts7 implements Comparable {
    public static final ts7 X = new ts7(bjd.Y);
    public static final ts7 Y = new ts7(bjd.Z);
    public static final ts7 Z = new ts7(bjd.s0);
    public static final ts7 b = new ts7(bjd.c);
    public static final ts7 c = new ts7(bjd.o);
    public static final ts7 o = new ts7(bjd.X);
    public final bjd a;

    public ts7(bjd bjd) {
        this.a = bjd;
    }

    public final int compareTo(Object obj) {
        return tpa.m(this.a.b, ((ts7) obj).a.b);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a;
    }
}
