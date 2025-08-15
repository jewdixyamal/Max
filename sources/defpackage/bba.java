package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bba  reason: default package */
public final class bba extends ffe implements a66 {
    public int X;
    public final /* synthetic */ je7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bba(je7 je7, Continuation continuation) {
        super(2, continuation);
        this.Y = je7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bba) n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bba(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            if (((uca) this.Y.getValue()).k(this) == tx3) {
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
