package defpackage;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: e27  reason: default package */
public final class e27 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e27(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onClick(View view) {
        Layout layout;
        Layout layout2;
        switch (this.a) {
            case 0:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.b;
                ((ad) inputPhoneScreen.Z.getValue()).g("MESSAGE_LINK_OPEN", "text");
                InputPhoneScreen.m0(inputPhoneScreen, z7.B(inputPhoneScreen.getContext(), jpc.L1));
                return;
            case 1:
                InputPhoneScreen inputPhoneScreen2 = (InputPhoneScreen) this.b;
                ((ad) inputPhoneScreen2.Z.getValue()).g("MESSAGE_LINK_OPEN", "text");
                InputPhoneScreen.m0(inputPhoneScreen2, z7.B(inputPhoneScreen2.getContext(), jpc.M1));
                return;
            default:
                p85 p85 = (p85) this.b;
                if (!p85.y0) {
                    p85.z0 = true;
                    p85.u0 = p85.w0;
                    p85.requestLayout();
                    return;
                } else if (!p85.z0 && (layout = p85.w0) != null && (layout2 = p85.v0) != null) {
                    p85.z0 = true;
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{layout2.getHeight(), layout.getHeight()});
                    ofInt.setInterpolator(new wb5());
                    ofInt.setDuration(200);
                    ofInt.addUpdateListener(new z00(8, (Object) p85));
                    ofInt.addListener(new lf(p85, 1, layout));
                    ofInt.addListener(new mf(3, (Object) p85));
                    ofInt.start();
                    return;
                } else {
                    return;
                }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(qp4.u0.j((p85) this.b).getText().j);
                return;
        }
    }
}
