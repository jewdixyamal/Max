package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: uge  reason: default package */
public final class uge extends FrameLayout {
    public static final /* synthetic */ int s0 = 0;
    public final dnf a;
    public boolean b;
    public ValueAnimator c;
    public tge o;

    public uge(Context context) {
        super(context, (AttributeSet) null);
        dnf dnf = new dnf(getContext(), this, new br0(2, this));
        dnf.b = (int) (1.0f * ((float) dnf.b));
        this.a = dnf;
    }

    public static void a(uge uge, float f) {
        uge.setBackgroundAlpha(f);
    }

    public static void b(uge uge, float f, float f2) {
        if (f2 != 0.0f) {
            f2 = ((float) 1) - f2;
        }
        if (f > f2) {
            uge.setBackgroundAlpha(((float) 1) - f);
        }
    }

    private final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (ote.d(f, 0.0f, 1.0f) * ((float) 255)));
        }
    }

    public final void c(int i, int i2, k56 k56, k56 k562, a66 a66) {
        tge tge = this.o;
        if (tge != null) {
            ValueAnimator valueAnimator = this.c;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            ValueAnimator valueAnimator2 = this.c;
            if (valueAnimator2 != null) {
                ju0.i(valueAnimator2);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
            ofInt.setDuration(200);
            ofInt.addUpdateListener(new jf(tge, a66, animatedFraction, 2));
            ofInt.addListener(new sg(k562, (FrameLayout) this, k56, 2));
            ofInt.start();
            this.c = ofInt;
        }
    }

    public final void computeScroll() {
        if (this.a.f()) {
            postInvalidateOnAnimation();
        }
    }

    public final void d() {
        tge tge = this.o;
        if (tge != null) {
            if (tge.q().getHeight() > 0) {
                c(tge.y(), tge.h(), new xid(21), new xid(21), new sge(this, 0));
            }
            invalidate();
        }
    }

    public final tge getCallback() {
        return this.o;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a.o(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        tge tge = this.o;
        if (tge != null) {
            View q = tge.q();
            int top = q.getHeight() > 0 ? q.getTop() : tge.y();
            super.onLayout(z, i, i2, i3, i4);
            q.offsetTopAndBottom(top);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a.i(motionEvent);
        return true;
    }

    public final void setCallback(tge tge) {
        this.o = tge;
    }
}
