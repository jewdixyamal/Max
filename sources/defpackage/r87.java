package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: r87  reason: default package */
public final class r87 extends sy1 {
    public final z87 Y;

    public r87(z87 z87, Continuation continuation) {
        super(1, continuation);
        this.Y = z87;
    }

    public final Throwable k(z87 z87) {
        Throwable c;
        Object state$kotlinx_coroutines_core = this.Y.getState$kotlinx_coroutines_core();
        return (!(state$kotlinx_coroutines_core instanceof t87) || (c = ((t87) state$kotlinx_coroutines_core).c()) == null) ? state$kotlinx_coroutines_core instanceof lb3 ? ((lb3) state$kotlinx_coroutines_core).a : z87.getCancellationException() : c;
    }

    public final String t() {
        return "AwaitContinuation";
    }
}
