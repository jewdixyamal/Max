package defpackage;

import android.view.View;

/* renamed from: cl9  reason: default package */
public final /* synthetic */ class cl9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl9 b;

    public /* synthetic */ cl9(dl9 dl9, int i) {
        this.a = i;
        this.b = dl9;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((View) this.b.c).setVisibility(0);
                return;
            default:
                dl9 dl9 = this.b;
                dl9.s0.requestLayout();
                dl9.t0.requestLayout();
                dl9.Z.requestLayout();
                dl9.u0.requestLayout();
                dl9.w0.requestLayout();
                return;
        }
    }
}
