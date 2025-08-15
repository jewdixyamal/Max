package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;

/* renamed from: yo5  reason: default package */
public final class yo5 extends ffe implements m56 {
    public final /* synthetic */ long X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yo5(long j, Continuation continuation) {
        super(1, continuation);
        this.X = j;
    }

    public final Object invoke(Object obj) {
        new yo5(this.X, (Continuation) obj).o(e5f.a);
        throw null;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ft4.j(this.X), (x77) null);
    }
}
