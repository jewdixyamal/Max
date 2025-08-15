package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.apache.http.HttpStatus;

/* renamed from: s0b  reason: default package */
public final class s0b extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public float A0;
    public float B0;
    public float C0;
    public ValueAnimator D0;
    public AnimatorSet E0;
    public fye F0;
    public final ScaleGestureDetector a;
    public r0b b = r0b.b;
    public float c;
    public float o = 1.0f;
    public float s0;
    public float t0;
    public boolean u0;
    public final Paint v0;
    public final Rect w0;
    public float x0;
    public float y0;
    public float z0;

    public s0b(Context context) {
        super(context);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.a = scaleGestureDetector;
        Paint paint = new Paint();
        this.v0 = paint;
        this.w0 = new Rect();
        paint.setColor(-1);
        paint.setStrokeWidth(40.0f);
        paint.setStyle(Paint.Style.STROKE);
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    private final r0b getStateByScale() {
        r0b r0b = this.b;
        r0b r0b2 = r0b.b;
        r0b r0b3 = r0b.a;
        if (r0b == r0b2) {
            float f = (float) 1;
            if (this.o <= z7b.f(this.t0, f, 0.25f, f)) {
                return r0b2;
            }
        } else {
            float f2 = this.o;
            float f3 = this.t0;
            if (f2 < f3 - ((f3 - ((float) 1)) * 0.25f)) {
                return r0b2;
            }
        }
        return r0b3;
    }

    private final View getVideoView() {
        Object obj;
        u1 u1Var = new u1(4, this);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((View) obj) instanceof amf) {
                break;
            }
        }
        return (View) obj;
    }

    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.B0, this.C0);
        float f = this.o;
        canvas.scale(f, f, this.x0, this.y0);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.u0) {
            canvas.drawRect(this.w0, this.v0);
        }
    }

    public final fye getTouchEventDelegate() {
        return this.F0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.E0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        fye fye = this.F0;
        if (fye != null) {
            ((zm4) fye).d();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return this.F0 != null && motionEvent.getPointerCount() <= 1;
        }
        return true;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View videoView = getVideoView();
        if (videoView != null) {
            int measuredHeight = videoView.getMeasuredHeight();
            int measuredWidth = videoView.getMeasuredWidth();
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0 && measuredWidth2 != 0 && measuredHeight2 != 0) {
                float f = (float) measuredWidth2;
                float f2 = (float) measuredHeight2;
                float f3 = (float) measuredWidth;
                float f4 = (float) measuredHeight;
                float f5 = f3 / f4 > f / f2 ? f2 / f4 : f / f3;
                this.t0 = f5;
                this.s0 = f5 * 4.0f;
                this.w0.set(0, 0, measuredWidth2, measuredHeight2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.c;
        this.o = scaleFactor;
        this.o = (float) Math.min((double) this.s0, Math.max(0.8999999761581421d, (double) scaleFactor));
        if (getStateByScale() == r0b.a && this.b == r0b.b) {
            this.v0.setAlpha(HttpStatus.SC_PROCESSING);
            this.u0 = true;
        } else {
            this.u0 = false;
        }
        invalidate();
        this.B0 = scaleGestureDetector.getFocusX() - this.z0;
        this.C0 = scaleGestureDetector.getFocusY() - this.A0;
        return false;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.c = this.o;
        if (this.b == r0b.b) {
            this.x0 = scaleGestureDetector.getFocusX();
            this.y0 = scaleGestureDetector.getFocusY();
        }
        this.z0 = scaleGestureDetector.getFocusX();
        this.A0 = scaleGestureDetector.getFocusY();
        if (this.D0 != null) {
            this.D0 = null;
            this.u0 = false;
        }
        AnimatorSet animatorSet = this.E0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.E0 = null;
        invalidate();
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ValueAnimator valueAnimator;
        ArrayList arrayList = new ArrayList();
        r0b stateByScale = getStateByScale();
        r0b r0b = r0b.a;
        r0b r0b2 = r0b.b;
        if (stateByScale == r0b && this.b == r0b2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.4f, 1.0f, 0.0f});
            ofFloat.setDuration(600);
            ofFloat.addUpdateListener(new q0b(this, 0));
            arrayList.add(ofFloat);
            this.D0 = ofFloat;
        }
        if (getStateByScale() == r0b) {
            this.b = r0b;
            valueAnimator = ValueAnimator.ofFloat(new float[]{this.o, this.t0});
        } else {
            this.b = r0b2;
            valueAnimator = ValueAnimator.ofFloat(new float[]{this.o, 1.0f});
        }
        valueAnimator.setDuration(300);
        valueAnimator.addUpdateListener(new q0b(this, 1));
        arrayList.add(valueAnimator);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{this.x0, ((float) getWidth()) / 2.0f});
        ofFloat2.setDuration(300);
        ofFloat2.addUpdateListener(new q0b(this, 2));
        arrayList.add(ofFloat2);
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{this.y0, ((float) getHeight()) / 2.0f});
        ofFloat3.setDuration(300);
        ofFloat3.addUpdateListener(new q0b(this, 3));
        arrayList.add(ofFloat3);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{this.B0, 0.0f});
        ofFloat4.setDuration(300);
        ofFloat4.addUpdateListener(new q0b(this, 4));
        arrayList.add(ofFloat4);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{this.C0, 0.0f});
        ofFloat5.setDuration(300);
        ofFloat5.addUpdateListener(new q0b(this, 5));
        arrayList.add(ofFloat5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.E0 = animatorSet;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        fye fye = this.F0;
        if (fye != null) {
            zm4 zm4 = (zm4) fye;
            Rect rect = (Rect) zm4.j;
            ((FrameLayout) zm4.c).getHitRect(rect);
            int x = (int) motionEvent.getX();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = (i - i2) / 6;
            if (x >= i2 && x <= rect.centerX() - i3) {
                ((GestureDetector) ((jn) zm4.g).o).onTouchEvent(motionEvent);
            } else if (x < rect.centerX() + i3 || x > rect.right) {
                ((GestureDetector) zm4.h).onTouchEvent(motionEvent);
            } else {
                ((GestureDetector) ((jn) zm4.f).o).onTouchEvent(motionEvent);
            }
        }
        ScaleGestureDetector scaleGestureDetector = this.a;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            View videoView = getVideoView();
            if (videoView != null) {
                videoView.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    public final void setTouchEventDelegate(fye fye) {
        this.F0 = fye;
    }
}
