package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: d2b  reason: default package */
public final class d2b extends k0 {
    public final lq8 A;
    public ww0 B;
    public ide C;
    public boolean D;
    public wz E;
    public xu3 F;
    public HashSet G;
    public wv6 H;
    public wv6 I;
    public final s94 y;
    public final wz z;

    public d2b(Resources resources, bg4 bg4, j84 j84, ExecutorService executorService, y7g y7g, wz wzVar) {
        super(bg4, executorService);
        this.y = new s94(resources, j84);
        this.z = wzVar;
        this.A = y7g;
    }

    public static psc s(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof psc) {
            return (psc) drawable;
        }
        if (drawable instanceof dq4) {
            return s(((dq4) drawable).j());
        }
        if (drawable instanceof js) {
            js jsVar = (js) drawable;
            int length = jsVar.c.length;
            for (int i = 0; i < length; i++) {
                psc s = s(jsVar.a(i));
                if (s != null) {
                    return s;
                }
            }
        }
        return null;
    }

    public static Drawable u(wz wzVar, l43 l43) {
        Drawable a;
        if (wzVar == null) {
            return null;
        }
        Iterator it = wzVar.iterator();
        while (it.hasNext()) {
            cq4 cq4 = (cq4) it.next();
            if (cq4.b(l43) && (a = cq4.a(l43)) != null) {
                return a;
            }
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    public final Drawable b(Object obj) {
        o43 o43 = (o43) obj;
        try {
            f46.I();
            od2.p(o43.n0(o43));
            l43 l43 = (l43) o43.e0();
            v(l43);
            Drawable u = u(this.E, l43);
            if (u == null) {
                u = u(this.z, l43);
                if (u == null) {
                    u = this.y.a(l43);
                    if (u == null) {
                        throw new UnsupportedOperationException("Unrecognized image class: " + l43);
                    }
                }
            }
            f46.I();
            return u;
        } catch (Throwable th) {
            f46.I();
            throw th;
        }
    }

    public final ru6 e(Object obj) {
        o43 o43 = (o43) obj;
        od2.p(o43.n0(o43));
        return ((l43) o43.e0()).getImageInfo();
    }

    public final synchronized void t(ImagePerfDataListener imagePerfDataListener, n0 n0Var) {
        try {
            xu3 xu3 = this.F;
            if (xu3 != null) {
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) xu3.h;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                xu3.v(false);
                ((d) xu3.d).Z1();
            }
            if (imagePerfDataListener != null) {
                if (this.F == null) {
                    this.F = new xu3(AwakeTimeSinceBootClock.get(), this);
                }
                xu3 xu32 = this.F;
                if (((CopyOnWriteArrayList) xu32.h) == null) {
                    xu32.h = new CopyOnWriteArrayList();
                }
                ((CopyOnWriteArrayList) xu32.h).add(imagePerfDataListener);
                this.F.v(true);
            }
            this.H = (wv6) n0Var.e;
            this.I = (wv6) n0Var.f;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final String toString() {
        nw4 r0 = j47.r0(this);
        r0.e(super.toString(), "super");
        r0.e(this.C, "dataSourceSupplier");
        return r0.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r1 = s(r1.d);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(defpackage.l43 r4) {
        /*
            r3 = this;
            boolean r0 = r3.D
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.graphics.drawable.Drawable r0 = r3.i
            if (r0 != 0) goto L_0x0023
            t44 r0 = new t44
            r0.<init>()
            bv6 r1 = new bv6
            r1.<init>(r0)
            r3.a(r1)
            r3.i = r0
            la6 r1 = r3.h
            if (r1 == 0) goto L_0x0023
            umc r1 = r1.d
            r1.X = r0
            r1.invalidateSelf()
        L_0x0023:
            android.graphics.drawable.Drawable r0 = r3.i
            boolean r1 = r0 instanceof defpackage.t44
            if (r1 == 0) goto L_0x007a
            t44 r0 = (defpackage.t44) r0
            java.lang.String r1 = r3.j
            r0.getClass()
            if (r1 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            java.lang.String r1 = "none"
        L_0x0035:
            r0.a = r1
            r0.invalidateSelf()
            la6 r1 = r3.h
            r2 = 0
            if (r1 == 0) goto L_0x004a
            umc r1 = r1.d
            psc r1 = s(r1)
            if (r1 == 0) goto L_0x004a
            rsc r1 = r1.X
            goto L_0x004b
        L_0x004a:
            r1 = r2
        L_0x004b:
            r0.X = r1
            java.lang.Object r3 = r3.k
            if (r3 != 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            java.lang.String r2 = r3.toString()
        L_0x0056:
            if (r2 == 0) goto L_0x005f
            java.util.HashMap r3 = r0.Y
            java.lang.String r1 = "cc"
            r3.put(r1, r2)
        L_0x005f:
            if (r4 == 0) goto L_0x0077
            int r3 = r4.getWidth()
            int r1 = r4.getHeight()
            r0.b = r3
            r0.c = r1
            r0.invalidateSelf()
            int r3 = r4.getSizeInBytes()
            r0.o = r3
            goto L_0x007a
        L_0x0077:
            r0.b()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d2b.v(l43):void");
    }

    public final void w(rq4 rq4) {
        if (ta5.a.i(2)) {
            ta5.f(k0.x, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.j, rq4);
        }
        this.a.a(rq4 != null ? pq4.a : pq4.b);
        if (this.m) {
            this.b.g(this);
            n();
        }
        la6 la6 = this.h;
        if (la6 != null) {
            umc umc = la6.d;
            umc.X = null;
            umc.invalidateSelf();
            this.h = null;
        }
        if (rq4 != null) {
            if (rq4 instanceof la6) {
                la6 la62 = (la6) rq4;
                this.h = la62;
                umc umc2 = la62.d;
                umc2.X = (t44) this.i;
                umc2.invalidateSelf();
            } else {
                throw new IllegalArgumentException();
            }
        }
        v((l43) null);
    }
}
