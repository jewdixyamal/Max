package defpackage;

import android.widget.FrameLayout;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: o71  reason: default package */
public final class o71 extends hqd {
    public final m71 F0;

    public o71(FrameLayout frameLayout) {
        super(frameLayout);
        this.F0 = (m71) frameLayout.findViewById(rvb.call_opponents);
    }

    public final void A(ol7 ol7) {
        this.F0.setOpponents((sma) ol7);
    }

    /* renamed from: E */
    public final void B(sma sma, Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        m71 m71 = this.F0;
        if (list == null || list.isEmpty()) {
            m71.setOpponents(sma);
            return;
        }
        pk5 pk5 = new pk5(l6d.Z(new um5(new at(2, list), new k8(20), n6d.a), n71.b));
        while (pk5.hasNext()) {
            rma rma = (rma) pk5.next();
            if (rma instanceof rma) {
                m71.setOpponents(rma.a);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
