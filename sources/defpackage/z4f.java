package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* renamed from: z4f  reason: default package */
public final class z4f extends ScopeCoroutine {
    public final ThreadLocal a;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z4f(defpackage.lx3 r3, kotlin.coroutines.Continuation r4) {
        /*
            r2 = this;
            a5f r0 = defpackage.a5f.a
            jx3 r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000d
            lx3 r0 = r3.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.a = r0
            lx3 r4 = r4.getContext()
            vu4 r0 = defpackage.vu4.b
            jx3 r4 = r4.get(r0)
            boolean r4 = r4 instanceof defpackage.nx3
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r3, r4)
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r3, r4)
            r2.I(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z4f.<init>(lx3, kotlin.coroutines.Continuation):void");
    }

    public final boolean H() {
        boolean z = this.threadLocalIsSet && this.a.get() == null;
        this.a.remove();
        return !z;
    }

    public final void I(lx3 lx3, Object obj) {
        this.threadLocalIsSet = true;
        this.a.set(new kpa(lx3, obj));
    }

    public final void afterResume(Object obj) {
        if (this.threadLocalIsSet) {
            kpa kpa = (kpa) this.a.get();
            if (kpa != null) {
                ThreadContextKt.restoreThreadContext((lx3) kpa.a, kpa.b);
            }
            this.a.remove();
        }
        Object M = z7.M(obj);
        Continuation<T> continuation = this.uCont;
        lx3 context = continuation.getContext();
        z4f z4f = null;
        Object updateThreadContext = ThreadContextKt.updateThreadContext(context, z4f);
        if (updateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS) {
            z4f = v3c.G(continuation, context, updateThreadContext);
        }
        try {
            this.uCont.resumeWith(M);
        } finally {
            if (z4f == null || z4f.H()) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        }
    }
}
