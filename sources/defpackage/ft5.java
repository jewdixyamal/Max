package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ft5  reason: default package */
public final class ft5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ht5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ft5(ht5 ht5, Continuation continuation) {
        super(2, continuation);
        this.Y = ht5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ft5) n((e5f) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ft5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (ht5.a(this.Y, this) == tx3) {
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
