package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ehb  reason: default package */
public final class ehb {
    public final av0 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public ehb(av0 av0, kke kke) {
        this.a = av0;
        this.c = j1e.a(((w9a) kke).c());
        av0.d(this);
    }

    @uae
    public final void onEvent(oi0 oi0) {
        jqe jqe;
        eqe eqe;
        Long valueOf = Long.valueOf(oi0.a);
        pke pke = oi0.b;
        String str = pke.o;
        if (str == null || str.length() == 0) {
            String str2 = pke.b;
            if (f46.U(str2) && tpa.f(str2, "io.exception")) {
                eqe = new eqe(jpc.G);
            } else if (!f46.U(str2) || tpa.f(str2, "io.exception")) {
                eqe = new eqe(jpc.F);
            } else {
                eqe = new eqe(jpc.J);
            }
            jqe = eqe;
        } else {
            jqe = new iqe(str);
        }
        j47.T(this.c, (lx3) null, (vx3) null, new dhb(this, new zgb(valueOf, jqe), (Continuation) null), 3);
    }

    @uae
    public final void onEvent(ts2 ts2) {
        j47.T(this.c, (lx3) null, (vx3) null, new dhb(this, new ahb(Long.valueOf(ts2.a)), (Continuation) null), 3);
    }
}
