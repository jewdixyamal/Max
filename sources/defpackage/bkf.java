package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: bkf  reason: default package */
public final class bkf {
    public final yjf a;
    public volatile long b = -1;

    public bkf(yjf yjf) {
        this.a = yjf;
    }

    @uae
    public final void onEvent(af9 af9) {
        l20 l20;
        Object obj;
        if (af9.a == this.b) {
            this.a.l().f(this);
            e52 z = this.a.m().z(this.a.X);
            pl plVar = null;
            if (z == null) {
                this.a.l().c(new oi0(this.a.a, new pke("attachment.token.expired", "chat deleted", (String) null)));
                return;
            }
            cu8 j = this.a.p().j(z.a, this.a.Y);
            if (j == null || j.v0 == vx8.DELETED) {
                this.a.l().c(new oi0(this.a.a, new pke("attachment.token.expired", "message deleted", (String) null)));
                return;
            }
            if (j.z0 == null) {
                this.a.l().c(new oi0(this.a.a, new pke("attachment.token.expired", "attaches not found", (String) null)));
            }
            long j2 = this.a.o;
            k8g k8g = j.z0;
            if (k8g == null) {
                l20 = null;
            } else {
                Iterator it = ((List) k8g.a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((l20) obj).d.a == j2) {
                        break;
                    }
                }
                l20 = (l20) obj;
            }
            if (l20 == null) {
                this.a.l().c(new oi0(this.a.a, new pke("attachment.token.expired", "video deleted", (String) null)));
                return;
            }
            k20 k20 = l20.d;
            yjf yjf = this.a;
            long j3 = j.b;
            String str = k20.m;
            yjf yjf2 = new yjf(yjf.a, yjf.o, yjf.X, yjf.Y, j3, yjf.s0, yjf.t0, yjf.u0, str, true);
            pl plVar2 = this.a.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            mle mle = (mle) plVar.P.getValue();
            mle.getClass();
            ((tle) mle).b(yjf2, yjf2, false);
        }
    }

    @uae
    public final void onEvent(ze9 ze9) {
        if (ze9.a == this.b) {
            this.a.l().f(this);
            this.a.l().c(new oi0(this.a.a, ze9.b));
        }
    }
}
