package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: op8  reason: default package */
public final class op8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ xp8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public op8(xp8 xp8, Continuation continuation) {
        super(2, continuation);
        this.Y = xp8;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((op8) n((cn8) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        op8 op8 = new op8(this.Y, continuation);
        op8.X = obj;
        return op8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (tpa.f((cn8) this.X, cn8.a)) {
            xp8 xp8 = this.Y;
            if (xp8.g.compareAndSet(false, true)) {
                j47.T(xp8.f, (lx3) null, (vx3) null, new wp8(xp8, (Continuation) null), 3);
            }
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
