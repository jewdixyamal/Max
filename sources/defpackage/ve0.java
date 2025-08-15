package defpackage;

/* renamed from: ve0  reason: default package */
public final class ve0 {
    public final ue0 a;
    public final we0 b;
    public final xe0 c;
    public final ye0 d;

    public ve0(ue0 ue0, we0 we0, xe0 xe0, ye0 ye0) {
        this.a = ue0;
        this.b = we0;
        this.c = xe0;
        this.d = ye0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve0)) {
            return false;
        }
        ve0 ve0 = (ve0) obj;
        return tpa.f(this.a, ve0.a) && tpa.f(this.b, ve0.b) && tpa.f(this.c, ve0.c) && tpa.f(this.d, ve0.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.d.hashCode() + k7d.e(this.c.a, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "BackgroundLocalColors(chips=" + this.a + ", fileType=" + this.b + ", tabBar=" + this.c + ", topBar=" + this.d + ")";
    }
}
