package defpackage;

import android.net.Uri;
import android.view.View;

/* renamed from: zn3  reason: default package */
public final class zn3 extends hqd {
    /* renamed from: E */
    public final void A(nn3 nn3) {
        lk3 lk3 = (lk3) this.a;
        long j = nn3.a;
        lk3.setId(Long.hashCode(j));
        lk3.setName(nn3.b);
        lk3.setMessage(nn3.X);
        lk3.setVerified(nn3.t0);
        lk3.N();
        String str = null;
        lk3.setOnClickListener((View.OnClickListener) null);
        Uri uri = nn3.Z;
        if (uri != null) {
            str = uri.toString();
        }
        lk3.O(j, nn3.u0, str);
        lk3.setSelectionEnabled(false);
    }
}
