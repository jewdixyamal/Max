package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: op2  reason: default package */
public final class op2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public op2(rq2 rq2, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((op2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new op2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        k92 k92;
        String str;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            rq2 rq2 = this.Y;
            e52 e52 = (e52) rq2.Y0.a.getValue();
            if (!(e52 == null || (k92 = e52.b) == null || (str = k92.I) == null)) {
                this.X = 1;
                if (((c97) rq2.J0.getValue()).a(str, this) == tx3) {
                    return tx3;
                }
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
