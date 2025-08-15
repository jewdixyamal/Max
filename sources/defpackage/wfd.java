package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.BitSet;

/* renamed from: wfd  reason: default package */
public final class wfd extends hqd {
    public lfd F0;

    public final void A(ol7 ol7) {
        ((ufd) this.a).setModelItem((kfd) ol7);
    }

    public final void D() {
        this.F0 = null;
    }

    /* renamed from: E */
    public final void B(kfd kfd, Object obj) {
        ifd ifd = obj instanceof ifd ? (ifd) obj : null;
        View view = this.a;
        if (ifd != null) {
            BitSet bitSet = (BitSet) ifd.b;
            bitSet.get(0);
            if (bitSet.get(1)) {
                ((ufd) view).setTitle(kfd.getTitle());
            }
            if (bitSet.get(2)) {
                ((ufd) view).setType(kfd.getType());
            }
            if (bitSet.get(3)) {
                ((ufd) view).setDescription(kfd.b());
            }
            if (bitSet.get(4)) {
                Integer f = kfd.f();
                if (f != null) {
                    ((ufd) view).setStartIcon(f.intValue());
                } else {
                    ((ufd) view).setStartIcon((Drawable) null);
                }
            }
            if (bitSet.get(5)) {
                ufd ufd = (ufd) view;
                ufd.setOnSwitchListener((qfd) null);
                ufd.setEndView(kfd.e());
                if (kfd.e() instanceof ffd) {
                    ufd.setOnSwitchCheckedListener(new bk(15, this));
                }
            }
            if (bitSet.get(6)) {
                ((ufd) view).setCounter(kfd.c());
            }
            if (bitSet.get(7)) {
                ((ufd) view).setUpperText(kfd.d());
            }
            if (bitSet.get(8)) {
                ((ufd) view).setStartIconPadding(kfd.q());
                return;
            }
            return;
        }
        ((ufd) view).setModelItem(kfd);
    }
}
