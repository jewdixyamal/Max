package ru.ok.messages.video.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.apache.http.HttpStatus;

public class PinchToZoomVideoViewWrapper extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public static final /* synthetic */ int K0 = 0;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public ValueAnimator E0;
    public ValueAnimator F0;
    public ValueAnimator G0;
    public ValueAnimator H0;
    public ValueAnimator I0;
    public ValueAnimator J0;
    public final ScaleGestureDetector a;
    public final ad b = ((y8a) vl.b()).b();
    public p0b c = p0b.b;
    public float o;
    public float s0 = 1.0f;
    public float t0;
    public float u0;
    public boolean v0 = false;
    public final Paint w0;
    public final Rect x0;
    public float y0;
    public float z0;

    public PinchToZoomVideoViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.a = scaleGestureDetector;
        Paint paint = new Paint();
        this.w0 = paint;
        this.x0 = new Rect();
        paint.setColor(-1);
        getContext();
        paint.setStrokeWidth((float) bk4.b().u);
        paint.setStyle(Paint.Style.STROKE);
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    private p0b getStateByScale() {
        p0b p0b = this.c;
        p0b p0b2 = p0b.b;
        p0b p0b3 = p0b.a;
        if (p0b == p0b2) {
            return this.s0 > z7b.f(this.u0, 1.0f, 0.25f, 1.0f) ? p0b3 : p0b2;
        }
        float f = this.s0;
        float f2 = this.u0;
        return f < f2 - ((f2 - 1.0f) * 0.25f) ? p0b2 : p0b3;
    }

    private View getVideoView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VideoView) {
                return childAt;
            }
        }
        throw new IllegalStateException("Wrapper should contains VideoView");
    }

    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.C0, this.D0);
        float f = this.s0;
        canvas.scale(f, f, this.y0, this.z0);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.v0) {
            canvas.drawRect(this.x0, this.w0);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.F0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.E0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.G0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.H0;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.I0;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.J0;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isEnabled();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getVideoView().getMeasuredHeight();
        int measuredWidth = getVideoView().getMeasuredWidth();
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0 && measuredWidth2 != 0 && measuredHeight2 != 0) {
            float f = (float) measuredWidth2;
            float f2 = (float) measuredHeight2;
            float f3 = (float) measuredWidth;
            float f4 = (float) measuredHeight;
            if (f3 / f4 > f / f2) {
                this.u0 = f2 / f4;
            } else {
                this.u0 = f / f3;
            }
            this.t0 = this.u0 * 4.0f;
            this.x0.set(0, 0, measuredWidth2, measuredHeight2);
        }
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.o;
        this.s0 = scaleFactor;
        this.s0 = Math.min(this.t0, Math.max(0.9f, scaleFactor));
        if (getStateByScale() == p0b.a && this.c == p0b.b) {
            this.w0.setAlpha(HttpStatus.SC_PROCESSING);
            this.v0 = true;
        } else {
            this.v0 = false;
        }
        invalidate();
        this.C0 = scaleGestureDetector.getFocusX() - this.A0;
        this.D0 = scaleGestureDetector.getFocusY() - this.B0;
        return false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.o = this.s0;
        if (this.c == p0b.b) {
            this.y0 = scaleGestureDetector.getFocusX();
            this.z0 = scaleGestureDetector.getFocusY();
        }
        this.A0 = scaleGestureDetector.getFocusX();
        this.B0 = scaleGestureDetector.getFocusY();
        ValueAnimator valueAnimator = this.E0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E0 = null;
        }
        ValueAnimator valueAnimator2 = this.F0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.F0 = null;
            this.v0 = false;
        }
        ValueAnimator valueAnimator3 = this.G0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.H0;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.I0;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.J0;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        invalidate();
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        p0b stateByScale = getStateByScale();
        p0b p0b = p0b.a;
        p0b p0b2 = p0b.b;
        if (stateByScale == p0b && this.c == p0b2) {
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.4f, 1.0f, 0.0f}).setDuration(600);
            this.F0 = duration;
            duration.addUpdateListener(new o0b(this, 0));
            this.F0.start();
        }
        if (getStateByScale() == p0b) {
            this.c = p0b;
            this.E0 = ValueAnimator.ofFloat(new float[]{this.s0, this.u0});
        } else {
            this.c = p0b2;
            this.E0 = ValueAnimator.ofFloat(new float[]{this.s0, 1.0f});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scaleType", this.c.toString());
        hashMap.put("orientation", Integer.valueOf(getContext().getResources().getConfiguration().orientation));
        this.b.h("PINCH_TO_ZOOM", hashMap);
        this.E0.setDuration(300).addUpdateListener(new o0b(this, 1));
        this.E0.start();
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{this.y0, (float) (getWidth() / 2)}).setDuration(300);
        this.G0 = duration2;
        duration2.addUpdateListener(new o0b(this, 2));
        this.G0.start();
        ValueAnimator duration3 = ValueAnimator.ofFloat(new float[]{this.z0, (float) (getHeight() / 2)}).setDuration(300);
        this.H0 = duration3;
        duration3.addUpdateListener(new o0b(this, 3));
        this.H0.start();
        ValueAnimator duration4 = ValueAnimator.ofFloat(new float[]{this.C0, 0.0f}).setDuration(300);
        this.I0 = duration4;
        duration4.addUpdateListener(new o0b(this, 4));
        this.I0.start();
        ValueAnimator duration5 = ValueAnimator.ofFloat(new float[]{this.D0, 0.0f}).setDuration(300);
        this.J0 = duration5;
        duration5.addUpdateListener(new o0b(this, 5));
        this.J0.start();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = this.a;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getVideoView().dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
