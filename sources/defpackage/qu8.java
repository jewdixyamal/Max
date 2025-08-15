package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: qu8  reason: default package */
public final class qu8 extends ClickableSpan {
    public final nu8 a;
    public int b;
    public jk7 c;

    public qu8(nu8 nu8, int i) {
        this.a = nu8;
        this.b = i;
    }

    public final void onClick(View view) {
        jk7 jk7 = this.c;
        if (jk7 != null) {
            kk7 kk7 = jk7.a;
            kk7.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            l7 l7Var = kk7.e;
            if (currentTimeMillis - l7Var.c > l7Var.b) {
                l7Var.c = currentTimeMillis;
                hk7 hk7 = kk7.a;
                if (hk7 == null) {
                    hk7 = view instanceof hk7 ? (hk7) view : null;
                }
                if (hk7 != null) {
                    hk7.a(this.a);
                }
            }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
