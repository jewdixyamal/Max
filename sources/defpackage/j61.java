package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j61  reason: default package */
public final class j61 extends yb4 {
    public final /* synthetic */ k61 t;

    public j61(k61 k61) {
        this.t = k61;
        this.d = 300;
        this.c = 300;
        this.f = 300;
        this.e = 300;
    }

    public final void l() {
        RecyclerView recyclerView = this.t.a;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                recyclerView.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }
}
