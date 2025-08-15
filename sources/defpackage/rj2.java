package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rj2  reason: default package */
public final class rj2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ck2 Y;
    public final /* synthetic */ au Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rj2(ck2 ck2, au auVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ck2;
        this.Z = auVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rj2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rj2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            pk pkVar = this.Y.u0;
            this.X = 1;
            obj = ((k4a) pkVar).J(this.Z, this);
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
