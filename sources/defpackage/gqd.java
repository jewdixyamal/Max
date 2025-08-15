package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: gqd  reason: default package */
public final class gqd extends zu3 implements View.OnAttachStateChangeListener {
    public final boolean X;
    public boolean Y;
    public ViewGroup Z;
    public boolean o;
    public xu3 s0;

    public gqd() {
        this(true);
    }

    public final void a() {
        xu3 xu3 = this.s0;
        if (xu3 != null) {
            xu3.q();
        }
        this.s0 = null;
        ViewGroup viewGroup = this.Z;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.Z = null;
    }

    public final zu3 b() {
        return new gqd(this.o);
    }

    public final boolean d() {
        return this.o;
    }

    public final boolean e() {
        return this.X;
    }

    public final void f(zu3 zu3, uu3 uu3) {
        this.Y = true;
    }

    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, xu3 xu3) {
        if (!this.Y) {
            if (view != null && (!z || this.o)) {
                viewGroup.removeView(view);
            }
            if (view2 != null && view2.getParent() == null) {
                viewGroup.addView(view2);
            }
            if (viewGroup.getWindowToken() != null) {
                xu3.q();
                return;
            }
            this.s0 = xu3;
            this.Z = viewGroup;
            viewGroup.addOnAttachStateChangeListener(this);
        }
    }

    public final void h(Bundle bundle) {
        this.o = bundle.getBoolean("SimpleSwapChangeHandler.removesFromViewOnPush");
    }

    public final void i(Bundle bundle) {
        bundle.putBoolean("SimpleSwapChangeHandler.removesFromViewOnPush", this.o);
    }

    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        xu3 xu3 = this.s0;
        if (xu3 != null) {
            xu3.q();
        }
        this.s0 = null;
        ViewGroup viewGroup = this.Z;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this);
        }
        this.Z = null;
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    public gqd(boolean z) {
        this.o = z;
        this.X = true;
    }
}
