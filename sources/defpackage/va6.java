package defpackage;

import android.graphics.Matrix;
import android.view.ScaleGestureDetector;

/* renamed from: va6  reason: default package */
public final class va6 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ wa6 a;

    public va6(wa6 wa6) {
        this.a = wa6;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        wa6 wa6 = this.a;
        float f = wa6.Q0;
        float f2 = wa6.R0;
        if (scaleFactor != 0.0f) {
            Matrix matrix = wa6.u0;
            matrix.postScale(scaleFactor, scaleFactor, f, f2);
            wa6.setImageMatrix(matrix);
        }
        wa6.S0 = scaleGestureDetector.getFocusX();
        wa6.T0 = scaleGestureDetector.getFocusY();
        return true;
    }
}
