package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ki7  reason: default package */
public final class ki7 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public ki7(av0 av0, kke kke) {
        this.b = j1e.a(((w9a) kke).c());
        av0.d(this);
    }

    @uae
    public final void onEvent(hi7 hi7) {
        j47.T(this.b, (lx3) null, (vx3) null, new ii7(this, hi7, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0) {
        j47.T(this.b, (lx3) null, (vx3) null, new ji7(this, oi0, (Continuation) null), 3);
    }
}
