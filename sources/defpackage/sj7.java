package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sj7  reason: default package */
public final class sj7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vj7 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sj7(vj7 vj7, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = vj7;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sj7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sj7(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            g00 g00 = new g00(((ki7) this.Y.i.getValue()).a, this.Z, 3);
            this.X = 1;
            obj = od2.A(g00, this);
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
