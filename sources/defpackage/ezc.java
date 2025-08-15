package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ezc  reason: default package */
public final class ezc {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public ezc() {
        je7 je7 = iyc.o;
        je7 je72 = iyc.l;
        this.b = j1e.a(((w9a) ((kke) je72.getValue())).c());
        ((av0) je7.getValue()).d(this);
    }

    @uae
    public final void onEvent(jl2 jl2) {
        j47.T(this.b, (lx3) null, (vx3) null, new czc(this, jl2, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0) {
        j47.T(this.b, (lx3) null, (vx3) null, new dzc(this, oi0, (Continuation) null), 3);
    }
}
