package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kee  reason: default package */
public final class kee implements Closeable {
    public final float[] X;
    public tj3 Y;
    public Executor Z;
    public final Object a = new Object();
    public final Surface b;
    public final int c;
    public final Size o;
    public boolean s0;
    public boolean t0;
    public final oq1 u0;
    public lq1 v0;

    public kee(Surface surface, int i, Size size, yb0 yb0, yb0 yb02) {
        float[] fArr = new float[16];
        this.X = fArr;
        this.s0 = false;
        this.t0 = false;
        this.b = surface;
        this.c = i;
        this.o = size;
        a(fArr, new float[16], yb0);
        a(new float[16], new float[16], yb02);
        this.u0 = f8.g(new bqc(24, this));
    }

    public static void a(float[] fArr, float[] fArr2, yb0 yb0) {
        Matrix.setIdentityM(fArr, 0);
        if (yb0 != null) {
            a14.G(fArr);
            int i = yb0.d;
            a14.F(fArr, (float) i);
            boolean z = yb0.e;
            if (z) {
                Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
            Size size = yb0.a;
            Size g = e1f.g(size, i);
            float f = (float) 0;
            android.graphics.Matrix a2 = e1f.a(new RectF(f, f, (float) size.getWidth(), (float) size.getHeight()), new RectF(f, f, (float) g.getWidth(), (float) g.getHeight()), i, z);
            RectF rectF = new RectF(yb0.b);
            a2.mapRect(rectF);
            Matrix.translateM(fArr, 0, rectF.left / ((float) g.getWidth()), ((((float) g.getHeight()) - rectF.height()) - rectF.top) / ((float) g.getHeight()), 0.0f);
            Matrix.scaleM(fArr, 0, rectF.width() / ((float) g.getWidth()), rectF.height() / ((float) g.getHeight()), 1.0f);
            Matrix.setIdentityM(fArr2, 0);
            a14.G(fArr2);
            ax1 ax1 = yb0.c;
            if (ax1 != null) {
                c54.p("Camera has no transform.", ax1.n());
                a14.F(fArr2, (float) ax1.p().b());
                if (ax1.d()) {
                    Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                    Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
                }
            }
            Matrix.invertM(fArr2, 0, fArr2, 0);
            Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        }
    }

    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.t0) {
                    this.t0 = true;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.v0.b((Object) null);
    }

    public final Surface d(zh6 zh6, tj3 tj3) {
        boolean z;
        synchronized (this.a) {
            this.Z = zh6;
            this.Y = tj3;
            z = this.s0;
        }
        if (z) {
            m();
        }
        return this.b;
    }

    public final void m() {
        Executor executor;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                if (this.Z != null) {
                    tj3 tj3 = this.Y;
                    if (tj3 != null) {
                        if (!this.t0) {
                            atomicReference.set(tj3);
                            executor = this.Z;
                            this.s0 = false;
                        }
                        executor = null;
                    }
                }
                this.s0 = true;
                executor = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (executor != null) {
            try {
                executor.execute(new flc(this, 22, atomicReference));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final void n(float[] fArr, float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.X, 0);
    }
}
