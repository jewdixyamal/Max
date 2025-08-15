package defpackage;

import android.net.Uri;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: to9  reason: default package */
public final class to9 extends hqd {
    /* renamed from: E */
    public final void A(qo9 qo9) {
        OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.a;
        oneMeDraweeView.setId(Long.hashCode(qo9.a));
        xv6 d = xv6.d(Uri.parse(qo9.b));
        float f = (float) 64;
        d.d = new jic(0.0f, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), 12);
        wv6 a = d.a();
        int i = OneMeDraweeView.B0;
        oneMeDraweeView.o(a, (wv6) null);
    }
}
