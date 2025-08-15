package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: iq  reason: default package */
public final class iq extends hqd {
    /* renamed from: E */
    public final void A(eq eqVar) {
        int i;
        int ordinal = eqVar.a.ordinal();
        if (ordinal == 0) {
            i = o4a.l;
        } else if (ordinal == 1) {
            i = o4a.e;
        } else if (ordinal == 2) {
            i = o4a.b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        View view = this.a;
        gq gqVar = (gq) view;
        gqVar.setTitle(z7.B(gqVar.getContext(), i));
        gq gqVar2 = (gq) view;
        Boolean bool = eqVar.b;
        gqVar2.setSelected(bool != null ? bool.booleanValue() : false);
    }
}
