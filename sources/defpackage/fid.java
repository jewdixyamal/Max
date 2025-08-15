package defpackage;

import android.view.View;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: fid  reason: default package */
public final class fid extends hqd {
    public final void A(ol7 ol7) {
        if (ol7 instanceof i1d) {
            View view = this.a;
            i1d i1d = (i1d) ol7;
            ((OneMeButton) view).setText(i1d.a.a(this));
            jqe jqe = i1d.c;
            if (jqe != null) {
                ((OneMeButton) view).setTextBadge(jqe.a(this));
            }
        }
    }
}
