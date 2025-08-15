package defpackage;

/* renamed from: jlf  reason: default package */
public final class jlf {
    public static final jlf e = new jlf(0, 0);
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(2, 36);
    public static final String i = Integer.toString(3, 36);
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    static {
        int i2 = oaf.a;
    }

    public jlf(int i2, int i3) {
        this(1.0f, i2, i3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlf)) {
            return false;
        }
        jlf jlf = (jlf) obj;
        return this.a == jlf.a && this.b == jlf.b && this.c == jlf.c && this.d == jlf.d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }

    public jlf(float f2, int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = f2;
    }
}
