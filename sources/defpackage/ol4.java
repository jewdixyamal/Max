package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ol4  reason: default package */
public abstract class ol4 extends nne {
    public int resumeMode;

    public ol4(int i) {
        super(0, joe.g);
        this.resumeMode = i;
    }

    public abstract void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th);

    public abstract Continuation getDelegate$kotlinx_coroutines_core();

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        lb3 lb3 = obj instanceof lb3 ? (lb3) obj : null;
        if (lb3 != null) {
            return lb3.a;
        }
        return null;
    }

    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj;
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                j47.e(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            wmd.v(getDelegate$kotlinx_coroutines_core().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        if (r5.H() != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (r5.H() != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            e5f r0 = defpackage.e5f.a
            sne r1 = r11.taskContext
            kotlin.coroutines.Continuation r2 = r11.getDelegate$kotlinx_coroutines_core()     // Catch:{ all -> 0x0020 }
            kotlinx.coroutines.internal.DispatchedContinuation r2 = (kotlinx.coroutines.internal.DispatchedContinuation) r2     // Catch:{ all -> 0x0020 }
            kotlin.coroutines.Continuation<T> r3 = r2.continuation     // Catch:{ all -> 0x0020 }
            java.lang.Object r2 = r2.countOrElement     // Catch:{ all -> 0x0020 }
            lx3 r4 = r3.getContext()     // Catch:{ all -> 0x0020 }
            java.lang.Object r2 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r2)     // Catch:{ all -> 0x0020 }
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch:{ all -> 0x0020 }
            r6 = 0
            if (r2 == r5) goto L_0x0023
            z4f r5 = defpackage.v3c.G(r3, r4, r2)     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r2 = move-exception
            goto L_0x009a
        L_0x0023:
            r5 = r6
        L_0x0024:
            lx3 r7 = r3.getContext()     // Catch:{ all -> 0x0043 }
            java.lang.Object r8 = r11.takeState$kotlinx_coroutines_core()     // Catch:{ all -> 0x0043 }
            java.lang.Throwable r9 = r11.getExceptionalResult$kotlinx_coroutines_core(r8)     // Catch:{ all -> 0x0043 }
            if (r9 != 0) goto L_0x0045
            int r10 = r11.resumeMode     // Catch:{ all -> 0x0043 }
            boolean r10 = defpackage.v3c.v(r10)     // Catch:{ all -> 0x0043 }
            if (r10 == 0) goto L_0x0045
            c32 r10 = defpackage.c32.X     // Catch:{ all -> 0x0043 }
            jx3 r7 = r7.get(r10)     // Catch:{ all -> 0x0043 }
            x77 r7 = (defpackage.x77) r7     // Catch:{ all -> 0x0043 }
            goto L_0x0046
        L_0x0043:
            r3 = move-exception
            goto L_0x008e
        L_0x0045:
            r7 = r6
        L_0x0046:
            if (r7 == 0) goto L_0x005e
            boolean r10 = r7.isActive()     // Catch:{ all -> 0x0043 }
            if (r10 != 0) goto L_0x005e
            java.util.concurrent.CancellationException r7 = r7.getCancellationException()     // Catch:{ all -> 0x0043 }
            r11.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch:{ all -> 0x0043 }
            njc r8 = new njc     // Catch:{ all -> 0x0043 }
            r8.<init>(r7)     // Catch:{ all -> 0x0043 }
            r3.resumeWith(r8)     // Catch:{ all -> 0x0043 }
            goto L_0x0070
        L_0x005e:
            if (r9 == 0) goto L_0x0069
            njc r7 = new njc     // Catch:{ all -> 0x0043 }
            r7.<init>(r9)     // Catch:{ all -> 0x0043 }
            r3.resumeWith(r7)     // Catch:{ all -> 0x0043 }
            goto L_0x0070
        L_0x0069:
            java.lang.Object r7 = r11.getSuccessfulResult$kotlinx_coroutines_core(r8)     // Catch:{ all -> 0x0043 }
            r3.resumeWith(r7)     // Catch:{ all -> 0x0043 }
        L_0x0070:
            if (r5 == 0) goto L_0x0078
            boolean r3 = r5.H()     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x007b
        L_0x0078:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r2)     // Catch:{ all -> 0x0020 }
        L_0x007b:
            r1.getClass()     // Catch:{ all -> 0x007f }
            goto L_0x0086
        L_0x007f:
            r0 = move-exception
            njc r1 = new njc
            r1.<init>(r0)
            r0 = r1
        L_0x0086:
            java.lang.Throwable r0 = defpackage.pjc.a(r0)
            r11.handleFatalException$kotlinx_coroutines_core(r6, r0)
            goto L_0x00ac
        L_0x008e:
            if (r5 == 0) goto L_0x0096
            boolean r5 = r5.H()     // Catch:{ all -> 0x0020 }
            if (r5 == 0) goto L_0x0099
        L_0x0096:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r2)     // Catch:{ all -> 0x0020 }
        L_0x0099:
            throw r3     // Catch:{ all -> 0x0020 }
        L_0x009a:
            r1.getClass()     // Catch:{ all -> 0x009e }
            goto L_0x00a5
        L_0x009e:
            r0 = move-exception
            njc r1 = new njc
            r1.<init>(r0)
            r0 = r1
        L_0x00a5:
            java.lang.Throwable r0 = defpackage.pjc.a(r0)
            r11.handleFatalException$kotlinx_coroutines_core(r2, r0)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol4.run():void");
    }

    public abstract Object takeState$kotlinx_coroutines_core();
}
