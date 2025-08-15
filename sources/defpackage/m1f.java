package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.util.SparseArray;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: m1f  reason: default package */
public final class m1f implements p1f, qgf {
    public kf4 A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public long F0 = -9223372036854775807L;
    public volatile boolean G0;
    public final pgf X;
    public final Executor Y;
    public final crd Z;
    public final Context a;
    public final i63 b;
    public final va8 c;
    public final xw0 o;
    public final ArrayList s0;
    public final SparseArray t0 = new SparseArray();
    public final ScheduledExecutorService u0;
    public final qf4 v0;
    public final ArrayDeque w0;
    public final SparseArray x0;
    public final long y0;
    public rf4 z0;

    public m1f(Context context, i63 i63, xw0 xw0, pgf pgf, crd crd, List list, long j) {
        nk4 nk4 = nk4.a;
        this.a = context;
        this.b = i63;
        this.o = xw0;
        this.X = pgf;
        this.Y = nk4;
        this.Z = crd;
        this.s0 = new ArrayList(list);
        this.y0 = j;
        int i = oaf.a;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new pd3(3, "Effect:MultipleInputVideoGraph:Thread"));
        this.u0 = newSingleThreadScheduledExecutor;
        va8 va8 = new va8(26, (byte) 0);
        this.c = va8;
        DefaultVideoFrameProcessor$Factory$Builder defaultVideoFrameProcessor$Factory$Builder = new DefaultVideoFrameProcessor$Factory$Builder();
        defaultVideoFrameProcessor$Factory$Builder.a = 2;
        defaultVideoFrameProcessor$Factory$Builder.c = va8;
        defaultVideoFrameProcessor$Factory$Builder.b = newSingleThreadScheduledExecutor;
        this.v0 = defaultVideoFrameProcessor$Factory$Builder.build();
        this.w0 = new ArrayDeque();
        this.x0 = new SparseArray();
    }

    public final void a() {
        fm9.k(this.t0.size() == 0 && this.A0 == null && this.z0 == null && !this.E0);
        rf4 b2 = this.v0.b(this.a, this.o, this.b, true, nk4.a, new rxd(23, this));
        this.z0 = b2;
        sg9 sg9 = new sg9(this);
        SparseArray sparseArray = b2.d.g;
        fm9.k(oaf.l(sparseArray, 3));
        ((r27) sparseArray.get(3)).a.x(sg9);
        this.A0 = new kf4(this.a, this.c, this.Z, this.u0, new o9g(22, (Object) this), new sg9(this));
    }

    public final void b() {
        boolean z;
        fm9.l(this.z0);
        if (this.C0) {
            ArrayDeque arrayDeque = this.w0;
            tg9 tg9 = (tg9) arrayDeque.peek();
            if (tg9 != null) {
                rf4 rf4 = this.z0;
                rf4.getClass();
                int i = tg9.a.a;
                if (!rf4.k.e()) {
                    z = false;
                } else {
                    v2 v2Var = rf4.d.k;
                    fm9.l(v2Var);
                    v2Var.p(i, tg9.b);
                    z = true;
                }
                fm9.k(z);
                arrayDeque.remove();
                if (this.D0 && arrayDeque.isEmpty()) {
                    rf4 rf42 = this.z0;
                    rf42.getClass();
                    rf42.f();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder, java.lang.Object] */
    public final sf6 f(int i) {
        fm9.k(!oaf.l(this.t0, i));
        kf4 kf4 = this.A0;
        kf4.getClass();
        synchronized (kf4) {
            fm9.k(!oaf.l(kf4.g, i));
            kf4.g.put(i, new jf4());
            if (kf4.o == -1) {
                kf4.o = i;
            }
        }
        qf4 qf4 = this.v0;
        ? obj = new Object();
        obj.a = qf4.a;
        obj.b = qf4.d;
        obj.c = qf4.c;
        obj.f = !qf4.b;
        boolean z = qf4.g;
        boolean z2 = qf4.h;
        obj.d = new hd0(i, 8, this);
        obj.e = 2;
        this.t0.put(i, obj.build().b(this.a, xw0.o, this.b, true, this.Y, new sh0(i, 13, (Object) this)));
        SparseArray sparseArray = this.t0;
        fm9.k(oaf.l(sparseArray, i));
        return new yff((bgf) sparseArray.get(i), (b8b) null, this.y0);
    }

    public final boolean k() {
        return this.G0;
    }

    public final void m(jee jee) {
        rf4 rf4 = this.z0;
        rf4.getClass();
        rf4.e(jee);
    }

    public final void release() {
        if (!this.E0) {
            for (int i = 0; i < this.t0.size(); i++) {
                SparseArray sparseArray = this.t0;
                ((rf4) ((bgf) sparseArray.get(sparseArray.keyAt(i)))).d();
            }
            this.t0.clear();
            kf4 kf4 = this.A0;
            if (kf4 != null) {
                synchronized (kf4) {
                    fm9.k(kf4.h);
                    try {
                        kf4.f.t(new ff4(kf4, 1));
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException(e);
                    }
                }
                this.A0 = null;
            }
            rf4 rf4 = this.z0;
            if (rf4 != null) {
                rf4.d();
                this.z0 = null;
            }
            try {
                if (((EGLContext) this.c.c) != null) {
                    mr0.s((EGLContext) this.c.c, mr0.A());
                }
            } catch (GlUtil$GlException e2) {
                z04.v("Error releasing GL context", e2);
            }
            this.u0.shutdown();
            try {
                this.u0.awaitTermination(1000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                this.Y.execute(new vs5(this, 27, e3));
            }
            this.E0 = true;
        }
    }
}
