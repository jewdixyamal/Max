package defpackage;

/* renamed from: gb8  reason: default package */
public final class gb8 implements su0 {
    public static final gb8 Y = new gb8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
    public final float X;
    public final long a;
    public final long b;
    public final long c;
    public final float o;

    public gb8(long j, long j2, long j3, float f, float f2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = f;
        this.X = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb8)) {
            return false;
        }
        gb8 gb8 = (gb8) obj;
        return this.a == gb8.a && this.b == gb8.b && this.c == gb8.c && this.o == gb8.o && this.X == gb8.X;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
        float f = this.o;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.X;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i2;
    }
}
