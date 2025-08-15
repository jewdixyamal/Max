package defpackage;

import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: hqc  reason: default package */
public final class hqc implements qv6 {
    public final Surface X;
    public h06 Y;
    public final tt6 Z = new tt6(1, this);
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public final qv6 o;

    public hqc(qv6 qv6) {
        this.o = qv6;
        this.X = qv6.getSurface();
    }

    public final void a() {
        synchronized (this.a) {
            try {
                this.c = true;
                this.o.k();
                if (this.b == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void close() {
        synchronized (this.a) {
            try {
                Surface surface = this.X;
                if (surface != null) {
                    surface.release();
                }
                this.o.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ov6 g() {
        ut6 ut6;
        synchronized (this.a) {
            ov6 g = this.o.g();
            if (g != null) {
                this.b++;
                ut6 = new ut6(g);
                ut6.a(this.Z);
            } else {
                ut6 = null;
            }
        }
        return ut6;
    }

    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.o.getHeight();
        }
        return height;
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.o.getSurface();
        }
        return surface;
    }

    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.o.getWidth();
        }
        return width;
    }

    public final int j() {
        int j;
        synchronized (this.a) {
            j = this.o.j();
        }
        return j;
    }

    public final void k() {
        synchronized (this.a) {
            this.o.k();
        }
    }

    public final void l(pv6 pv6, Executor executor) {
        synchronized (this.a) {
            this.o.l(new ypc(this, 2, pv6), executor);
        }
    }

    public final int m() {
        int m;
        synchronized (this.a) {
            m = this.o.m();
        }
        return m;
    }

    public final ov6 o() {
        ut6 ut6;
        synchronized (this.a) {
            ov6 o2 = this.o.o();
            if (o2 != null) {
                this.b++;
                ut6 = new ut6(o2);
                ut6.a(this.Z);
            } else {
                ut6 = null;
            }
        }
        return ut6;
    }
}
