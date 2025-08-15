package defpackage;

/* renamed from: bj1  reason: default package */
public final class bj1 extends wj1 {
    public final nnf D;

    public bj1(nnf nnf) {
        this.D = nnf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj1) && this.D == ((bj1) obj).D;
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return "ChangeMode(mode=" + this.D + ")";
    }
}
