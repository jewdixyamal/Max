package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: a79  reason: default package */
public final class a79 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public a79(av0 av0, kke kke) {
        this.b = j1e.a(((w9a) kke).c());
        av0.d(this);
    }

    @uae
    public final void onEvent(fn4 fn4) {
        j47.T(this.b, (lx3) null, (vx3) null, new z69(this, new w69(fn4.X, fn4.o), (Continuation) null), 3);
    }

    @uae
    public final void onEvent(hn4 hn4) {
        j47.T(this.b, (lx3) null, (vx3) null, new z69(this, new x69(hn4.o, hn4.c), (Continuation) null), 3);
    }
}
