package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j91  reason: default package */
public final class j91 extends ffe implements a66 {
    public int X;

    public final Object invoke(Object obj, Object obj2) {
        return ((j91) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ffe(2, continuation);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [a66, ffe] */
    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            xq9 xq9 = xq9.a;
            ? ffe = new ffe(2, (Continuation) null);
            this.X = 1;
            if (j47.t0(xq9, ffe, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
