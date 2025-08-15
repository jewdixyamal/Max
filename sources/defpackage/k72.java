package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: k72  reason: default package */
public final class k72 extends z12 {
    public static final /* synthetic */ bc7[] x;
    public final qeb j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;
    public final mn5 p;
    public final kld q;
    public final v7c r;
    public final w4d s = mqd.D();
    public final AtomicLong t = new AtomicLong();
    public final AtomicLong u = new AtomicLong();
    public final AtomicLong v = new AtomicLong();
    public final AtomicBoolean w = new AtomicBoolean();

    static {
        oi9 oi9 = new oi9(k72.class, "generateLinkJob", "getGenerateLinkJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        x = new bc7[]{oi9};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k72(long j2, sx3 sx3, qeb qeb) {
        super(j2, sx3);
        long j3 = j2;
        sx3 sx32 = sx3;
        neb neb = neb.a;
        je7 d = neb.d();
        je7 c = neb.c();
        khe d2 = neb.getAccessor().d(fl7.class);
        khe khe = new khe(new m52(2));
        je7 b = neb.b();
        khe khe2 = new khe(new m52(3));
        khe d3 = neb.getAccessor().d(rh0.class);
        this.j = qeb;
        this.k = d;
        this.l = c;
        this.m = d2;
        this.n = khe;
        this.o = b;
        khe khe3 = (khe) d;
        this.p = od2.F(new j31(new t03(this.c, 11), this.d, f72.s0, 4), ((w9a) ((kke) khe3.getValue())).a());
        kld b2 = lld.b(0, 0, 0, 7);
        this.q = b2;
        this.r = new v7c(b2);
        od2.L(od2.F(new zn5(this.i, new p62(this, (Continuation) null), 5), ((w9a) ((kke) khe3.getValue())).a()), sx32);
        od2.L(od2.F(new zn5(new b72(new zn5(new mqc(new e72(new t03(((jz2) ((iy2) ((khe) c).getValue())).m(j3), 11), (Continuation) null, this)), new q62(this, (Continuation) null), 5), this, 0), new r62(this, (Continuation) null), 5), ((w9a) ((kke) khe3.getValue())).b()), sx32);
        od2.L(new zn5(new b72(((rh0) d3.getValue()).b, this, 1), new vw(2, this, k72.class, "handleError", "handleError(Lone/me/profileedit/screens/changelink/ChangeLinkErrors;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), 5), sx32);
        od2.L(new zn5(new v7c(((dfb) khe2.getValue()).a), new n62(this, j3, (Continuation) null), 5), sx32);
    }

    public static final void m(k72 k72, e52 e52) {
        k72.getClass();
        o22 t2 = t(e52);
        k72.h.m((Object) null, t2);
        q0e q0e = k72.i;
        q0e.m((Object) null, t2);
        o22 o22 = (o22) q0e.getValue();
        if ((o22 != null ? o22.b : null) == n22.c) {
            q0e.m((Object) null, t2);
        }
        k72.d(k72.s());
    }

    public static o22 t(e52 e52) {
        String str;
        String str2;
        Object obj;
        Uri parse;
        qx7 qx7 = n22.a;
        int i = e52.b.r0;
        if (i == 1) {
            str = "PUBLIC";
        } else if (i == 2) {
            str = "PRIVATE";
        } else {
            throw null;
        }
        qx7.getClass();
        Iterator it = n22.X.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            str2 = null;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (tpa.f(((n22) obj).name(), str)) {
                break;
            }
        }
        n22 n22 = (n22) obj;
        if (n22 == null) {
            n22 = n22.c;
        }
        n22 n222 = n22.c;
        k92 k92 = e52.b;
        if (n22 == n222) {
            str2 = k92.I;
        } else {
            String str3 = k92.I;
            if (!(str3 == null || (parse = Uri.parse(str3)) == null)) {
                str2 = parse.getLastPathSegment();
            }
        }
        return new o22(n22, str2);
    }

    public final void a() {
        j47.T(this.b, ((w9a) p()).a(), (vx3) null, new t62(this, (Continuation) null), 2);
    }

    public final void b() {
        bc7[] bc7Arr = x;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.s;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[0], (Object) null);
    }

    public final Object c(Continuation continuation) {
        Object n2 = n(continuation);
        return n2 == tx3.a ? n2 : e5f.a;
    }

    public final void e() {
        vxd T = j47.T(this.b, ((w9a) p()).b(), (vx3) null, new v62(this, true, (Continuation) null), 2);
        this.s.o1(this, x[0], T);
    }

    public final mn5 f() {
        return this.p;
    }

    public final void g(int i) {
        j47.T(this.b, (lx3) null, (vx3) null, new w62(i, this, (Continuation) null), 3);
    }

    public final void h(int i) {
        j47.T(this.b, ((w9a) p()).a(), (vx3) null, new x62(i, this, (Continuation) null), 2);
    }

    public final void i(int i) {
        j47.T(this.b, ((w9a) p()).a(), (vx3) null, new y62(i, this, (Continuation) null), 2);
    }

    public final Object j(Continuation continuation) {
        o22 o22;
        e52 o2 = o();
        e5f e5f = e5f.a;
        if (o2 == null || (o22 = (o22) this.i.getValue()) == null) {
            return e5f;
        }
        qeb qeb = qeb.CREATE;
        kld kld = this.f;
        tx3 tx3 = tx3.a;
        if (this.j == qeb && o2.I() && tpa.f(q(), Boolean.FALSE)) {
            Object a = kld.a(new qcb(this.a), continuation);
            return a == tx3 ? a : e5f;
        } else if (o22.f) {
            Object a2 = kld.a(new ucb(o22.d, (Integer) null, 14), continuation);
            return a2 == tx3 ? a2 : e5f;
        } else {
            Object t0 = j47.t0(((w9a) p()).b(), new g72(this, o22, o2, (Continuation) null), continuation);
            return t0 == tx3 ? t0 : e5f;
        }
    }

    public final void k(String str) {
        j47.T(this.b, ((w9a) p()).c().getImmediate(), (vx3) null, new j72(this, str, (Continuation) null), 2);
    }

    public final void l(int i) {
        int i2 = sea.i0;
        q0e q0e = this.i;
        q0e q0e2 = this.h;
        if (i == i2) {
            o22 o22 = (o22) q0e2.getValue();
            n22 n22 = o22 != null ? o22.b : null;
            n22 n222 = n22.c;
            q0e.setValue(n22 == n222 ? (o22) q0e2.getValue() : new o22(n222, (String) null));
        } else if (i == sea.j0) {
            o22 o222 = (o22) q0e2.getValue();
            n22 n223 = o222 != null ? o222.b : null;
            n22 n224 = n22.b;
            q0e.setValue(n223 == n224 ? (o22) q0e2.getValue() : new o22(n224, (String) null));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.u62
            if (r0 == 0) goto L_0x0013
            r0 = r12
            u62 r0 = (defpackage.u62) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            u62 r0 = new u62
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 6
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r9) goto L_0x0047
            if (r2 == r8) goto L_0x0042
            if (r2 == r7) goto L_0x003c
            if (r2 != r6) goto L_0x0034
            defpackage.od2.a0(r12)
            goto L_0x00a3
        L_0x0034:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003c:
            k72 r11 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x007d
        L_0x0042:
            defpackage.od2.a0(r12)
            goto L_0x00f0
        L_0x0047:
            k72 r11 = r0.o
            defpackage.od2.a0(r12)
            goto L_0x00ca
        L_0x004e:
            defpackage.od2.a0(r12)
            q0e r12 = r11.i
            java.lang.Object r12 = r12.getValue()
            o22 r12 = (defpackage.o22) r12
            if (r12 != 0) goto L_0x005c
            return r3
        L_0x005c:
            n22 r2 = r12.b
            int r2 = r2.ordinal()
            kld r10 = r11.f
            java.lang.String r12 = r12.c
            if (r2 == 0) goto L_0x00aa
            if (r2 != r9) goto L_0x00a4
            if (r12 != 0) goto L_0x006d
            return r3
        L_0x006d:
            ocb r2 = new ocb
            r2.<init>(r12)
            r0.o = r11
            r0.Z = r7
            java.lang.Object r12 = r10.a(r2, r0)
            if (r12 != r1) goto L_0x007d
            return r1
        L_0x007d:
            boolean r12 = defpackage.tpa.s()
            if (r12 == 0) goto L_0x00f0
            kld r11 = r11.f
            ucb r12 = new ucb
            int r2 = defpackage.vea.m2
            eqe r7 = new eqe
            r7.<init>(r2)
            int r2 = defpackage.woc.s
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            r12.<init>(r7, r8, r4)
            r0.o = r5
            r0.Z = r6
            java.lang.Object r11 = r11.a(r12, r0)
            if (r11 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            return r3
        L_0x00a4:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x00aa:
            ocb r2 = new ocb
            je7 r6 = r11.m
            java.lang.Object r6 = r6.getValue()
            fl7 r6 = (defpackage.fl7) r6
            java.lang.String r6 = r6.e
            java.lang.String r7 = "/"
            java.lang.String r12 = defpackage.rh4.j(r6, r7, r12)
            r2.<init>(r12)
            r0.o = r11
            r0.Z = r9
            java.lang.Object r12 = r10.a(r2, r0)
            if (r12 != r1) goto L_0x00ca
            return r1
        L_0x00ca:
            boolean r12 = defpackage.tpa.s()
            if (r12 == 0) goto L_0x00f0
            kld r11 = r11.f
            ucb r12 = new ucb
            int r2 = defpackage.vea.r2
            eqe r6 = new eqe
            r6.<init>(r2)
            int r2 = defpackage.woc.s
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r2)
            r12.<init>(r6, r7, r4)
            r0.o = r5
            r0.Z = r8
            java.lang.Object r11 = r11.a(r12, r0)
            if (r11 != r1) goto L_0x00f0
            return r1
        L_0x00f0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k72.n(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final e52 o() {
        return (e52) ((jz2) ((iy2) this.l.getValue())).m(this.a).a.getValue();
    }

    public final kke p() {
        return (kke) this.k.getValue();
    }

    public final Boolean q() {
        o22 o22 = (o22) this.h.getValue();
        if (o22 != null) {
            return Boolean.valueOf(o22.b((q22) this.i.getValue()));
        }
        return null;
    }

    public final Object r(e22 e22, Continuation continuation) {
        boolean f = tpa.f(e22, b22.a);
        e5f e5f = e5f.a;
        tx3 tx3 = tx3.a;
        kld kld = this.f;
        if (f) {
            Object a = kld.a(new ucb(new eqe(vea.i2), new eqe(vea.g2), true, new Integer(woc.I)), continuation);
            return a == tx3 ? a : e5f;
        } else if (tpa.f(e22, c22.a)) {
            Object a2 = kld.a(new ucb(new eqe(vea.j2), new eqe(vea.h2), true, new Integer(woc.I)), continuation);
            return a2 == tx3 ? a2 : e5f;
        } else if (e22 instanceof a22) {
            Object a3 = kld.a(new ucb(((a22) e22).a, (Integer) null, 14), continuation);
            return a3 == tx3 ? a3 : e5f;
        } else if (e22 instanceof d22) {
            Object a4 = kld.a(new ucb(((d22) e22).a, (Integer) null, 14), continuation);
            return a4 == tx3 ? a4 : e5f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final y12 s() {
        e52 o2 = o();
        return new y12(new m22((o2 == null || !o2.I()) ? vea.d2 : vea.X1, false, true, false), ((f22) this.g.getValue()).a(this));
    }
}
