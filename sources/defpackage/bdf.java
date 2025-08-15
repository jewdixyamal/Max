package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* renamed from: bdf  reason: default package */
public final class bdf extends ffe implements a66 {
    public final /* synthetic */ gdf X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bdf(gdf gdf, Continuation continuation) {
        super(2, continuation);
        this.X = gdf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bdf) n((e5f) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bdf(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        gdf gdf = this.X;
        RecyclerView recyclerView = gdf.f;
        e5f e5f = e5f.a;
        if (recyclerView == null) {
            return e5f;
        }
        String str = gdf.e;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "Player autoplay. Handle fetch event for video message, try start autoplay.", (Throwable) null);
        }
        if (recyclerView.getScrollState() == 0) {
            this.X.e(recyclerView, false);
        }
        return e5f;
    }
}
