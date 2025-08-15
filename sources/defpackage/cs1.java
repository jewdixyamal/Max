package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: cs1  reason: default package */
public final class cs1 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public cs1(je7 je7, je7 je72) {
        this.b = j1e.a(((w9a) ((kke) je72.getValue())).c());
        ((av0) je7.getValue()).d(this);
    }

    @uae
    public final void onEvent(nu7 nu7) {
        j47.T(this.b, (lx3) null, (vx3) null, new xr1(this, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(ps3 ps3) {
        j47.T(this.b, (lx3) null, (vx3) null, new yr1(this, ps3, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(vz2 vz2) {
        j47.T(this.b, (lx3) null, (vx3) null, new zr1(this, vz2, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(hi7 hi7) {
        j47.T(this.b, (lx3) null, (vx3) null, new as1(this, hi7, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(oi0 oi0) {
        j47.T(this.b, (lx3) null, (vx3) null, new bs1(this, oi0, (Continuation) null), 3);
    }
}
