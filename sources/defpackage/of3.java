package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: of3  reason: default package */
public final class of3 extends pnf implements dh3 {
    public static final /* synthetic */ bc7[] F0;
    public static final String G0;
    public final gld A0;
    public final q0e B0;
    public volatile String C0;
    public vxd D0;
    public final w4d E0;
    public final String X;
    public final je7 Y;
    public final je7 Z;
    public final /* synthetic */ snf b;
    public final int c;
    public String o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final kld v0;
    public final m32 w0;
    public final s35 x0 = new s35(0);
    public final q0e y0;
    public final w7c z0;

    static {
        Class<of3> cls = of3.class;
        oi9 oi9 = new oi9(cls, "loginJob", "getLoginJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        F0 = new bc7[]{oi9};
        G0 = cls.getName();
    }

    public of3(int i, String str, String str2, khe khe, khe khe2, khe khe3, je7 je7, je7 je72) {
        lt7 lt7 = lt7.a;
        khe d = lt7.getAccessor().d(ty3.class);
        khe d2 = lt7.getAccessor().d(cud.class);
        snf snf = new snf(je72, new pz2(5));
        this.b = snf;
        this.c = i;
        this.o = str;
        this.X = str2;
        this.Y = khe;
        this.Z = khe2;
        this.s0 = khe3;
        this.t0 = je7;
        this.u0 = d2;
        kld b2 = lld.b(0, 1, 2, 1);
        this.v0 = b2;
        m32 N = od2.N(b2, new t03(new t03(snf.o, 11), 1));
        this.w0 = N;
        q0e a = r0e.a(60L);
        this.y0 = a;
        this.z0 = od2.X(new t03(a, 2), this.a, wld.a, (Object) null);
        this.A0 = ((we6) ((cud) d2.getValue())).c;
        this.B0 = r0e.a(Boolean.FALSE);
        this.E0 = mqd.D();
        od2.L(od2.F(new zn5(N, new hf3(this, d, (Continuation) null), 5), ((w9a) ((kke) je7.getValue())).a()), this.a);
    }

    public final v7c f() {
        return this.b.o;
    }

    public final void p() {
        vxd vxd = this.D0;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        this.D0 = null;
        bc7[] bc7Arr = F0;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.E0;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[0], (Object) null);
    }
}
