package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: xhb  reason: default package */
public final class xhb extends ppd {
    public final whb X;

    public xhb(ExecutorService executorService, whb whb) {
        super(executorService);
        this.X = whb;
    }

    /* renamed from: J */
    public final void r(gmb gmb, int i) {
        cjb cjb = (cjb) ((ol7) C(i));
        gmb.A(cjb);
        dec dec = null;
        if (cjb instanceof yib) {
            if (gmb instanceof w47) {
                dec = (w47) gmb;
            }
            if (dec != null) {
                tu0.K(dec.a, 300, new m6(13, new zja(this, 7, cjb)));
            }
        } else if (cjb instanceof rib) {
            boolean z = gmb instanceof cd2;
            cd2 cd2 = z ? (cd2) gmb : null;
            if (cd2 != null) {
                tu0.K(cd2.a, 300, new m6(4, new vhb(this, 0)));
            }
            if (z) {
                dec = (cd2) gmb;
            }
            if (dec != null) {
                ((xc2) dec.a).setOnMoreActionsClickListener(new vhb(this, 1));
            }
        }
    }

    public final int l(int i) {
        return ((cjb) ((ol7) C(i))).l();
    }

    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (lz7.i(i2, 8192)) {
            return new dec(new ufd(viewGroup.getContext(), (AttributeSet) null));
        }
        if (lz7.i(i2, 4)) {
            return new p20(viewGroup.getContext());
        }
        if (lz7.i(i2, 16384)) {
            return new dec(new xc2(viewGroup.getContext(), (AttributeSet) null));
        }
        throw new IllegalStateException(("unknown item viewType: " + i).toString());
    }
}
