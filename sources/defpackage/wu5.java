package defpackage;

import android.view.View;

/* renamed from: wu5  reason: default package */
public final class wu5 extends hqd {
    public final void D() {
        ((d12) this.a).setOnTrailClick((View.OnClickListener) null);
    }

    /* renamed from: E */
    public final void A(pu5 pu5) {
        d12 d12 = (d12) this.a;
        d12.setTitle(pu5.c);
        Long valueOf = Long.valueOf(pu5.o);
        CharSequence charSequence = pu5.X;
        if (charSequence == null) {
            charSequence = "";
        }
        s5a.i(d12.a, pu5.b, valueOf, charSequence);
        d12.requestLayout();
        d12.invalidate();
        d12.setVerified(pu5.Y);
    }
}
