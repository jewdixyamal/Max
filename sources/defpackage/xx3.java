package defpackage;

import androidx.work.CoroutineWorker;
import kotlin.coroutines.Continuation;

/* renamed from: xx3  reason: default package */
public final class xx3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ CoroutineWorker Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xx3(CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.Y = coroutineWorker;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xx3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xx3(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        CoroutineWorker coroutineWorker = this.Y;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = coroutineWorker.doWork(this);
            if (obj == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            try {
                od2.a0(obj);
            } catch (Throwable th) {
                coroutineWorker.b.k(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineWorker.b.j((fm7) obj);
        return e5f.a;
    }
}
