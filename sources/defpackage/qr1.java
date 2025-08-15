package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qr1  reason: default package */
public final class qr1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ wr1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qr1(wr1 wr1, Continuation continuation) {
        super(2, continuation);
        this.Y = wr1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qr1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qr1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            wr1 wr1 = this.Y;
            kld kld = ((cs1) wr1.q.getValue()).a;
            xw xwVar = new xw(4, (Object) wr1);
            this.X = 1;
            kld.d(new tk1(xwVar, 10), this);
            return tx3;
        } else if (i == 1) {
            od2.a0(obj);
            return e5f;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
