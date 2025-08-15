package defpackage;

import android.net.Uri;
import android.view.View;

/* renamed from: ln8  reason: default package */
public final class ln8 extends hqd {
    /* renamed from: E */
    public final void A(kn8 kn8) {
        String str;
        lk3 lk3 = (lk3) this.a;
        long j = kn8.a;
        lk3.setId(Long.hashCode(j));
        lk3.setEnabled(kn8.u0);
        lk3.setName(kn8.b);
        lk3.setMessage(kn8.o.b(lk3.getContext()));
        lk3.setVerified(kn8.Z);
        jqe jqe = kn8.x0;
        lk3.setAlias(jqe != null ? jqe.b(lk3.getContext()) : null);
        lk3.N();
        lk3.setOnClickListener((View.OnClickListener) null);
        Uri uri = kn8.X;
        if (uri == null || (str = uri.toString()) == null) {
            str = Uri.EMPTY.toString();
        }
        lk3.O(j, kn8.Y, str);
        lk3.setSelectionEnabled(false);
    }
}
