package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: ha  reason: default package */
public final class ha extends hqd {
    public final lrf F0;

    public ha(Context context, lrf lrf) {
        super(new lk3(context, (AttributeSet) null));
        this.F0 = lrf;
    }

    /* renamed from: E */
    public final void A(z9f z9f) {
        lk3 lk3 = (lk3) this.a;
        lk3.setCustomTheme(qp4.u0.p(lk3).c);
        lk3.setCallButtonMode(jk3.b);
        lk3.setName(z9f.a.b(lk3.getContext()));
        lk3.setMessage((CharSequence) null);
        uc0 uc0 = z9f.b;
        lk3.O(uc0.a, uc0.b, z9f.c);
    }
}
