package defpackage;

/* renamed from: mxe  reason: default package */
public final class mxe {
    public final nxe a;

    public mxe(nxe nxe) {
        this.a = nxe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxe) && tpa.f(this.a, ((mxe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopbarStrokeSeparatorColors(default=" + this.a + ")";
    }
}
