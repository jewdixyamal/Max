package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g02  reason: default package */
public final class g02 extends tdc {
    public final ppd a;
    public final m56 b;

    public g02(ppd ppd, m56 m56) {
        this.a = ppd;
        this.b = m56;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        int T0;
        GridLayoutManager q = z7.q(recyclerView);
        if (q != null && (T0 = q.T0()) != -1) {
            this.b.invoke((ol7) x53.j0(T0, this.a.o.f));
        }
    }
}
