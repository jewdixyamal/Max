package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ep0  reason: default package */
public final class ep0 {
    public final je7 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public ep0(je7 je7, je7 je72) {
        this.a = je7;
        this.c = j1e.a(((w9a) ((kke) je72.getValue())).a());
        ((av0) je7.getValue()).d(this);
    }

    @uae
    public final void onEvent(ps3 ps3) {
        j47.T(this.c, (lx3) null, (vx3) null, new bp0(this, ps3, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(kn3 kn3) {
        j47.T(this.c, (lx3) null, (vx3) null, new cp0(this, kn3, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0) {
        j47.T(this.c, (lx3) null, (vx3) null, new dp0(this, oi0, (Continuation) null), 3);
    }
}
