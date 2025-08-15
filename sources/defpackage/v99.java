package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Rational;

/* renamed from: v99  reason: default package */
public abstract class v99 {
    public Rational a;

    /* JADX WARNING: type inference failed for: r6v1, types: [u99, java.lang.Object] */
    public final u99 a(float f, float f2, float f3) {
        PointF pointF;
        r8b r8b = (r8b) this;
        float[] fArr = {f, f2};
        synchronized (r8b) {
            try {
                Matrix matrix = r8b.d;
                if (matrix == null) {
                    pointF = r8b.e;
                } else {
                    matrix.mapPoints(fArr);
                    pointF = new PointF(fArr[0], fArr[1]);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        float f4 = pointF.x;
        float f5 = pointF.y;
        Rational rational = this.a;
        ? obj = new Object();
        obj.a = f4;
        obj.b = f5;
        obj.c = f3;
        obj.d = rational;
        return obj;
    }
}
