package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: bof  reason: default package */
public abstract class bof extends ow3 {
    public cof a;
    public int b = 0;

    public bof() {
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        y(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new cof(view);
        }
        cof cof = this.a;
        View view2 = cof.a;
        cof.b = view2.getTop();
        cof.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public final int x() {
        cof cof = this.a;
        if (cof != null) {
            return cof.d;
        }
        return 0;
    }

    public void y(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.p(view, i);
    }

    public boolean z(int i) {
        cof cof = this.a;
        if (cof != null) {
            return cof.b(i);
        }
        this.b = i;
        return false;
    }

    public bof(int i) {
    }
}
