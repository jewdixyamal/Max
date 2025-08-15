package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: nx2  reason: default package */
public final class nx2 extends pnf {
    public static final /* synthetic */ bc7[] X0;
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public final je7 E0;
    public final je7 F0;
    public final q0e G0;
    public final w7c H0;
    public final q0e I0;
    public final q0e J0;
    public final w7c K0;
    public final w7c L0;
    public final q0e M0;
    public final w7c N0;
    public final s35 O0;
    public final s35 P0;
    public volatile gi9 Q0;
    public final fi9 R0;
    public final q0e S0;
    public final w4d T0;
    public final kld U0;
    public final mn5 V0;
    public vxd W0;
    public final pu2 X;
    public final kke Y;
    public final je7 Z;
    public final qn3 b;
    public final String c;
    public final rg1 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        oi9 oi9 = new oi9(nx2.class, "unblockContactJob", "getUnblockContactJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        X0 = new bc7[]{oi9};
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [a66, ffe] */
    public nx2(qn3 qn3, String str, rg1 rg1) {
        khe khe;
        Object obj;
        i07 i07;
        String str2 = str;
        ys2 ys2 = ys2.a;
        pu2 a = ((rt2) ys2.getAccessor().c(rt2.class)).a(str2);
        kke kke = (kke) ys2.getAccessor().c(kke.class);
        khe d = ys2.getAccessor().d(j52.class);
        khe d2 = ys2.getAccessor().d(zfc.class);
        khe d3 = ys2.getAccessor().d(iy2.class);
        khe d4 = ys2.getAccessor().d(p82.class);
        khe d5 = ys2.getAccessor().d(ck3.class);
        khe d6 = ys2.getAccessor().d(qq3.class);
        khe d7 = ys2.getAccessor().d(q33.class);
        khe d8 = ys2.getAccessor().d(y7d.class);
        khe d9 = ys2.getAccessor().d(p7c.class);
        qf7 qf7 = (qf7) ys2.getAccessor().c(qf7.class);
        j07 j07 = (j07) ys2.getAccessor().c(j07.class);
        j07.getClass();
        if (str2.equals("all.chat.folder")) {
            obj = "all.chat.folder";
            khe = d9;
            i07 = new ey1(2, (eca) j07.a.c(eca.class));
        } else {
            khe = d9;
            obj = "all.chat.folder";
            i07 = i07.L;
        }
        khe d10 = ys2.getAccessor().d(ta2.class);
        khe d11 = ys2.getAccessor().d(xb9.class);
        khe d12 = ys2.getAccessor().d(qu2.class);
        khe d13 = ys2.getAccessor().d(vj7.class);
        khe d14 = ys2.getAccessor().d(afe.class);
        khe d15 = ys2.getAccessor().d(s8g.class);
        khe d16 = ys2.getAccessor().d(oc6.class);
        this.b = qn3;
        this.c = str2;
        this.o = rg1;
        this.X = a;
        this.Y = kke;
        this.Z = d2;
        this.s0 = d7;
        this.t0 = d8;
        this.u0 = d3;
        this.v0 = d4;
        this.w0 = d5;
        this.x0 = d6;
        this.y0 = d;
        this.z0 = khe;
        this.A0 = d10;
        this.B0 = d11;
        this.C0 = d13;
        this.D0 = d14;
        this.E0 = d15;
        this.F0 = d16;
        q0e a2 = r0e.a(i07.b());
        this.G0 = a2;
        this.H0 = new w7c(a2);
        q0e a3 = r0e.a(nz4.a);
        this.I0 = a3;
        q0e a4 = r0e.a(a3.getValue());
        this.J0 = a4;
        xk1 xk1 = new xk1(a4, 23);
        Object value = a4.getValue();
        c32 c32 = wld.a;
        this.K0 = od2.X(xk1, this.a, c32, value);
        this.L0 = od2.X(new xk1(a4, 24), this.a, c32, a4.getValue());
        q0e a5 = r0e.a(Boolean.FALSE);
        this.M0 = a5;
        this.N0 = new w7c(a5);
        this.O0 = new s35(0);
        this.P0 = new s35(0);
        this.Q0 = vv7.a;
        fi9 fi9 = rv7.a;
        this.R0 = new fi9();
        this.S0 = r0e.a(0L);
        this.T0 = mqd.D();
        this.U0 = lld.a(20, 20, 2);
        if (tpa.f(str2, obj)) {
            wa9 wa9 = (wa9) ((qu2) d12.getValue());
            vxd vxd = wa9.h;
            if (vxd != null) {
                vxd.cancel((CancellationException) null);
            }
            m58 m58 = new m58(new jp5(a.y0, 0), 11);
            int i = ft4.o;
            wa9.h = od2.L(od2.h(new ac(od2.F(new zn5(od2.F(new sa9(od2.w(new sa9(nu0.Q(m58, z7.R(3, kt4.SECONDS)), wa9, 0), new ai0(19)), wa9, 1), wa9.e), new ua9(wa9, (Continuation) null), 5), wa9.d), 18, new er2(3, (Continuation) null, 2))), wa9.f);
        }
        od2.L(od2.F(new zn5(new sw2(new j31(a.y0, qf7.d, new c3(this, (Continuation) null, 7), 4), this, 0), new vw(2, a2, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 11), 5), ((w9a) kke).a()), this.a);
        qyc qyc = (qyc) ((y7d) d8.getValue());
        qyc.getClass();
        if (qyc.n(PmsKey.f39fakechats, false)) {
            String g = ((t33) ((q33) d7.getValue())).g("user.Phone", (String) null);
            StringBuilder sb = new StringBuilder();
            int length = g.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = g.charAt(i2);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            Long f0 = dae.f0(sb.toString());
            zn5 zn5 = new zn5(od2.M(new sb1(new j31(this.b.a(), new zn5(new sw2(new sw2(this.S0, this, 1), this, 2), new ffe(2, (Continuation) null)), new ax2(3, (Continuation) null, 0), 4), new yw2(new fs4(15), 0), this, f0, 1), new bx2(this, (Continuation) null)), new cx2(this, (Continuation) null));
            w9a w9a = (w9a) this.Y;
            mn5 F = od2.F(zn5, w9a.a());
            ContextScope contextScope = this.a;
            od2.L(F, contextScope);
            od2.L(od2.F(new zn5(this.H0, new dx2(this, (Continuation) null), 5), w9a.a()), contextScope);
        }
        j47.T(this.a, ((w9a) this.Y).a(), (vx3) null, new iw2(this, (Continuation) null), 2);
        xk1 xk12 = new xk1(od2.x(this.U0), 26);
        int i3 = ft4.o;
        od2.L(od2.F(new ac(new zn5(new xk1(new sw2(new m32(new vn5(z7.R(5, kt4.SECONDS), xk12, (Continuation) null), hz4.a, -2, 1, 0), this, 4), 27), new kx2(this, (Continuation) null), 5), 18, new er2(3, (Continuation) null, 1)), ((w9a) this.Y).b().limitedParallelism(1, "missed")), this.a);
        this.V0 = od2.F(new xk1(od2.x(new sw2(new j31(this.G0, ((zb2) ((ta2) this.A0.getValue())).g(), new xh0(3, (Continuation) null, 6), 4), this, 3)), 25), ((w9a) this.Y).a());
    }

    public static final boolean q(nx2 nx2, mt2 mt2) {
        nx2.getClass();
        return mt2.a.size() <= 10 && !mt2.b;
    }

    public static final iy2 r(nx2 nx2) {
        return (iy2) nx2.u0.getValue();
    }

    public static final void s(nx2 nx2, long j, long j2) {
        p82 t = nx2.t();
        long e = ft4.e(j2) + ((hyc) ((q33) nx2.s0.getValue())).n();
        e52 C = t.C(j);
        if (C != null) {
            t.l(e, C);
            ((k4a) ((pk) t.p.get())).r(C.a);
        }
    }

    public final p82 t() {
        return (p82) this.v0.getValue();
    }

    public final void u() {
        q0e q0e = this.S0;
        q0e.m((Object) null, Long.valueOf(((Number) q0e.getValue()).longValue() + 1));
    }

    public final void v() {
        vxd vxd = this.W0;
        if (vxd == null || !vxd.isActive()) {
            this.W0 = pnf.n(this, ((w9a) this.Y).c(), (vx3) null, new pw2(this, (Continuation) null), 2);
        }
    }
}
