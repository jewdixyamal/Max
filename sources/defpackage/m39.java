package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: m39  reason: default package */
public final class m39 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n59 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m39(n59 n59, Continuation continuation) {
        super(2, continuation);
        this.Z = n59;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m39) n((y69) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m39 m39 = new m39(this.Z, continuation);
        m39.Y = obj;
        return m39;
    }

    public final Object o(Object obj) {
        Object obj2;
        Object obj3;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            y69 y69 = (y69) this.Y;
            boolean z = y69 instanceof w69;
            n59 n59 = this.Z;
            if (z) {
                w69 w69 = (w69) y69;
                this.X = 1;
                if (!n59.w1.remove(w69.b, e5f) || (obj3 = j47.t0(((w9a) n59.Y).c(), new u39(n59, w69, (Continuation) null), this)) != tx3) {
                    obj3 = e5f;
                }
                if (obj3 == tx3) {
                    return tx3;
                }
            } else if (y69 instanceof x69) {
                x69 x69 = (x69) y69;
                this.X = 2;
                if (!n59.w1.remove(x69.b, e5f) || (obj2 = j47.t0(((w9a) n59.Y).c(), new v39(n59, x69, (Continuation) null), this)) != tx3) {
                    obj2 = e5f;
                }
                if (obj2 == tx3) {
                    return tx3;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1 || i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
