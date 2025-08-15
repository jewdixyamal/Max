package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: sd6  reason: default package */
public final class sd6 extends hqd {
    /* renamed from: E */
    public final void A(rd6 rd6) {
        String str;
        lk3 lk3 = (lk3) this.a;
        lk3.setId(Long.hashCode(rd6.u0));
        w6b w6b = rd6.c;
        boolean M = lk3.M(w6b.a.toString());
        CharSequence charSequence = w6b.a;
        List list = rd6.Z;
        if (M) {
            charSequence = ema.D(charSequence, list, w6b.b);
        }
        lk3.setName(charSequence);
        w6b w6b2 = rd6.o;
        boolean K = lk3.K(w6b2.a.toString());
        CharSequence charSequence2 = w6b2.a;
        if (K) {
            charSequence2 = ema.D(charSequence2, list, w6b2.b);
        }
        lk3.setMessage(charSequence2);
        Uri uri = rd6.X;
        if (uri == null || (str = uri.toString()) == null) {
            str = Uri.EMPTY.toString();
        }
        lk3.O(rd6.a, rd6.b, str);
    }
}
