package defpackage;

import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: ldf  reason: default package */
public final class ldf extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mdf o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ldf(mdf mdf, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.o = mdf;
                super(9, (Object) bool);
                return;
            case 2:
                Boolean bool2 = Boolean.TRUE;
                this.o = mdf;
                super(9, (Object) bool2);
                return;
            case 3:
                Boolean bool3 = Boolean.TRUE;
                this.o = mdf;
                super(9, (Object) bool3);
                return;
            default:
                this.o = mdf;
                return;
        }
    }

    public final void L1(Object obj, Object obj2) {
        Drawable drawable;
        switch (this.c) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!tpa.f((CharSequence) obj, charSequence) && charSequence != null && charSequence.length() != 0) {
                    mdf mdf = this.o;
                    BoringLayout.Metrics b = mdf.getMetrics();
                    TextPaint textPaint = mdf.E0;
                    b.width = tu0.G(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(mdf.v0);
                    mdf.A0 = mdf.a.a(charSequence, textPaint, b.width, 1, false, TextUtils.TruncateAt.END);
                    mdf.invalidate();
                    mdf.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    this.o.invalidate();
                    return;
                }
                return;
            case 2:
                if (!tpa.f(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    this.o.invalidate();
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    mdf mdf2 = this.o;
                    if (booleanValue) {
                        drawable = kt3.b(mdf2.getContext(), woc.l2);
                        int i = mdf2.c;
                        drawable.setBounds(0, 0, i, i);
                        drawable.setTint(mdf2.getDrawableColor());
                    } else {
                        drawable = null;
                    }
                    mdf2.z0 = drawable;
                    mdf2.requestLayout();
                    mdf2.invalidate();
                    return;
                }
                return;
        }
    }
}
