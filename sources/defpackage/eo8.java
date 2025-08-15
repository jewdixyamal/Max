package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: eo8  reason: default package */
public final class eo8 {
    public final kld a;
    public final ContextScope b;
    public final zn5 c;

    public eo8(av0 av0, kke kke) {
        kld b2 = lld.b(0, 0, 0, 7);
        this.a = b2;
        this.b = j1e.a(((w9a) kke).c());
        int i = ft4.o;
        this.c = nu0.e(b2, z7.R(1000, kt4.MILLISECONDS), new ai0(17));
        av0.d(this);
    }

    public final void a() {
        j47.T(this.b, (lx3) null, (vx3) null, new zn8(this, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(ut7 ut7) {
        a();
    }

    @uae
    public final void onEvent(sva sva) {
        a();
    }

    @uae
    public final void onEvent(ps3 ps3) {
        a();
    }

    @uae
    public final void onEvent(c6f c6f) {
        a();
    }

    @uae
    public final void onEvent(vz2 vz2) {
        a();
    }
}
