package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.apache.http.util.LangUtils;
import ru.ok.messages.secret.widgets.TimerView;
import ru.ok.messages.settings.view.BrightnessSeekBar;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.tamtam.nano.Protos;

/* renamed from: z00  reason: default package */
public final /* synthetic */ class z00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                a10 a10 = (a10) obj;
                a10.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                a10.invalidateSelf();
                return;
            case 1:
                r20 r20 = (r20) obj;
                r20.getClass();
                r20.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r20.invalidateSelf();
                return;
            case 2:
                ((el9) obj).C0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                int i = BrightnessSeekBar.u0;
                BrightnessSeekBar brightnessSeekBar = (BrightnessSeekBar) obj;
                brightnessSeekBar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                brightnessSeekBar.s0 = floatValue;
                if (floatValue < 0.0f) {
                    brightnessSeekBar.s0 = 0.0f;
                }
                brightnessSeekBar.invalidate();
                return;
            case 4:
                ((u91) obj).invalidateSelf();
                return;
            case 5:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy3 gy3 = (gy3) obj;
                int i2 = (int) ((((float) gy3.u0) * ((((float) 100) * floatValue2) / 360.0f)) / 100.0f);
                c23 c23 = gy3.w0;
                c23.b = floatValue2;
                c23.invalidateSelf();
                gy3.setText(String.valueOf((i2 / 1000) + 1));
                return;
            case 6:
                oz3 oz3 = (oz3) obj;
                oz3.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue3 != 0.0f) {
                    Matrix matrix = oz3.k;
                    float L = floatValue3 / f46.L(matrix, 0);
                    RectF rectF = oz3.g;
                    matrix.postScale(L, 1.0f, rectF.centerX(), rectF.centerY());
                    oz3.j.set(matrix);
                    iag iag = oz3.b;
                    if (iag != null) {
                        iag.f(matrix);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                qs4 qs4 = (qs4) obj;
                qs4.getClass();
                qs4.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                p85 p85 = (p85) obj;
                p85.A0 = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = p85.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    p85.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            case 9:
                ld6 ld6 = (ld6) obj;
                ld6.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ld6.invalidate();
                return;
            case 10:
                float animatedFraction = valueAnimator.getAnimatedFraction();
                vf7 vf7 = (vf7) obj;
                if (animatedFraction <= 0.1f && vf7.a) {
                    vf7.a = false;
                    vf7.b.a();
                    return;
                } else if (animatedFraction > 0.1f) {
                    vf7.a = true;
                    return;
                } else {
                    return;
                }
            case 11:
                ((oo7) obj).invalidateSelf();
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((ht8) obj).I0.getForeground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 13:
                caa caa = (caa) obj;
                caa.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                caa.invalidate();
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                z5c z5c = (z5c) obj;
                z5c.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z5c.invalidate();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                fvc fvc = (fvc) obj;
                fvc.getClass();
                ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fvc.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                ((bmd) obj).invalidateSelf();
                return;
            case LangUtils.HASH_SEED /*17*/:
                ood ood = (ood) obj;
                ood.getClass();
                if (valueAnimator.isRunning()) {
                    ood.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ood.invalidate();
                    return;
                }
                return;
            case 18:
                int i3 = SlideOutLayout.C0;
                ((SlideOutLayout) obj).e();
                return;
            case 19:
                ((TextView) obj).setWidth(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 20:
                int i4 = TimerView.y0;
                TimerView timerView = (TimerView) obj;
                timerView.getClass();
                timerView.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 360.0f;
                timerView.invalidate();
                return;
            case 21:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ejf ejf = (ejf) obj;
                ejf.I0 = floatValue4;
                hg7 hg7 = ejf.z0;
                ejc ejc = hg7 != null ? hg7.c.B0 : null;
                if (ejc != null) {
                    ejc.d(floatValue4);
                    return;
                }
                return;
            default:
                ((View) ((d6g) ((w5e) obj).a).Z.getParent()).invalidate();
                return;
        }
    }

    public /* synthetic */ z00(w5e w5e, View view) {
        this.a = 22;
        this.b = w5e;
    }
}
