package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pj4  reason: default package */
public final class pj4 extends pnf {
    public static final /* synthetic */ bc7[] s0;
    public final q0e X;
    public final w7c Y;
    public final w4d Z = mqd.D();
    public final je7 b;
    public final je7 c;
    public final je7 o;

    static {
        oi9 oi9 = new oi9(pj4.class, "changeDialogNotificationsJob", "getChangeDialogNotificationsJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        s0 = new bc7[]{oi9};
    }

    public pj4() {
        sw9 sw9 = sw9.a;
        khe d = sw9.getAccessor().d(hp.class);
        khe d2 = sw9.getAccessor().d(pk.class);
        khe d3 = sw9.getAccessor().d(kke.class);
        this.b = d2;
        this.c = d;
        this.o = d3;
        q0e a = r0e.a(nz4.a);
        this.X = a;
        this.Y = new w7c(a);
        a.setValue(q());
    }

    public final kl7 q() {
        kl7 l = j1e.l();
        vfd vfd = r3;
        vfd vfd2 = new vfd((long) dea.h, 0, new eqe(eea.g), (jfd) null, (jqe) null, (Integer) null, new ffd(((kxc) ((hp) this.c.getValue())).p() != 1, true), (zed) null, (jqe) null, 0, (wed) null, 1976);
        l.add(vfd);
        return j1e.d(l);
    }

    public final void r(long j) {
        if (j == ((long) dea.h)) {
            vxd S = j47.S(this.a, ((w9a) ((kke) this.o.getValue())).b(), vx3.b, new oj4(this, (Continuation) null));
            this.Z.o1(this, s0[0], S);
        }
    }
}
