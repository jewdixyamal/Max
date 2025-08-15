package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: sn3  reason: default package */
public final class sn3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yn3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sn3(yn3 yn3, Continuation continuation) {
        super(2, continuation);
        this.Y = yn3;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((sn3) n((ota) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        sn3 sn3 = new sn3(this.Y, continuation);
        sn3.X = obj;
        return sn3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (((ota) this.X) instanceof ota) {
            this.Y.b();
            return e5f.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
