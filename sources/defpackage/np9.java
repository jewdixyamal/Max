package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: np9  reason: default package */
public final class np9 extends tdc {
    public final jv5 a;
    public final m56 b;
    public boolean c;

    public np9(jv5 jv5, om8 om8) {
        this.a = jv5;
        this.b = om8;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.c = false;
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (!this.c) {
            a layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                int T0 = gridLayoutManager.T0();
                int X0 = gridLayoutManager.X0();
                jv5 jv5 = this.a;
                int j = jv5.j();
                if (T0 != -1) {
                    this.b.invoke(X0 == j + -1 ? jv5.J(X0) : jv5.J(T0));
                }
            }
        }
    }
}
