package defpackage;

import java.util.BitSet;

/* renamed from: sd1  reason: default package */
public final class sd1 extends vd1 {
    public final jqe b;
    public final ak1 c;

    public sd1(gqe gqe, ak1 ak1) {
        super(nnf.b);
        this.b = gqe;
        this.c = ak1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd1)) {
            return false;
        }
        sd1 sd1 = (sd1) obj;
        return tpa.f(this.b, sd1.b) && tpa.f(this.c, sd1.c);
    }

    public final long getItemId() {
        return 225;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final int l() {
        return 225;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        sd1 sd1 = ol7 instanceof sd1 ? (sd1) ol7 : null;
        if (sd1 == null) {
            return null;
        }
        u2 u2Var = new u2(7);
        BitSet bitSet = (BitSet) u2Var.b;
        bitSet.set(0, !tpa.f(this.c, sd1.c));
        bitSet.set(1, !tpa.f(this.b, sd1.b));
        return u2Var;
    }

    public final String toString() {
        return "Sharing(title=" + this.b + ", sharingState=" + this.c + ")";
    }
}
