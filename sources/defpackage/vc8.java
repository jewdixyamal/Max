package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vc8  reason: default package */
public final class vc8 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ es8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vc8(Object obj, Continuation continuation, es8 es8) {
        super(2, continuation);
        this.X = obj;
        this.Y = es8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vc8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vc8(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        l20 l20 = (l20) this.X;
        if ((l20 != null ? l20.g : null) == null) {
            return null;
        }
        long j = this.Y.a.b;
        c20 c20 = l20.g;
        return new vm8((long) l20.r.hashCode(), j, c20.a, fp3.F(l20), c20.c, c20.d, c20.b);
    }
}
