package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: na2  reason: default package */
public final class na2 extends of2 {
    public um8 F0;

    public final void E(xm8 xm8, m56 m56, a66 a66) {
        um8 um8 = (um8) xm8;
        kf2 kf2 = (kf2) this.a;
        A(um8);
        tu0.K(kf2, 300, new tb((Object) m56, 12, (Object) um8));
        kf2.setOnLongClickListener(new z52(a66, um8, this, 1));
    }

    /* renamed from: F */
    public final void A(um8 um8) {
        um8 um82 = this.F0;
        long j = um8.a;
        boolean z = um82 == null || um82.a != j;
        this.F0 = um8;
        kf2 kf2 = (kf2) this.a;
        kf2.setId((int) j);
        boolean z2 = !z;
        je7 je7 = kf2.K0;
        s5a s5a = kf2.L0;
        hm9 hm9 = um8.v0;
        String str = um8.o;
        if (str == null || str.length() == 0) {
            s5a.setVisibility(8);
            ((View) je7.getValue()).setVisibility(0);
            boolean z3 = hm9 instanceof rm8;
            uf5 uf5 = um8.w0;
            if (z3) {
                ((ch5) je7.getValue()).b(uf5, z2);
            } else if (hm9 instanceof sm8) {
                ((ch5) je7.getValue()).c(uf5, ((sm8) hm9).p, z2);
            } else if (hm9 instanceof tm8) {
                ((ch5) je7.getValue()).d(uf5, z2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (je7.a()) {
                ((View) je7.getValue()).setVisibility(8);
            }
            s5a.setVisibility(0);
            s5a.j(s5a, kf2.I0, l5a.a, 28);
            s5a.setAvatarUrl(str);
        }
        kf2.setTitle(um8.X);
        kf2.setFileDescription(um8.Y + " · " + hm9.C().b(kf2.getContext()));
    }
}
