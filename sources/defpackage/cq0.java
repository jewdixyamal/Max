package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: cq0  reason: default package */
public final class cq0 extends ClickableSpan {
    public final String a;
    public final int b;
    public fk7 c;

    public cq0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void onClick(View view) {
        fk7 fk7 = this.c;
        if (fk7 != null) {
            fk7.a.b(view, this.a, lk7.c, (ClickableSpan) fk7.b);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}
