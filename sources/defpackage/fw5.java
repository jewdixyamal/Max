package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fw5  reason: default package */
public final class fw5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ iw5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fw5(iw5 iw5, Continuation continuation) {
        super(2, continuation);
        this.Y = iw5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fw5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fw5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        at5 at5;
        String str;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            iw5 iw5 = this.Y;
            w9f w9f = iw5.t0;
            if (!(w9f == null || (at5 = w9f.a) == null || (str = at5.a) == null)) {
                ta2 ta2 = iw5.b;
                this.X = 1;
                if (((zb2) ta2).c(str, this) == tx3) {
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
