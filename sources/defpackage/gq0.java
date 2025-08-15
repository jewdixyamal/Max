package defpackage;

import java.util.Collections;

/* renamed from: gq0  reason: default package */
public final class gq0 extends ol implements lme {
    public final long X;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq0(long j, long j2, int i) {
        super(j);
        this.o = i;
        this.X = j2;
    }

    private final void u(pke pke) {
    }

    private final void v(pke pke) {
    }

    private final void w(gle gle) {
    }

    public final void e(gle gle) {
        switch (this.o) {
            case 0:
                hq0 hq0 = (hq0) gle;
                wm3 wm3 = hq0.o;
                if (wm3 != null) {
                    el3 n = n();
                    long j = wm3.a;
                    uj3 i = n.i(j, false);
                    if ((i != null ? i.a.c.k : null) == ol3.a) {
                        n().u(Collections.singletonList(wm3));
                    } else {
                        n().v(Collections.singletonList(wm3));
                    }
                    p82 m = m();
                    long j2 = this.X;
                    e52 F = m.F(j2);
                    l().c(new i62(this.a, F.a, hq0.c, Collections.singletonMap(Long.valueOf(j2), wm3)));
                    qzd qzd = hq0.X;
                    if (qzd != null) {
                        el3 n2 = n();
                        n2.getClass();
                        n2.c(j, new v02(16, qzd));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void g(pke pke) {
        int i = this.o;
    }

    public final dle i() {
        long j = this.X;
        switch (this.o) {
            case 0:
                au auVar = new au(sla.BOT_INFO, 9);
                auVar.i(j, "botId");
                return auVar;
            default:
                if (j == 0) {
                    return new tq2(0, 26, (byte) 0);
                }
                e52 C = m().C(j);
                if (C != null) {
                    k92 k92 = C.b;
                    if (k92.a != 0 || m().P(C)) {
                        return new tq2(k92.a, 26, (byte) 0);
                    }
                }
                hm9.p("gq0", "createRequest: No chat or serverId == 0. return null", (Throwable) null);
                return null;
        }
    }
}
