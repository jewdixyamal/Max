package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* renamed from: a7g  reason: default package */
public final class a7g {
    public final ft a;

    public a7g(WindowInsetsController windowInsetsController) {
        this.a = new z6g(windowInsetsController, new o9g(windowInsetsController));
    }

    public final void a(boolean z) {
        this.a.u(z);
    }

    public final void b(boolean z) {
        this.a.v(z);
    }

    public a7g(Window window, View view) {
        o9g o9g = new o9g(view);
        if (Build.VERSION.SDK_INT >= 30) {
            z6g z6g = new z6g(window.getInsetsController(), o9g);
            z6g.k = window;
            this.a = z6g;
            return;
        }
        this.a = new y6g(window, o9g);
    }
}
