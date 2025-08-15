package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: a57  reason: default package */
public final class a57 extends hqd {
    /* renamed from: E */
    public final void A(y47 y47) {
        Drawable drawable;
        z47 z47 = (z47) this.a;
        CharSequence b = y47.b.b(z47.getContext());
        if (b == null) {
            b = "";
        }
        z47.setText(b);
        Integer num = y47.c;
        if (num != null) {
            drawable = kt3.b(z47.getContext(), num.intValue());
        } else {
            drawable = null;
        }
        z47.setIcon(drawable);
    }
}
