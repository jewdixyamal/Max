package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: gmf  reason: default package */
public final class gmf implements View.OnAttachStateChangeListener {
    public ey1 X;
    public rp0 Y;
    public boolean a;
    public boolean b;
    public boolean c;
    public int o;

    public static View a(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() == 0) {
            return viewGroup;
        }
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        return childAt instanceof ViewGroup ? a((ViewGroup) childAt) : childAt;
    }

    public final void b() {
        if (this.a && this.b && !this.c && this.o != 3) {
            this.o = 3;
            this.X.i();
        }
    }

    public final void c(boolean z) {
        boolean z2 = this.o == 2;
        if (z) {
            this.o = 2;
        } else {
            this.o = 1;
        }
        ey1 ey1 = this.X;
        if (!z2 || z) {
            ey1.j(z);
        } else {
            ey1.l();
        }
    }

    public final void onViewAttachedToWindow(View view) {
        if (!this.a) {
            this.a = true;
            qje qje = new qje(3, this);
            if (!(view instanceof ViewGroup)) {
                this.b = true;
                b();
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                this.b = true;
                b();
                return;
            }
            this.Y = new rp0(this, qje);
            a(viewGroup).addOnAttachStateChangeListener(this.Y);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        this.a = false;
        if (this.b) {
            this.b = false;
            c(false);
        }
    }
}
