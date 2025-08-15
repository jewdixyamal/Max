package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* renamed from: nl4  reason: default package */
public final class nl4 extends ScopeCoroutine {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(nl4.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public final void afterCompletion(Object obj) {
        afterResume(obj);
    }

    public final void afterResume(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = a;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    DispatchedContinuationKt.resumeCancellableWith$default(v3c.u(this.uCont), z7.M(obj), (m56) null, 2, (Object) null);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
