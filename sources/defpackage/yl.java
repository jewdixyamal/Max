package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.transition.TransitionValues;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: yl  reason: default package */
public final /* synthetic */ class yl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yl(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        Object obj2 = this.c;
        switch (this.a) {
            case 0:
                fm fmVar = (fm) obj;
                fmVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((q18) obj2).k(floatValue);
                Drawable drawable = fmVar.J0;
                if (drawable instanceof q18) {
                    ((q18) drawable).k(floatValue);
                }
                Iterator it = fmVar.F0.iterator();
                if (it.hasNext()) {
                    au1.r(it.next());
                    throw null;
                }
                return;
            case 1:
                no1.x((bg) obj, (no1) obj2);
                return;
            case 2:
                w33 w33 = (w33) obj;
                w33.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TransitionValues transitionValues = (TransitionValues) obj2;
                j47.s(w33.a, transitionValues.view);
                if (w33.b) {
                    double d = (double) floatValue2;
                    if (d > 0.5d && transitionValues.view.getClipBounds() != null) {
                        Rect clipBounds = transitionValues.view.getClipBounds();
                        int i = clipBounds.top;
                        if (i != 0) {
                            clipBounds.top = i - ((int) (((d - 0.5d) * ((double) transitionValues.view.getClipBounds().top)) / 0.5d));
                        }
                        if (clipBounds.bottom < transitionValues.view.getHeight()) {
                            clipBounds.bottom += (int) (((d - 0.5d) * ((double) (transitionValues.view.getHeight() - clipBounds.bottom))) / 0.5d);
                        }
                        transitionValues.view.setClipBounds(clipBounds);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                bc7[] bc7Arr = FakeInAppReviewBottomSheet.H0;
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj;
                fakeInAppReviewBottomSheet.getClass();
                bc7[] bc7Arr2 = FakeInAppReviewBottomSheet.H0;
                ValueAnimator valueAnimator2 = (ValueAnimator) obj2;
                ((ConstraintLayout) fakeInAppReviewBottomSheet.y0.T0(fakeInAppReviewBottomSheet, bc7Arr2[0])).setAlpha(1.0f - valueAnimator2.getAnimatedFraction());
                ((FrameLayout) fakeInAppReviewBottomSheet.z0.T0(fakeInAppReviewBottomSheet, bc7Arr2[1])).setAlpha(valueAnimator2.getAnimatedFraction());
                return;
            case 4:
                bc7[] bc7Arr3 = MediaKeyboardWidget.C0;
                float floatValue3 = ((Float) ((ValueAnimator) obj).getAnimatedValue()).floatValue();
                for (View view : (View[]) obj2) {
                    view.setScaleX(floatValue3);
                    view.setScaleY(floatValue3);
                }
                return;
            default:
                lsf lsf = (lsf) obj2;
                if (valueAnimator.getAnimatedFraction() > 0.5f) {
                    jec jec = (jec) obj;
                    if (!jec.a) {
                        jec.a = true;
                        lsf.f();
                    }
                }
                lsf.v0.setLinesColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
