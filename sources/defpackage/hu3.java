package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hu3  reason: default package */
public abstract class hu3 extends gi0 {
    public final lx3 b;
    public transient Continuation c;

    public hu3(lx3 lx3, Continuation continuation) {
        super(continuation);
        this.b = lx3;
    }

    public lx3 getContext() {
        return this.b;
    }

    public void p() {
        Continuation continuation = this.c;
        if (!(continuation == null || continuation == this)) {
            ((iu3) getContext().get(vu4.b)).releaseInterceptedContinuation(continuation);
        }
        this.c = kb3.b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public hu3(Continuation continuation) {
        this(continuation != null ? continuation.getContext() : null, continuation);
    }
}
