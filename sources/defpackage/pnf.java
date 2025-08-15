package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: pnf  reason: default package */
public abstract class pnf {
    public final ContextScope a;

    public pnf() {
        hde a2 = f46.a();
        jd4 jd4 = ql4.a;
        this.a = j1e.a(a2.plus(MainDispatcherLoader.dispatcher.getImmediate()));
    }

    public static vxd n(pnf pnf, lx3 lx3, vx3 vx3, a66 a66, int i) {
        if ((i & 1) != 0) {
            lx3 = hz4.a;
        }
        if ((i & 2) != 0) {
            vx3 = vx3.a;
        }
        return j47.S(pnf.a, lx3, vx3, a66);
    }

    public static void o(s35 s35, Object obj) {
        s35.b.g(obj);
    }

    public void p() {
    }
}
