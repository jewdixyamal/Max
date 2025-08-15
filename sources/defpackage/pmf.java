package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: pmf  reason: default package */
public abstract class pmf {
    public static x6g a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        x6g f = x6g.f((View) null, rootWindowInsets);
        v6g v6g = f.a;
        v6g.q(f);
        v6g.d(view.getRootView());
        return f;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
