package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: ti6  reason: default package */
public final class ti6 extends ClickableSpan {
    public final String a;
    public final int b;
    public fk7 c;

    public ti6(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void onClick(View view) {
        fk7 fk7 = this.c;
        if (fk7 != null) {
            fk7.a.b(view, this.a, lk7.b, (ClickableSpan) fk7.b);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
