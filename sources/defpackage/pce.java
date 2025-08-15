package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: pce  reason: default package */
public final class pce extends ppd {
    public final oce X;

    public pce(oce oce, ExecutorService executorService) {
        super(executorService);
        this.X = oce;
    }

    /* renamed from: J */
    public final void r(sce sce, int i) {
        rce rce = (rce) ((ol7) C(i));
        lk3 lk3 = (lk3) sce.a;
        lk3.setId(lga.B);
        CharSequence charSequence = rce.b;
        lk3.setName(charSequence);
        lk3.setMessage(rce.o);
        int i2 = rce.Z;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                lk3.O(rce.a, charSequence, rce.c);
            } else {
                lk3.G0.setVisibility(8);
                lk3.J();
            }
            boolean z = !rce.Y.isEmpty();
            oce oce = this.X;
            if (z) {
                lk3.S(lk3, Integer.valueOf(kga.a), (b7a) null, new a81(oce, lk3, rce, 12), 6);
            } else {
                lk3.S(lk3, (Integer) null, (b7a) null, (k56) null, 6);
            }
            tu0.K(lk3, 300, new v7d(oce, 12, rce));
            return;
        }
        throw null;
    }

    public final dec t(ViewGroup viewGroup, int i) {
        return new dec(new lk3(viewGroup.getContext(), (AttributeSet) null));
    }
}
