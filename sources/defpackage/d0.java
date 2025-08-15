package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadContextKt;

/* renamed from: d0  reason: default package */
public abstract class d0 extends z87 implements Continuation, sx3 {
    private final lx3 context;

    public d0(lx3 lx3, boolean z, boolean z2) {
        super(z2);
        if (z) {
            initParentJob((x77) lx3.get(c32.X));
        }
        this.context = lx3.plus(this);
    }

    public static /* synthetic */ void getContext$annotations() {
    }

    public String cancellationExceptionMessage() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public final lx3 getContext() {
        return this.context;
    }

    public lx3 getCoroutineContext() {
        return this.context;
    }

    public final void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) {
        wmd.v(this.context, th);
    }

    public boolean isActive() {
        return super.isActive();
    }

    public String nameString$kotlinx_coroutines_core() {
        return super.nameString$kotlinx_coroutines_core();
    }

    public void onCancelled(Throwable th, boolean z) {
    }

    public void onCompleted(Object obj) {
    }

    public final void onCompletionInternal(Object obj) {
        if (obj instanceof lb3) {
            lb3 lb3 = (lb3) obj;
            onCancelled(lb3.a, lb3.b.get(lb3) != 0);
            return;
        }
        onCompleted(obj);
    }

    public final void resumeWith(Object obj) {
        Object makeCompletingOnce$kotlinx_coroutines_core = makeCompletingOnce$kotlinx_coroutines_core(z7.T(obj, (m56) null));
        if (makeCompletingOnce$kotlinx_coroutines_core != a97.b) {
            afterResume(makeCompletingOnce$kotlinx_coroutines_core);
        }
    }

    public final <R> void start(vx3 vx3, R r, a66 a66) {
        lx3 context2;
        Object updateThreadContext;
        Object obj;
        int ordinal = vx3.ordinal();
        if (ordinal == 0) {
            tu0.M(a66, r, this);
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                v3c.u(v3c.j(a66, r, this)).resumeWith(e5f.a);
            } else if (ordinal == 3) {
                try {
                    context2 = getContext();
                    updateThreadContext = ThreadContextKt.updateThreadContext(context2, (Object) null);
                    od2.P(this);
                    if (!(a66 instanceof gi0)) {
                        obj = v3c.H(a66, r, this);
                    } else {
                        f8.c(2, a66);
                        obj = a66.invoke(r, this);
                    }
                    ThreadContextKt.restoreThreadContext(context2, updateThreadContext);
                    if (obj != tx3.a) {
                        resumeWith(obj);
                    }
                } catch (Throwable th) {
                    resumeWith(new njc(th));
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
