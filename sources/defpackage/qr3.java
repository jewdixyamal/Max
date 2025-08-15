package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: qr3  reason: default package */
public final class qr3 extends hqd {
    /* renamed from: E */
    public final void A(pr3 pr3) {
        aba aba = (aba) this.a;
        pr3.getClass();
        aba.setIcon(woc.J0);
        aba.setTitle(new eqe(a9a.r));
        aba.setSubtitle(new eqe(pr3.a));
    }

    public final void F(Integer num, k56 k56) {
        View view = this.a;
        if (num != null) {
            aba aba = (aba) view;
            aba.x(aba.getContext().getString(num.intValue()), new m6(7, k56));
            return;
        }
        OneMeButton oneMeButton = ((aba) view).J0;
        oneMeButton.setText((CharSequence) null);
        oneMeButton.setOnClickListener((View.OnClickListener) null);
        oneMeButton.setVisibility(8);
    }
}
