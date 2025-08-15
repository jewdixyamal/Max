package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: x95  reason: default package */
public final class x95 {
    public final av0 a;
    public final kld b = lld.b(0, 0, 0, 7);
    public final ContextScope c;
    public final Long d;

    public x95(kke kke, av0 av0, long j, o92 o92, je7 je7) {
        int i;
        w7c w7c;
        this.a = av0;
        this.c = j1e.a(((w9a) kke).c());
        av0.d(this);
        int ordinal = o92.ordinal();
        if (ordinal == 0) {
            i = 1;
        } else if (ordinal == 1) {
            i = 2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        iy2 iy2 = (iy2) je7.getValue();
        iy2.getClass();
        int s = au1.s(i);
        if (s == 0) {
            w7c = ((jz2) iy2).m(j);
        } else if (s == 1) {
            w7c = ((jz2) iy2).n(j);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        e52 e52 = (e52) w7c.a.getValue();
        this.d = e52 != null ? Long.valueOf(e52.a) : null;
    }

    @uae
    public final void onEvent(xfc xfc) {
        Long l = this.d;
        if (l != null) {
            if (xfc.b == l.longValue()) {
                j47.T(this.c, (lx3) null, (vx3) null, new w95(this, (Continuation) null), 3);
            }
        }
    }
}
