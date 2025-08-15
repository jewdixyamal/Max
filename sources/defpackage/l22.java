package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: l22  reason: default package */
public final class l22 extends pnf {
    public static final /* synthetic */ bc7[] u0;
    public final q0e X;
    public final w7c Y;
    public final s35 Z;
    public final z12 b;
    public final q0e c;
    public final w7c o;
    public final s35 s0;
    public final w4d t0;

    static {
        oi9 oi9 = new oi9(l22.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        u0 = new bc7[]{oi9};
    }

    public l22(long j, reb reb, qeb qeb) {
        z12 z12;
        int ordinal = reb.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            z12 = new k72(j, this.a, qeb);
        } else if (ordinal == 2) {
            z12 = new zk3(j, this.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.b = z12;
        je7 d = neb.a.d();
        q0e a = r0e.a(nz4.a);
        this.c = a;
        this.o = new w7c(a);
        q0e a2 = r0e.a((Object) null);
        this.X = a2;
        this.Y = new w7c(a2);
        this.Z = new s35(0);
        this.s0 = new s35(0);
        this.t0 = mqd.D();
        od2.L(od2.F(new zn5(new t03(z12.f(), 11), new g22(this, (Continuation) null), 5), ((w9a) ((kke) d.getValue())).a()), this.a);
        od2.L(od2.F(new zn5(z12.e, new h22(this, (Continuation) null), 5), ((w9a) ((kke) d.getValue())).a()), this.a);
        od2.L(od2.F(new zn5(z12.f, new i22(this, (Continuation) null), 5), ((w9a) ((kke) d.getValue())).c()), this.a);
    }

    public final void p() {
        this.b.b();
    }
}
