package defpackage;

/* renamed from: oxe  reason: default package */
public final class oxe {
    public final pxe a;
    public final qxe b;

    public oxe(pxe pxe, qxe qxe) {
        this.a = pxe;
        this.b = qxe;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oxe)) {
            return false;
        }
        oxe oxe = (oxe) obj;
        return tpa.f(this.a, oxe.a) && tpa.f(this.b, oxe.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopbarTextColors(default=" + this.a + ", disabled=" + this.b + ")";
    }
}
