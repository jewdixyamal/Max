package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: xpf  reason: default package */
public final class xpf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ Runnable b;

    public xpf(ViewTreeObserver viewTreeObserver, u5 u5Var) {
        this.a = viewTreeObserver;
        this.b = u5Var;
    }

    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.b.run();
        return true;
    }
}
