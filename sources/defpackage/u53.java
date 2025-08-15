package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: u53  reason: default package */
public final class u53 implements em {
    public final /* synthetic */ w53 a;

    public u53(w53 w53) {
        this.a = w53;
    }

    public final void V(fm fmVar, int i) {
        w53 w53 = this.a;
        w53.M0 = i;
        x6g x6g = w53.O0;
        int d = x6g != null ? x6g.d() : 0;
        int childCount = w53.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = w53.getChildAt(i2);
            t53 t53 = (t53) childAt.getLayoutParams();
            cof b = w53.b(childAt);
            int i3 = t53.a;
            if (i3 == 1) {
                b.b(z04.p(-i, 0, ((w53.getHeight() - w53.b(childAt).b) - childAt.getHeight()) - ((t53) childAt.getLayoutParams()).bottomMargin));
            } else if (i3 == 2) {
                b.b(Math.round(((float) (-i)) * t53.b));
            }
        }
        w53.d();
        if (w53.D0 != null && d > 0) {
            WeakHashMap weakHashMap = zmf.a;
            w53.postInvalidateOnAnimation();
        }
        int height = w53.getHeight();
        WeakHashMap weakHashMap2 = zmf.a;
        int minimumHeight = (height - w53.getMinimumHeight()) - d;
        float f = (float) minimumHeight;
        float min = Math.min(1.0f, ((float) (height - w53.getScrimVisibleHeightTrigger())) / f);
        s53 s53 = w53.y0;
        s53.d = min;
        s53.e = z7b.f(1.0f, min, 0.5f, min);
        s53.f = w53.M0 + minimumHeight;
        s53.p(((float) Math.abs(i)) / f);
    }
}
