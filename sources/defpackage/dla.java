package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: dla  reason: default package */
public final /* synthetic */ class dla implements m56 {
    public final /* synthetic */ float a;
    public final /* synthetic */ Interpolator b;

    public /* synthetic */ dla(float f, LinearInterpolator linearInterpolator) {
        this.a = f;
        this.b = linearInterpolator;
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{view.getAlpha(), this.a});
        ofFloat.setInterpolator(this.b);
        return ofFloat;
    }
}
