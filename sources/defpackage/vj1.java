package defpackage;

/* renamed from: vj1  reason: default package */
public final class vj1 extends wj1 {
    public final jqe D;
    public final k56 E;

    public vj1(gqe gqe, a81 a81) {
        this.D = gqe;
        this.E = a81;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj1)) {
            return false;
        }
        vj1 vj1 = (vj1) obj;
        vj1.getClass();
        return tpa.f(this.D, vj1.D) && tpa.f(this.E, vj1.E);
    }

    public final int hashCode() {
        return this.E.hashCode() + k7d.f(dj1.b.hashCode() * 31, 31, this.D);
    }

    public final String toString() {
        return "ShowTimerSnackbar(priority=" + dj1.b + ", textSource=" + this.D + ", action=" + this.E + ")";
    }
}
