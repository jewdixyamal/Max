package defpackage;

import java.util.BitSet;

/* renamed from: kfd  reason: default package */
public interface kfd extends ol7 {
    public static final yed V = yed.a;

    jqe b();

    bfd c();

    jqe d();

    hfd e();

    Integer f();

    jqe getTitle();

    jfd getType() {
        return jfd.b;
    }

    boolean h(ol7 ol7) {
        return getItemId() == ol7.getItemId();
    }

    int l() {
        return 0;
    }

    Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        u2 u2Var = null;
        vfd vfd = ol7 instanceof vfd ? (vfd) ol7 : null;
        if (vfd != null) {
            u2Var = new u2(7);
            boolean z = false;
            boolean z2 = u() != vfd.b;
            BitSet bitSet = (BitSet) u2Var.b;
            bitSet.set(0, z2);
            bitSet.set(1, !tpa.f(getTitle(), vfd.c));
            bitSet.set(2, getType() != vfd.o);
            bitSet.set(3, !tpa.f(b(), vfd.X));
            bitSet.set(4, !tpa.f(f(), vfd.Y));
            bitSet.set(5, !tpa.f(e(), vfd.Z));
            bitSet.set(6, !tpa.f(c(), vfd.s0));
            bitSet.set(7, !tpa.f(d(), vfd.t0));
            if (q() != vfd.u0) {
                z = true;
            }
            bitSet.set(8, z);
        }
        return u2Var;
    }

    int q() {
        return tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
    }

    wed s() {
        return null;
    }

    int u();
}
