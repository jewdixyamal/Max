package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobCancellationException;

/* renamed from: fab  reason: default package */
public final class fab extends d0 implements iab, e32 {
    public final e32 a;

    public fab(lx3 lx3, zt0 zt0) {
        super(lx3, true, true);
        this.a = zt0;
    }

    public final v3d c() {
        return this.a.c();
    }

    public final void cancel(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(cancellationExceptionMessage(), (Throwable) null, this);
            }
            cancelInternal(cancellationException);
        }
    }

    public final void cancelInternal(Throwable th) {
        CancellationException cancellationException$default = z87.toCancellationException$default(this, th, (String) null, 1, (Object) null);
        this.a.cancel(cancellationException$default);
        cancelCoroutine(cancellationException$default);
    }

    public final Object f() {
        return this.a.f();
    }

    public final Object h(Continuation continuation) {
        return this.a.h(continuation);
    }

    public final boolean i(Throwable th) {
        return this.a.i(th);
    }

    public final tt0 iterator() {
        return this.a.iterator();
    }

    public final void k(c01 c01) {
        this.a.k(c01);
    }

    public final Object n(Object obj) {
        return this.a.n(obj);
    }

    public final Object o(Object obj, Continuation continuation) {
        return this.a.o(obj, continuation);
    }

    public final void onCancelled(Throwable th, boolean z) {
        if (!this.a.i(th) && !z) {
            wmd.v(getContext(), th);
        }
    }

    public final void onCompleted(Object obj) {
        e5f e5f = (e5f) obj;
        this.a.i((Throwable) null);
    }

    public final boolean p() {
        return this.a.p();
    }

    public final /* synthetic */ void cancel() {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), (Throwable) null, this));
    }

    public final /* synthetic */ boolean cancel(Throwable th) {
        cancelInternal(new JobCancellationException(cancellationExceptionMessage(), (Throwable) null, this));
        return true;
    }
}
