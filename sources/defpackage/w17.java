package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: w17  reason: default package */
public final class w17 extends pnf implements dh3 {
    public static final /* synthetic */ bc7[] u0;
    public final w4d X = mqd.D();
    public final s35 Y = new s35(0);
    public final h35 Z = new h35(y53.M(new Object(), new xc(), new Object()));
    public final /* synthetic */ snf b;
    public final String c;
    public final String o;
    public final s35 s0;
    public final m32 t0;

    static {
        oi9 oi9 = new oi9(w17.class, "registerJob", "getRegisterJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        u0 = new bc7[]{oi9};
    }

    public w17(String str, String str2, je7 je7) {
        snf snf = new snf(je7, new pz2(29));
        this.b = snf;
        this.c = str;
        this.o = str2;
        s35 s35 = new s35(0);
        this.s0 = s35;
        this.t0 = od2.N(s35, new t03(new t03(snf.o, 11), 18));
    }

    public final v7c f() {
        return this.b.o;
    }

    public final void p() {
        bc7[] bc7Arr = u0;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.X;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[0], (Object) null);
    }

    public final void q(String str, boolean z) {
        pnf.o(this.s0, (z || str.length() != 0) ? mnd.a : zj6.a);
    }

    public final boolean r(int i, String str) {
        a73 a = this.Z.a(i, str);
        jqe jqe = a != null ? (jqe) x53.i0(a.a) : null;
        if (jqe == null) {
            return true;
        }
        pnf.o(this.s0, new m17(i, jqe));
        return false;
    }
}
