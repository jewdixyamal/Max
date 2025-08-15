package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: sj4  reason: default package */
public final class sj4 {
    public final long a;
    public final av0 b;
    public final iy2 c;
    public final kld d = lld.b(0, 0, 0, 7);
    public final ContextScope e;

    public sj4(long j, av0 av0, kke kke, iy2 iy2) {
        this.a = j;
        this.b = av0;
        this.c = iy2;
        this.e = j1e.a(((w9a) kke).c().getImmediate());
        av0.d(this);
    }

    @uae
    public final void onEvent(vz2 vz2) {
        uj3 l;
        for (Number longValue : vz2.b) {
            e52 e52 = (e52) ((jz2) this.c).m(longValue.longValue()).a.getValue();
            if (e52 != null && (l = e52.l()) != null) {
                if (l.n() == this.a) {
                    j47.T(this.e, (lx3) null, (vx3) null, new rj4(this, (Continuation) null), 3);
                    return;
                }
                return;
            }
        }
    }
}
