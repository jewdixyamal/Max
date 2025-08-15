package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sda  reason: default package */
public final class sda extends ffe implements a66 {
    public int X;
    public final /* synthetic */ tda Y;
    public final /* synthetic */ uj3 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sda(tda tda, uj3 uj3, Continuation continuation) {
        super(2, continuation);
        this.Y = tda;
        this.Z = uj3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sda) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new sda(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gt9 a = this.Y.a();
            this.X = 1;
            obj = a.c(this.Z, this);
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
