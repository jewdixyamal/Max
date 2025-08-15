package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: cmb  reason: default package */
public final class cmb extends ClickableSpan {
    public final String a;
    public int b;
    public boolean c = true;
    public ik7 o;

    public cmb(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void onClick(View view) {
        ik7 ik7 = this.o;
        if (ik7 != null) {
            kk7 kk7 = ik7.a;
            kk7.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            l7 l7Var = kk7.e;
            if (currentTimeMillis - l7Var.c > l7Var.b) {
                l7Var.c = currentTimeMillis;
                hk7 hk7 = kk7.a;
                if (hk7 != null) {
                    hk7.b(this.a, lk7.X, (ClickableSpan) null);
                }
            }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(this.c);
    }
}
