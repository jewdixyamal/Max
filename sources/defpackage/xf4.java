package defpackage;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xf4  reason: default package */
public abstract class xf4 {
    public static final Size k = new Size(0, 0);
    public static final AtomicInteger l = new AtomicInteger(0);
    public static final AtomicInteger m = new AtomicInteger(0);
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public lq1 d;
    public final oq1 e;
    public lq1 f;
    public final oq1 g;
    public final Size h;
    public final int i;
    public Class j;

    public xf4(Size size, int i2) {
        this.h = size;
        this.i = i2;
        oq1 g2 = f8.g(new vf4(this, 0));
        this.e = g2;
        this.g = f8.g(new vf4(this, 1));
        if (mqd.u(3, "DeferrableSurface")) {
            m.incrementAndGet();
            l.get();
            toString();
            g2.b.d(new wf4(this, Log.getStackTraceString(new Exception())), ju0.k());
        }
    }

    public void a() {
        lq1 lq1;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    this.c = true;
                    this.f.b((Object) null);
                    if (this.b == 0) {
                        lq1 = this.d;
                        this.d = null;
                    } else {
                        lq1 = null;
                    }
                    if (mqd.u(3, "DeferrableSurface")) {
                        toString();
                    }
                } else {
                    lq1 = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (lq1 != null) {
            lq1.b((Object) null);
        }
    }

    public final void b() {
        lq1 lq1;
        synchronized (this.a) {
            try {
                int i2 = this.b;
                if (i2 != 0) {
                    int i3 = i2 - 1;
                    this.b = i3;
                    if (i3 != 0 || !this.c) {
                        lq1 = null;
                    } else {
                        lq1 = this.d;
                        this.d = null;
                    }
                    if (mqd.u(3, "DeferrableSurface")) {
                        toString();
                        if (this.b == 0) {
                            m.get();
                            l.decrementAndGet();
                            toString();
                        }
                    }
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (lq1 != null) {
            lq1.b((Object) null);
        }
    }

    public final bm7 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    dw6 dw6 = new dw6(1, new DeferrableSurface$SurfaceClosedException(this, "DeferrableSurface already closed."));
                    return dw6;
                }
                bm7 e2 = e();
                return e2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i2 = this.b;
                if (i2 == 0) {
                    if (this.c) {
                        throw new DeferrableSurface$SurfaceClosedException(this, "Cannot begin use on a closed surface.");
                    }
                }
                this.b = i2 + 1;
                if (mqd.u(3, "DeferrableSurface")) {
                    if (this.b == 1) {
                        m.get();
                        l.incrementAndGet();
                        toString();
                    }
                    toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract bm7 e();
}
