package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: sc2  reason: default package */
public final class sc2 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public sc2(av0 av0, kke kke) {
        this.b = j1e.a(((w9a) kke).c());
        av0.d(this);
    }

    @uae
    public final void onEvent(qc2 qc2) {
        j47.T(this.b, (lx3) null, (vx3) null, new rc2(this, qc2, (Continuation) null), 3);
    }
}
