package defpackage;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* renamed from: ew1  reason: default package */
public final class ew1 extends FrameLayout {
    public static final /* synthetic */ int A0 = 0;
    public rrb a;
    public ValueAnimator b;
    public final IntEvaluator c = new IntEvaluator();
    public final FloatEvaluator o = new FloatEvaluator();
    public int s0;
    public int t0;
    public float u0;
    public int v0;
    public int w0;
    public final axe x0;
    public dw1 y0;
    public boolean z0;

    /* JADX WARNING: type inference failed for: r3v3, types: [android.view.ViewOutlineProvider, axe] */
    public ew1(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        ? viewOutlineProvider = new ViewOutlineProvider();
        viewOutlineProvider.a = 0;
        viewOutlineProvider.b = 0;
        this.x0 = viewOutlineProvider;
        setOutlineProvider(viewOutlineProvider);
    }

    public static final void b(ew1 ew1, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, float f3) {
        Integer evaluate = ew1.c.evaluate(f3, Integer.valueOf(i), Integer.valueOf(i2));
        IntEvaluator intEvaluator = ew1.c;
        Integer evaluate2 = intEvaluator.evaluate(f3, Integer.valueOf(i3), Integer.valueOf(i4));
        Float evaluate3 = ew1.o.evaluate(f3, Float.valueOf(f), Float.valueOf(f2));
        Integer evaluate4 = intEvaluator.evaluate(f3, Integer.valueOf(i5), Integer.valueOf(i6));
        Integer evaluate5 = intEvaluator.evaluate(f3, Integer.valueOf(i7), Integer.valueOf(i8));
        ew1.getLayoutParams().width = evaluate.intValue();
        ew1.getLayoutParams().height = evaluate2.intValue();
        ew1.setLayoutParams(ew1.getLayoutParams());
        ew1.setTranslationY(evaluate3.floatValue());
        int intValue = evaluate4.intValue();
        axe axe = ew1.x0;
        axe.a = intValue;
        axe.b = evaluate5.intValue();
        ew1.invalidateOutline();
    }

    public final void a(boolean z, boolean z2) {
        boolean z3 = z;
        if (this.z0 != z3) {
            this.z0 = z3;
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            rrb rrb = this.a;
            if (rrb == null) {
                rrb = null;
            }
            boolean z4 = this.z0;
            if (rrb.b != z4) {
                rrb.b = z4;
                ValueAnimator valueAnimator2 = rrb.c;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float alpha = rrb.v0.getAlpha();
                float f = z4 ? 0.0f : 1.0f;
                float alpha2 = rrb.D0.getAlpha();
                float f2 = z4 ? 1.0f : 0.0f;
                if (z2) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    rrb.c = ofFloat;
                    ofFloat.addUpdateListener(new nrb(rrb, alpha, f, alpha2, f2, 0));
                    ofFloat.setStartDelay(z4 ? 50 : 0);
                    ofFloat.setDuration(150);
                    ofFloat.start();
                } else {
                    rrb.b(rrb, alpha, f, alpha2, f2, 1.0f);
                }
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int measuredWidth2 = this.z0 ? ay7.u(this).getMeasuredWidth() : this.s0;
            int measuredHeight2 = this.z0 ? ay7.u(this).getMeasuredHeight() : this.t0;
            float translationY = getTranslationY();
            boolean z5 = this.z0;
            float f3 = z5 ? 0.0f : this.u0;
            axe axe = this.x0;
            int i = axe.a;
            int i2 = 0;
            int i3 = z5 ? 0 : this.v0;
            int i4 = axe.b;
            if (!z5) {
                i2 = this.w0;
            }
            if (z2) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                this.b = ofFloat2;
                ofFloat2.addUpdateListener(new cw1(this, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2, translationY, f3, i, i3, i4, i2));
                ofFloat2.setDuration(200);
                ofFloat2.start();
                return;
            }
            b(this, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2, translationY, f3, i, i3, i4, i2, 1.0f);
        }
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof rrb) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalArgumentException("child must be QuickCameraView instance".toString());
    }

    public final dw1 getListener() {
        return this.y0;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.z0;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        axe axe = this.x0;
        boolean z = true;
        boolean z2 = y <= ((float) axe.a);
        if (motionEvent.getY() < ((float) (getMeasuredHeight() - axe.b))) {
            z = false;
        }
        if (this.z0 || (!z2 && !z)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setListener(dw1 dw1) {
        this.y0 = dw1;
    }

    public final void setPreviewTranslationY(float f) {
        this.u0 = f;
        if (!this.z0) {
            setTranslationY(f);
        }
    }
}
