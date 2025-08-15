package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;

/* renamed from: tf4  reason: default package */
public final /* synthetic */ class tf4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ uf4 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ tf4(uf4 uf4, float f, float f2) {
        this.a = uf4;
        this.b = f;
        this.c = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        uf4 uf4 = this.a;
        uf4.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Matrix matrix = uf4.k;
        float K = floatValue / f46.K(matrix);
        matrix.postScale(K, K, this.b, this.c);
        uf4.j.set(matrix);
        uf4.b();
        iag iag = uf4.b;
        if (iag != null) {
            iag.f(matrix);
        }
    }
}
