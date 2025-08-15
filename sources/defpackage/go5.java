package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: go5  reason: default package */
public final class go5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gh7 Z;
    public final /* synthetic */ fg7 s0;
    public final /* synthetic */ mn5 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public go5(gh7 gh7, fg7 fg7, mn5 mn5, Continuation continuation) {
        super(2, continuation);
        this.Z = gh7;
        this.s0 = fg7;
        this.t0 = mn5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((go5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        go5 go5 = new go5(this.Z, this.s0, this.t0, continuation);
        go5.Y = obj;
        return go5;
    }

    public final Object o(Object obj) {
        iab iab;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iab iab2 = (iab) this.Y;
            fo5 fo5 = new fo5(this.t0, iab2, (Continuation) null);
            this.Y = iab2;
            this.X = 1;
            if (kq0.B(this.Z, this.s0, fo5, this) == tx3) {
                return tx3;
            }
            iab = iab2;
        } else if (i == 1) {
            iab = (iab) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((fab) iab).i((Throwable) null);
        return e5f.a;
    }
}
