package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: tm3  reason: default package */
public final class tm3 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public tm3(av0 av0, kke kke) {
        this.b = j1e.a(((w9a) kke).a());
        av0.d(this);
    }

    public final mn5 a() {
        return new v7c(this.a);
    }

    @uae
    public final void onEvent(ut7 ut7) {
        j47.T(this.b, (lx3) null, (vx3) null, new pm3(this, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(sva sva) {
        j47.T(this.b, (lx3) null, (vx3) null, new qm3(this, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(ps3 ps3) {
        j47.T(this.b, (lx3) null, (vx3) null, new rm3(this, ps3, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(c6f c6f) {
        j47.T(this.b, (lx3) null, (vx3) null, new sm3(this, (Continuation) null), 3);
    }
}
