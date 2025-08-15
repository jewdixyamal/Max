package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ImageWriter;
import java.nio.ByteBuffer;

/* renamed from: qt6  reason: default package */
public abstract class qt6 implements pv6 {
    public ImageWriter X;
    public Rect Y = new Rect();
    public Matrix Z;
    public volatile int a;
    public volatile int b = 1;
    public volatile boolean c;
    public hqc o;
    public ByteBuffer s0;
    public ByteBuffer t0;
    public ByteBuffer u0;
    public ByteBuffer v0;
    public final Object w0;
    public boolean x0;

    public qt6() {
        new Rect();
        this.Z = new Matrix();
        new Matrix();
        this.w0 = new Object();
        this.x0 = true;
    }

    public abstract ov6 a(qv6 qv6);

    public final bm7 b(ov6 ov6) {
        int i = this.c ? this.a : 0;
        synchronized (this.w0) {
            try {
                if (this.c && i != 0) {
                    g(ov6, i);
                }
                if (this.c) {
                    d(ov6);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return new dw6(1, new RuntimeException("No analyzer or executor currently set.".toString()));
    }

    public abstract void c();

    public final void d(ov6 ov6) {
        if (this.b == 1) {
            if (this.t0 == null) {
                this.t0 = ByteBuffer.allocateDirect(ov6.getHeight() * ov6.getWidth());
            }
            this.t0.position(0);
            if (this.u0 == null) {
                this.u0 = ByteBuffer.allocateDirect((ov6.getHeight() * ov6.getWidth()) / 4);
            }
            this.u0.position(0);
            if (this.v0 == null) {
                this.v0 = ByteBuffer.allocateDirect((ov6.getHeight() * ov6.getWidth()) / 4);
            }
            this.v0.position(0);
        } else if (this.b == 2 && this.s0 == null) {
            this.s0 = ByteBuffer.allocateDirect(ov6.getHeight() * ov6.getWidth() * 4);
        }
    }

    public abstract void e(ov6 ov6);

    public final void f(qv6 qv6) {
        try {
            ov6 a2 = a(qv6);
            if (a2 != null) {
                e(a2);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void g(ov6 ov6, int i) {
        hqc hqc = this.o;
        if (hqc != null) {
            hqc.a();
            int width = ov6.getWidth();
            int height = ov6.getHeight();
            int j = this.o.j();
            int m = this.o.m();
            boolean z = i == 90 || i == 270;
            int i2 = z ? height : width;
            if (!z) {
                width = height;
            }
            this.o = new hqc(s36.k(i2, width, j, m));
            if (this.b == 1) {
                ImageWriter imageWriter = this.X;
                if (imageWriter != null) {
                    imageWriter.close();
                }
                this.X = ImageWriter.newInstance(this.o.getSurface(), this.o.m());
            }
        }
    }
}
