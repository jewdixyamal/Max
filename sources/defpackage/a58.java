package defpackage;

/* renamed from: a58  reason: default package */
public final class a58 implements c58 {
    public final er7 a;
    public final float b;
    public final long c;

    public a58(er7 er7, float f, long j) {
        this.a = er7;
        this.b = f;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a58)) {
            return false;
        }
        a58 a58 = (a58) obj;
        return tpa.f(this.a, a58.a) && Float.compare(this.b, a58.b) == 0 && this.c == a58.c;
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
