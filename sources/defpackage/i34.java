package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* renamed from: i34  reason: default package */
public final class i34 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ j34 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i34(j34 j34, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.o = j34;
                super(9, (Object) bool);
                return;
            default:
                this.o = j34;
                return;
        }
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!tpa.f((CharSequence) obj, charSequence) && charSequence != null && charSequence.length() != 0) {
                    j34 j34 = this.o;
                    BoringLayout.Metrics a = j34.getMetrics();
                    TextPaint textPaint = j34.E0;
                    a.width = tu0.G(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(j34.v0);
                    j34.z0 = BoringLayout.make(charSequence, textPaint, a.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, a, false);
                    j34.invalidate();
                    j34.requestLayout();
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    j34 j342 = this.o;
                    j342.d(j342.x0);
                    j342.invalidate();
                    return;
                }
                return;
        }
    }
}
