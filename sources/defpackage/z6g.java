package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: z6g  reason: default package */
public final class z6g extends ft {
    public final WindowInsetsController i;
    public final o9g j;
    public Window k;

    public z6g(WindowInsetsController windowInsetsController, o9g o9g) {
        this.i = windowInsetsController;
        this.j = o9g;
    }

    public final void k(int i2) {
        this.i.hide(i2 & -9);
    }

    public final boolean m() {
        this.i.setSystemBarsAppearance(0, 0);
        return (this.i.getSystemBarsAppearance() & 8) != 0;
    }

    public final void u(boolean z) {
        Window window = this.k;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.i.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.i.setSystemBarsAppearance(0, 16);
    }

    public final void v(boolean z) {
        Window window = this.k;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.i.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.i.setSystemBarsAppearance(0, 8);
    }

    public final void w() {
        this.i.setSystemBarsBehavior(2);
    }

    public final void x(int i2) {
        if ((i2 & 8) != 0) {
            ((rxd) this.j.b).f0();
        }
        this.i.show(i2 & -9);
    }
}
