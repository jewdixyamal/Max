package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: al3  reason: default package */
public final class al3 extends ClickableSpan {
    public final long a;
    public v02 b;

    public al3(long j) {
        this.a = j;
    }

    public final void onClick(View view) {
        ey1 ey1;
        v02 v02 = this.b;
        if (v02 != null && (ey1 = ((lu3) v02.b).I0) != null) {
            bc7[] bc7Arr = MessagesListWidget.X0;
            ((MessagesListWidget) ey1.b).x0().G(this.a);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
