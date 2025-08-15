package defpackage;

import android.content.Context;
import android.util.Range;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: lw1  reason: default package */
public abstract class lw1 {
    public static final jw1 D = new Object();
    public final HashSet A;
    public final Context B;
    public final HashMap C;
    public px1 a = px1.c;
    public int b = 3;
    public h8b c;
    public fu6 d;
    public pt6 e;
    public rdf f;
    public cdc g = null;
    public final HashMap h = new HashMap();
    public b9b i = adc.j0;
    public final eu4 j;
    public final eu4 k;
    public final Range l;
    public hg7 m;
    public l9b n;
    public uof o;
    public g8b p;
    public final k8g q;
    public final ync r;
    public final boolean s;
    public boolean t;
    public final l06 u;
    public final l06 v;
    public final ci9 w;
    public final fd7 x;
    public final fd7 y;
    public final fd7 z;

    /* JADX WARNING: type inference failed for: r5v6, types: [l06, bn8] */
    /* JADX WARNING: type inference failed for: r5v7, types: [l06, bn8] */
    /* JADX WARNING: type inference failed for: r5v8, types: [ci9, xm7] */
    /* JADX WARNING: type inference failed for: r5v9, types: [fd7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v10, types: [fd7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v11, types: [fd7, java.lang.Object] */
    public lw1(Context context) {
        k9b k9b = k9b.f;
        k12 p2 = s36.p(context);
        mu1 mu1 = new mu1(5);
        k12 K = kq0.K(p2, new re6(15, (Object) mu1), ju0.k());
        eu4 eu4 = eu4.c;
        this.j = eu4;
        this.k = eu4;
        this.l = vb0.f;
        this.s = true;
        this.t = true;
        this.u = new bn8();
        this.v = new bn8();
        this.w = new xm7(0);
        this.x = new Object();
        this.y = new Object();
        this.z = new Object();
        this.A = new HashSet();
        this.C = new HashMap();
        Context n2 = lz7.n(context);
        this.B = n2;
        mt6 mt6 = new mt6(2);
        c(mt6);
        eu4 eu42 = this.k;
        mt6.b.j(tu6.A, eu42);
        this.c = mt6.b();
        mt6 mt62 = new mt6(1);
        c(mt62);
        this.d = mt62.a();
        this.e = d((Integer) null, (Integer) null, (Integer) null);
        this.f = e();
        ig7 ig7 = (ig7) this;
        iw1 iw1 = new iw1(0, ig7);
        kq0.K(K, new re6(15, (Object) iw1), ju0.D());
        this.q = new k8g(n2);
        this.r = new ync(28, ig7);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(defpackage.g8b r7, defpackage.uof r8) {
        /*
            r6 = this;
            defpackage.kq0.e()
            g8b r0 = r6.p
            if (r0 == r7) goto L_0x000e
            r6.p = r7
            h8b r0 = r6.c
            r0.G(r7)
        L_0x000e:
            uof r7 = r6.o
            r0 = 0
            if (r7 == 0) goto L_0x0037
            int r7 = r6.g(r8)
            r1 = -1
            if (r7 == r1) goto L_0x0021
            fm5 r2 = new fm5
            r3 = 1
            r2.<init>(r7, r3)
            goto L_0x0022
        L_0x0021:
            r2 = r0
        L_0x0022:
            uof r7 = r6.o
            int r7 = r6.g(r7)
            if (r7 == r1) goto L_0x0031
            fm5 r1 = new fm5
            r3 = 1
            r1.<init>(r7, r3)
            goto L_0x0032
        L_0x0031:
            r1 = r0
        L_0x0032:
            if (r2 == r1) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r7 = 0
            goto L_0x0038
        L_0x0037:
            r7 = 1
        L_0x0038:
            r6.o = r8
            k8g r8 = r6.q
            zh6 r1 = defpackage.ju0.D()
            ync r2 = r6.r
            java.lang.Object r3 = r8.a
            monitor-enter(r3)
            java.lang.Object r4 = r8.b     // Catch:{ all -> 0x0051 }
            bnc r4 = (defpackage.bnc) r4     // Catch:{ all -> 0x0051 }
            boolean r4 = r4.canDetectOrientation()     // Catch:{ all -> 0x0051 }
            if (r4 != 0) goto L_0x0053
            monitor-exit(r3)     // Catch:{ all -> 0x0051 }
            goto L_0x0067
        L_0x0051:
            r6 = move-exception
            goto L_0x0070
        L_0x0053:
            java.lang.Object r4 = r8.c     // Catch:{ all -> 0x0051 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0051 }
            cnc r5 = new cnc     // Catch:{ all -> 0x0051 }
            r5.<init>(r2, r1)     // Catch:{ all -> 0x0051 }
            r4.put(r2, r5)     // Catch:{ all -> 0x0051 }
            java.lang.Object r8 = r8.b     // Catch:{ all -> 0x0051 }
            bnc r8 = (defpackage.bnc) r8     // Catch:{ all -> 0x0051 }
            r8.enable()     // Catch:{ all -> 0x0051 }
            monitor-exit(r3)     // Catch:{ all -> 0x0051 }
        L_0x0067:
            if (r7 == 0) goto L_0x006c
            r6.r()
        L_0x006c:
            r6.q(r0)
            return
        L_0x0070:
            monitor-exit(r3)     // Catch:{ all -> 0x0051 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw1.a(g8b, uof):void");
    }

    public final void b() {
        kq0.e();
        l9b l9b = this.n;
        if (l9b != null) {
            l9b.a(this.c, this.d, this.e, this.f);
        }
        this.c.G((g8b) null);
        this.m = null;
        this.p = null;
        this.o = null;
        k8g k8g = this.q;
        ync ync = this.r;
        synchronized (k8g.a) {
            try {
                cnc cnc = (cnc) ((HashMap) k8g.c).get(ync);
                if (cnc != null) {
                    cnc.c.set(false);
                    ((HashMap) k8g.c).remove(ync);
                }
                if (((HashMap) k8g.c).isEmpty()) {
                    ((bnc) k8g.b).disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(mt6 mt6) {
        uof uof = this.o;
        if (uof != null) {
            int g2 = g(uof);
            fm5 fm5 = g2 != -1 ? new fm5(g2, 1) : null;
            if (fm5 != null) {
                mt6.c(new kic(fm5, (lic) null, 0));
            }
        }
    }

    public final pt6 d(Integer num, Integer num2, Integer num3) {
        mt6 mt6 = new mt6(0);
        mi9 mi9 = mt6.b;
        if (num != null) {
            mi9.j(st6.b, num);
        }
        if (num2 != null) {
            mi9.j(st6.c, num2);
        }
        if (num3 != null) {
            mi9.j(st6.X, num3);
        }
        c(mt6);
        st6 st6 = new st6(wma.a(mi9));
        ev6.e0(st6);
        return new pt6(st6);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [lc0, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [lc0, java.lang.Object] */
    public final rdf e() {
        int g2;
        av1 av1 = adc.n0;
        nw4 a2 = ab0.a();
        b9b b9b = this.i;
        c54.o(b9b, "The specified quality selector can't be null.");
        mc0 mc0 = (mc0) a2.b;
        if (mc0 != null) {
            ? obj = new Object();
            obj.a = mc0.a;
            obj.b = mc0.b;
            obj.c = mc0.c;
            obj.d = Integer.valueOf(mc0.d);
            obj.a = b9b;
            a2.b = obj.a();
            uof uof = this.o;
            if (!(uof == null || this.i != adc.j0 || (g2 = g(uof)) == -1)) {
                mc0 mc02 = (mc0) a2.b;
                if (mc02 != null) {
                    ? obj2 = new Object();
                    obj2.a = mc02.a;
                    obj2.b = mc02.b;
                    obj2.c = mc02.c;
                    obj2.d = Integer.valueOf(mc02.d);
                    obj2.d = Integer.valueOf(g2);
                    a2.b = obj2.a();
                } else {
                    throw new IllegalStateException("Property \"videoSpec\" has not been set");
                }
            }
            mt6 mt6 = new mt6((wjf) new adc((ExecutorService) null, a2.f(), av1, av1));
            aa0 aa0 = o9f.l0;
            Range range = this.l;
            mi9 mi9 = mt6.b;
            mi9.j(aa0, range);
            mi9.j(ev6.E, 0);
            mi9.j(tu6.A, this.j);
            return new rdf(new sdf(wma.a(mi9)));
        }
        throw new IllegalStateException("Property \"videoSpec\" has not been set");
    }

    public final dvc f() {
        cvc cvc = cvc.b;
        HashMap hashMap = this.C;
        if (hashMap.get(cvc) != null) {
            return (dvc) hashMap.get(cvc);
        }
        cvc cvc2 = cvc.a;
        if (hashMap.get(cvc2) != null) {
            return (dvc) hashMap.get(cvc2);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.uof r6) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0005
            r1 = r0
            goto L_0x000b
        L_0x0005:
            int r1 = r6.c
            int r1 = defpackage.kp.C(r1)
        L_0x000b:
            l9b r2 = r5.n
            if (r2 != 0) goto L_0x0011
            r2 = r0
            goto L_0x001f
        L_0x0011:
            px1 r3 = r5.a
            k9b r2 = r2.a
            fjc r2 = r2.e(r3)
            yw1 r2 = r2.a
            int r2 = r2.b()
        L_0x001f:
            l9b r3 = r5.n
            r4 = 1
            if (r3 != 0) goto L_0x0026
        L_0x0024:
            r5 = r4
            goto L_0x0038
        L_0x0026:
            px1 r5 = r5.a
            k9b r3 = r3.a
            fjc r5 = r3.e(r5)
            yw1 r5 = r5.a
            int r5 = r5.g()
            if (r5 != r4) goto L_0x0037
            goto L_0x0024
        L_0x0037:
            r5 = r0
        L_0x0038:
            int r5 = defpackage.kp.m(r1, r2, r5)
            android.util.Rational r6 = r6.b
            r1 = 90
            if (r5 == r1) goto L_0x0046
            r1 = 270(0x10e, float:3.78E-43)
            if (r5 != r1) goto L_0x0054
        L_0x0046:
            android.util.Rational r5 = new android.util.Rational
            int r1 = r6.getDenominator()
            int r6 = r6.getNumerator()
            r5.<init>(r1, r6)
            r6 = r5
        L_0x0054:
            android.util.Rational r5 = new android.util.Rational
            r1 = 4
            r2 = 3
            r5.<init>(r1, r2)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0062
            return r0
        L_0x0062:
            android.util.Rational r5 = new android.util.Rational
            r0 = 16
            r1 = 9
            r5.<init>(r0, r1)
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0072
            return r4
        L_0x0072:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw1.g(uof):int");
    }

    public final boolean h() {
        return this.m != null;
    }

    public final boolean i() {
        return this.n != null;
    }

    public final void j(l9b l9b) {
        this.n = l9b;
        r();
        q((Runnable) null);
    }

    public final void k(px1 px1) {
        kq0.e();
        if (this.a != px1) {
            Integer b2 = px1.b();
            if (this.d.H() != 3 || b2 == null || b2.intValue() == 0) {
                px1 px12 = this.a;
                this.a = px1;
                l9b l9b = this.n;
                if (l9b != null) {
                    l9b.a(this.c, this.d, this.e, this.f);
                    q(new wt1((ig7) this, 5, px12));
                    return;
                }
                return;
            }
            throw new IllegalStateException("Not a front camera despite setting FLASH_MODE_SCREEN");
        }
    }

    public final void l(int i2) {
        kq0.e();
        int i3 = this.b;
        if (i2 != i3) {
            this.b = i2;
            kq0.e();
            if ((this.b & 4) == 0) {
                kq0.e();
                cdc cdc = this.g;
                if (cdc != null && !cdc.a.get()) {
                    kq0.e();
                    cdc cdc2 = this.g;
                    if (cdc2 != null) {
                        cdc2.close();
                        this.g = null;
                    }
                }
            }
            q(new l40(i3, 5, (ig7) this));
        }
    }

    public final void m(int i2) {
        kq0.e();
        if (i2 == 3) {
            Integer b2 = this.a.b();
            if (b2 == null || b2.intValue() == 0) {
                dvc f2 = f();
                if (f2 == null) {
                    fu6 fu6 = this.d;
                    jw1 jw1 = D;
                    fu6.getClass();
                    gvc gvc = new gvc(jw1);
                    fu6.u = gvc;
                    fu6.d().g(gvc);
                } else {
                    fu6 fu62 = this.d;
                    fu62.getClass();
                    gvc gvc2 = new gvc(f2.b);
                    fu62.u = gvc2;
                    fu62.d().g(gvc2);
                    f2.a.name();
                }
            } else {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
        }
        fu6 fu63 = this.d;
        fu63.getClass();
        if (!(i2 == 0 || i2 == 1 || i2 == 2)) {
            if (i2 != 3) {
                throw new IllegalArgumentException(zr6.h(i2, "Invalid flash mode: "));
            } else if (fu63.u.a == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            } else if (fu63.c() != null) {
                ax1 c2 = fu63.c();
                if ((c2 != null ? c2.p().g() : -1) != 0) {
                    throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
                }
            }
        }
        synchronized (fu63.q) {
            fu63.s = i2;
            fu63.K();
        }
    }

    public final void n(b9b b9b) {
        kq0.e();
        this.i = b9b;
        if (i()) {
            this.n.a(this.f);
        }
        this.f = e();
        q((Runnable) null);
    }

    public final bm7 o(float f2) {
        kq0.e();
        if (h()) {
            return ((hw1) this.m.c.B0.d).d(f2);
        }
        return this.z.M(Float.valueOf(f2));
    }

    public abstract hg7 p();

    public final void q(Runnable runnable) {
        an8 an8;
        an8 an82;
        try {
            this.m = p();
            if (h()) {
                xm7 r2 = this.m.c.C0.b.r();
                l06 l06 = this.u;
                xm7 xm7 = l06.m;
                if (!(xm7 == null || (an82 = (an8) l06.l.c(xm7)) == null)) {
                    an82.a.j(an82);
                }
                l06.m = r2;
                l06.l(r2, new gu1(2, l06));
                xm7 e2 = this.m.c.C0.b.e();
                l06 l062 = this.v;
                xm7 xm72 = l062.m;
                if (!(xm72 == null || (an8 = (an8) l062.l.c(xm72)) == null)) {
                    an8.a.j(an8);
                }
                l062.m = e2;
                l062.l(e2, new gu1(2, l062));
                fd7 fd7 = this.x;
                fd7.getClass();
                kq0.e();
                mpa mpa = (mpa) fd7.a;
                if (mpa != null) {
                    Boolean bool = (Boolean) mpa.b;
                    boolean booleanValue = bool.booleanValue();
                    kq0.e();
                    bm7 M = !h() ? fd7.M(bool) : ((hw1) this.m.c.B0.d).k(booleanValue);
                    lq1 lq1 = (lq1) ((mpa) fd7.a).a;
                    Objects.requireNonNull(lq1);
                    kq0.y(M, lq1);
                    fd7.a = null;
                }
                fd7 fd72 = this.y;
                fd72.getClass();
                kq0.e();
                mpa mpa2 = (mpa) fd72.a;
                if (mpa2 != null) {
                    Float f2 = (Float) mpa2.b;
                    float floatValue = f2.floatValue();
                    kq0.e();
                    bm7 M2 = !h() ? fd72.M(f2) : ((hw1) this.m.c.B0.d).b(floatValue);
                    lq1 lq12 = (lq1) ((mpa) fd72.a).a;
                    Objects.requireNonNull(lq12);
                    kq0.y(M2, lq12);
                    fd72.a = null;
                }
                fd7 fd73 = this.z;
                fd73.getClass();
                kq0.e();
                mpa mpa3 = (mpa) fd73.a;
                if (mpa3 != null) {
                    bm7 o2 = o(((Float) mpa3.b).floatValue());
                    lq1 lq13 = (lq1) ((mpa) fd73.a).a;
                    Objects.requireNonNull(lq13);
                    kq0.y(o2, lq13);
                    fd73.a = null;
                }
            }
        } catch (RuntimeException e3) {
            if (runnable != null) {
                runnable.run();
            }
            throw e3;
        }
    }

    public final void r() {
        if (i()) {
            this.n.a(this.c);
        }
        mt6 mt6 = new mt6(2);
        c(mt6);
        eu4 eu4 = this.k;
        mt6.b.j(tu6.A, eu4);
        h8b b2 = mt6.b();
        this.c = b2;
        g8b g8b = this.p;
        if (g8b != null) {
            b2.G(g8b);
        }
        kq0.e();
        Integer valueOf = Integer.valueOf(this.d.p);
        if (i()) {
            this.n.a(this.d);
        }
        int H = this.d.H();
        mt6 mt62 = new mt6(1);
        mt62.b.j(gu6.b, valueOf);
        c(mt62);
        this.d = mt62.a();
        m(H);
        Integer num = (Integer) ((st6) this.e.f).f(st6.b, 0);
        num.intValue();
        Integer num2 = (Integer) ((st6) this.e.f).f(st6.c, 6);
        num2.intValue();
        Integer valueOf2 = Integer.valueOf(this.e.G());
        kq0.e();
        if (i()) {
            this.n.a(this.e);
        }
        this.e = d(num, num2, valueOf2);
        if (i()) {
            this.n.a(this.f);
        }
        this.f = e();
    }
}
