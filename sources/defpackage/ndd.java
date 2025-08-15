package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ndd  reason: default package */
public final class ndd extends pnf {
    public static final /* synthetic */ bc7[] A0;
    public final q0e X;
    public final w7c Y;
    public final w4d Z = mqd.D();
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final w4d s0 = mqd.D();
    public final w4d t0 = mqd.D();
    public final w4d u0 = mqd.D();
    public final w4d v0 = mqd.D();
    public final w4d w0 = mqd.D();
    public final w4d x0 = mqd.D();
    public final w4d y0 = mqd.D();
    public final s35 z0 = new s35(0);

    static {
        Class<ndd> cls = ndd.class;
        A0 = new bc7[]{new oi9(cls, "loadVideoJob", "getLoadVideoJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "loadAudioJob", "getLoadAudioJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "loadGifJob", "getLoadGifJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "loadPhotoJob", "getLoadPhotoJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "loadQualityVideoJob", "getLoadQualityVideoJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "loadRoamingJob", "getLoadRoamingJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "loadGifEnablingJob", "getLoadGifEnablingJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "loadAnimojiEnablingJob", "getLoadAnimojiEnablingJob()Lkotlinx/coroutines/Job;")};
    }

    public ndd(je7 je7, je7 je72, je7 je73) {
        this.b = je7;
        this.c = je72;
        this.o = je73;
        q0e a = r0e.a(nz4.a);
        this.X = a;
        this.Y = new w7c(a);
        pnf.n(this, (lx3) null, (vx3) null, new ddd(this, (Continuation) null), 3);
    }

    public static final Object q(ndd ndd, Continuation continuation) {
        Object t02 = j47.t0(((w9a) ((kke) ndd.b.getValue())).b(), new edd(ndd, (Continuation) null), continuation);
        return t02 == tx3.a ? t02 : e5f.a;
    }

    public static jqe t(int i, boolean z) {
        eqe eqe;
        if (i == -1) {
            eqe = z ? new eqe(gha.b) : new eqe(gha.c);
        } else if (i == 0) {
            eqe = new eqe(gha.a);
        } else if (i != 1) {
            return new iqe("");
        } else {
            eqe = new eqe(gha.g);
        }
        return eqe;
    }

    public final kxc r() {
        return (kxc) this.c.getValue();
    }

    public final void s(int i) {
        int i2 = fha.m;
        bc7[] bc7Arr = A0;
        if (i == i2) {
            vxd n = pnf.n(this, (lx3) null, (vx3) null, new gdd(this, !((jp) r()).g.getBoolean("app.media.autoplay.gif", true), (Continuation) null), 3);
            this.x0.o1(this, bc7Arr[6], n);
        } else if (i == fha.j) {
            vxd n2 = pnf.n(this, (lx3) null, (vx3) null, new fdd(this, !((rj) this.o.getValue()).a(), (Continuation) null), 3);
            this.y0.o1(this, bc7Arr[7], n2);
        } else if (i == fha.n) {
            vxd n3 = pnf.n(this, (lx3) null, (vx3) null, new kdd(this, !r().n(), (Continuation) null), 3);
            this.w0.o1(this, bc7Arr[5], n3);
        } else {
            int i3 = fha.o;
            s35 s35 = this.z0;
            if (i == i3) {
                pnf.o(s35, sgd.e);
            } else if (i == fha.s) {
                w(0);
            } else if (i == fha.u) {
                w(1);
            } else if (i == fha.t) {
                w(-1);
            } else if (i == fha.l) {
                pnf.o(s35, sgd.f);
            } else if (i == fha.g) {
                v(0);
            } else if (i == fha.i) {
                v(1);
            } else if (i == fha.h) {
                v(-1);
            } else if (i == fha.k) {
                pnf.o(s35, sgd.g);
            } else if (i == fha.a) {
                u(0);
            } else if (i == fha.c) {
                u(1);
            } else if (i == fha.b) {
                u(-1);
            } else if (i == fha.p) {
                pnf.o(s35, sgd.h);
            } else if (i == fha.d) {
                x(0);
            } else if (i == fha.f) {
                x(1);
            } else if (i == fha.e) {
                x(-1);
            } else if (i == fha.r) {
                pnf.o(s35, sgd.i);
            } else if (i == fha.v) {
                y(xdf.WITHOUT_COMPRESS);
            } else if (i == fha.x) {
                y(xdf.OPTIMAL);
            } else if (i == fha.w) {
                y(xdf.MAXIMUM);
            } else if (i == fha.q) {
                pnf.o(s35, qgd.b);
            }
        }
    }

    public final void u(int i) {
        vxd n = pnf.n(this, (lx3) null, (vx3) null, new hdd(this, i, (Continuation) null), 3);
        this.s0.o1(this, A0[1], n);
    }

    public final void v(int i) {
        vxd n = pnf.n(this, (lx3) null, (vx3) null, new idd(this, i, (Continuation) null), 3);
        this.t0.o1(this, A0[2], n);
    }

    public final void w(int i) {
        vxd n = pnf.n(this, (lx3) null, (vx3) null, new jdd(this, i, (Continuation) null), 3);
        this.u0.o1(this, A0[3], n);
    }

    public final void x(int i) {
        vxd n = pnf.n(this, (lx3) null, (vx3) null, new ldd(this, i, (Continuation) null), 3);
        this.Z.o1(this, A0[0], n);
    }

    public final void y(xdf xdf) {
        vxd n = pnf.n(this, (lx3) null, (vx3) null, new mdd(this, xdf, (Continuation) null), 3);
        this.v0.o1(this, A0[4], n);
    }
}
