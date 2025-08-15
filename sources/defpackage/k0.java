package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ForwardingControllerListener2;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: k0  reason: default package */
public abstract class k0 implements mq4, ag4, sa6 {
    public static final Map v = dx6.a("component_tag", "drawee");
    public static final Map w = dx6.b(HasExtraData.KEY_ORIGIN, "memory_bitmap", HasExtraData.KEY_ORIGIN_SUBCATEGORY, "shortcut");
    public static final Class x = k0.class;
    public final qq4 a;
    public final bg4 b;
    public final Executor c;
    public zs6 d;
    public ta6 e;
    public ev3 f;
    public final ForwardingControllerListener2 g;
    public la6 h;
    public Drawable i;
    public String j;
    public Object k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public g0 q;
    public Object r;
    public boolean s;
    public boolean t;
    public Drawable u;

    public k0(bg4 bg4, ExecutorService executorService) {
        this.a = qq4.c ? new qq4() : qq4.b;
        this.g = new ForwardingControllerListener2();
        this.s = true;
        this.t = false;
        this.b = bg4;
        this.c = executorService;
        g((Object) null, (String) null);
    }

    public final void a(ev3 ev3) {
        ev3.getClass();
        ev3 ev32 = this.f;
        if (ev32 instanceof j0) {
            ((j0) ev32).b(ev3);
        } else if (ev32 != null) {
            if (f46.W()) {
                f46.e("AbstractDraweeController#createInternal");
            }
            j0 j0Var = new j0();
            j0Var.b(ev32);
            j0Var.b(ev3);
            if (f46.W()) {
                f46.A();
            }
            this.f = j0Var;
        } else {
            this.f = ev3;
        }
    }

    public abstract Drawable b(Object obj);

    public final Animatable c() {
        Drawable drawable = this.u;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    public final ev3 d() {
        ev3 ev3 = this.f;
        return ev3 == null ? ii0.a : ev3;
    }

    public abstract ru6 e(Object obj);

    public final la6 f() {
        la6 la6 = this.h;
        if (la6 != null) {
            return la6;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.k);
    }

    public final synchronized void g(Object obj, String str) {
        bg4 bg4;
        try {
            f46.I();
            this.a.a(pq4.Y);
            if (!this.s && (bg4 = this.b) != null) {
                bg4.g(this);
            }
            this.l = false;
            o();
            this.o = false;
            zs6 zs6 = this.d;
            if (zs6 != null) {
                zs6.b = false;
                zs6.a = 4;
                zs6.c = 0;
            }
            ta6 ta6 = this.e;
            if (ta6 != null) {
                ta6.a = null;
                ta6.c = false;
                ta6.d = false;
                ta6.a = this;
            }
            ev3 ev3 = this.f;
            if (ev3 instanceof j0) {
                j0 j0Var = (j0) ev3;
                synchronized (j0Var) {
                    j0Var.a.clear();
                }
            } else {
                this.f = null;
            }
            la6 la6 = this.h;
            if (la6 != null) {
                la6.f.o(la6.a);
                la6.g();
                umc umc = this.h.d;
                umc.X = null;
                umc.invalidateSelf();
                this.h = null;
            }
            this.i = null;
            if (ta5.a.i(2)) {
                ta5.f(x, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.j, str);
            }
            this.j = str;
            this.k = obj;
            f46.I();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final boolean h(String str, g0 g0Var) {
        if (g0Var == null && this.q == null) {
            return true;
        }
        return str.equals(this.j) && g0Var == this.q && this.m;
    }

    public final void i(String str, Throwable th) {
        if (ta5.a.i(2)) {
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            if (ta5.a.i(2)) {
                ft7 ft7 = ta5.a;
                String simpleName = x.getSimpleName();
                String.format((Locale) null, "controller %x %s: %s: failure: %s", new Object[]{valueOf, str2, str, th});
                ft7.b(simpleName);
            }
        }
    }

    public final void j(Object obj, String str) {
        if (ta5.a.i(2)) {
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.j;
            String simpleName = obj != null ? obj.getClass().getSimpleName() : "<null>";
            o43 o43 = (o43) obj;
            int i2 = 0;
            if (o43 != null && o43.m0()) {
                i2 = System.identityHashCode(o43.b.b());
            }
            Object[] objArr = {valueOf, str2, str, simpleName, Integer.valueOf(i2)};
            if (ta5.a.i(2)) {
                ft7 ft7 = ta5.a;
                String simpleName2 = x.getSimpleName();
                String.format((Locale) null, "controller %x %s: %s: image: %s %x", objArr);
                ft7.b(simpleName2);
            }
        }
    }

    public final ControllerListener2.Extras k(Map map, Map map2, Uri uri) {
        String str;
        PointF pointF;
        la6 la6 = this.h;
        if (la6 instanceof la6) {
            str = String.valueOf(!(la6.e(2) instanceof psc) ? null : la6.f(2).X);
            pointF = !(la6.e(2) instanceof psc) ? null : la6.f(2).Z;
        } else {
            pointF = null;
            str = null;
        }
        la6 la62 = this.h;
        Rect bounds = la62 == null ? null : la62.d.getBounds();
        Object obj = this.k;
        boolean z = this.t;
        ControllerListener2.Extras extras = new ControllerListener2.Extras();
        if (bounds != null) {
            extras.viewportWidth = bounds.width();
            extras.viewportHeight = bounds.height();
        }
        extras.scaleType = str;
        if (pointF != null) {
            extras.focusX = Float.valueOf(pointF.x);
            extras.focusY = Float.valueOf(pointF.y);
        }
        extras.callerContext = obj;
        extras.logWithHighSamplingRate = z;
        extras.mainUri = uri;
        extras.datasourceExtras = map;
        extras.imageExtras = map2;
        extras.shortcutExtras = w;
        extras.componentExtras = v;
        extras.imageSourceExtras = null;
        return extras;
    }

    public final void l(String str, g0 g0Var, Throwable th, boolean z) {
        Drawable drawable;
        f46.I();
        if (!h(str, g0Var)) {
            i("ignore_old_datasource @ onFailure", th);
            g0Var.a();
            f46.I();
            return;
        }
        this.a.a(z ? pq4.x0 : pq4.y0);
        ForwardingControllerListener2 forwardingControllerListener2 = this.g;
        if (z) {
            i("final_failed @ onFailure", th);
            this.q = null;
            this.n = true;
            la6 la6 = this.h;
            if (la6 != null) {
                if (!this.o || (drawable = this.u) == null) {
                    boolean q2 = q();
                    ya5 ya5 = la6.e;
                    if (q2) {
                        ya5.C0++;
                        la6.c();
                        if (ya5.a(4) != null) {
                            la6.b(4);
                        } else {
                            la6.b(1);
                        }
                        ya5.c();
                    } else {
                        ya5.C0++;
                        la6.c();
                        if (ya5.a(5) != null) {
                            la6.b(5);
                        } else {
                            la6.b(1);
                        }
                        ya5.c();
                    }
                } else {
                    la6.j(drawable, 1.0f, true);
                }
            }
            ControllerListener2.Extras k2 = k(g0Var == null ? null : g0Var.a, (Map) null, (Uri) null);
            d().d(this.j, th);
            forwardingControllerListener2.onFailure(this.j, th, k2);
        } else {
            i("intermediate_failed @ onFailure", th);
            d().k(this.j, th);
            forwardingControllerListener2.onIntermediateImageFailed(this.j);
        }
        f46.I();
    }

    public final void m(String str, g0 g0Var, Object obj, float f2, boolean z, boolean z2, boolean z3) {
        Drawable b2;
        Object obj2;
        Drawable drawable;
        try {
            f46.I();
            if (!h(str, g0Var)) {
                j(obj, "ignore_old_datasource @ onNewResult");
                o43.S((o43) obj);
                g0Var.a();
                f46.I();
                return;
            }
            this.a.a(z ? pq4.v0 : pq4.w0);
            try {
                b2 = b(obj);
                obj2 = this.r;
                drawable = this.u;
                this.r = obj;
                this.u = b2;
                if (z) {
                    j(obj, "set_final_result @ onNewResult");
                    this.q = null;
                    f().j(b2, 1.0f, z2);
                    ru6 e2 = e(obj);
                    d().a(str, e2, c());
                    this.g.onFinalImageSet(str, e2, k(g0Var == null ? null : g0Var.a, e2 == null ? null : e2.getExtras(), (Uri) null));
                } else if (z3) {
                    j(obj, "set_temporary_result @ onNewResult");
                    f().j(b2, 1.0f, z2);
                    ru6 e3 = e(obj);
                    d().a(str, e3, c());
                    this.g.onFinalImageSet(str, e3, k(g0Var == null ? null : g0Var.a, e3 == null ? null : e3.getExtras(), (Uri) null));
                } else {
                    j(obj, "set_intermediate_result @ onNewResult");
                    f().j(b2, f2, z2);
                    ru6 e4 = e(obj);
                    d().h(str, e4);
                    this.g.onIntermediateImageSet(str, e4);
                }
                if (!(drawable == null || drawable == b2)) {
                    if (drawable instanceof kq4) {
                        ((kq4) drawable).a();
                    }
                }
                if (!(obj2 == null || obj2 == obj)) {
                    j(obj2, "release_previous_result @ onNewResult");
                    o43.S((o43) obj2);
                }
                f46.I();
            } catch (Exception e5) {
                j(obj, "drawable_failed @ onNewResult");
                o43.S((o43) obj);
                l(str, g0Var, e5, z);
                f46.I();
            }
        } catch (Throwable th) {
            f46.I();
            throw th;
        }
    }

    public final void n() {
        this.a.a(pq4.t0);
        zs6 zs6 = this.d;
        if (zs6 != null) {
            zs6.c = 0;
        }
        ta6 ta6 = this.e;
        if (ta6 != null) {
            ta6.c = false;
            ta6.d = false;
        }
        la6 la6 = this.h;
        if (la6 != null) {
            la6.f.o(la6.a);
            la6.g();
        }
        o();
    }

    public final void o() {
        Map map;
        Map map2;
        boolean z = this.m;
        this.m = false;
        this.n = false;
        g0 g0Var = this.q;
        if (g0Var != null) {
            map = g0Var.a;
            g0Var.a();
            this.q = null;
        } else {
            map = null;
        }
        Drawable drawable = this.u;
        if (drawable != null && (drawable instanceof kq4)) {
            ((kq4) drawable).a();
        }
        if (this.p != null) {
            this.p = null;
        }
        this.u = null;
        Object obj = this.r;
        if (obj != null) {
            ru6 e2 = e(obj);
            map2 = e2 == null ? null : e2.getExtras();
            j(this.r, "release");
            o43.S((o43) this.r);
            this.r = null;
        } else {
            map2 = null;
        }
        if (z) {
            d().g(this.j);
            this.g.onRelease(this.j, k(map, map2, (Uri) null));
        }
    }

    public final void p(g0 g0Var, ru6 ru6) {
        d().e(this.k, this.j);
        String str = this.j;
        Object obj = this.k;
        d2b d2b = (d2b) this;
        wv6 wv6 = d2b.H;
        wv6 wv62 = d2b.I;
        Map map = null;
        Uri uri = wv6 != null ? wv6.b : null;
        if (uri == null) {
            uri = wv62 != null ? wv62.b : null;
        }
        Map map2 = g0Var == null ? null : g0Var.a;
        if (ru6 != null) {
            map = ru6.getExtras();
        }
        this.g.onSubmit(str, obj, k(map2, map, uri));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r1 = this;
            boolean r0 = r1.n
            if (r0 == 0) goto L_0x0014
            zs6 r1 = r1.d
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.b
            if (r0 == 0) goto L_0x0014
            int r0 = r1.c
            int r1 = r1.a
            if (r0 >= r1) goto L_0x0014
            r1 = 1
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0.q():boolean");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r() {
        /*
            r8 = this;
            defpackage.f46.I()
            r0 = r8
            d2b r0 = (defpackage.d2b) r0
            defpackage.f46.I()
            lq8 r1 = r0.A     // Catch:{ all -> 0x0031 }
            r2 = 0
            if (r1 == 0) goto L_0x002c
            ww0 r3 = r0.B     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x0013
            goto L_0x002c
        L_0x0013:
            o43 r1 = r1.get(r3)     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0034
            java.lang.Object r3 = r1.e0()     // Catch:{ all -> 0x0031 }
            l43 r3 = (defpackage.l43) r3     // Catch:{ all -> 0x0031 }
            pqb r3 = r3.getQualityInfo()     // Catch:{ all -> 0x0031 }
            hx6 r3 = (defpackage.hx6) r3     // Catch:{ all -> 0x0031 }
            boolean r3 = r3.c     // Catch:{ all -> 0x0031 }
            if (r3 != 0) goto L_0x0034
            r1.close()     // Catch:{ all -> 0x0031 }
        L_0x002c:
            defpackage.f46.I()
            r3 = r2
            goto L_0x0038
        L_0x0031:
            r8 = move-exception
            goto L_0x00e5
        L_0x0034:
            defpackage.f46.I()
            r3 = r1
        L_0x0038:
            r1 = 0
            r4 = 1
            if (r3 == 0) goto L_0x006e
            defpackage.f46.I()
            r8.q = r2
            r8.m = r4
            r8.n = r1
            qq4 r1 = r8.a
            pq4 r2 = defpackage.pq4.D0
            r1.a(r2)
            g0 r1 = r8.q
            ru6 r2 = r8.e(r3)
            r8.p(r1, r2)
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = r8.j
            g0 r2 = r8.q
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1
            r6 = 1
            r7 = 1
            r0 = r8
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            defpackage.f46.I()
            defpackage.f46.I()
            return
        L_0x006b:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r8
        L_0x006e:
            qq4 r3 = r8.a
            pq4 r5 = defpackage.pq4.u0
            r3.a(r5)
            la6 r3 = r8.h
            r5 = 0
            r3.m(r5, r4)
            r8.m = r4
            r8.n = r1
            defpackage.f46.I()
            ft7 r1 = defpackage.ta5.a
            r3 = 2
            boolean r1 = r1.i(r3)
            if (r1 == 0) goto L_0x009a
            int r1 = java.lang.System.identityHashCode(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Class<d2b> r4 = defpackage.d2b.class
            java.lang.String r5 = "controller %x: getDataSource"
            defpackage.ta5.d(r4, r1, r5)
        L_0x009a:
            ide r0 = r0.C
            java.lang.Object r0 = r0.get()
            g0 r0 = (defpackage.g0) r0
            defpackage.f46.I()
            r8.q = r0
            r8.p(r0, r2)
            ft7 r0 = defpackage.ta5.a
            boolean r0 = r0.i(r3)
            if (r0 == 0) goto L_0x00cd
            java.lang.Class r0 = x
            java.lang.String r1 = "controller %x %s: submitRequest: dataSource: %x"
            int r2 = java.lang.System.identityHashCode(r8)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = r8.j
            g0 r4 = r8.q
            int r4 = java.lang.System.identityHashCode(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            defpackage.ta5.f(r0, r1, r2, r3, r4)
        L_0x00cd:
            java.lang.String r0 = r8.j
            g0 r1 = r8.q
            boolean r1 = r1.f()
            i0 r2 = new i0
            r2.<init>(r8, r0, r1)
            g0 r0 = r8.q
            java.util.concurrent.Executor r8 = r8.c
            r0.m(r2, r8)
            defpackage.f46.I()
            return
        L_0x00e5:
            defpackage.f46.I()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k0.r():void");
    }

    public String toString() {
        nw4 r0 = j47.r0(this);
        r0.d("isAttached", this.l);
        r0.d("isRequestSubmitted", this.m);
        r0.d("hasFetchFailed", this.n);
        o43 o43 = (o43) this.r;
        int i2 = 0;
        if (o43 != null && o43.m0()) {
            i2 = System.identityHashCode(o43.b.b());
        }
        r0.a(i2, "fetchedImage");
        r0.e(this.a.a.toString(), "events");
        return r0.toString();
    }
}
