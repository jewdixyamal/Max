package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: rn3  reason: default package */
public final class rn3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yn3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rn3(yn3 yn3, Continuation continuation) {
        super(2, continuation);
        this.Y = yn3;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rn3) n((nm3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        rn3 rn3 = new rn3(this.Y, continuation);
        rn3.X = obj;
        return rn3;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        nm3 nm3 = (nm3) this.X;
        boolean f = tpa.f(nm3, lm3.a);
        yn3 yn3 = this.Y;
        if (f) {
            yn3.b();
        } else if (nm3 instanceof mm3) {
            yn3.b();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
