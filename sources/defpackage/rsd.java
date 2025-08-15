package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: rsd  reason: default package */
public final class rsd extends gqf {
    public static final DecelerateInterpolator U0 = new DecelerateInterpolator();
    public static final AccelerateInterpolator V0 = new AccelerateInterpolator();
    public static final psd W0 = new psd();
    public qsd T0;

    public final ObjectAnimator S(ViewGroup viewGroup, View view, g2f g2f, g2f g2f2) {
        if (g2f2 == null) {
            return null;
        }
        int[] iArr = (int[]) g2f2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return ema.o(view, g2f2, iArr[0], iArr[1], this.T0.a(view, viewGroup), this.T0.b(view, viewGroup), translationX, translationY, U0, this);
    }

    public final ObjectAnimator T(ViewGroup viewGroup, View view, g2f g2f, g2f g2f2) {
        if (g2f == null) {
            return null;
        }
        int[] iArr = (int[]) g2f.a.get("android:slide:screenPosition");
        return ema.o(view, g2f, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.T0.a(view, viewGroup), this.T0.b(view, viewGroup), V0, this);
    }

    public final void e(g2f g2f) {
        gqf.Q(g2f);
        int[] iArr = new int[2];
        g2f.b.getLocationOnScreen(iArr);
        g2f.a.put("android:slide:screenPosition", iArr);
    }

    public final void h(g2f g2f) {
        gqf.Q(g2f);
        int[] iArr = new int[2];
        g2f.b.getLocationOnScreen(iArr);
        g2f.a.put("android:slide:screenPosition", iArr);
    }
}
