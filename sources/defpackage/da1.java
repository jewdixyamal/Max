package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: da1  reason: default package */
public final class da1 extends ppd {
    public final bkg X;

    public da1(bkg bkg, ExecutorService executorService) {
        super(executorService);
        this.X = bkg;
    }

    /* renamed from: H */
    public final void r(hqd hqd, int i) {
        if (hqd instanceof ca1) {
            ca1 ca1 = (ca1) hqd;
            ol7 ol7 = (ol7) C(i);
            if (ol7 instanceof jc1) {
                ca1.A(ol7);
                tu0.K((ufd) ca1.a, 300, new tb((Object) this.X, 2, (Object) (jc1) ol7));
                return;
            }
            return;
        }
        hqd.A((ol7) C(i));
    }

    public final dec t(ViewGroup viewGroup, int i) {
        return new dec(new ufd(viewGroup.getContext(), (AttributeSet) null));
    }
}
