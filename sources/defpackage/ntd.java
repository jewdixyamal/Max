package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: ntd  reason: default package */
public final /* synthetic */ class ntd implements View.OnKeyListener {
    public final /* synthetic */ ptd a;
    public final /* synthetic */ int b;

    public /* synthetic */ ntd(ptd ptd, int i) {
        this.a = ptd;
        this.b = i;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z = false;
        if (i != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        jg3 jg3 = (jg3) this.a.G0;
        int i2 = this.b;
        int i3 = i2 - 1;
        l17 H0 = jg3.H0(i2);
        String A = H0 != null ? ((ptd) H0).A() : null;
        if (A == null || A.length() == 0) {
            z = true;
        }
        if (!(!z)) {
            l17 H02 = jg3.H0(i3);
            if (H02 != null) {
                ptd ptd = (ptd) H02;
                ptd.B("");
                ptd.H0.requestFocus();
            }
        } else if (H0 != null) {
            ((ptd) H0).B("");
        }
        return true;
    }
}
