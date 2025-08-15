package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: rdd  reason: default package */
public final class rdd {
    public final je7 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public rdd(je7 je7, kke kke) {
        this.a = je7;
        this.c = j1e.a(((w9a) kke).a());
        ((av0) je7.getValue()).d(this);
    }

    @uae
    public final void onEvent(hh3 hh3) {
        throw null;
    }

    @uae
    public final void onEvent(vbd vbd) {
        j47.T(this.c, (lx3) null, (vx3) null, new odd(this, vbd, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(tbd tbd) {
        j47.T(this.c, (lx3) null, (vx3) null, new pdd(this, tbd, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0) {
        j47.T(this.c, (lx3) null, (vx3) null, new qdd(this, oi0, (Continuation) null), 3);
    }
}
