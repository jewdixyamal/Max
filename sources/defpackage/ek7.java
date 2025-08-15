package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: ek7  reason: default package */
public final class ek7 extends ClickableSpan implements yz7 {
    public int a;
    public final String b;
    public dk7 c;
    public final int o = 6;

    public ek7(String str, int i) {
        this.a = i;
        this.b = w9e.b1(str).toString();
    }

    public final uw3 copy() {
        return new ek7(this.b, this.a);
    }

    public final int getType() {
        return this.o;
    }

    public final void onClick(View view) {
        dk7 dk7 = this.c;
        if (dk7 != null) {
            dk7.b(view, this.b);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
        textPaint.linkColor = this.a;
        textPaint.setUnderlineText(true);
    }
}
