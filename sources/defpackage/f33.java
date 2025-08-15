package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: f33  reason: default package */
public final /* synthetic */ class f33 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ h33 b;

    public /* synthetic */ f33(h33 h33, int i) {
        this.a = i;
        this.b = h33;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        h33 h33 = this.b;
        h33.getClass();
        switch (i) {
            case 0:
                h33.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = h33.d;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                return;
        }
    }
}
