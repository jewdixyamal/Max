package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: nmf  reason: default package */
public final class nmf implements View.OnApplyWindowInsetsListener {
    public x6g a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ y2a c;

    public nmf(View view, y2a y2a) {
        this.b = view;
        this.c = y2a;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        x6g f = x6g.f(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        y2a y2a = this.c;
        if (i < 30) {
            omf.a(windowInsets, this.b);
            if (f.equals(this.a)) {
                return y2a.P(view, f).e();
            }
        }
        this.a = f;
        x6g P = y2a.P(view, f);
        if (i >= 30) {
            return P.e();
        }
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(view);
        return P.e();
    }
}
