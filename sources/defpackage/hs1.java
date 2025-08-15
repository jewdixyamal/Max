package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: hs1  reason: default package */
public final class hs1 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public hs1(je7 je7, je7 je72) {
        this.b = j1e.a(((w9a) ((kke) je72.getValue())).c());
        ((av0) je7.getValue()).d(this);
    }

    @uae
    public final void onEvent(b41 b41) {
        j47.T(this.b, (lx3) null, (vx3) null, new fs1(this, b41, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0) {
        j47.T(this.b, (lx3) null, (vx3) null, new gs1(this, oi0, (Continuation) null), 3);
    }
}
