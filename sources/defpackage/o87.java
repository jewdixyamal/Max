package defpackage;

/* renamed from: o87  reason: default package */
public final class o87 {
    public final String a;
    public final x77 b;

    public o87(String str, vxd vxd) {
        this.a = str;
        this.b = vxd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o87)) {
            return false;
        }
        o87 o87 = (o87) obj;
        return tpa.f(this.a, o87.a) && tpa.f(this.b, o87.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JobWrapper(name=" + this.a + ", job=" + this.b + ")";
    }
}
