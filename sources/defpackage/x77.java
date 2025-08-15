package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: x77  reason: default package */
public interface x77 extends jx3 {
    public static final /* synthetic */ int N = 0;

    e03 attachChild(h03 h03);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    c6d getChildren();

    cm4 invokeOnCompletion(m56 m56);

    cm4 invokeOnCompletion(boolean z, boolean z2, m56 m56);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(Continuation continuation);

    boolean start();
}
