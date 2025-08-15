package defpackage;

import android.widget.FrameLayout;

/* renamed from: xe1  reason: default package */
public final class xe1 extends hqd {
    public final xo1 F0;
    public final ap1 G0;

    public xe1(FrameLayout frameLayout, xo1 xo1) {
        super(frameLayout);
        this.F0 = xo1;
        this.G0 = (ap1) frameLayout.findViewById(rvb.call_opponent);
    }

    public final void A(ol7 ol7) {
        hb1 hb1 = (hb1) ol7;
        CharSequence charSequence = hb1.c;
        String str = hb1.o;
        ap1 ap1 = this.G0;
        ap1.J(str, charSequence);
        ap1.F(hb1.s0);
        ap1.G(hb1.Y);
        ap1.setAvatar(hb1.X);
        ap1.setRaiseHand(hb1.v0);
        ap1.setOpponentVideo(hb1.z0);
        ap1.setButtonAction(hb1.A0);
        ap1.h1 = hb1.a;
        ap1.b1 = this.F0;
    }
}
