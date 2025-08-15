package defpackage;

import java.util.BitSet;
import java.util.List;

/* renamed from: ud1  reason: default package */
public final class ud1 extends vd1 {
    public final List b;
    public final zx7 c;
    public final qma o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ud1(mvd mvd) {
        super(nnf.a);
        qma qma = null;
        List list = mvd != null ? mvd.a : null;
        list = list == null ? nz4.a : list;
        zx7 zx7 = mvd != null ? mvd.b : null;
        qma = mvd != null ? mvd.c : qma;
        this.b = list;
        this.c = zx7;
        this.o = qma;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud1)) {
            return false;
        }
        ud1 ud1 = (ud1) obj;
        return tpa.f(this.b, ud1.b) && tpa.f(this.c, ud1.c) && tpa.f(this.o, ud1.o);
    }

    public final long getItemId() {
        return 111;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        int i = 0;
        zx7 zx7 = this.c;
        int hashCode2 = (hashCode + (zx7 == null ? 0 : zx7.hashCode())) * 31;
        qma qma = this.o;
        if (qma != null) {
            i = qma.hashCode();
        }
        return hashCode2 + i;
    }

    public final int l() {
        return 111;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        u2 u2Var = null;
        ud1 ud1 = ol7 instanceof ud1 ? (ud1) ol7 : null;
        if (ud1 != null) {
            u2Var = new u2(7);
            BitSet bitSet = (BitSet) u2Var.b;
            boolean z = false;
            bitSet.set(0, !tpa.f(this.b, ud1.b));
            if (!tpa.f(this.c, ud1.c) || !tpa.f(this.o, ud1.o)) {
                z = true;
            }
            bitSet.set(1, z);
        }
        return u2Var;
    }

    public final String toString() {
        return "Speaker(opponentsPages=" + this.b + ", mainOpponentState=" + this.c + ", opponentPipState=" + this.o + ")";
    }
}
