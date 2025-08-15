package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: jf2  reason: default package */
public final class jf2 {
    public final long a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;

    public jf2(long j, av0 av0, kke kke) {
        this.a = j;
        this.c = j1e.a(((w9a) kke).a());
        av0.d(this);
    }

    public final void a(hf2 hf2) {
        j47.T(this.c, (lx3) null, (vx3) null, new if2(this, hf2, (Continuation) null), 3);
    }

    @uae
    public final void onEvent(fn4 fn4) {
        a(new cf2(fn4.X, fn4.o));
    }

    @uae
    public final void onEvent(hn4 hn4) {
        a(new df2(hn4.o));
    }

    @uae
    public final void onEvent(l6f l6f) {
        if (l6f.b == this.a) {
            a(new ff2(l6f.c));
        }
    }

    @uae
    public final void onEvent(kz6 kz6) {
        if (kz6.b == this.a && !kz6.Y) {
            a(new bf2(kz6.c));
        }
    }

    @uae
    public final void onEvent(mna mna) {
        if (mna.b == this.a) {
            a(new bf2(mna.o));
        }
    }

    @uae
    public final void onEvent(re9 re9) {
        if (re9.b == this.a) {
            a(new ef2(re9.X));
        }
    }
}
