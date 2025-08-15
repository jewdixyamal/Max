package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: dj5  reason: default package */
public final class dj5 {
    public final av0 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public dj5(av0 av0, kke kke) {
        this.a = av0;
        this.c = j1e.a(((w9a) kke).c());
        av0.d(this);
    }

    @uae
    public final void onEvent(fk5 fk5) {
        if (nu0.t0.equals(fk5.c)) {
            j47.T(this.c, (lx3) null, (vx3) null, new bj5(this, (Continuation) null), 3);
        }
    }

    @uae
    public final void onEvent(n5d n5d) {
        if ("file.local.max.size.reached".equals(n5d.b)) {
            j47.T(this.c, (lx3) null, (vx3) null, new cj5(this, (Continuation) null), 3);
        }
    }
}
