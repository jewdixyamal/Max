package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: mfd  reason: default package */
public final class mfd extends ppd {
    public final lfd X;

    public mfd(lfd lfd, ExecutorService executorService) {
        super(executorService);
        this.X = lfd;
    }

    /* renamed from: J */
    public final void r(wfd wfd, int i) {
        kfd kfd = (kfd) ((ol7) C(i));
        View view = wfd.a;
        ((ufd) view).setModelItem(kfd);
        lfd lfd = this.X;
        wfd.F0 = lfd;
        if (kfd.e() instanceof ffd) {
            ((ufd) view).setOnSwitchCheckedListener(new bk(16, lfd));
        } else {
            ((ufd) view).setOnSwitchListener((qfd) null);
        }
        tu0.K(view, 300, new v7d(lfd, 2, kfd));
    }

    public final void s(dec dec, int i, List list) {
        wfd wfd = (wfd) dec;
        if (!list.isEmpty()) {
            u2 u2Var = new u2(7);
            for (Object next : list) {
                ifd ifd = next instanceof ifd ? (ifd) next : null;
                if (ifd != null) {
                    u2Var.M1(ifd);
                }
            }
            wfd.B((kfd) this.o.f.get(i), u2Var);
            return;
        }
        r(wfd, i);
    }

    public final dec t(ViewGroup viewGroup, int i) {
        return new dec(new ufd(viewGroup.getContext(), (AttributeSet) null));
    }
}
