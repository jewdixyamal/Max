package defpackage;

/* renamed from: cme  reason: default package */
public final class cme {
    public final er7 a;
    public final long b;
    public final long c;

    public cme(er7 er7, long j, long j2) {
        this.a = er7;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cme)) {
            return false;
        }
        cme cme = (cme) obj;
        return tpa.f(this.a, cme.a) && this.b == cme.b && this.c == cme.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + h4f.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LocationResult(locationData=" + this.a + ", livePeriod=" + this.b + ", zoom=" + this.c + ")";
    }
}
