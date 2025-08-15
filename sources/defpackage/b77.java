package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: b77  reason: default package */
public final class b77 implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final dec e;
    public final int f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ dec o;
    public final /* synthetic */ f77 p;

    public b77(f77 f77, dec dec, int i2, float f2, float f3, float f4, float f5, int i3, dec dec2) {
        this.p = f77;
        this.n = i3;
        this.o = dec2;
        this.f = i2;
        this.e = dec;
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.g = ofFloat;
        ofFloat.addUpdateListener(new yj0(5, this));
        ofFloat.setTarget(dec.a);
        ofFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.v(true);
        }
        this.l = true;
    }

    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (!this.k) {
            int i2 = this.n;
            dec dec = this.o;
            f77 f77 = this.p;
            if (i2 <= 0) {
                f77.x0.a(f77.C0, dec);
            } else {
                f77.a.add(dec.a);
                this.h = true;
                if (i2 > 0) {
                    f77.C0.post(new i76(f77, this, i2));
                }
            }
            View view = f77.H0;
            View view2 = dec.a;
            if (view == view2) {
                f77.r(view2);
            }
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
