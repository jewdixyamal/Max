package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ina  reason: default package */
public final class ina extends pnf {
    public static final /* synthetic */ bc7[] s0;
    public final q0e X;
    public final w7c Y;
    public final w4d Z = mqd.D();
    public final je7 b;
    public final je7 c;
    public final je7 o;

    static {
        oi9 oi9 = new oi9(ina.class, "changePushNewUserJob", "getChangePushNewUserJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        s0 = new bc7[]{oi9};
    }

    public ina() {
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
        l.add(new vfd((long) dea.q, 0, new eqe(eea.m), (jfd) null, (jqe) null, (Integer) null, new ffd(((jp) ((hp) this.c.getValue())).g.getBoolean("app.notification.show.new.users", true), true), (zed) null, (jqe) null, 0, (wed) null, 1976));
        return j1e.d(l);
    }

    public final void r(long j) {
        if (j == ((long) dea.q)) {
            vxd S = j47.S(this.a, ((w9a) ((kke) this.o.getValue())).b(), vx3.b, new hna(this, (Continuation) null));
            this.Z.o1(this, s0[0], S);
        }
    }
}
