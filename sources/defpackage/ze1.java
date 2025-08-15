package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: ze1  reason: default package */
public final class ze1 extends hqd {
    public final /* synthetic */ int F0 = 0;
    public final Object G0;
    public final ViewGroup H0;

    public ze1(c8a c8a, f fVar) {
        super(c8a);
        this.G0 = fVar;
        this.H0 = c8a;
    }

    public final void A(ol7 ol7) {
        switch (this.F0) {
            case 0:
                ib1 ib1 = (ib1) ol7;
                ((vl1) this.H0).setListener((ul1) this.G0);
                return;
            default:
                opd opd = ol7 instanceof opd ? (opd) ol7 : null;
                if (opd != null) {
                    c8a c8a = (c8a) this.H0;
                    CharSequence b = opd.a.b(c8a.getContext());
                    CharSequence charSequence = "";
                    if (b == null) {
                        b = charSequence;
                    }
                    c8a.setTextTitle(b);
                    CharSequence b2 = opd.b.b(c8a.getContext());
                    if (b2 != null) {
                        charSequence = b2;
                    }
                    c8a.setTextSubtitle(charSequence);
                    tu0.K(c8a, 300, new tb((Object) this, 8, (Object) charSequence));
                    return;
                }
                return;
        }
    }

    public ze1(FrameLayout frameLayout, ul1 ul1) {
        super(frameLayout);
        this.G0 = ul1;
        this.H0 = (vl1) frameLayout.findViewById(rvb.call_copy_link_preview);
    }
}
