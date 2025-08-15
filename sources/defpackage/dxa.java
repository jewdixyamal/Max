package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: dxa  reason: default package */
public final class dxa {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public dxa(av0 av0, kke kke) {
        this.b = j1e.a(((w9a) kke).a());
        av0.d(this);
    }

    @uae
    public final void onEvent(tk2 tk2) {
        j47.T(this.b, (lx3) null, (vx3) null, new bxa(this, tk2, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0) {
        j47.T(this.b, (lx3) null, (vx3) null, new cxa(this, oi0, (Continuation) null), 3);
    }
}
