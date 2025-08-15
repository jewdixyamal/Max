package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Concurrent_commonKt;

/* renamed from: s0e  reason: default package */
public final class s0e extends p3 {
    public final AtomicReference a = new AtomicReference((Object) null);

    public final boolean a(o3 o3Var) {
        q0e q0e = (q0e) o3Var;
        AtomicReference atomicReference = this.a;
        if (Concurrent_commonKt.getValue(atomicReference) != null) {
            return false;
        }
        Concurrent_commonKt.setValue(atomicReference, r0e.a);
        return true;
    }

    public final Continuation[] b(o3 o3Var) {
        q0e q0e = (q0e) o3Var;
        Concurrent_commonKt.setValue(this.a, null);
        return ft.a;
    }
}
