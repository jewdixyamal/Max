package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: yga  reason: default package */
public final /* synthetic */ class yga implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eha b;

    public /* synthetic */ yga(eha eha, int i) {
        this.a = i;
        this.b = eha;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                eha eha = this.b;
                int width = eha.getWidth();
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ((AppCompatImageView) eha.B0.getValue()).setAlpha(animatedFraction);
                ((AppCompatImageView) eha.F0.getValue()).setAlpha(animatedFraction);
                je7 je7 = eha.C0;
                View view = (View) je7.getValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.LayoutParams layoutParams2 = ((View) je7.getValue()).getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                    layoutParams.width = (int) (((float) (width - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0))) * animatedFraction);
                    view.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            default:
                float animatedFraction2 = ((float) 1) - valueAnimator.getAnimatedFraction();
                eha eha2 = this.b;
                AppCompatImageView appCompatImageView = (AppCompatImageView) eha2.B0.getValue();
                appCompatImageView.setAlpha(appCompatImageView.getAlpha() * animatedFraction2);
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) eha2.F0.getValue();
                appCompatImageView2.setAlpha(appCompatImageView2.getAlpha() * animatedFraction2);
                je7 je72 = eha2.C0;
                View view2 = (View) je72.getValue();
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = (int) (((float) ((AppCompatEditText) je72.getValue()).getWidth()) * animatedFraction2);
                    view2.setLayoutParams(layoutParams3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
