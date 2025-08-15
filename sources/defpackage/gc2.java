package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: gc2  reason: default package */
public final class gc2 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public gc2(av0 av0, kke kke) {
        this.b = j1e.a(((w9a) kke).c());
        av0.d(this);
    }

    @uae
    public final void onEvent(ec2 ec2) {
        j47.T(this.b, (lx3) null, (vx3) null, new fc2(this, ec2, (Continuation) null), 3);
    }
}
