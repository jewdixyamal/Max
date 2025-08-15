package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: y7e  reason: default package */
public final class y7e extends ffe implements a66 {
    public int X;
    public final /* synthetic */ b8e Y;
    public final /* synthetic */ w3e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y7e(b8e b8e, w3e w3e, Continuation continuation) {
        super(2, continuation);
        this.Y = b8e;
        this.Z = w3e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((y7e) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y7e(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            b8e b8e = this.Y;
            AtomicLong atomicLong = b8e.v0;
            w3e w3e = this.Z;
            atomicLong.compareAndSet(0, w3e.a);
            db3 d = ((sc5) b8e.Y.getValue()).d(w3e.a, true);
            this.X = 1;
            if (s36.e(d, this) == tx3) {
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
