package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: rh0  reason: default package */
public final class rh0 {
    public final kld a;
    public final v7c b;
    public final ContextScope c;

    public rh0(av0 av0, kke kke) {
        kld b2 = lld.b(0, 0, 0, 7);
        this.a = b2;
        this.b = new v7c(b2);
        this.c = j1e.a(((w9a) kke).c());
        av0.d(this);
    }

    @uae
    public final void onBaseError(oi0 oi0) {
        j47.T(this.c, (lx3) null, (vx3) null, new qh0(this, oi0, (Continuation) null), 3);
    }
}
