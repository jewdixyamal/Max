package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gx9  reason: default package */
public final class gx9 extends pnf {
    public static final /* synthetic */ bc7[] C0;
    public final w4d A0 = mqd.D();
    public final w4d B0 = mqd.D();
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final lle b;
    public final je7 c;
    public final je7 o;
    public final w7c s0;
    public final q0e t0;
    public final w7c u0;
    public final w7c v0;
    public final q0e w0;
    public final q0e x0;
    public final s35 y0 = new s35(0);
    public final w4d z0 = mqd.D();

    static {
        Class<gx9> cls = gx9.class;
        C0 = new bc7[]{new oi9(cls, "resetDefaultsJob", "getResetDefaultsJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "changeAllNotificationsEnabledJob", "getChangeAllNotificationsEnabledJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "changeShowContentJob", "getChangeShowContentJob()Lkotlinx/coroutines/Job;")};
    }

    public gx9() {
        sw9 sw9 = sw9.a;
        lle lle = (lle) sw9.getAccessor().c(lle.class);
        khe d = sw9.getAccessor().d(hp.class);
        khe d2 = sw9.getAccessor().d(pk.class);
        khe d3 = sw9.getAccessor().d(kke.class);
        khe d4 = sw9.getAccessor().d(cea.class);
        this.b = lle;
        this.c = d;
        this.o = d2;
        this.X = d3;
        this.Y = d4;
        q0e a = r0e.a(nz4.a);
        this.Z = a;
        this.s0 = new w7c(a);
        q0e a2 = r0e.a(Boolean.valueOf(!lle.b()));
        this.t0 = a2;
        this.u0 = new w7c(a2);
        this.v0 = new w7c(r0e.a(Boolean.valueOf(lle.b())));
        q0e a3 = r0e.a(Boolean.valueOf(lle.b()));
        this.w0 = a3;
        q0e a4 = r0e.a(0);
        this.x0 = a4;
        od2.L(od2.F(new zn5(od2.s(c37.c(((kxc) q()).j), c37.c(((kxc) q()).k), new w7c(a3), new w7c(a4), new dx9(this, (Continuation) null)), new bx9(this, (Continuation) null), 5), ((w9a) ((kke) d3.getValue())).b()), this.a);
    }

    public static eqe r(int i) {
        return i != 0 ? i != 1 ? i != 2 ? new eqe(eea.t) : new eqe(eea.u) : new eqe(eea.s) : new eqe(eea.t);
    }

    public final hp q() {
        return (hp) this.c.getValue();
    }

    public final void s(long j) {
        int i = (j > ((long) dea.m) ? 1 : (j == ((long) dea.m) ? 0 : -1));
        je7 je7 = this.X;
        bc7[] bc7Arr = C0;
        if (i == 0) {
            vxd S = j47.S(this.a, ((w9a) ((kke) je7.getValue())).b(), vx3.b, new ex9(this, (Continuation) null));
            this.A0.o1(this, bc7Arr[1], S);
            return;
        }
        int i2 = (j > ((long) dea.k) ? 1 : (j == ((long) dea.k) ? 0 : -1));
        s35 s35 = this.y0;
        if (i2 == 0) {
            sv9.c.getClass();
            pnf.o(s35, new c64(":settings/notifications/dialog"));
        } else if (j == ((long) dea.d)) {
            sv9.c.getClass();
            pnf.o(s35, new c64(":settings/notifications/chat"));
        } else if (j == ((long) dea.s)) {
            sv9.c.getClass();
            pnf.o(s35, new c64(":settings/notifications/other"));
        } else if (j == ((long) dea.w)) {
            this.B0.o1(this, bc7Arr[2], pnf.n(this, ((w9a) ((kke) je7.getValue())).b(), (vx3) null, new cx9(this, (Continuation) null), 2));
        } else if (j == ((long) dea.o)) {
            pnf.o(s35, uw9.b);
        }
    }
}
