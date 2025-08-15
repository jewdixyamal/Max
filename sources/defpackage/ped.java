package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ped  reason: default package */
public final class ped extends pnf implements t15 {
    public static final /* synthetic */ bc7[] z0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final ep0 b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final q0e t0;
    public final w7c u0;
    public Long v0;
    public int w0;
    public final w4d x0 = mqd.D();
    public final s35 y0 = new s35(0);

    static {
        oi9 oi9 = new oi9(ped.class, "openProfileJob", "getOpenProfileJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        z0 = new bc7[]{oi9};
    }

    public ped(ep0 ep0) {
        ehd ehd = ehd.a;
        khe d = ehd.getAccessor().d(pk.class);
        khe d2 = ehd.getAccessor().d(ds3.class);
        khe d3 = ehd.getAccessor().d(iy2.class);
        khe d4 = ehd.getAccessor().d(oq3.class);
        khe d5 = ehd.getAccessor().d(qq3.class);
        je7 b2 = ehd.b();
        this.b = ep0;
        this.c = d;
        this.o = d2;
        this.X = d3;
        this.Y = d4;
        this.Z = d5;
        this.s0 = b2;
        q0e a = r0e.a(oz4.a);
        this.t0 = a;
        this.u0 = new w7c(a);
        od2.L(new zn5(new v7c(ep0.b), new ked(this, d2, (Continuation) null), 5), this.a);
        pnf.n(this, (lx3) null, (vx3) null, new led(this, (Continuation) null), 3);
    }

    public final boolean h() {
        return false;
    }

    public final void l() {
        q(this.w0);
    }

    public final boolean m() {
        return this.w0 < Integer.MAX_VALUE;
    }

    public final void p() {
        ep0 ep0 = this.b;
        ((av0) ep0.a.getValue()).f(ep0);
    }

    public final void q(int i) {
        if (this.v0 == null) {
            k4a k4a = (k4a) ((pk) this.c.getValue());
            this.v0 = Long.valueOf(k4a.v(k4a, new gn3(((p7b) k4a.y()).a.o(), i)));
        }
    }
}
