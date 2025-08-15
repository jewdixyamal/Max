package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.coroutines.Continuation;

/* renamed from: wx3  reason: default package */
public final class wx3 extends ffe implements a66 {
    public j87 X;
    public int Y;
    public final /* synthetic */ j87 Z;
    public final /* synthetic */ CoroutineWorker s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wx3(j87 j87, CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Z = j87;
        this.s0 = coroutineWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wx3) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wx3(this.Z, this.s0, continuation);
    }

    public final Object o(Object obj) {
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = this.Z;
            this.Y = 1;
            this.s0.getClass();
            throw new IllegalStateException("Not implemented");
        } else if (i == 1) {
            j87 j87 = this.X;
            od2.a0(obj);
            j87.a.j(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
