package defpackage;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: vl7  reason: default package */
public final class vl7 implements AbsListView.OnScrollListener {
    public final /* synthetic */ wl7 a;

    public vl7(wl7 wl7) {
        this.a = wl7;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            wl7 wl7 = this.a;
            if (wl7.K0.getInputMethodMode() != 2 && wl7.K0.getContentView() != null) {
                Handler handler = wl7.G0;
                ul7 ul7 = wl7.C0;
                handler.removeCallbacks(ul7);
                ul7.run();
            }
        }
    }
}
