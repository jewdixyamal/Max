package defpackage;

import android.widget.ImageView;

/* renamed from: cd2  reason: default package */
public final class cd2 extends gmb {
    public final void A(ol7 ol7) {
        xc2 xc2 = (xc2) this.a;
        nc2 nc2 = ((rib) ol7).a;
        xc2.setLink(nc2.e);
        xc2.setLoading(nc2.f);
        xc2.setChatTitle(nc2.d);
        s5a.i(xc2.I0, nc2.a, Long.valueOf(nc2.b), nc2.c);
        int i = 0;
        boolean z = nc2.g && nc2.h;
        ImageView imageView = xc2.L0;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        xc2.w();
    }
}
