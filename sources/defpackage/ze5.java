package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ze5  reason: default package */
public final class ze5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ a66 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ze5(cf5 cf5, Continuation continuation) {
        super(2, continuation);
        this.Z = cf5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ze5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ze5 ze5 = new ze5((cf5) this.Z, continuation);
        ze5.Y = obj;
        return ze5;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = this.Z.invoke((sx3) this.Y, this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
