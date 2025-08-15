package defpackage;

/* renamed from: lxe  reason: default package */
public final class lxe {
    public final mxe a;

    public lxe(mxe mxe) {
        this.a = mxe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lxe) && tpa.f(this.a, ((lxe) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "TopbarStrokeColors(separator=" + this.a + ")";
    }
}
