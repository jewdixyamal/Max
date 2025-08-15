package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fo5  reason: default package */
public final class fo5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ mn5 Y;
    public final /* synthetic */ iab Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fo5(mn5 mn5, iab iab, Continuation continuation) {
        super(2, continuation);
        this.Y = mn5;
        this.Z = iab;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fo5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fo5(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            tn5 tn5 = new tn5(this.Z, 1);
            this.X = 1;
            if (this.Y.d(tn5, this) == tx3) {
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
