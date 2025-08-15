package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: uf4  reason: default package */
public class uf4 implements jag, Animator.AnimatorListener {
    public final b9b a;
    public iag b = null;
    public boolean c = false;
    public boolean d = false;
    public float e = 1.0f;
    public float f = 4.0f;
    public final RectF g = new RectF();
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final Matrix j = new Matrix();
    public final Matrix k = new Matrix();

    public uf4(b9b b9b) {
        new Matrix();
        this.a = b9b;
        b9b.c = this;
    }

    public void a(float f2, float f3) {
        float K = f46.K(this.k);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{K, ((double) K) <= 1.1d ? 2.5f : 1.0f});
        ofFloat.setDuration(250);
        ofFloat.addUpdateListener(new tf4(this, f2, f3));
        ofFloat.addListener(this);
        ofFloat.start();
    }

    public void b() {
        RectF rectF = this.i;
        rectF.set(this.h);
        Matrix matrix = this.k;
        matrix.mapRect(rectF);
        float f2 = rectF.left;
        float width = rectF.width();
        RectF rectF2 = this.g;
        float width2 = rectF2.width() - width;
        float min = width2 > 0.0f ? width2 / 2.0f : Math.min(Math.max(width2, f2), 0.0f);
        float f3 = rectF.top;
        float height = rectF2.height() - rectF.height();
        float min2 = height > 0.0f ? height / 2.0f : Math.min(Math.max(height, f3), 0.0f);
        float f4 = rectF.left;
        if (min != f4 || min2 != rectF.top) {
            matrix.postTranslate(min - f4, min2 - rectF.top);
            this.a.q();
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.d = false;
    }

    public final void onAnimationEnd(Animator animator) {
        this.d = false;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.d = true;
    }

    public void reset() {
        ((r68) this.a.b).b();
        this.j.reset();
        this.k.reset();
    }
}
