package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* renamed from: nc7  reason: default package */
public final class nc7 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ RecyclerView Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc7(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                nc7 nc7 = new nc7(3, continuation, 0);
                nc7.Y = recyclerView;
                e5f e5f = e5f.a;
                nc7.o(e5f);
                return e5f;
            case 1:
                nc7 nc72 = new nc7(3, continuation, 1);
                nc72.Y = recyclerView;
                e5f e5f2 = e5f.a;
                nc72.o(e5f2);
                return e5f2;
            default:
                nc7 nc73 = new nc7(3, continuation, 2);
                nc73.Y = recyclerView;
                e5f e5f3 = e5f.a;
                nc73.o(e5f3);
                return e5f3;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                RecyclerView recyclerView = this.Y;
                recyclerView.setBackgroundColor(qp4.u0.j(recyclerView).b().l);
                return e5f.a;
            case 1:
                od2.a0(obj);
                RecyclerView recyclerView2 = this.Y;
                recyclerView2.setBackgroundColor(qp4.u0.j(recyclerView2).b().m);
                return e5f.a;
            default:
                od2.a0(obj);
                RecyclerView recyclerView3 = this.Y;
                pq9 pq9 = qp4.u0;
                recyclerView3.setBackgroundColor(pq9.j(recyclerView3).b().l);
                qp4.d(pq9.b(recyclerView3.getContext()), recyclerView3);
                return e5f.a;
        }
    }
}
