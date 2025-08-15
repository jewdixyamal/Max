package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lif  reason: default package */
public final class lif extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mif Y;
    public final /* synthetic */ cu8 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lif(mif mif, cu8 cu8, Continuation continuation) {
        super(2, continuation);
        this.Y = mif;
        this.Z = cu8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lif) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lif(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            long j = this.Z.Y;
            this.X = 1;
            obj = ((ds3) this.Y.o.getValue()).b(j, this);
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
