package defpackage;

import java.util.Collections;
import one.me.profile.screens.invite.ProfileInviteScreen;

/* renamed from: vhb  reason: default package */
public final /* synthetic */ class vhb implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xhb b;

    public /* synthetic */ vhb(xhb xhb, int i) {
        this.a = i;
        this.b = xhb;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                jib m0 = ((ProfileInviteScreen) this.b.X).m0();
                String s = m0.s();
                if (s != null) {
                    lhb lhb = new lhb(s);
                    s35 s35 = m0.C0;
                    pnf.o(s35, lhb);
                    if (tpa.s()) {
                        e52 r = m0.r();
                        s35.b.g(new ohb(woc.r, new eqe((r == null || !r.I()) ? yea.S0 : yea.P0)));
                    }
                }
                return e5f.a;
            default:
                jib m02 = ((ProfileInviteScreen) this.b.X).m0();
                m02.getClass();
                pnf.o(m02.C0, new nhb(Collections.singletonList(new tt3(wea.K, (jqe) new eqe(yea.V0), Integer.valueOf(wfa.U), Integer.valueOf(woc.O1), Integer.valueOf(wfa.P)))));
                return e5f.a;
        }
    }
}
