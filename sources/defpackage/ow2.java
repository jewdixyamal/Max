package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ow2  reason: default package */
public final class ow2 extends ffe implements a66 {
    public int X;

    public final Object invoke(Object obj, Object obj2) {
        return ((ow2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ffe(2, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            int i2 = ft4.o;
            long R = z7.R(2, kt4.SECONDS);
            this.X = 1;
            if (j47.y(R, this) == tx3) {
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
