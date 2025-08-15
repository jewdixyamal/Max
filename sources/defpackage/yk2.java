package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: yk2  reason: default package */
public final class yk2 extends ffe implements a66 {
    public final /* synthetic */ Collection X;
    public final /* synthetic */ bl2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yk2(Set set, bl2 bl2, Continuation continuation) {
        super(2, continuation);
        this.X = set;
        this.Y = bl2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yk2) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yk2((Set) this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bl2 bl2 = this.Y;
        String n0 = x53.n0(this.X, ", ", (String) null, (String) null, new l(26, bl2), 30);
        int s = au1.s(bl2.w0);
        s35 s35 = bl2.x0;
        Collection collection = this.X;
        if (s == 0) {
            pnf.o(s35, np8.l(collection, new eqe(yea.i2), new iqe(n0)));
        } else if (s == 1) {
            pnf.o(s35, np8.m(collection, new eqe(yea.j2), new iqe(n0)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
