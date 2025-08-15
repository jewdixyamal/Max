package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: f6g  reason: default package */
public final class f6g implements View.OnApplyWindowInsetsListener {
    public final q42 a;
    public x6g b;

    public f6g(View view, q42 q42) {
        x6g x6g;
        this.a = q42;
        WeakHashMap weakHashMap = zmf.a;
        x6g a2 = pmf.a(view);
        if (a2 != null) {
            x6g = (Build.VERSION.SDK_INT >= 30 ? new n6g(a2) : new m6g(a2)).b();
        } else {
            x6g = null;
        }
        this.b = x6g;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        v6g v6g;
        View view2 = view;
        WindowInsets windowInsets2 = windowInsets;
        if (!view.isLaidOut()) {
            this.b = x6g.f(view, windowInsets);
            return g6g.i(view, windowInsets);
        }
        x6g f = x6g.f(view, windowInsets);
        if (this.b == null) {
            WeakHashMap weakHashMap = zmf.a;
            this.b = pmf.a(view);
        }
        if (this.b == null) {
            this.b = f;
            return g6g.i(view, windowInsets);
        }
        q42 j = g6g.j(view);
        if (j != null && Objects.equals((WindowInsets) j.b, windowInsets2)) {
            return g6g.i(view, windowInsets);
        }
        x6g x6g = this.b;
        int i = 1;
        int i2 = 0;
        while (true) {
            v6g = f.a;
            if (i > 256) {
                break;
            }
            if (!v6g.f(i).equals(x6g.a.f(i))) {
                i2 |= i;
            }
            i <<= 1;
        }
        if (i2 == 0) {
            return g6g.i(view, windowInsets);
        }
        x6g x6g2 = this.b;
        k6g k6g = new k6g(i2, (i2 & 8) != 0 ? v6g.f(8).d > x6g2.a.f(8).d ? g6g.e : g6g.f : g6g.g, 160);
        k6g.a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(k6g.a.a());
        v27 f2 = v6g.f(i2);
        v27 f3 = x6g2.a.f(i2);
        int min = Math.min(f2.a, f3.a);
        int i3 = f2.b;
        int i4 = f3.b;
        int min2 = Math.min(i3, i4);
        int i5 = f2.c;
        int i6 = f3.c;
        int min3 = Math.min(i5, i6);
        ValueAnimator valueAnimator = duration;
        int i7 = f2.d;
        int i8 = i2;
        int i9 = f3.d;
        l7b l7b = new l7b(v27.b(min, min2, min3, Math.min(i7, i9)), v27.b(Math.max(f2.a, f3.a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)), false, 16);
        g6g.f(view2, k6g, windowInsets2, false);
        ValueAnimator valueAnimator2 = valueAnimator;
        valueAnimator2.addUpdateListener(new e6g(k6g, f, x6g2, i8, view));
        valueAnimator2.addListener(new eh(k6g, 6, view2));
        pla.a(view2, new r8g(6, view, k6g, l7b, valueAnimator2, false));
        this.b = f;
        return g6g.i(view, windowInsets);
    }
}
