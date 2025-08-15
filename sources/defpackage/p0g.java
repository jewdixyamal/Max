package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p0g  reason: default package */
public final class p0g extends pnf {
    public static final /* synthetic */ bc7[] z0;
    public final String X = p0g.class.getName();
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final long c;
    public final kxf o;
    public final je7 s0;
    public final q0e t0;
    public final w7c u0;
    public final s35 v0;
    public final s35 w0;
    public final w4d x0;
    public final w4d y0;

    static {
        Class<p0g> cls = p0g.class;
        z0 = new bc7[]{new oi9(cls, "toggleBiometryJob", "getToggleBiometryJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "loadWebAppSectionsJob", "getLoadWebAppSectionsJob()Lkotlinx/coroutines/Job;")};
    }

    public p0g(long j, long j2) {
        StringBuilder k = au1.k(j, "webapp_biom_s_key_", "_");
        k.append(j2);
        kxf kxf = new kxf(k.toString(), true);
        jwf jwf = jwf.a;
        khe d = jwf.getAccessor().d(mtf.class);
        khe d2 = jwf.getAccessor().d(uc6.class);
        khe d3 = jwf.getAccessor().d(kke.class);
        this.b = j;
        this.c = j2;
        this.o = kxf;
        this.Y = d;
        this.Z = d2;
        this.s0 = d3;
        q0e a = r0e.a(new l0g("", nz4.a));
        this.t0 = a;
        this.u0 = new w7c(a);
        this.v0 = new s35(0);
        this.w0 = new s35(0);
        this.x0 = mqd.D();
        this.y0 = mqd.D();
        q();
    }

    public final void q() {
        vxd S = j47.S(this.a, ((w9a) ((kke) this.s0.getValue())).b(), vx3.b, new m0g(this, (Continuation) null));
        this.y0.o1(this, z0[1], S);
    }
}
