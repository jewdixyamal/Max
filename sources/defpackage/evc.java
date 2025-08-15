package defpackage;

import android.animation.ValueAnimator;
import java.util.Objects;

/* renamed from: evc  reason: default package */
public final class evc implements eu6 {
    public float a;
    public ValueAnimator b;
    public final /* synthetic */ fvc c;

    public evc(fvc fvc) {
        this.c = fvc;
    }

    public final void a(long j, wu1 wu1) {
        fvc fvc = this.c;
        this.a = fvc.getBrightness();
        fvc.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(wu1);
        u3c u3c = new u3c(9, wu1);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(fvc.getVisibilityRampUpAnimationDurationMillis());
        ofFloat.addUpdateListener(new z00(15, (Object) fvc));
        ofFloat.addListener(new mf(8, (Object) u3c));
        ofFloat.start();
        this.b = ofFloat;
    }

    public final void clear() {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        fvc fvc = this.c;
        fvc.setAlpha(0.0f);
        fvc.setBrightness(this.a);
    }
}
