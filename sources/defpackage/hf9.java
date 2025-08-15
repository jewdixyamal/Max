package defpackage;

import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: hf9  reason: default package */
public final class hf9 extends ol implements lme {
    public final String X;
    public final int Y = 100;
    public final long Z;
    public final long o;
    public final String s0;

    public hf9(String str, long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = str;
        this.Z = j3;
        this.s0 = hf9.class.getName();
    }

    public final void e(gle gle) {
        if9 if9 = (if9) gle;
        l().c(new jl2(this.a, this.X, if9.c, if9.o, if9.X));
    }

    public final void g(pke pke) {
        l().c(new oi0(this.a, pke));
    }

    public final dle i() {
        e52 C = m().C(this.o);
        if (C != null) {
            k92 k92 = C.b;
            if (k92.a != 0 || m().P(C)) {
                tq2 tq2 = new tq2((sla) null, 25);
                tq2.i(k92.a, ApiProtocol.PARAM_CHAT_ID);
                tq2.p("query", this.X);
                tq2.e(this.Y, NewHtcHomeBadger.COUNT);
                long j = this.Z;
                if (j != 0) {
                    tq2.i(j, "marker");
                }
                return tq2;
            }
        }
        hm9.p(this.s0, "createRequest: No chat or serverId == 0. return null", (Throwable) null);
        return null;
    }
}
