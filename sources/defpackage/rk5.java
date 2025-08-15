package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: rk5  reason: default package */
public final class rk5 implements gd6, jd6 {
    public of4 A;
    public boolean B;
    public boolean C;
    public jee D;
    public EGLSurface E;
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final EGLDisplay d;
    public final EGLContext e;
    public final EGLSurface f;
    public final xw0 g;
    public final i63 h;
    public final nx0 i;
    public final Executor j;
    public final agf k;
    public final ConcurrentLinkedQueue l;
    public final er0 m;
    public final uy n;
    public final uy o;
    public final id6 p;
    public final int q;
    public final boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public od4 w;
    public boolean x;
    public ed6 y;
    public lsd z;

    /* JADX WARNING: type inference failed for: r1v3, types: [ed6, java.lang.Object] */
    public rk5(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, xw0 xw0, i63 i63, nx0 nx0, Executor executor, agf agf, id6 id6, int i2, int i3, boolean z2) {
        this.a = context;
        this.d = eGLDisplay;
        this.e = eGLContext;
        this.f = eGLSurface;
        this.g = xw0;
        this.h = i63;
        this.i = nx0;
        this.j = executor;
        this.k = agf;
        this.p = id6;
        this.q = i3;
        this.r = z2;
        this.y = new Object();
        this.l = new ConcurrentLinkedQueue();
        this.m = new er0(i63.g(i63), i2);
        this.n = new uy(i2);
        this.o = new uy(i2);
    }

    public final void a(hd6 hd6) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        if (this.l.isEmpty()) {
            of4 of4 = this.A;
            of4.getClass();
            of4.a();
            this.x = false;
            return;
        }
        fm9.k(!this.r);
        this.x = true;
    }

    public final void c(long j2) {
        this.i.v(new gf4(this, j2, 2));
    }

    public final void d(Executor executor, lf4 lf4) {
        throw new UnsupportedOperationException();
    }

    public final void e(va8 va8, hd6 hd6, long j2) {
        this.j.execute(new r60(this, j2, 5));
        if (this.p == null) {
            if (this.r) {
                k(va8, hd6, j2, j2 * 1000);
            } else {
                this.l.add(Pair.create(hd6, Long.valueOf(j2)));
            }
            this.y.h();
            return;
        }
        fm9.k(this.m.f() > 0);
        k(va8, hd6, j2, j2 * 1000);
    }

    public final void f(jo7 jo7) {
        throw new UnsupportedOperationException();
    }

    public final void flush() {
        er0 er0 = this.m;
        int i2 = 0;
        id6 id6 = this.p;
        if (id6 != null) {
            ArrayDeque arrayDeque = (ArrayDeque) er0.e;
            ((ArrayDeque) er0.d).addAll(arrayDeque);
            arrayDeque.clear();
            uy uyVar = this.n;
            uyVar.b = 0;
            uyVar.c = -1;
            uyVar.o = 0;
            uy uyVar2 = this.o;
            uyVar2.b = 0;
            uyVar2.c = -1;
            uyVar2.o = 0;
        }
        this.l.clear();
        this.x = false;
        od4 od4 = this.w;
        if (od4 != null) {
            od4.flush();
        }
        this.y.v();
        while (true) {
            if (i2 < (id6 == null ? 1 : er0.f())) {
                this.y.h();
                i2++;
            } else {
                return;
            }
        }
    }

    public final void g(ed6 ed6) {
        this.y = ed6;
        int i2 = 0;
        while (true) {
            if (i2 < (this.p == null ? 1 : this.m.f())) {
                ed6.h();
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ww6, pw6] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, nsc] */
    public final synchronized od4 h(int i2, int i3, int i4) {
        od4 i5;
        try {
            ? pw6 = new pw6(4);
            pw6.e(this.b);
            if (i2 != 0) {
                ? obj = new Object();
                float f2 = ((float) i2) % 360.0f;
                obj.a = f2;
                if (f2 < 0.0f) {
                    obj.a = f2 + 360.0f;
                }
                pw6.a(new osc(obj.a));
            }
            pw6.a(b8b.e(i3, i4));
            i5 = od4.i(this.a, pw6.j(), this.c, this.h, this.q);
            lsd g2 = c37.g(i5.i, this.s, this.t);
            jee jee = this.D;
            if (jee != null) {
                boolean z2 = false;
                fm9.k(g2.a == jee.b);
                if (g2.b == jee.c) {
                    z2 = true;
                }
                fm9.k(z2);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return i5;
    }

    public final synchronized void i() {
        if (this.E != null) {
            try {
                EGLDisplay eGLDisplay = this.d;
                EGLContext eGLContext = this.e;
                EGLSurface eGLSurface = this.f;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
                mr0.e("Error making context current");
                mr0.u(0, 1, 1);
                EGLDisplay eGLDisplay2 = this.d;
                EGLSurface eGLSurface2 = this.E;
                if (eGLDisplay2 != null) {
                    if (eGLSurface2 != null) {
                        EGL14.eglDestroySurface(eGLDisplay2, eGLSurface2);
                        mr0.e("Error destroying surface");
                    }
                }
            } catch (GlUtil$GlException e2) {
                try {
                    this.j.execute(new kl4((Object) this, 27, (Object) e2));
                } catch (Throwable th) {
                    this.E = null;
                    throw th;
                }
            }
            this.E = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00cd, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0018 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean j(defpackage.va8 r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.s     // Catch:{ all -> 0x0012 }
            r1 = 1
            r2 = 0
            if (r0 != r8) goto L_0x0015
            int r0 = r6.t     // Catch:{ all -> 0x0012 }
            if (r0 != r9) goto L_0x0015
            lsd r0 = r6.z     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r0 = r2
            goto L_0x0016
        L_0x0012:
            r7 = move-exception
            goto L_0x00ce
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x0038
            r6.s = r8     // Catch:{ all -> 0x0012 }
            r6.t = r9     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r3 = r6.b     // Catch:{ all -> 0x0012 }
            lsd r8 = defpackage.c37.g(r3, r8, r9)     // Catch:{ all -> 0x0012 }
            lsd r9 = r6.z     // Catch:{ all -> 0x0012 }
            boolean r9 = defpackage.oaf.a(r9, r8)     // Catch:{ all -> 0x0012 }
            if (r9 != 0) goto L_0x0038
            r6.z = r8     // Catch:{ all -> 0x0012 }
            java.util.concurrent.Executor r9 = r6.j     // Catch:{ all -> 0x0012 }
            kl4 r3 = new kl4     // Catch:{ all -> 0x0012 }
            r4 = 28
            r3.<init>((java.lang.Object) r6, (int) r4, (java.lang.Object) r8)     // Catch:{ all -> 0x0012 }
            r9.execute(r3)     // Catch:{ all -> 0x0012 }
        L_0x0038:
            lsd r8 = r6.z     // Catch:{ all -> 0x0012 }
            r8.getClass()     // Catch:{ all -> 0x0012 }
            jee r8 = r6.D     // Catch:{ all -> 0x0012 }
            r9 = 0
            if (r8 != 0) goto L_0x005f
            id6 r3 = r6.p     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x005f
            android.opengl.EGLSurface r7 = r6.E     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r1 = r2
        L_0x004c:
            defpackage.fm9.k(r1)     // Catch:{ all -> 0x0012 }
            od4 r7 = r6.w     // Catch:{ all -> 0x0012 }
            if (r7 == 0) goto L_0x0058
            r7.release()     // Catch:{ all -> 0x0012 }
            r6.w = r9     // Catch:{ all -> 0x0012 }
        L_0x0058:
            java.lang.String r7 = "Output surface and size not set, dropping frame."
            defpackage.z04.c0(r7)     // Catch:{ all -> 0x0012 }
            monitor-exit(r6)
            return r2
        L_0x005f:
            if (r8 != 0) goto L_0x0066
            lsd r3 = r6.z     // Catch:{ all -> 0x0012 }
            int r3 = r3.a     // Catch:{ all -> 0x0012 }
            goto L_0x0068
        L_0x0066:
            int r3 = r8.b     // Catch:{ all -> 0x0012 }
        L_0x0068:
            r6.u = r3     // Catch:{ all -> 0x0012 }
            if (r8 != 0) goto L_0x0071
            lsd r3 = r6.z     // Catch:{ all -> 0x0012 }
            int r3 = r3.b     // Catch:{ all -> 0x0012 }
            goto L_0x0073
        L_0x0071:
            int r3 = r8.c     // Catch:{ all -> 0x0012 }
        L_0x0073:
            r6.v = r3     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x008b
            android.opengl.EGLSurface r3 = r6.E     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x008b
            android.opengl.EGLDisplay r3 = r6.d     // Catch:{ all -> 0x0012 }
            android.view.Surface r8 = r8.a     // Catch:{ all -> 0x0012 }
            i63 r4 = r6.h     // Catch:{ all -> 0x0012 }
            int r4 = r4.c     // Catch:{ all -> 0x0012 }
            boolean r5 = r6.r     // Catch:{ all -> 0x0012 }
            android.opengl.EGLSurface r8 = r7.s(r3, r8, r4, r5)     // Catch:{ all -> 0x0012 }
            r6.E = r8     // Catch:{ all -> 0x0012 }
        L_0x008b:
            id6 r8 = r6.p     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x0098
            er0 r8 = r6.m     // Catch:{ all -> 0x0012 }
            int r3 = r6.u     // Catch:{ all -> 0x0012 }
            int r4 = r6.v     // Catch:{ all -> 0x0012 }
            r8.e(r7, r3, r4)     // Catch:{ all -> 0x0012 }
        L_0x0098:
            xw0 r7 = r6.g     // Catch:{ all -> 0x0012 }
            r7.getClass()     // Catch:{ all -> 0x0012 }
            od4 r7 = r6.w     // Catch:{ all -> 0x0012 }
            if (r7 == 0) goto L_0x00b4
            boolean r8 = r6.C     // Catch:{ all -> 0x0012 }
            if (r8 != 0) goto L_0x00ab
            if (r0 != 0) goto L_0x00ab
            boolean r8 = r6.B     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x00b4
        L_0x00ab:
            r7.release()     // Catch:{ all -> 0x0012 }
            r6.w = r9     // Catch:{ all -> 0x0012 }
            r6.C = r2     // Catch:{ all -> 0x0012 }
            r6.B = r2     // Catch:{ all -> 0x0012 }
        L_0x00b4:
            od4 r7 = r6.w     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x00cc
            jee r7 = r6.D     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x00be
            r7 = r2
            goto L_0x00c0
        L_0x00be:
            int r7 = r7.d     // Catch:{ all -> 0x0012 }
        L_0x00c0:
            int r8 = r6.u     // Catch:{ all -> 0x0012 }
            int r9 = r6.v     // Catch:{ all -> 0x0012 }
            od4 r7 = r6.h(r7, r8, r9)     // Catch:{ all -> 0x0012 }
            r6.w = r7     // Catch:{ all -> 0x0012 }
            r6.C = r2     // Catch:{ all -> 0x0012 }
        L_0x00cc:
            monitor-exit(r6)
            return r1
        L_0x00ce:
            monitor-exit(r6)     // Catch:{ all -> 0x0012 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk5.j(va8, int, int):boolean");
    }

    public final synchronized void k(va8 va8, hd6 hd6, long j2, long j3) {
        if (j3 != -2) {
            try {
                if (j(va8, hd6.c, hd6.d)) {
                    if (this.D != null) {
                        l(hd6, j2, j3);
                    } else if (this.p != null) {
                        m(hd6, j2);
                    }
                    this.y.s(hd6);
                    return;
                }
            } catch (VideoFrameProcessingException | GlUtil$GlException e2) {
                this.j.execute(new kl4(this, e2, j2));
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.y.s(hd6);
    }

    public final synchronized void l(hd6 hd6, long j2, long j3) {
        try {
            EGLSurface eGLSurface = this.E;
            eGLSurface.getClass();
            jee jee = this.D;
            jee.getClass();
            od4 od4 = this.w;
            od4.getClass();
            EGLDisplay eGLDisplay = this.d;
            EGLContext eGLContext = this.e;
            int i2 = jee.b;
            int i3 = jee.c;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            mr0.e("Error making context current");
            mr0.u(0, i2, i3);
            mr0.h();
            od4.c(hd6.a, j2);
            EGLDisplay eGLDisplay2 = this.d;
            if (j3 == -1) {
                j3 = System.nanoTime();
            }
            EGLExt.eglPresentationTimeANDROID(eGLDisplay2, eGLSurface, j3);
            EGL14.eglSwapBuffers(this.d, eGLSurface);
            d54.a();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void m(hd6 hd6, long j2) {
        hd6 h2 = this.m.h();
        this.n.e(j2);
        mr0.u(h2.b, h2.c, h2.d);
        mr0.h();
        od4 od4 = this.w;
        od4.getClass();
        od4.c(hd6.a, j2);
        this.o.e(mr0.p());
        id6 id6 = this.p;
        id6.getClass();
        id6.a(this, h2, j2);
    }

    public final synchronized void release() {
        od4 od4 = this.w;
        if (od4 != null) {
            od4.release();
        }
        try {
            this.m.d();
            EGLDisplay eGLDisplay = this.d;
            EGLSurface eGLSurface = this.E;
            if (eGLDisplay != null) {
                if (eGLSurface != null) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                    mr0.e("Error destroying surface");
                }
            }
            mr0.f();
        } catch (GlUtil$GlException e2) {
            throw new Exception(e2);
        }
    }
}
