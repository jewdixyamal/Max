package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: zz0  reason: default package */
public final class zz0 extends ndc {
    public final int a = tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density);
    public final int b = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
    public final int c = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        hdc adapter = recyclerView.getAdapter();
        Integer num = null;
        dz0 dz0 = adapter instanceof dz0 ? (dz0) adapter : null;
        if (dz0 != null && R >= 0 && R < dz0.j()) {
            ol7 ol7 = (ol7) dz0.C(R);
            h01 h01 = ol7 instanceof h01 ? (h01) ol7 : null;
            ol7 G = dz0.G(R + 1);
            h01 h012 = G instanceof h01 ? (h01) G : null;
            int i = 0;
            boolean z = R == 0;
            int i2 = this.c;
            rect.left = i2;
            rect.right = i2;
            boolean z2 = h01 instanceof g01;
            int i3 = this.a;
            rect.top = (!z2 && !z) ? 0 : i3;
            Integer valueOf = h01 != null ? Integer.valueOf(h01.u()) : null;
            if (h012 != null) {
                num = Integer.valueOf(h012.u());
            }
            if (!tpa.f(valueOf, num)) {
                i = i3;
            } else if (h01 != null && !h01.g()) {
                i = this.b;
            }
            rect.bottom = i;
        }
    }
}
