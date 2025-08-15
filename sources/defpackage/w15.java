package defpackage;

import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: w15  reason: default package */
public final class w15 implements Runnable {
    public final /* synthetic */ x15 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public w15(x15 x15, int i, int i2) {
        this.a = x15;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        x15 x15 = this.a;
        t15 t15 = x15.a;
        if (!(this.b == 0 && this.c == 0)) {
            t15.getClass();
        }
        EndlessRecyclerView2 endlessRecyclerView2 = x15.d;
        int Y0 = endlessRecyclerView2.getLinearLayoutManager().Y0();
        hdc adapter = endlessRecyclerView2.getAdapter();
        if ((adapter != null ? adapter.j() : 0) - Y0 <= x15.b && ((endlessRecyclerView2.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView2.b2) && t15.m())) {
            endlessRecyclerView2.setRefreshingNext(true);
            t15.l();
        }
        int W0 = endlessRecyclerView2.getLinearLayoutManager().W0();
        if (W0 >= 0 && W0 <= x15.b) {
            if ((endlessRecyclerView2.getIgnoreRefreshingFlagsForScrollEvent() || !endlessRecyclerView2.c2) && t15.h()) {
                endlessRecyclerView2.setRefreshingPrev(true);
                t15.j();
            }
        }
    }
}
