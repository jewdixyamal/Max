package defpackage;

/* renamed from: lj1  reason: default package */
public final class lj1 extends wj1 {
    public final gg1 D;

    public lj1(gg1 gg1) {
        this.D = gg1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lj1) && tpa.f(this.D, ((lj1) obj).D);
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return "RaiseHandDialog(participantId=" + this.D + ")";
    }
}
