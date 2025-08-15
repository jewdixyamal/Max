package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: sw3  reason: default package */
public final class sw3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout a;

    public sw3(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.a.o(0);
        return true;
    }
}
