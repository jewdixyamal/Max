package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: vgb  reason: default package */
public final class vgb extends pnf {
    public static final /* synthetic */ bc7[] A0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final gv4 b;
    public final je7 c;
    public final je7 o;
    public final q0e s0;
    public final w7c t0;
    public final q0e u0;
    public final w7c v0;
    public final s35 w0 = new s35(0);
    public final s35 x0 = new s35(0);
    public final w4d y0 = mqd.D();
    public final AtomicReference z0 = new AtomicReference();

    static {
        oi9 oi9 = new oi9(vgb.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        A0 = new bc7[]{oi9};
    }

    public vgb(long j, reb reb) {
        gv4 gv4;
        neb neb = neb.a;
        this.c = neb.getAccessor().d(y7d.class);
        this.o = neb.d();
        khe khe = new khe(new lab(18));
        this.X = neb.getAccessor().d(eua.class);
        this.Y = neb.getAccessor().d(kk5.class);
        this.Z = neb.getAccessor().d(Application.class);
        neb.c();
        q0e a = r0e.a(nz4.a);
        this.s0 = a;
        this.t0 = new w7c(a);
        q0e a2 = r0e.a((Object) null);
        this.u0 = a2;
        this.v0 = new w7c(a2);
        int ordinal = reb.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            gv4 = new ka2(j, this.a);
        } else if (ordinal == 2) {
            gv4 = new jm3(j, this.a);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.b = gv4;
        od2.L(od2.F(new zn5(new t03(gv4.f, 11), new lgb(this, (Continuation) null), 5), ((w9a) q()).a()), this.a);
        od2.L(od2.F(new zn5(gv4.d, new mgb(this, (Continuation) null), 5), ((w9a) q()).c()), this.a);
        od2.L(od2.F(new zn5(gv4.e, new ngb(this, (Continuation) null), 5), ((w9a) q()).c()), this.a);
        od2.L(new zn5(new v7c(((dfb) khe.getValue()).a), new ugb(this, (Continuation) null), 5), this.a);
    }

    public final void p() {
        this.b.b();
    }

    public final kke q() {
        return (kke) this.o.getValue();
    }

    public final void r() {
        if (!((eua) this.X.getValue()).b(eua.l)) {
            pnf.o(this.w0, hfb.b);
            return;
        }
        j47.T(this.a, ((w9a) q()).b(), (vx3) null, new sgb(this, (Continuation) null), 2);
    }

    public final void s() {
        this.z0.set((Object) null);
        pnf.o(this.w0, new sfb(new eqe(vea.j), Integer.valueOf(woc.I)));
    }

    public final void t() {
        this.z0.set((Object) null);
        pnf.o(this.w0, new sfb(new eqe(vea.p), Integer.valueOf(woc.I)));
    }

    public final void u() {
        vxd T = j47.T(this.a, (lx3) null, (vx3) null, new tgb(this, (Continuation) null), 3);
        this.y0.o1(this, A0[0], T);
    }
}
