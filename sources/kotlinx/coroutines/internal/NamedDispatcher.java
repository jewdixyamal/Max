package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\bHA¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#¨\u0006$"}, d2 = {"Lkotlinx/coroutines/internal/NamedDispatcher;", "Lnx3;", "Lhg4;", "dispatcher", "", "name", "<init>", "(Lnx3;Ljava/lang/String;)V", "", "timeMillis", "Lry1;", "Le5f;", "continuation", "scheduleResumeAfterDelay", "(JLry1;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Llx3;", "context", "Lcm4;", "invokeOnTimeout", "(JLjava/lang/Runnable;Llx3;)Lcm4;", "", "isDispatchNeeded", "(Llx3;)Z", "dispatch", "(Llx3;Ljava/lang/Runnable;)V", "dispatchYield", "toString", "()Ljava/lang/String;", "time", "delay", "(J)V", "Lnx3;", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
public final class NamedDispatcher extends nx3 implements hg4 {
    private final /* synthetic */ hg4 $$delegate_0;
    private final nx3 dispatcher;
    private final String name;

    public NamedDispatcher(nx3 nx3, String str) {
        hg4 hg4 = nx3 instanceof hg4 ? (hg4) nx3 : null;
        this.$$delegate_0 = hg4 == null ? qa4.a : hg4;
        this.dispatcher = nx3;
        this.name = str;
    }

    public Object delay(long j, Continuation<? super e5f> continuation) {
        return this.$$delegate_0.delay(j, continuation);
    }

    public void dispatch(lx3 lx3, Runnable runnable) {
        this.dispatcher.dispatch(lx3, runnable);
    }

    public void dispatchYield(lx3 lx3, Runnable runnable) {
        this.dispatcher.dispatchYield(lx3, runnable);
    }

    public cm4 invokeOnTimeout(long j, Runnable runnable, lx3 lx3) {
        return this.$$delegate_0.invokeOnTimeout(j, runnable, lx3);
    }

    public boolean isDispatchNeeded(lx3 lx3) {
        return this.dispatcher.isDispatchNeeded(lx3);
    }

    public void scheduleResumeAfterDelay(long j, ry1 ry1) {
        this.$$delegate_0.scheduleResumeAfterDelay(j, ry1);
    }

    public String toString() {
        return this.name;
    }
}
