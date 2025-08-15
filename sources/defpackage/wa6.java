package defpackage;

import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: wa6  reason: default package */
public final class wa6 extends t37 {
    public ScaleGestureDetector N0;
    public zmc O0;
    public GestureDetector P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public boolean U0;
    public boolean V0;
    public int W0;

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getDrawable() == null) {
            return true;
        }
        if ((motionEvent.getAction() & 255) == 0) {
            removeCallbacks(this.J0);
            removeCallbacks(this.K0);
        }
        if (motionEvent.getPointerCount() > 1) {
            this.Q0 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.R0 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
        }
        this.P0.onTouchEvent(motionEvent);
        if (this.V0) {
            this.N0.onTouchEvent(motionEvent);
        }
        if (this.U0) {
            zmc zmc = this.O0;
            zmc.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                zmc.c = motionEvent.getX();
                zmc.d = motionEvent.getY();
                zmc.e = motionEvent.findPointerIndex(motionEvent.getPointerId(0));
                zmc.g = 0.0f;
                zmc.h = true;
            } else if (actionMasked == 1) {
                zmc.e = -1;
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    zmc.a = motionEvent.getX();
                    zmc.b = motionEvent.getY();
                    zmc.f = motionEvent.findPointerIndex(motionEvent.getPointerId(motionEvent.getActionIndex()));
                    zmc.g = 0.0f;
                    zmc.h = true;
                } else if (actionMasked == 6) {
                    zmc.f = -1;
                }
            } else if (!(zmc.e == -1 || zmc.f == -1 || motionEvent.getPointerCount() <= zmc.f)) {
                float x = motionEvent.getX(zmc.e);
                float y = motionEvent.getY(zmc.e);
                float x2 = motionEvent.getX(zmc.f);
                float y2 = motionEvent.getY(zmc.f);
                if (zmc.h) {
                    zmc.g = 0.0f;
                    zmc.h = false;
                } else {
                    float f = zmc.a;
                    float degrees = (((float) Math.toDegrees((double) ((float) Math.atan2((double) (y2 - y), (double) (x2 - x))))) % 360.0f) - (((float) Math.toDegrees((double) ((float) Math.atan2((double) (zmc.b - zmc.d), (double) (f - zmc.c))))) % 360.0f);
                    zmc.g = degrees;
                    if (degrees < -180.0f) {
                        zmc.g = degrees + 360.0f;
                    } else if (degrees > 180.0f) {
                        zmc.g = degrees - 360.0f;
                    }
                }
                gaa gaa = zmc.i;
                if (gaa != null) {
                    float f2 = zmc.g;
                    wa6 wa6 = (wa6) gaa.a;
                    float f3 = wa6.Q0;
                    float f4 = wa6.R0;
                    if (f2 != 0.0f) {
                        Matrix matrix = wa6.u0;
                        matrix.postRotate(f2, f3, f4);
                        wa6.setImageMatrix(matrix);
                    }
                }
                zmc.a = x2;
                zmc.b = y2;
                zmc.c = x;
                zmc.d = y;
            }
        }
        if ((motionEvent.getAction() & 255) == 1) {
            setImageToWrapCropBounds(true);
        }
        return true;
    }
}
