package defpackage;

/* renamed from: ho4  reason: default package */
public final class ho4 implements io4 {
    public final float a;
    public final long b;
    public final long c;

    public ho4(float f, long j, long j2) {
        this.a = f;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho4)) {
            return false;
        }
        ho4 ho4 = (ho4) obj;
        return Float.compare(this.a, ho4.a) == 0 && this.b == ho4.b && this.c == ho4.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + h4f.m(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Loading(progress=" + this.a + ", time=" + this.b + ", botId=" + this.c + ")";
    }
}
