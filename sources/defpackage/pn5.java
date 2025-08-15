package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* renamed from: pn5  reason: default package */
public final class pn5 extends ScopeCoroutine {
    public final boolean childCancelled(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th);
    }
}
