package defpackage;

/* renamed from: e0g  reason: default package */
public final class e0g {
    public final String a;
    public final boolean b;
    public final a0g c;

    public e0g(String str, boolean z, a0g a0g) {
        this.a = str;
        this.b = z;
        this.c = a0g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0g)) {
            return false;
        }
        e0g e0g = (e0g) obj;
        return tpa.f(this.a, e0g.a) && this.b == e0g.b && tpa.f(this.c, e0g.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ms2.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WebAppRootViewState(title=" + this.a + ", isVerified=" + this.b + ", loadingState=" + this.c + ")";
    }
}
