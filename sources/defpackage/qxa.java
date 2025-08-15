package defpackage;

import android.net.Uri;
import android.view.View;

/* renamed from: qxa  reason: default package */
public final class qxa extends hqd {
    /* renamed from: E */
    public final void A(pxa pxa) {
        String str;
        lk3 lk3 = (lk3) this.a;
        lk3.setId(Long.hashCode(pxa.v0));
        lk3.setEnabled(pxa.u0);
        lk3.setName(pxa.c);
        jqe jqe = pxa.o;
        lk3.setMessage(jqe != null ? jqe.b(lk3.getContext()) : null);
        lk3.setOnClickListener((View.OnClickListener) null);
        Uri uri = pxa.X;
        if (uri == null || (str = uri.toString()) == null) {
            str = Uri.EMPTY.toString();
        }
        lk3.O(pxa.b, pxa.t0, str);
        lk3.setVerified(pxa.Z);
    }
}
