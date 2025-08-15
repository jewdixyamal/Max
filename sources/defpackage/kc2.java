package defpackage;

import java.util.HashSet;
import java.util.List;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: kc2  reason: default package */
public final class kc2 extends ol implements lme {
    public final List X;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kc2(int i, long j, List list) {
        super(j);
        this.o = i;
        this.X = list;
    }

    public final void e(gle gle) {
        switch (this.o) {
            case 0:
                lc2 lc2 = (lc2) gle;
                try {
                    q().m(lc2);
                } catch (TamErrorException unused) {
                    String name = kc2.class.getName();
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        ir6.d(us7.s0, name, "fail to get missed contacts for CHAT_INFO", (Throwable) null);
                    }
                }
                m().c0(lc2.c);
                av0 l = l();
                long j = this.a;
                List list = this.X;
                pi0 pi0 = new pi0(j);
                new HashSet(list);
                l.c(pi0);
                return;
            default:
                k().h(((sbd) gle).c, k().e());
                l().c(new pi0(this.a));
                return;
        }
    }

    public final void g(pke pke) {
        switch (this.o) {
            case 0:
                l().c(new oi0(this.a, pke));
                return;
            default:
                l().c(new oi0(this.a, pke));
                return;
        }
    }

    public final dle i() {
        switch (this.o) {
            case 0:
                au auVar = new au((sla) null, 21);
                auVar.g("chatIds", this.X);
                return auVar;
            default:
                gs9 gs9 = new gs9((sla) null, 8);
                List list = this.X;
                if (list != null && !list.isEmpty()) {
                    gs9.g("pushTokens", list);
                }
                return gs9;
        }
    }
}
