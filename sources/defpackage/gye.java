package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: gye  reason: default package */
public final class gye extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, cna {
    public final GestureDetector X;
    public volatile float Y;
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    public final rvd c;
    public final float o;

    public gye(Context context, rvd rvd) {
        this.c = rvd;
        this.o = 25.0f;
        this.X = new GestureDetector(context, this);
        this.Y = 3.1415927f;
    }

    public final void a(float[] fArr, float f) {
        this.Y = -f;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.a.x) / this.o;
        float y = motionEvent2.getY();
        PointF pointF = this.a;
        float f3 = (y - pointF.y) / this.o;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = (double) this.Y;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.b;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = (cos * f3) + (sin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        rvd rvd = this.c;
        PointF pointF3 = this.b;
        synchronized (rvd) {
            float f5 = pointF3.y;
            rvd.Z = f5;
            Matrix.setRotateM(rvd.X, 0, -f5, (float) Math.cos((double) rvd.s0), (float) Math.sin((double) rvd.s0), 0.0f);
            Matrix.setRotateM(rvd.Y, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.c.v0.performClick();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.X.onTouchEvent(motionEvent);
    }
}
