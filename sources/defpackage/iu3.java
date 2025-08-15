package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: iu3  reason: default package */
public interface iu3 extends jx3 {
    public static final /* synthetic */ int n = 0;

    Continuation interceptContinuation(Continuation continuation);

    void releaseInterceptedContinuation(Continuation continuation);
}
