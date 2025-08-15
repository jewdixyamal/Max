package defpackage;

import android.widget.PopupWindow;

/* renamed from: g11  reason: default package */
public final /* synthetic */ class g11 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j11 b;

    public /* synthetic */ g11(j11 j11, int i) {
        this.a = i;
        this.b = j11;
    }

    public final void onDismiss() {
        switch (this.a) {
            case 0:
                this.b.Q0 = null;
                return;
            case 1:
                j11 j11 = this.b;
                a51 a51 = j11.P0;
                if (a51 != null) {
                    boolean z = a51 instanceof w41;
                    knc knc = j11.I0;
                    if (z) {
                        w41 w41 = (w41) a51;
                        j11.x(knc, w41.c, w41.f);
                        return;
                    }
                    j11.A(knc, a51.a(), a51.getContentDescription());
                    return;
                }
                return;
            default:
                j11.x(this.b.L0, woc.s0, new eqe(f0c.call_more_accessibility));
                return;
        }
    }
}
