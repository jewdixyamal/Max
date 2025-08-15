package defpackage;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: xk2  reason: default package */
public final class xk2 extends ffe implements a66 {
    public final /* synthetic */ bl2 X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xk2(bl2 bl2, long j, Continuation continuation) {
        super(2, continuation);
        this.X = bl2;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xk2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xk2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        String d;
        od2.a0(obj);
        bl2 bl2 = this.X;
        long j = this.Y;
        uj3 uj3 = (uj3) ((ds3) bl2.X.getValue()).c(j).a.getValue();
        e5f e5f = e5f.a;
        if (!(uj3 == null || (d = uj3.d()) == null)) {
            int s = au1.s(bl2.w0);
            s35 s35 = bl2.x0;
            if (s == 0) {
                pnf.o(s35, np8.l(Collections.singletonList(new Long(j)), new gqe(yea.k2, ys.m0(new Object[]{d})), (jqe) null));
            } else if (s == 1) {
                pnf.o(s35, np8.m(Collections.singletonList(new Long(j)), new gqe(yea.l2, ys.m0(new Object[]{d})), (jqe) null));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f;
    }
}
