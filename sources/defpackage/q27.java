package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: q27  reason: default package */
public final class q27 extends pnf implements dh3 {
    public static final /* synthetic */ bc7[] B0;
    public final qec A0;
    public final je7 X;
    public final s35 Y = new s35(0);
    public final kld Z;
    public final /* synthetic */ snf b;
    public final je7 c;
    public final je7 o;
    public final s35 s0;
    public final m32 t0;
    public final w4d u0;
    public final w4d v0;
    public final q0e w0;
    public final w7c x0;
    public final q0e y0;
    public final mn5 z0;

    static {
        Class<q27> cls = q27.class;
        B0 = new bc7[]{new oi9(cls, "authJob", "getAuthJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;")};
    }

    public q27(khe khe, je7 je7, je7 je72) {
        lt7 lt7 = lt7.a;
        khe d = lt7.getAccessor().d(ty3.class);
        khe d2 = lt7.getAccessor().d(zua.class);
        snf snf = new snf(je72, new g27(0));
        this.b = snf;
        this.c = khe;
        this.o = je7;
        this.X = d2;
        kld b2 = lld.b(0, 0, 0, 7);
        this.Z = b2;
        this.s0 = new s35(0);
        m32 N = od2.N(b2, new t03(snf.o, 11));
        this.t0 = N;
        this.u0 = mqd.D();
        this.v0 = mqd.D();
        q0e a = r0e.a(daa.b);
        this.w0 = a;
        sb1 sb1 = new sb1(a, this, je7, d2, 2);
        my3 my3 = new my3((eaa) a.getValue(), Integer.MAX_VALUE, new eqe(v0c.oneme_login_input_default_phone_hint));
        this.x0 = od2.X(sb1, this.a, wld.a, my3);
        q0e a2 = r0e.a("");
        this.y0 = a2;
        this.z0 = od2.F(new j31(new ac(a2, 26, this), new e21(a, d2, 2), new j27(3, (Continuation) null, 0), 4), ((w9a) ((kke) je7.getValue())).a());
        this.A0 = new qec("[^0-9+]");
        od2.L(od2.F(new zn5(N, new h27(this, d, (Continuation) null), 5), ((w9a) ((kke) je7.getValue())).a()), this.a);
    }

    public final v7c f() {
        return this.b.o;
    }

    public final void p() {
        bc7[] bc7Arr = B0;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.u0;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[0], (Object) null);
        bc7 bc72 = bc7Arr[1];
        w4d w4d2 = this.v0;
        x77 x772 = (x77) w4d2.T0(this, bc72);
        if (x772 != null) {
            x772.cancel((CancellationException) null);
        }
        w4d2.o1(this, bc7Arr[1], (Object) null);
    }
}
