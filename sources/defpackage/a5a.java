package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a5a  reason: default package */
public final class a5a extends ffe implements a66 {
    public int X;

    public final Object invoke(Object obj, Object obj2) {
        return ((a5a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ffe(2, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            t03 g = ((zb2) ((ta2) jyc.a.getAccessor().c(ta2.class))).g();
            this.X = 1;
            if (od2.U(g, this) == tx3) {
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
