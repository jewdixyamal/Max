package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: dfb  reason: default package */
public final class dfb {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public dfb(av0 av0, je7 je7) {
        this.b = j1e.a(((w9a) ((kke) je7.getValue())).c());
        av0.d(this);
    }

    public static final jqe a(dfb dfb, pke pke) {
        dfb.getClass();
        String str = pke.o;
        if (str != null && str.length() != 0) {
            return new iqe(str);
        }
        String str2 = pke.b;
        return (!f46.U(str2) || !tpa.f(str2, "io.exception")) ? (!f46.U(str2) || tpa.f(str2, "io.exception")) ? new eqe(jpc.F) : new eqe(jpc.J) : new eqe(jpc.G);
    }

    @uae
    public final void onEvent(bhb bhb) {
        j47.T(this.b, (lx3) null, (vx3) null, new yeb(this, bhb, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(vab vab) {
        j47.T(this.b, (lx3) null, (vx3) null, new zeb(this, vab, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0) {
        j47.T(this.b, (lx3) null, (vx3) null, new afb(this, oi0, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(xgb xgb) {
        j47.T(this.b, (lx3) null, (vx3) null, new bfb(this, xgb, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(ts2 ts2) {
        j47.T(this.b, (lx3) null, (vx3) null, new cfb(this, ts2, (Continuation) null), 3);
    }
}
