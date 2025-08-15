package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vo5  reason: default package */
public final class vo5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vo5(mn5 mn5, Continuation continuation) {
        super(2, continuation);
        this.Z = mn5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vo5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vo5 vo5 = new vo5(this.Z, continuation);
        vo5.Y = obj;
        return vo5;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            tn5 tn5 = new tn5((iab) this.Y, 2);
            this.X = 1;
            if (this.Z.d(tn5, this) == tx3) {
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
