package defpackage;

/* renamed from: dpd  reason: default package */
public final class dpd {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public dpd(cpd cpd) {
        this.a = cpd.a;
        this.b = cpd.b;
        this.c = cpd.c;
        this.e = cpd.e;
        this.d = cpd.d;
        this.f = cpd.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dpd.class != obj.getClass()) {
            return false;
        }
        dpd dpd = (dpd) obj;
        if (this.a == dpd.a && this.b == dpd.b && this.c == dpd.c && this.d == dpd.d && this.f == dpd.f) {
            return this.e == dpd.e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a ? 1 : 0) * true) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0);
    }
}
