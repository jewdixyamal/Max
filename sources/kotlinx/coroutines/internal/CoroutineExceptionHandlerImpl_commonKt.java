package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llx3;", "context", "", "exception", "Le5f;", "handleUncaughtCoroutineException", "(Llx3;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
public final class CoroutineExceptionHandlerImpl_commonKt {
    public static final void handleUncaughtCoroutineException(lx3 lx3, Throwable th) {
        Throwable th2;
        for (ox3 g : CoroutineExceptionHandlerImplKt.getPlatformExceptionHandlers()) {
            try {
                g.g(lx3, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    j47.e(th2, th);
                }
                CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(th2);
            }
        }
        try {
            j47.e(th, new DiagnosticCoroutineContextException(lx3));
        } catch (Throwable unused2) {
        }
        CoroutineExceptionHandlerImplKt.propagateExceptionFinalResort(th);
    }
}
