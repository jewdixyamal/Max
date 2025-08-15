package defpackage;

import android.graphics.RectF;
import java.lang.ref.WeakReference;

/* renamed from: r37  reason: default package */
public final class r37 implements Runnable {
    public final float X;
    public final float Y;
    public final float Z;
    public final WeakReference a;
    public final long b = 500;
    public final long c = System.currentTimeMillis();
    public final float o;
    public final float s0;
    public final float t0;
    public final boolean u0;

    public r37(t37 t37, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.a = new WeakReference(t37);
        this.o = f;
        this.X = f2;
        this.Y = f3;
        this.Z = f4;
        this.s0 = f5;
        this.t0 = f6;
        this.u0 = z;
    }

    public final void run() {
        t37 t37 = (t37) this.a.get();
        if (t37 != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j = this.b;
            float min = (float) Math.min(j, currentTimeMillis);
            float f = (float) j;
            float f2 = (min / f) - 1.0f;
            float f3 = (f2 * f2 * f2) + 1.0f;
            float f4 = (this.Y * f3) + 0.0f;
            float f5 = (f3 * this.Z) + 0.0f;
            float i = pag.i(min, this.t0, f);
            if (min < f) {
                float[] fArr = t37.s0;
                t37.g(f4 - (fArr[0] - this.o), f5 - (fArr[1] - this.X));
                if (!this.u0) {
                    RectF rectF = t37.C0;
                    t37.j(this.s0 + i, rectF.centerX(), rectF.centerY());
                }
                if (!t37.i(t37.o)) {
                    t37.post(this);
                }
            }
        }
    }
}
