package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: yj0  reason: default package */
public final class yj0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yj0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck0 ck0 = (ck0) obj;
                Iterator it = ck0.z0.iterator();
                while (it.hasNext()) {
                    uwe uwe = (uwe) it.next();
                    uwe.Y0 = 1.2f;
                    uwe.W0 = floatValue;
                    uwe.X0 = floatValue;
                    uwe.Z0 = og.b(0.0f, 1.0f, 0.19f, 1.0f, floatValue);
                    uwe.invalidateSelf();
                }
                WeakHashMap weakHashMap = zmf.a;
                ck0.postInvalidateOnAnimation();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q18 q18 = ((BottomSheetBehavior) obj).i;
                if (q18 != null) {
                    p18 p18 = q18.a;
                    if (p18.j != floatValue2) {
                        p18.j = floatValue2;
                        q18.X = true;
                        q18.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((w53) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 3:
                ((qsc) obj).j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                int floatValue3 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                zb5 zb5 = (zb5) obj;
                zb5.c.setAlpha(floatValue3);
                zb5.o.setAlpha(floatValue3);
                zb5.D0.invalidate();
                return;
            case 5:
                ((b77) obj).m = valueAnimator.getAnimatedFraction();
                return;
            case 6:
                ood ood = (ood) obj;
                ood.f1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ood.o = (((ood.f1 - ood.l1) * ood.d1) / ood.g1) + ood.b;
                ood.invalidate();
                ood.getClass();
                return;
            case 7:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            case 8:
                ((TextInputLayout) obj).G1.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                dif dif = (dif) obj;
                dif.K0 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                dif.requestLayout();
                return;
        }
    }
}
