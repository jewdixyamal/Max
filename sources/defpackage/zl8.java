package defpackage;

/* renamed from: zl8  reason: default package */
public final class zl8 implements am8 {
    public final er7 a;
    public final float b;
    public final long c;

    public zl8(er7 er7, float f, long j) {
        this.a = er7;
        this.b = f;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl8)) {
            return false;
        }
        zl8 zl8 = (zl8) obj;
        return tpa.f(this.a, zl8.a) && Float.compare(this.b, zl8.b) == 0 && this.c == zl8.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ms2.c(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendLocation(locationData=");
        sb.append(this.a);
        sb.append(", zoom=");
        sb.append(this.b);
        sb.append(", livePeriod=");
        return zr6.k(sb, this.c, ")");
    }
}
