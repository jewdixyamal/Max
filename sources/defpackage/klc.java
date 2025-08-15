package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadLocalElement;

/* renamed from: klc  reason: default package */
public final class klc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ilc Z;
    public final /* synthetic */ ry1 s0;
    public final /* synthetic */ a66 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public klc(ilc ilc, sy1 sy1, llc llc, Continuation continuation) {
        super(2, continuation);
        this.Z = ilc;
        this.s0 = sy1;
        this.t0 = llc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((klc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        klc klc = new klc(this.Z, (sy1) this.s0, (llc) this.t0, continuation);
        klc.Y = obj;
        return klc;
    }

    public final Object o(Object obj) {
        Continuation continuation;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iu3 iu3 = (iu3) ((sx3) this.Y).getCoroutineContext().get(vu4.b);
            v0f v0f = new v0f(iu3);
            lx3 plus = iu3.plus(v0f).plus(new ThreadLocalElement(Integer.valueOf(System.identityHashCode(v0f)), this.Z.j));
            ry1 ry1 = this.s0;
            this.Y = ry1;
            this.X = 1;
            obj = j47.t0(plus, this.t0, this);
            if (obj == tx3) {
                return tx3;
            }
            continuation = ry1;
        } else if (i == 1) {
            continuation = (Continuation) this.Y;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        continuation.resumeWith(obj);
        return e5f.a;
    }
}
