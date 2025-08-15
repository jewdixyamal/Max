package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: qxf  reason: default package */
public final class qxf {
    public final je7 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public qxf(je7 je7, je7 je72) {
        this.a = je7;
        this.c = j1e.a(((w9a) ((kke) je72.getValue())).a());
        ((av0) je7.getValue()).d(this);
    }

    public final void a(oxf oxf) {
        j47.T(this.c, (lx3) null, (vx3) null, new pxf(this, oxf, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(bh5 bh5) {
        throw null;
    }

    @uae
    public final void onEvent(oi0 oi0) {
        a(new nxf(oi0.a));
    }

    @uae
    public final void onEvent(zg5 zg5) {
        a(new nxf(zg5.b));
    }

    @uae
    public final void onEvent(xg5 xg5) {
        a(new lxf(xg5.b));
    }

    @uae
    public final void onEvent(ah5 ah5) {
        a(new mxf(ah5.a));
    }
}
