package defpackage;

import android.app.Application;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ug0  reason: default package */
public final class ug0 {
    public final Application a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;
    public final dua d;
    public final dua e;
    public final mg0 f;

    public ug0(Application application, av0 av0, kke kke) {
        this.a = application;
        this.c = j1e.a(((w9a) kke).c().getImmediate());
        this.d = new dua(eua.f);
        this.e = new dua(eua.k);
        this.f = new mg0(0, this);
        av0.d(this);
    }

    @uae
    public final void onEvent(ut7 ut7) {
        j47.T(this.c, (lx3) null, (vx3) null, new ng0(this, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(sva sva) {
        j47.T(this.c, (lx3) null, (vx3) null, new og0(this, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(ps3 ps3) {
        j47.T(this.c, (lx3) null, (vx3) null, new pg0(this, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(c6f c6f) {
        j47.T(this.c, (lx3) null, (vx3) null, new qg0(this, (Continuation) null), 3);
    }
}
