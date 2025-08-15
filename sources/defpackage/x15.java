package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: x15  reason: default package */
public final class x15 extends tdc {
    public final t15 a;
    public int b = 1;
    public w15 c;
    public final /* synthetic */ EndlessRecyclerView2 d;

    public x15(EndlessRecyclerView2 endlessRecyclerView2, t15 t15) {
        this.d = endlessRecyclerView2;
        this.a = t15;
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        w15 w15 = this.c;
        EndlessRecyclerView2 endlessRecyclerView2 = this.d;
        if (w15 != null) {
            endlessRecyclerView2.removeCallbacks(w15);
        }
        w15 w152 = new w15(this, i, i2);
        this.c = w152;
        endlessRecyclerView2.post(w152);
    }
}
