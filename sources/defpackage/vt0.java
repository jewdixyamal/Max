package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: vt0  reason: default package */
public final /* synthetic */ class vt0 extends p66 implements c66 {
    public static final vt0 a = new p66(3, zt0.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zt0 zt0 = (zt0) obj;
        z3d z3d = (z3d) obj2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = zt0.o;
        zt0.getClass();
        j42 j42 = (j42) zt0.t0.get(zt0);
        while (true) {
            if (zt0.x()) {
                ((y3d) z3d).X = bu0.l;
                break;
            }
            long andIncrement = zt0.X.getAndIncrement(zt0);
            long j = (long) bu0.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (j42.id != j2) {
                j42 r = zt0.r(j2, j42);
                if (r == null) {
                    continue;
                } else {
                    j42 = r;
                }
            }
            Object H = zt0.H(j42, i, andIncrement, z3d);
            if (H == bu0.m) {
                irf irf = z3d instanceof irf ? (irf) z3d : null;
                if (irf != null) {
                    irf.a(j42, i);
                }
            } else if (H == bu0.o) {
                if (andIncrement < zt0.u()) {
                    j42.cleanPrev();
                }
            } else if (H != bu0.n) {
                j42.cleanPrev();
                ((y3d) z3d).X = H;
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return e5f.a;
    }
}
