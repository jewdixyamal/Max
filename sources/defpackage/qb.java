package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* renamed from: qb  reason: default package */
public final class qb extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ RecyclerView Y;
    public final /* synthetic */ h8e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qb(h8e h8e, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.Z = h8e;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        fka fka = (fka) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                qb qbVar = new qb(this.Z, continuation, 0);
                qbVar.Y = recyclerView;
                e5f e5f = e5f.a;
                qbVar.o(e5f);
                return e5f;
            case 1:
                qb qbVar2 = new qb(this.Z, continuation, 1);
                qbVar2.Y = recyclerView;
                e5f e5f2 = e5f.a;
                qbVar2.o(e5f2);
                return e5f2;
            case 2:
                qb qbVar3 = new qb(this.Z, continuation, 2);
                qbVar3.Y = recyclerView;
                e5f e5f3 = e5f.a;
                qbVar3.o(e5f3);
                return e5f3;
            case 3:
                qb qbVar4 = new qb(this.Z, continuation, 3);
                qbVar4.Y = recyclerView;
                e5f e5f4 = e5f.a;
                qbVar4.o(e5f4);
                return e5f4;
            default:
                qb qbVar5 = new qb(this.Z, continuation, 4);
                qbVar5.Y = recyclerView;
                e5f e5f5 = e5f.a;
                qbVar5.o(e5f5);
                return e5f5;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                RecyclerView recyclerView = this.Y;
                this.Z.j();
                recyclerView.Y();
                return e5f.a;
            case 1:
                od2.a0(obj);
                RecyclerView recyclerView2 = this.Y;
                this.Z.j();
                recyclerView2.Y();
                return e5f.a;
            case 2:
                od2.a0(obj);
                RecyclerView recyclerView3 = this.Y;
                this.Z.j();
                recyclerView3.Y();
                return e5f.a;
            case 3:
                od2.a0(obj);
                RecyclerView recyclerView4 = this.Y;
                this.Z.j();
                recyclerView4.Y();
                return e5f.a;
            default:
                od2.a0(obj);
                RecyclerView recyclerView5 = this.Y;
                this.Z.j();
                recyclerView5.Y();
                return e5f.a;
        }
    }
}
