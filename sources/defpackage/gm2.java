package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: gm2  reason: default package */
public final class gm2 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ EndlessRecyclerView2 Y;
    public final /* synthetic */ h8e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gm2(h8e h8e, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = h8e;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                gm2 gm2 = new gm2(this.Z, continuation, 0);
                gm2.Y = endlessRecyclerView2;
                e5f e5f = e5f.a;
                gm2.o(e5f);
                return e5f;
            default:
                gm2 gm22 = new gm2(this.Z, continuation, 1);
                gm22.Y = endlessRecyclerView2;
                e5f e5f2 = e5f.a;
                gm22.o(e5f2);
                return e5f2;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                EndlessRecyclerView2 endlessRecyclerView2 = this.Y;
                this.Z.j();
                endlessRecyclerView2.Y();
                return e5f.a;
            default:
                od2.a0(obj);
                EndlessRecyclerView2 endlessRecyclerView22 = this.Y;
                this.Z.j();
                endlessRecyclerView22.Y();
                return e5f.a;
        }
    }
}
