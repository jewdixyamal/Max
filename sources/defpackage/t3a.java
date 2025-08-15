package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: t3a  reason: default package */
public final class t3a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final Handler Y = new Handler(Looper.getMainLooper());
    public boolean X;
    public final View a;
    public final boolean b;
    public final k56 c;
    public ViewTreeObserver o;

    public t3a(View view, boolean z, ga5 ga5) {
        this.a = view;
        this.b = z;
        this.c = ga5;
        this.o = view.getViewTreeObserver();
    }

    public final boolean onPreDraw() {
        boolean z = true;
        if (!this.X) {
            boolean booleanValue = ((Boolean) this.c.invoke()).booleanValue();
            if (booleanValue || this.b) {
                this.X = true;
                Y.post(new nn6(21, this));
            }
            z = booleanValue;
        }
        if (!z) {
            hm9.G("OneShotOnPreDrawListener", "skipping frame", (Throwable) null);
        }
        return z;
    }

    public final void onViewAttachedToWindow(View view) {
        this.o = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.o.isAlive();
        View view2 = this.a;
        if (isAlive) {
            this.o.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
