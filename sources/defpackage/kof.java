package defpackage;

import android.view.View;

/* renamed from: kof  reason: default package */
public final class kof implements qdc {
    public final void b(View view) {
    }

    public final void d(View view) {
        pdc pdc = (pdc) view.getLayoutParams();
        if (pdc.width != -1 || pdc.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
