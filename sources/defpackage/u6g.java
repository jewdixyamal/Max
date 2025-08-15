package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: u6g  reason: default package */
public final class u6g extends s6g {
    public static final x6g q = x6g.f((View) null, WindowInsets.CONSUMED);

    public u6g(x6g x6g, WindowInsets windowInsets) {
        super(x6g, windowInsets);
    }

    public final void d(View view) {
    }

    public v27 f(int i) {
        return v27.c(this.c.getInsets(w6g.a(i)));
    }

    public boolean o(int i) {
        return this.c.isVisible(w6g.a(i));
    }
}
