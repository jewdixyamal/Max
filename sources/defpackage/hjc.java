package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hjc  reason: default package */
public abstract class hjc extends gi0 {
    public hjc(Continuation continuation) {
        super(continuation);
        if (continuation != null && continuation.getContext() != hz4.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    public final lx3 getContext() {
        return hz4.a;
    }
}
