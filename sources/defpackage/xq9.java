package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: xq9  reason: default package */
public final class xq9 extends e0 implements x77 {
    public static final xq9 a = new e0(c32.X);

    public final e03 attachChild(h03 h03) {
        return er9.a;
    }

    public final void cancel(CancellationException cancellationException) {
    }

    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    public final c6d getChildren() {
        return vz4.a;
    }

    public final cm4 invokeOnCompletion(m56 m56) {
        return er9.a;
    }

    public final boolean isActive() {
        return true;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isCompleted() {
        return false;
    }

    public final Object join(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    public final cm4 invokeOnCompletion(boolean z, boolean z2, m56 m56) {
        return er9.a;
    }
}
