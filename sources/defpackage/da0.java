package defpackage;

/* renamed from: da0  reason: default package */
public final class da0 {
    public final cb0 a;
    public final cb0 b;

    public da0(cb0 cb0, cb0 cb02) {
        this.a = cb0;
        this.b = cb02;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof da0)) {
            return false;
        }
        da0 da0 = (da0) obj;
        return this.a.equals(da0.a) && this.b.equals(da0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
