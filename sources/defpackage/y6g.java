package defpackage;

import android.view.View;
import android.view.Window;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: y6g  reason: default package */
public final class y6g extends ft {
    public final Window i;
    public final o9g j;

    public y6g(Window window, o9g o9g) {
        this.i = window;
        this.j = o9g;
    }

    public final void F(int i2) {
        View decorView = this.i.getDecorView();
        decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
    }

    public final void G(int i2) {
        View decorView = this.i.getDecorView();
        decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
    }

    public final void k(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                if (i3 == 1) {
                    F(4);
                } else if (i3 == 2) {
                    F(2);
                } else if (i3 == 8) {
                    ((rxd) this.j.b).Z();
                }
            }
        }
    }

    public final boolean m() {
        return (this.i.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    public final void u(boolean z) {
        if (z) {
            Window window = this.i;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            F(16);
            return;
        }
        G(16);
    }

    public final void v(boolean z) {
        if (z) {
            Window window = this.i;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            F(8192);
            return;
        }
        G(8192);
    }

    public final void w() {
        G(2048);
        F(4096);
    }

    public final void x(int i2) {
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                if (i3 == 1) {
                    G(4);
                    this.i.clearFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                } else if (i3 == 2) {
                    G(2);
                } else if (i3 == 8) {
                    ((rxd) this.j.b).f0();
                }
            }
        }
    }
}
