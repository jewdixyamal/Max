package defpackage;

import java.util.BitSet;
import java.util.List;

/* renamed from: qd1  reason: default package */
public final class qd1 extends vd1 {
    public final List b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qd1(lg6 lg6) {
        super(nnf.c);
        List list = lg6 != null ? lg6.a : null;
        list = list == null ? nz4.a : list;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd1) && tpa.f(this.b, ((qd1) obj).b);
    }

    public final long getItemId() {
        return 222;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final int l() {
        return 222;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        qd1 qd1 = ol7 instanceof qd1 ? (qd1) ol7 : null;
        if (qd1 == null) {
            return null;
        }
        u2 u2Var = new u2(7);
        ((BitSet) u2Var.b).set(0, !tpa.f(this.b, qd1.b));
        return u2Var;
    }

    public final String toString() {
        return "Grid(opponentsPages=" + this.b + ")";
    }
}
