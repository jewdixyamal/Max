package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* renamed from: me7  reason: default package */
public final class me7 extends zf4 {
    public final Continuation a;

    public me7(lx3 lx3, a66 a66) {
        super(lx3, true, false);
        this.a = v3c.j(a66, this, this);
    }

    public final void onStart() {
        try {
            DispatchedContinuationKt.resumeCancellableWith$default(v3c.u(this.a), e5f.a, (m56) null, 2, (Object) null);
        } catch (Throwable th) {
            resumeWith(new njc(th));
            throw th;
        }
    }
}
