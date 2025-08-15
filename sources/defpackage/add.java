package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: add  reason: default package */
public final class add extends pnf {
    public static final /* synthetic */ bc7[] K0;
    public final s35 A0 = new s35(0);
    public final q0e B0;
    public final w7c C0;
    public final q0e D0;
    public final w7c E0;
    public final AtomicReference F0;
    public final AtomicLong G0;
    public final w4d H0;
    public final w4d I0;
    public final ai9 J0;
    public final Application X;
    public final je7 Y;
    public final je7 Z;
    public final x6a b;
    public final mb6 c;
    public final oc6 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final fc3 y0 = new fc3(5);
    public final s35 z0 = new s35(0);

    static {
        Class<add> cls = add.class;
        K0 = new bc7[]{new oi9(cls, "showInviteDialogJob", "getShowInviteDialogJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "sectionItemsJob", "getSectionItemsJob()Lkotlinx/coroutines/Job;")};
    }

    public add() {
        yfd yfd = yfd.a;
        khe d = yfd.getAccessor().d(m7b.class);
        khe d2 = yfd.getAccessor().d(lle.class);
        khe d3 = yfd.getAccessor().d(kke.class);
        khe d4 = yfd.getAccessor().d(eua.class);
        yfd.getClass();
        Application application = new Application();
        khe d5 = yfd.getAccessor().d(kk5.class);
        khe d6 = yfd.getAccessor().d(pk.class);
        hhb hhb = (hhb) yfd.getAccessor().c(hhb.class);
        khe d7 = yfd.getAccessor().d(iy2.class);
        khe d8 = yfd.getAccessor().d(l67.class);
        this.b = (x6a) yfd.getAccessor().c(x6a.class);
        this.c = (mb6) yfd.getAccessor().c(mb6.class);
        this.o = (oc6) yfd.getAccessor().c(oc6.class);
        this.X = application;
        this.Y = d;
        this.Z = d2;
        this.s0 = d3;
        this.t0 = d4;
        this.u0 = d5;
        this.v0 = d6;
        this.w0 = d7;
        this.x0 = d8;
        q0e a = r0e.a(did.h);
        this.B0 = a;
        this.C0 = new w7c(a);
        q0e a2 = r0e.a(nz4.a);
        this.D0 = a2;
        this.E0 = new w7c(a2);
        this.F0 = new AtomicReference();
        this.G0 = new AtomicLong();
        this.H0 = mqd.D();
        this.I0 = mqd.D();
        this.J0 = new ai9(2);
        q();
        j47.T(this.a, ((w9a) ((kke) d3.getValue())).a(), (vx3) null, new ncd((wxc) yfd.getAccessor().c(wxc.class), (blb) yfd.getAccessor().d(blb.class).getValue(), d, this, (Continuation) null), 2);
        od2.L(new zn5(new v7c(hhb.a), new ocd(this, (Continuation) null), 5), this.a);
    }

    public final void q() {
        vxd S = j47.S(this.a, ((w9a) r()).a(), vx3.b, new scd(this, (Continuation) null));
        this.I0.o1(this, K0[1], S);
    }

    public final kke r() {
        return (kke) this.s0.getValue();
    }

    public final m7b s() {
        return (m7b) this.Y.getValue();
    }

    public final Long t() {
        long j = ((did) this.C0.a.getValue()).a;
        Long valueOf = Long.valueOf(j);
        if (j != -1) {
            return valueOf;
        }
        return null;
    }

    public final void u() {
        if (!((eua) this.t0.getValue()).b(eua.l)) {
            pnf.o(this.z0, ugd.b);
            return;
        }
        j47.T(this.a, ((w9a) r()).b(), (vx3) null, new zcd(this, (Continuation) null), 2);
    }

    public final void v() {
        this.F0.set((Object) null);
        pnf.o(this.z0, new ahd(new eqe(mha.o), Integer.valueOf(woc.I)));
    }

    public final void w() {
        this.F0.set((Object) null);
        pnf.o(this.z0, new ahd(new eqe(mha.q), Integer.valueOf(woc.I)));
    }
}
