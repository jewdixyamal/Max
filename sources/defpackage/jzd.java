package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: jzd  reason: default package */
public final class jzd extends pnf {
    public static final /* synthetic */ bc7[] A0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 b;
    public final y7d c;
    public final je7 o;
    public final w4d s0 = mqd.D();
    public final q0e t0;
    public final w7c u0;
    public final js3 v0;
    public final q0e w0;
    public final w7c x0;
    public final s35 y0;
    public final s35 z0;

    static {
        oi9 oi9 = new oi9(jzd.class, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        A0 = new bc7[]{oi9};
    }

    public jzd(je7 je7, je7 je72, je7 je73, qn3 qn3, je7 je74, je7 je75, je7 je76, je7 je77, y7d y7d) {
        this.b = je72;
        this.c = y7d;
        this.o = je7;
        this.X = je75;
        this.Y = je76;
        this.Z = je77;
        q0e a = r0e.a(dn3.d);
        this.t0 = a;
        w7c w7c = new w7c(a);
        this.u0 = w7c;
        this.v0 = new js3(this.a, w7c, new td((Object) je74, (Object) (Context) je72.getValue(), false, 8), je7, je73);
        q0e a2 = r0e.a(nz4.a);
        this.w0 = a2;
        this.x0 = new w7c(a2);
        this.y0 = new s35(0);
        this.z0 = new s35(0);
        od2.L(new zn5(qn3.a(), new dzd(this, (Continuation) null), 5), this.a);
        qn3.b();
        pnf.n(this, (lx3) null, (vx3) null, new ezd(this, (Continuation) null), 3);
    }

    public final void q() {
        bc7[] bc7Arr = A0;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.s0;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 == null || !x77.isActive()) {
            w4d.o1(this, bc7Arr[0], pnf.n(this, ((w9a) ((kke) this.o.getValue())).c(), (vx3) null, new izd(this, (Continuation) null), 2));
        }
    }
}
