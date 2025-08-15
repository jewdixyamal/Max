package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yi2  reason: default package */
public final class yi2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ck2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yi2(ck2 ck2, Continuation continuation) {
        super(2, continuation);
        this.Z = ck2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yi2) n((yu8) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yi2 yi2 = new yi2(this.Z, continuation);
        yi2.Y = obj;
        return yi2;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (ck2.r(this.Z, (yu8) this.Y, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
