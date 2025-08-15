package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tbb  reason: default package */
public final class tbb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ccb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tbb(ccb ccb, Continuation continuation) {
        super(2, continuation);
        this.Y = ccb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((tbb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tbb(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            fbb fbb = this.Y.b;
            this.X = 1;
            if (fbb.a(this) == tx3) {
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
