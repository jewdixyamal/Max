package defpackage;

/* renamed from: jgb  reason: default package */
public final class jgb {
    public final jqe a;
    public final int b;
    public final xha c;

    public jgb(eqe eqe, int i, v02 v02) {
        this.a = eqe;
        this.b = i;
        this.c = v02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgb)) {
            return false;
        }
        jgb jgb = (jgb) obj;
        return tpa.f(this.a, jgb.a) && this.b == jgb.b && tpa.f(this.c, jgb.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", bottomMargin=" + this.b + ", cancelAction=" + this.c + ")";
    }
}
