package defpackage;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: x21  reason: default package */
public final class x21 extends ch {
    public final je7 A0;
    public final int v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    public x21() {
        this(0, 3);
    }

    public static boolean o(View view) {
        return view != null && view.getId() == y7a.Z0;
    }

    public final AnimatorSet l(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        boolean o = o(view2);
        je7 je7 = this.z0;
        int i = this.v0;
        if (o && i == 2) {
            return ((t41) je7.getValue()).l(viewGroup, view, view2, z, z2);
        }
        boolean o2 = o(view2);
        je7 je72 = this.x0;
        if (o2 && i == 1) {
            return ((bi1) je72.getValue()).l(viewGroup, view, view2, z, z2);
        }
        je7 je73 = this.w0;
        if (view != null && view.getId() == y7a.a1 && o(view2)) {
            return (AnimatorSet) je73.getValue();
        }
        je7 je74 = this.y0;
        if ((view2 != null && view2.getId() == y7a.a1) || (view != null && view.getId() == y7a.a1)) {
            return ((am1) je74.getValue()).l(viewGroup, view, view2, z, z2);
        }
        if ((view != null && view.getId() == y7a.q0) || (view2 != null && view2.getId() == y7a.q0)) {
            return (AnimatorSet) je73.getValue();
        }
        boolean o3 = o(view);
        je7 je75 = this.A0;
        return (!o3 || !((wr1) ((kr1) je75.getValue())).p() || !((wr1) ((kr1) je75.getValue())).y()) ? (!o(view) || !((wr1) ((kr1) je75.getValue())).p()) ? ((wr1) ((kr1) je75.getValue())).p() ? ((am1) je74.getValue()).l(viewGroup, view, view2, z, z2) : ((t41) je7.getValue()).l(viewGroup, view, view2, z, z2) : ((am1) je74.getValue()).l(viewGroup, view, view2, z, z2) : ((bi1) je72.getValue()).l(viewGroup, view, view2, z, z2);
    }

    public final void n(View view) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x21(int i, int i2) {
        super(0);
        i = (i2 & 1) != 0 ? 3 : i;
        this.v0 = i;
        this.w0 = tu0.r(3, new k11(4));
        this.x0 = tu0.r(3, new w21(250, 0));
        this.y0 = tu0.r(3, new w21(250, 1));
        this.z0 = tu0.r(3, new w21(250, 2));
        this.A0 = tu0.r(3, new k11(5));
    }
}
