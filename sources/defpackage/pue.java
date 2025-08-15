package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* renamed from: pue  reason: default package */
public final class pue extends ScopeCoroutine implements Runnable {
    public final long a;

    public pue(long j, Continuation continuation) {
        super(continuation.getContext(), continuation);
        this.a = j;
    }

    public final String nameString$kotlinx_coroutines_core() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.nameString$kotlinx_coroutines_core());
        sb.append("(timeMillis=");
        return z7b.i(sb, this.a, ')');
    }

    public final void run() {
        j47.H(getContext());
        cancelCoroutine(new TimeoutCancellationException("Timed out waiting for " + this.a + " ms", this));
    }
}
