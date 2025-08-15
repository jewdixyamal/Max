package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: jk1  reason: default package */
public final class jk1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ el1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jk1(el1 el1, Continuation continuation) {
        super(2, continuation);
        this.Y = el1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((jk1) n((xvc) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jk1 jk1 = new jk1(this.Y, continuation);
        jk1.X = obj;
        return jk1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        int ordinal = ((xvc) this.X).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                pnf.o(this.Y.M0, wj1.r);
            } else if (!(ordinal == 2 || ordinal == 3)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
