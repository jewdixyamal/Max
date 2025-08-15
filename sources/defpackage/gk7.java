package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

/* renamed from: gk7  reason: default package */
public final class gk7 extends URLSpan {
    public final l7 X;
    public hk7 a = null;
    public int b;
    public final boolean c;
    public final boolean o;

    public gk7(String str, int i, boolean z, boolean z2) {
        super(str);
        this.b = i;
        this.c = z;
        this.o = z2;
        this.X = new l7(0);
    }

    public final void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        l7 l7Var = this.X;
        if (currentTimeMillis - l7Var.c > l7Var.b) {
            l7Var.c = currentTimeMillis;
            if (!(view instanceof TextView) || ((TextView) view).getLinksClickable()) {
                hk7 hk7 = this.a;
                if (hk7 == null) {
                    hk7 = view instanceof hk7 ? (hk7) view : null;
                }
                if (hk7 != null) {
                    hk7.b(getURL(), lk7.a, this);
                }
            }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        int i = textPaint.bgColor;
        int i2 = this.b;
        if (i != i2) {
            textPaint.setColor(i2);
        }
        textPaint.setUnderlineText(this.c);
        if (this.o) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
    }
}
