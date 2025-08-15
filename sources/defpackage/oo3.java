package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: oo3  reason: default package */
public final class oo3 extends pnf {
    public static final /* synthetic */ bc7[] G0;
    public static final l45 H0 = new l45(y53.M(vj3.c, vj3.Z, vj3.s0, vj3.a, vj3.b, vj3.o, vj3.t0, vj3.X, vj3.Y));
    public final w4d A0 = mqd.D();
    public final js3 B0;
    public final s35 C0;
    public final s35 D0;
    public final q0e E0;
    public final q0e F0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final uo3 b;
    public final kke c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final w7c z0;

    static {
        oi9 oi9 = new oi9(oo3.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        G0 = new bc7[]{oi9};
    }

    public oo3(uo3 uo3, je7 je7, qn3 qn3, je7 je72, kke kke, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79, je7 je710, je7 je711, je7 je712, je7 je713, je7 je714) {
        uo3 uo32 = uo3;
        kke kke2 = kke;
        this.b = uo32;
        this.c = kke2;
        this.o = je74;
        this.X = je75;
        this.Y = je76;
        this.Z = je77;
        this.s0 = je78;
        this.t0 = je79;
        this.u0 = je710;
        this.v0 = je711;
        this.w0 = je712;
        this.x0 = je713;
        this.y0 = je714;
        q0e a = r0e.a(dn3.d);
        w7c w7c = new w7c(a);
        this.z0 = w7c;
        je7 je715 = je72;
        this.B0 = new js3(this.a, w7c, new td((Object) je72, (Object) (Context) je7.getValue(), uo32 == uo3.a, 8), new v07(kke2), je73);
        this.C0 = new s35(0);
        this.D0 = new s35(0);
        q0e a2 = r0e.a(new eqe(a9a.j));
        this.E0 = a2;
        this.F0 = a2;
        od2.L(new zn5(new ac(qn3.a(), 17, this), new vw(2, a, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 17), 5), this.a);
        qn3.b();
        pnf.n(this, ((w9a) kke2).b(), (vx3) null, new eo3(this, (Continuation) null), 2);
    }

    public final void q(int i, long j) {
        pnf.n(this, ((w9a) this.c).a(), (vx3) null, new jo3(i, this, j, (Continuation) null), 2);
    }

    public final void r() {
        bc7[] bc7Arr = G0;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.A0;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 == null || !x77.isActive()) {
            w4d.o1(this, bc7Arr[0], pnf.n(this, ((w9a) this.c).c(), (vx3) null, new lo3(this, (Continuation) null), 2));
        }
    }
}
