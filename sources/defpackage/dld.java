package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: dld  reason: default package */
public final class dld implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public ViewTreeObserver b;
    public final Runnable c;
    public final boolean o = true;

    public dld(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        dld dld = new dld(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(dld);
        view.addOnAttachStateChangeListener(dld);
    }

    public final boolean onPreDraw() {
        boolean isAlive = this.b.isAlive();
        View view = this.a;
        if (isAlive) {
            this.b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.c.run();
        return this.o;
    }

    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.b.isAlive();
        View view2 = this.a;
        if (isAlive) {
            this.b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
