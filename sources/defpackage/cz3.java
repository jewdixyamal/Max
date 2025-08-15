package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: cz3  reason: default package */
public final class cz3 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public cz3(av0 av0, kke kke) {
        this.b = j1e.a(((w9a) kke).a());
        av0.d(this);
    }

    @uae
    public final void onEvent(h32 h32) {
        j47.T(this.b, (lx3) null, (vx3) null, new az3(this, h32, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0) {
        j47.T(this.b, (lx3) null, (vx3) null, new bz3(this, oi0, (Continuation) null), 3);
    }
}
