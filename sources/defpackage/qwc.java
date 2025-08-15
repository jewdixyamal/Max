package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: qwc  reason: default package */
public final class qwc implements m56 {
    public final /* synthetic */ iwc X;
    public final /* synthetic */ View a;
    public final /* synthetic */ rwc b;
    public final /* synthetic */ lwc c;
    public final /* synthetic */ rwc o;

    public qwc(iwc iwc, rwc rwc, lwc lwc, rwc rwc2, iwc iwc2) {
        this.a = iwc;
        this.b = rwc;
        this.c = lwc;
        this.o = rwc2;
        this.X = iwc2;
    }

    public final Object invoke(Object obj) {
        ValueAnimator valueAnimator = (ValueAnimator) obj;
        View view = this.a;
        float translationY = ((float) 1) - (view.getTranslationY() / (fk4.d().getDisplayMetrics().density * 4.0f));
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{view.getTranslationY(), fk4.d().getDisplayMetrics().density * 4.0f});
        ofFloat.setDuration((long) (((float) 200) * translationY));
        ofFloat.setInterpolator(rwc.x0);
        iwc iwc = (iwc) view;
        ofFloat.addListener(new owc(iwc, this.b, this.c, this.o, this.X));
        ofFloat.addUpdateListener(new pwc(iwc, animatedFraction));
        ofFloat.start();
        return ofFloat;
    }
}
