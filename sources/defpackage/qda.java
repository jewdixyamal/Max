package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qda  reason: default package */
public final class qda extends ffe implements a66 {
    public int X;
    public final /* synthetic */ tda Y;
    public final /* synthetic */ e52 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qda(tda tda, e52 e52, Continuation continuation) {
        super(2, continuation);
        this.Y = tda;
        this.Z = e52;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qda) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qda(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gt9 a = this.Y.a();
            this.X = 1;
            obj = a.b(this.Z, this);
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
