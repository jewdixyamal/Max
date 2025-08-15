package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: rn8  reason: default package */
public final class rn8 {
    public final long a;
    public final long b;
    public final av0 c;
    public final kld d = lld.b(0, 0, 0, 7);
    public final ContextScope e;

    public rn8(long j, long j2, av0 av0, kke kke) {
        this.a = j;
        this.b = j2;
        this.c = av0;
        this.e = j1e.a(((w9a) kke).a());
        av0.d(this);
    }

    @uae
    public final void onEvent(vz2 vz2) {
        if (vz2.b.contains(Long.valueOf(this.b))) {
            j47.T(this.e, (lx3) null, (vx3) null, new pn8(this, (Continuation) null), 3);
        }
    }

    @uae
    public final void onEvent(l6f l6f) {
        if (l6f.b == this.b) {
            if (l6f.c == this.a || l6f.X) {
                j47.T(this.e, (lx3) null, (vx3) null, new qn8(this, (Continuation) null), 3);
            }
        }
    }
}
