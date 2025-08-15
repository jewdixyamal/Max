package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* renamed from: bj0  reason: default package */
public final /* synthetic */ class bj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cj0 b;

    public /* synthetic */ bj0(cj0 cj0, int i) {
        this.a = i;
        this.b = cj0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Iterator it = this.b.g.iterator();
                while (it.hasNext()) {
                    gdf gdf = (gdf) it.next();
                    String str = gdf.e;
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        ir6.d(us7.X, str, "Player autoplay. onMediaProcessingFinished.", (Throwable) null);
                    }
                    gdf.r = false;
                    RecyclerView recyclerView = gdf.f;
                    if (recyclerView != null) {
                        gdf.e(recyclerView, false);
                    }
                }
                return;
            default:
                Iterator it2 = this.b.g.iterator();
                while (it2.hasNext()) {
                    ((gdf) it2.next()).c();
                }
                return;
        }
    }
}
