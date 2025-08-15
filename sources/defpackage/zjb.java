package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: zjb  reason: default package */
public final class zjb extends pnf {
    public static final /* synthetic */ bc7[] B0;
    public z87 A0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final long b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final kld t0;
    public final w4d u0 = mqd.D();
    public final kld v0;
    public final v7c w0;
    public final s35 x0;
    public final AtomicLong y0;
    public final q0e z0;

    static {
        oi9 oi9 = new oi9(zjb.class, "updateOptionsJob", "getUpdateOptionsJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        B0 = new bc7[]{oi9};
    }

    public zjb(long j, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        long j2 = j;
        this.b = j2;
        this.c = je7;
        this.o = je72;
        this.X = je73;
        this.Y = je76;
        this.Z = je75;
        this.s0 = je77;
        kld b2 = lld.b(0, 0, 0, 7);
        this.t0 = b2;
        m32 N = od2.N(new ujb(((rh0) je74.getValue()).b, this, 1), new t03(b2, 11));
        kld a = lld.a(1, 1, 2);
        this.v0 = a;
        this.w0 = new v7c(a);
        this.x0 = new s35(0);
        this.y0 = new AtomicLong(-9223372036854775807L);
        this.z0 = r0e.a(new ljb(false, false, false, false, false));
        y77 a2 = pag.a();
        a2.H();
        this.A0 = a2;
        od2.L(od2.F(new mqc(new xjb(new ujb(new t03(((jz2) ((iy2) je7.getValue())).m(j2), 11), this, 0), (Continuation) null, this)), ((w9a) ((kke) je72.getValue())).a()), this.a);
        od2.L(od2.F(new zn5(N, new pjb(this, (Continuation) null), 5), ((w9a) ((kke) je72.getValue())).a()), this.a);
    }

    public static final Object q(zjb zjb, ljb ljb, Continuation continuation) {
        zjb zjb2 = zjb;
        ljb ljb2 = ljb;
        zjb.getClass();
        kl7 l = j1e.l();
        l.add(new s0d(new eqe(vea.E1), (kqe) null, 0, 14));
        int i = sea.n0;
        l.add(new x6(i, new vfd((long) i, 0, new eqe(vea.C1), (jfd) null, (jqe) null, new Integer(woc.r0), new ffd(ljb2.a, true), (zed) null, (jqe) null, 0, (wed) null, 1944), 536871936));
        int i2 = sea.l0;
        eqe eqe = new eqe(vea.A1);
        Integer num = new Integer(woc.b);
        boolean z = ljb2.b;
        boolean z2 = z;
        l.add(new x6(i2, new vfd((long) i2, 0, eqe, (jfd) null, (jqe) null, num, new ffd(z, true), (zed) null, (jqe) null, 0, (wed) null, 1944), 1073742848));
        int i3 = sea.o0;
        l.add(new x6(i3, new vfd((long) i3, 0, new eqe(vea.D1), (jfd) null, (jqe) null, new Integer(woc.E1), new ffd(ljb2.c, true), (zed) null, (jqe) null, 0, (wed) null, 1944), 1073742848));
        je7 je7 = zjb2.s0;
        if (((se5) ((qe5) je7.getValue())).r()) {
            se5 se5 = (se5) ((qe5) je7.getValue());
            se5.getClass();
            if (se5.n(PmsKey.gcmpe, false)) {
                int i4 = sea.m0;
                l.add(new x6(i4, new vfd((long) i4, 0, new eqe(vea.B1), (jfd) null, (jqe) null, new Integer(woc.B1), new ffd(ljb2.d, true), (zed) null, (jqe) null, 0, (wed) null, 1944), 1073742848));
            }
        }
        if (((se5) ((qe5) je7.getValue())).p()) {
            int i5 = sea.p0;
            l.add(new x6(i5, new vfd((long) i5, 0, new eqe(vea.F1), (jfd) null, (jqe) null, new Integer(woc.f1), new ffd(ljb2.e, z2), (zed) null, (jqe) null, 0, (wed) null, 1944), 1073742848));
        }
        Object obj = l.get(y53.L(l));
        x6 x6Var = obj instanceof x6 ? (x6) obj : null;
        if (x6Var != null) {
            l.set(y53.L(l), new x6(x6Var.a, x6Var.b, -2147482624));
        }
        Object a = zjb2.v0.a(j1e.d(l), continuation);
        return a == tx3.a ? a : e5f.a;
    }

    public static final ljb r(zjb zjb, e52 e52) {
        zjb.getClass();
        z82 z82 = e52.b.H;
        boolean z = z82.i;
        return new ljb(!z82.b, !z82.d, z82.e, !z82.f, z);
    }

    public final void s(HashMap hashMap) {
        vxd S = j47.S(this.a, ((w9a) ((kke) this.o.getValue())).b(), vx3.b, new yjb(this, hashMap, (Continuation) null));
        this.u0.o1(this, B0[0], S);
    }
}
