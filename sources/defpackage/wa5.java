package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: wa5  reason: default package */
public final class wa5 extends gqf {
    public wa5(int i) {
        if ((i & -4) == 0) {
            this.R0 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float V(defpackage.g2f r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.HashMap r1 = r1.a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa5.V(g2f, float):float");
    }

    public final ObjectAnimator S(ViewGroup viewGroup, View view, g2f g2f, g2f g2f2) {
        l12 l12 = ppf.a;
        return U(view, V(g2f, 0.0f), 1.0f);
    }

    public final ObjectAnimator T(ViewGroup viewGroup, View view, g2f g2f, g2f g2f2) {
        l12 l12 = ppf.a;
        ObjectAnimator U = U(view, V(g2f, 1.0f), 0.0f);
        if (U == null) {
            view.setTransitionAlpha(V(g2f2, 1.0f));
        }
        return U;
    }

    public final ObjectAnimator U(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        l12 l12 = ppf.a;
        view.setTransitionAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ppf.a, new float[]{f2});
        va5 va5 = new va5(view);
        ofFloat.addListener(va5);
        s().a(va5);
        return ofFloat;
    }

    public final void h(g2f g2f) {
        gqf.Q(g2f);
        int i = gvb.transition_pause_alpha;
        View view = g2f.b;
        Float f = (Float) view.getTag(i);
        if (f == null) {
            if (view.getVisibility() == 0) {
                l12 l12 = ppf.a;
                f = Float.valueOf(view.getTransitionAlpha());
            } else {
                f = Float.valueOf(0.0f);
            }
        }
        g2f.a.put("android:fade:transitionAlpha", f);
    }
}
