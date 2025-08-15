package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: z87  reason: default package */
public class z87 implements x77, h03, vpa {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Class<z87> cls = z87.class;
        Class<Object> cls2 = Object.class;
        _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public z87(boolean z) {
        this._state$volatile = z ? a97.g : a97.f;
    }

    public static String E(Object obj) {
        if (!(obj instanceof t87)) {
            return obj instanceof nz6 ? ((nz6) obj).isActive() ? "Active" : "New" : obj instanceof lb3 ? "Cancelled" : "Completed";
        }
        t87 t87 = (t87) obj;
        return t87.d() ? "Cancelling" : t87.b.get(t87) != 0 ? "Completing" : "Active";
    }

    public static final void access$continueCompleting(z87 z87, t87 t87, f03 f03, Object obj) {
        z87.getClass();
        f03 z = z(f03);
        if (z == null || !z87.G(t87, z, obj)) {
            t87.a.close(2);
            f03 z2 = z(f03);
            if (z2 == null || !z87.G(t87, z2, obj)) {
                z87.afterCompletion(z87.v(t87, obj));
            }
        }
    }

    public static final Object access$onAwaitInternalProcessResFunc(z87 z87, Object obj, Object obj2) {
        z87.getClass();
        if (!(obj2 instanceof lb3)) {
            return obj2;
        }
        throw ((lb3) obj2).a;
    }

    public static final void access$onAwaitInternalRegFunc(z87 z87, z3d z3d, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = z87.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof nz6)) {
                if (!(state$kotlinx_coroutines_core instanceof lb3)) {
                    state$kotlinx_coroutines_core = a97.a(state$kotlinx_coroutines_core);
                }
                ((y3d) z3d).X = state$kotlinx_coroutines_core;
                return;
            }
        } while (z87.D(state$kotlinx_coroutines_core) < 0);
        ((y3d) z3d).c = pag.q(z87, true, new u87(z87, z3d, 0));
    }

    public static final void access$registerSelectForOnJoin(z87 z87, z3d z3d, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = z87.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof nz6)) {
                ((y3d) z3d).X = e5f.a;
                return;
            }
        } while (z87.D(state$kotlinx_coroutines_core) < 0);
        ((y3d) z3d).c = pag.q(z87, true, new u87(z87, z3d, 1));
    }

    public static /* synthetic */ JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(z87 z87, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = z87.cancellationExceptionMessage();
            }
            return new JobCancellationException(str, th, z87);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    public static /* synthetic */ void getOnAwaitInternal$annotations() {
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    public static /* synthetic */ CancellationException toCancellationException$default(z87 z87, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return z87.toCancellationException(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    public static f03 z(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof f03) {
                    return (f03) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof tq9) {
                    return null;
                }
            }
        }
    }

    public final void A(tq9 tq9, Throwable th) {
        onCancelling(th);
        tq9.close(4);
        RuntimeException runtimeException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) tq9.getNext(); !tpa.f(lockFreeLinkedListNode, tq9); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
            if ((lockFreeLinkedListNode instanceof k87) && ((k87) lockFreeLinkedListNode).c()) {
                try {
                    ((k87) lockFreeLinkedListNode).d(th);
                } catch (Throwable th2) {
                    if (runtimeException != null) {
                        j47.e(runtimeException, th2);
                    } else {
                        runtimeException = new RuntimeException("Exception in completion handler " + lockFreeLinkedListNode + " for " + this, th2);
                    }
                }
            }
        }
        if (runtimeException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(runtimeException);
        }
        s(th);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kotlinx.coroutines.internal.LockFreeLinkedListHead, tq9] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0012 A[LOOP:0: B:4:0x0012->B:7:0x001d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(defpackage.ez4 r4) {
        /*
            r3 = this;
            tq9 r0 = new tq9
            r0.<init>()
            boolean r1 = r4.a
            if (r1 == 0) goto L_0x000a
            goto L_0x0010
        L_0x000a:
            gz6 r1 = new gz6
            r1.<init>(r0)
            r0 = r1
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = _state$volatile$FU
        L_0x0012:
            boolean r2 = r1.compareAndSet(r3, r4, r0)
            if (r2 == 0) goto L_0x0019
            goto L_0x001f
        L_0x0019:
            java.lang.Object r2 = r1.get(r3)
            if (r2 == r4) goto L_0x0012
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z87.B(ez4):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x000e A[LOOP:0: B:1:0x000e->B:4:0x0019, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(defpackage.k87 r4) {
        /*
            r3 = this;
            tq9 r0 = new tq9
            r0.<init>()
            r4.addOneIfEmpty(r0)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r4.getNextNode()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = _state$volatile$FU
        L_0x000e:
            boolean r2 = r1.compareAndSet(r3, r4, r0)
            if (r2 == 0) goto L_0x0015
            goto L_0x001b
        L_0x0015:
            java.lang.Object r2 = r1.get(r3)
            if (r2 == r4) goto L_0x000e
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z87.C(k87):void");
    }

    public final int D(Object obj) {
        if (obj instanceof ez4) {
            if (((ez4) obj).a) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            ez4 ez4 = a97.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ez4)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            onStart();
            return 1;
        } else if (!(obj instanceof gz6)) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
            tq9 tq9 = ((gz6) obj).a;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, tq9)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    return -1;
                }
            }
            onStart();
            return 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ae, code lost:
        if (r1 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b0, code lost:
        A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b3, code lost:
        r7 = z(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b7, code lost:
        if (r7 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00bd, code lost:
        if (G(r2, r7, r8) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c2, code lost:
        r0.close(2);
        r7 = z(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ca, code lost:
        if (r7 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d0, code lost:
        if (G(r2, r7, r8) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return v(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return defpackage.a97.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return defpackage.a97.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.nz6
            if (r0 != 0) goto L_0x0007
            kotlinx.coroutines.internal.Symbol r6 = defpackage.a97.a
            return r6
        L_0x0007:
            boolean r0 = r7 instanceof defpackage.ez4
            r1 = 0
            if (r0 != 0) goto L_0x0010
            boolean r0 = r7 instanceof defpackage.k87
            if (r0 == 0) goto L_0x0047
        L_0x0010:
            boolean r0 = r7 instanceof defpackage.f03
            if (r0 != 0) goto L_0x0047
            boolean r0 = r8 instanceof defpackage.lb3
            if (r0 != 0) goto L_0x0047
            r0 = r7
            nz6 r0 = (defpackage.nz6) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = _state$volatile$FU
            kotlinx.coroutines.internal.Symbol r7 = defpackage.a97.a
            boolean r7 = r8 instanceof defpackage.nz6
            if (r7 == 0) goto L_0x002d
            oz6 r7 = new oz6
            r3 = r8
            nz6 r3 = (defpackage.nz6) r3
            r7.<init>(r3)
            r3 = r7
            goto L_0x002e
        L_0x002d:
            r3 = r8
        L_0x002e:
            boolean r7 = r2.compareAndSet(r6, r0, r3)
            if (r7 == 0) goto L_0x003e
            r6.onCancelling(r1)
            r6.onCompletionInternal(r8)
            r6.t(r0, r8)
            return r8
        L_0x003e:
            java.lang.Object r7 = r2.get(r6)
            if (r7 == r0) goto L_0x002e
            kotlinx.coroutines.internal.Symbol r6 = defpackage.a97.c
            return r6
        L_0x0047:
            nz6 r7 = (defpackage.nz6) r7
            tq9 r0 = r6.x(r7)
            if (r0 != 0) goto L_0x0053
            kotlinx.coroutines.internal.Symbol r6 = defpackage.a97.c
            goto L_0x00d9
        L_0x0053:
            boolean r2 = r7 instanceof defpackage.t87
            if (r2 == 0) goto L_0x005b
            r2 = r7
            t87 r2 = (defpackage.t87) r2
            goto L_0x005c
        L_0x005b:
            r2 = r1
        L_0x005c:
            if (r2 != 0) goto L_0x0063
            t87 r2 = new t87
            r2.<init>(r0, r1)
        L_0x0063:
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.t87.b     // Catch:{ all -> 0x009b }
            int r4 = r3.get(r2)     // Catch:{ all -> 0x009b }
            r5 = 1
            if (r4 == 0) goto L_0x006f
            r4 = r5
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            if (r4 == 0) goto L_0x0077
            kotlinx.coroutines.internal.Symbol r6 = defpackage.a97.a     // Catch:{ all -> 0x009b }
            monitor-exit(r2)
            goto L_0x00d9
        L_0x0077:
            r3.set(r2, r5)     // Catch:{ all -> 0x009b }
            if (r2 == r7) goto L_0x008f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = _state$volatile$FU     // Catch:{ all -> 0x009b }
        L_0x007e:
            boolean r4 = r3.compareAndSet(r6, r7, r2)     // Catch:{ all -> 0x009b }
            if (r4 == 0) goto L_0x0085
            goto L_0x008f
        L_0x0085:
            java.lang.Object r4 = r3.get(r6)     // Catch:{ all -> 0x009b }
            if (r4 == r7) goto L_0x007e
            kotlinx.coroutines.internal.Symbol r6 = defpackage.a97.c     // Catch:{ all -> 0x009b }
            monitor-exit(r2)
            goto L_0x00d9
        L_0x008f:
            boolean r7 = r2.d()     // Catch:{ all -> 0x009b }
            boolean r3 = r8 instanceof defpackage.lb3     // Catch:{ all -> 0x009b }
            if (r3 == 0) goto L_0x009d
            r3 = r8
            lb3 r3 = (defpackage.lb3) r3     // Catch:{ all -> 0x009b }
            goto L_0x009e
        L_0x009b:
            r6 = move-exception
            goto L_0x00da
        L_0x009d:
            r3 = r1
        L_0x009e:
            if (r3 == 0) goto L_0x00a5
            java.lang.Throwable r3 = r3.a     // Catch:{ all -> 0x009b }
            r2.a(r3)     // Catch:{ all -> 0x009b }
        L_0x00a5:
            java.lang.Throwable r3 = r2.c()     // Catch:{ all -> 0x009b }
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x00ad
            r1 = r3
        L_0x00ad:
            monitor-exit(r2)
            if (r1 == 0) goto L_0x00b3
            r6.A(r0, r1)
        L_0x00b3:
            f03 r7 = z(r0)
            if (r7 == 0) goto L_0x00c2
            boolean r7 = r6.G(r2, r7, r8)
            if (r7 == 0) goto L_0x00c2
            kotlinx.coroutines.internal.Symbol r6 = defpackage.a97.b
            goto L_0x00d9
        L_0x00c2:
            r7 = 2
            r0.close(r7)
            f03 r7 = z(r0)
            if (r7 == 0) goto L_0x00d5
            boolean r7 = r6.G(r2, r7, r8)
            if (r7 == 0) goto L_0x00d5
            kotlinx.coroutines.internal.Symbol r6 = defpackage.a97.b
            goto L_0x00d9
        L_0x00d5:
            java.lang.Object r6 = r6.v(r2, r8)
        L_0x00d9:
            return r6
        L_0x00da:
            monitor-exit(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z87.F(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean G(t87 t87, f03 f03, Object obj) {
        do {
            if (pag.q(f03.b, false, new s87(this, t87, f03, obj)) != er9.a) {
                return true;
            }
            f03 = z(f03);
        } while (f03 != null);
        return false;
    }

    public Object a(Continuation continuation) {
        return awaitInternal(continuation);
    }

    public void afterCompletion(Object obj) {
    }

    public void afterResume(Object obj) {
        afterCompletion(obj);
    }

    public final e03 attachChild(h03 h03) {
        f03 f03 = new f03(h03);
        f03.a = this;
        loop0:
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof ez4) {
                ez4 ez4 = (ez4) state$kotlinx_coroutines_core;
                if (ez4.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, state$kotlinx_coroutines_core, f03)) {
                        if (atomicReferenceFieldUpdater.get(this) != state$kotlinx_coroutines_core) {
                        }
                    }
                    break loop0;
                }
                B(ez4);
            } else {
                boolean z = state$kotlinx_coroutines_core instanceof nz6;
                er9 er9 = er9.a;
                Throwable th = null;
                if (z) {
                    tq9 b = ((nz6) state$kotlinx_coroutines_core).b();
                    if (b == null) {
                        C((k87) state$kotlinx_coroutines_core);
                    } else if (!b.addLast(f03, 7)) {
                        boolean addLast = b.addLast(f03, 3);
                        Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                        if (state$kotlinx_coroutines_core2 instanceof t87) {
                            th = ((t87) state$kotlinx_coroutines_core2).c();
                        } else {
                            lb3 lb3 = state$kotlinx_coroutines_core2 instanceof lb3 ? (lb3) state$kotlinx_coroutines_core2 : null;
                            if (lb3 != null) {
                                th = lb3.a;
                            }
                        }
                        f03.d(th);
                        return addLast ? f03 : er9;
                    }
                } else {
                    Object state$kotlinx_coroutines_core3 = getState$kotlinx_coroutines_core();
                    lb3 lb32 = state$kotlinx_coroutines_core3 instanceof lb3 ? (lb3) state$kotlinx_coroutines_core3 : null;
                    if (lb32 != null) {
                        th = lb32.a;
                    }
                    f03.d(th);
                    return er9;
                }
            }
        }
    }

    public final Object awaitInternal(Continuation<Object> continuation) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof nz6)) {
                if (!(state$kotlinx_coroutines_core instanceof lb3)) {
                    return a97.a(state$kotlinx_coroutines_core);
                }
                throw ((lb3) state$kotlinx_coroutines_core).a;
            }
        } while (D(state$kotlinx_coroutines_core) < 0);
        return r(continuation);
    }

    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public final boolean cancelCoroutine(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        r0 = defpackage.a97.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancelImpl$kotlinx_coroutines_core(java.lang.Object r10) {
        /*
            r9 = this;
            kotlinx.coroutines.internal.Symbol r0 = defpackage.a97.a
            boolean r1 = r9.getOnCancelComplete$kotlinx_coroutines_core()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003e
        L_0x000a:
            java.lang.Object r0 = r9.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof defpackage.nz6
            if (r1 == 0) goto L_0x0037
            boolean r1 = r0 instanceof defpackage.t87
            if (r1 == 0) goto L_0x0025
            r1 = r0
            t87 r1 = (defpackage.t87) r1
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.t87.b
            int r1 = r4.get(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            lb3 r1 = new lb3
            java.lang.Throwable r4 = r9.u(r10)
            r1.<init>(r4, r3)
            java.lang.Object r0 = r9.F(r0, r1)
            kotlinx.coroutines.internal.Symbol r1 = defpackage.a97.c
            if (r0 == r1) goto L_0x000a
            goto L_0x0039
        L_0x0037:
            kotlinx.coroutines.internal.Symbol r0 = defpackage.a97.a
        L_0x0039:
            kotlinx.coroutines.internal.Symbol r1 = defpackage.a97.b
            if (r0 != r1) goto L_0x003e
            return r2
        L_0x003e:
            kotlinx.coroutines.internal.Symbol r1 = defpackage.a97.a
            if (r0 != r1) goto L_0x0101
            r0 = 0
            r1 = r0
        L_0x0044:
            java.lang.Object r4 = r9.getState$kotlinx_coroutines_core()
            boolean r5 = r4 instanceof defpackage.t87
            if (r5 == 0) goto L_0x009d
            monitor-enter(r4)
            r5 = r4
            t87 r5 = (defpackage.t87) r5     // Catch:{ all -> 0x007a }
            r5.getClass()     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = defpackage.t87.o     // Catch:{ all -> 0x007a }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x007a }
            kotlinx.coroutines.internal.Symbol r6 = defpackage.a97.e     // Catch:{ all -> 0x007a }
            if (r5 != r6) goto L_0x005f
            r5 = r2
            goto L_0x0060
        L_0x005f:
            r5 = r3
        L_0x0060:
            if (r5 == 0) goto L_0x0068
            kotlinx.coroutines.internal.Symbol r10 = defpackage.a97.d     // Catch:{ all -> 0x007a }
            monitor-exit(r4)
        L_0x0065:
            r0 = r10
            goto L_0x0101
        L_0x0068:
            r5 = r4
            t87 r5 = (defpackage.t87) r5     // Catch:{ all -> 0x007a }
            boolean r5 = r5.d()     // Catch:{ all -> 0x007a }
            if (r10 != 0) goto L_0x0073
            if (r5 != 0) goto L_0x0082
        L_0x0073:
            if (r1 != 0) goto L_0x007c
            java.lang.Throwable r1 = r9.u(r10)     // Catch:{ all -> 0x007a }
            goto L_0x007c
        L_0x007a:
            r9 = move-exception
            goto L_0x009b
        L_0x007c:
            r10 = r4
            t87 r10 = (defpackage.t87) r10     // Catch:{ all -> 0x007a }
            r10.a(r1)     // Catch:{ all -> 0x007a }
        L_0x0082:
            r10 = r4
            t87 r10 = (defpackage.t87) r10     // Catch:{ all -> 0x007a }
            java.lang.Throwable r10 = r10.c()     // Catch:{ all -> 0x007a }
            r1 = r5 ^ 1
            if (r1 == 0) goto L_0x008e
            r0 = r10
        L_0x008e:
            monitor-exit(r4)
            if (r0 == 0) goto L_0x0098
            t87 r4 = (defpackage.t87) r4
            tq9 r10 = r4.a
            r9.A(r10, r0)
        L_0x0098:
            kotlinx.coroutines.internal.Symbol r10 = defpackage.a97.a
            goto L_0x0065
        L_0x009b:
            monitor-exit(r4)
            throw r9
        L_0x009d:
            boolean r5 = r4 instanceof defpackage.nz6
            if (r5 == 0) goto L_0x00fd
            if (r1 != 0) goto L_0x00a7
            java.lang.Throwable r1 = r9.u(r10)
        L_0x00a7:
            r5 = r4
            nz6 r5 = (defpackage.nz6) r5
            boolean r6 = r5.isActive()
            if (r6 == 0) goto L_0x00d2
            tq9 r6 = r9.x(r5)
            if (r6 != 0) goto L_0x00b7
            goto L_0x0044
        L_0x00b7:
            t87 r7 = new t87
            r7.<init>(r6, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = _state$volatile$FU
        L_0x00be:
            boolean r4 = r8.compareAndSet(r9, r5, r7)
            if (r4 == 0) goto L_0x00ca
            r9.A(r6, r1)
            kotlinx.coroutines.internal.Symbol r10 = defpackage.a97.a
            goto L_0x0065
        L_0x00ca:
            java.lang.Object r4 = r8.get(r9)
            if (r4 == r5) goto L_0x00be
            goto L_0x0044
        L_0x00d2:
            lb3 r5 = new lb3
            r5.<init>(r1, r3)
            java.lang.Object r5 = r9.F(r4, r5)
            kotlinx.coroutines.internal.Symbol r6 = defpackage.a97.a
            if (r5 == r6) goto L_0x00e5
            kotlinx.coroutines.internal.Symbol r4 = defpackage.a97.c
            if (r5 == r4) goto L_0x0044
            r0 = r5
            goto L_0x0101
        L_0x00e5:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot happen in "
            r10.<init>(r0)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00fd:
            kotlinx.coroutines.internal.Symbol r10 = defpackage.a97.d
            goto L_0x0065
        L_0x0101:
            kotlinx.coroutines.internal.Symbol r10 = defpackage.a97.a
            if (r0 != r10) goto L_0x0106
            goto L_0x0114
        L_0x0106:
            kotlinx.coroutines.internal.Symbol r10 = defpackage.a97.b
            if (r0 != r10) goto L_0x010b
            goto L_0x0114
        L_0x010b:
            kotlinx.coroutines.internal.Symbol r10 = defpackage.a97.d
            if (r0 != r10) goto L_0x0111
            r2 = r3
            goto L_0x0114
        L_0x0111:
            r9.afterCompletion(r0)
        L_0x0114:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z87.cancelImpl$kotlinx_coroutines_core(java.lang.Object):boolean");
    }

    public void cancelInternal(Throwable th) {
        cancelImpl$kotlinx_coroutines_core(th);
    }

    public String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    public boolean childCancelled(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th) && getHandlesException$kotlinx_coroutines_core();
    }

    public final JobCancellationException defaultCancellationException$kotlinx_coroutines_core(String str, Throwable th) {
        if (str == null) {
            str = cancellationExceptionMessage();
        }
        return new JobCancellationException(str, th, this);
    }

    public <R> R fold(R r, a66 a66) {
        return a66.invoke(r, this);
    }

    public <E extends jx3> E get(kx3 kx3) {
        return tpa.r(this, kx3);
    }

    public final CancellationException getCancellationException() {
        CancellationException cancellationException;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof t87) {
            Throwable c = ((t87) state$kotlinx_coroutines_core).c();
            if (c != null && (cancellationException = toCancellationException(c, getClass().getSimpleName().concat(" is cancelling"))) != null) {
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(state$kotlinx_coroutines_core instanceof nz6)) {
            return state$kotlinx_coroutines_core instanceof lb3 ? toCancellationException$default(this, ((lb3) state$kotlinx_coroutines_core).a, (String) null, 1, (Object) null) : new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), (Throwable) null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public CancellationException getChildJobCancellationCause() {
        Throwable th;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        CancellationException cancellationException = null;
        if (state$kotlinx_coroutines_core instanceof t87) {
            th = ((t87) state$kotlinx_coroutines_core).c();
        } else if (state$kotlinx_coroutines_core instanceof lb3) {
            th = ((lb3) state$kotlinx_coroutines_core).a;
        } else if (!(state$kotlinx_coroutines_core instanceof nz6)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(E(state$kotlinx_coroutines_core)), th, this) : cancellationException;
    }

    public final c6d getChildren() {
        return new at(5, new v87(this, (Continuation) null));
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(!(state$kotlinx_coroutines_core instanceof nz6))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(state$kotlinx_coroutines_core instanceof lb3)) {
            return a97.a(state$kotlinx_coroutines_core);
        } else {
            throw ((lb3) state$kotlinx_coroutines_core).a;
        }
    }

    public final Throwable getCompletionCause() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof t87) {
            Throwable c = ((t87) state$kotlinx_coroutines_core).c();
            if (c != null) {
                return c;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (state$kotlinx_coroutines_core instanceof nz6) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (state$kotlinx_coroutines_core instanceof lb3) {
            return ((lb3) state$kotlinx_coroutines_core).a;
        } else {
            return null;
        }
    }

    public final boolean getCompletionCauseHandled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof lb3) {
            lb3 lb3 = (lb3) state$kotlinx_coroutines_core;
            lb3.getClass();
            if (lb3.b.get(lb3) != 0) {
                return true;
            }
        }
        return false;
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof nz6)) {
            lb3 lb3 = state$kotlinx_coroutines_core instanceof lb3 ? (lb3) state$kotlinx_coroutines_core : null;
            if (lb3 != null) {
                return lb3.a;
            }
            return null;
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    public final kx3 getKey() {
        return c32.X;
    }

    public final v3d getOnAwaitInternal() {
        w87 w87 = w87.a;
        f8.c(3, w87);
        x87 x87 = x87.a;
        f8.c(3, x87);
        return new m5d(13, this, w87, x87, (Object) null, false);
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [a8g, u3d, java.lang.Object] */
    public final u3d getOnJoin() {
        y87 y87 = y87.a;
        f8.c(3, y87);
        ? obj = new Object();
        obj.a = this;
        obj.b = y87;
        obj.c = null;
        Symbol symbol = b4d.a;
        obj.o = a4d.a;
        return obj;
    }

    public x77 getParent() {
        e03 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    public final e03 getParentHandle$kotlinx_coroutines_core() {
        return (e03) _parentHandle$volatile$FU.get(this);
    }

    public final Object getState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    public boolean handleJobException(Throwable th) {
        return false;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) {
        throw th;
    }

    public final void initParentJob(x77 x77) {
        er9 er9 = er9.a;
        if (x77 == null) {
            setParentHandle$kotlinx_coroutines_core(er9);
            return;
        }
        x77.start();
        e03 attachChild = x77.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(attachChild);
        if (isCompleted()) {
            attachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(er9);
        }
    }

    public final cm4 invokeOnCompletion(m56 m56) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(true, new gm4(1, m56));
    }

    public final cm4 invokeOnCompletionInternal$kotlinx_coroutines_core(boolean z, k87 k87) {
        er9 er9;
        boolean z2;
        Throwable th;
        boolean z3;
        k87.a = this;
        loop0:
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            boolean z4 = state$kotlinx_coroutines_core instanceof ez4;
            er9 = er9.a;
            z2 = true;
            th = null;
            if (!z4) {
                if (!(state$kotlinx_coroutines_core instanceof nz6)) {
                    z2 = false;
                    break;
                }
                nz6 nz6 = (nz6) state$kotlinx_coroutines_core;
                tq9 b = nz6.b();
                if (b == null) {
                    C((k87) state$kotlinx_coroutines_core);
                } else {
                    if (k87.c()) {
                        t87 t87 = nz6 instanceof t87 ? (t87) nz6 : null;
                        Throwable c = t87 != null ? t87.c() : null;
                        if (c == null) {
                            z3 = b.addLast(k87, 5);
                        } else {
                            if (z) {
                                k87.d(c);
                            }
                            return er9;
                        }
                    } else {
                        z3 = b.addLast(k87, 1);
                    }
                    if (z3) {
                        break;
                    }
                }
            } else {
                ez4 ez4 = (ez4) state$kotlinx_coroutines_core;
                if (ez4.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, state$kotlinx_coroutines_core, k87)) {
                        if (atomicReferenceFieldUpdater.get(this) != state$kotlinx_coroutines_core) {
                        }
                    }
                    break loop0;
                }
                B(ez4);
            }
        }
        if (z2) {
            return k87;
        }
        if (z) {
            Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
            lb3 lb3 = state$kotlinx_coroutines_core2 instanceof lb3 ? (lb3) state$kotlinx_coroutines_core2 : null;
            if (lb3 != null) {
                th = lb3.a;
            }
            k87.d(th);
        }
        return er9;
    }

    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof nz6) && ((nz6) state$kotlinx_coroutines_core).isActive();
    }

    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof lb3) || ((state$kotlinx_coroutines_core instanceof t87) && ((t87) state$kotlinx_coroutines_core).d());
    }

    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof nz6);
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof lb3;
    }

    public boolean isScopedCoroutine() {
        return this instanceof jp0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object join(kotlin.coroutines.Continuation<? super defpackage.e5f> r3) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof defpackage.nz6
            if (r1 != 0) goto L_0x000a
            r0 = 0
            goto L_0x0011
        L_0x000a:
            int r0 = r2.D(r0)
            if (r0 < 0) goto L_0x0000
            r0 = 1
        L_0x0011:
            e5f r1 = defpackage.e5f.a
            if (r0 != 0) goto L_0x001d
            lx3 r2 = r3.getContext()
            defpackage.pag.j(r2)
            return r1
        L_0x001d:
            java.lang.Object r2 = r2.y(r3)
            tx3 r3 = defpackage.tx3.a
            if (r2 != r3) goto L_0x0026
            return r2
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z87.join(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object m() {
        return getCompletedInternal$kotlinx_coroutines_core();
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object obj) {
        Object F;
        do {
            F = F(getState$kotlinx_coroutines_core(), obj);
            if (F == a97.a) {
                return false;
            }
            if (F == a97.b) {
                return true;
            }
        } while (F == a97.c);
        afterCompletion(F);
        return true;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object obj) {
        Object F;
        do {
            F = F(getState$kotlinx_coroutines_core(), obj);
            if (F == a97.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                lb3 lb3 = obj instanceof lb3 ? (lb3) obj : null;
                if (lb3 != null) {
                    th = lb3.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (F == a97.c);
        return F;
    }

    public lx3 minusKey(kx3 kx3) {
        return tpa.y(this, kx3);
    }

    public String nameString$kotlinx_coroutines_core() {
        return getClass().getSimpleName();
    }

    public void onCancelling(Throwable th) {
    }

    public void onCompletionInternal(Object obj) {
    }

    public void onStart() {
    }

    public final void parentCancelled(vpa vpa) {
        cancelImpl$kotlinx_coroutines_core(vpa);
    }

    public x77 plus(x77 x77) {
        return x77;
    }

    public final Object r(Continuation continuation) {
        r87 r87 = new r87(this, v3c.u(continuation));
        r87.n();
        nu0.w(r87, new hy1(2, pag.q(this, true, new d03(r87, 1))));
        return r87.m();
    }

    public final void removeNode$kotlinx_coroutines_core(k87 k87) {
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof k87) {
                if (state$kotlinx_coroutines_core == k87) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
                    ez4 ez4 = a97.g;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, state$kotlinx_coroutines_core, ez4)) {
                            if (atomicReferenceFieldUpdater.get(this) != state$kotlinx_coroutines_core) {
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else if ((state$kotlinx_coroutines_core instanceof nz6) && ((nz6) state$kotlinx_coroutines_core).b() != null) {
                k87.remove();
                return;
            } else {
                return;
            }
        }
    }

    public final boolean s(Throwable th) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        e03 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        return (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == er9.a) ? z : parentHandle$kotlinx_coroutines_core.a(th) || z;
    }

    public final void setParentHandle$kotlinx_coroutines_core(e03 e03) {
        _parentHandle$volatile$FU.set(this, e03);
    }

    public final boolean start() {
        int D;
        do {
            D = D(getState$kotlinx_coroutines_core());
            if (D == 0) {
                return false;
            }
        } while (D != 1);
        return true;
    }

    public final void t(nz6 nz6, Object obj) {
        e03 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(er9.a);
        }
        RuntimeException runtimeException = null;
        lb3 lb3 = obj instanceof lb3 ? (lb3) obj : null;
        Throwable th = lb3 != null ? lb3.a : null;
        if (nz6 instanceof k87) {
            try {
                ((k87) nz6).d(th);
            } catch (Throwable th2) {
                handleOnCompletionException$kotlinx_coroutines_core(new RuntimeException("Exception in completion handler " + nz6 + " for " + this, th2));
            }
        } else {
            tq9 b = nz6.b();
            if (b != null) {
                b.close(1);
                for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) b.getNext(); !tpa.f(lockFreeLinkedListNode, b); lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode()) {
                    if (lockFreeLinkedListNode instanceof k87) {
                        try {
                            ((k87) lockFreeLinkedListNode).d(th);
                        } catch (Throwable th3) {
                            if (runtimeException != null) {
                                j47.e(runtimeException, th3);
                            } else {
                                runtimeException = new RuntimeException("Exception in completion handler " + lockFreeLinkedListNode + " for " + this, th3);
                            }
                        }
                    }
                }
                if (runtimeException != null) {
                    handleOnCompletionException$kotlinx_coroutines_core(runtimeException);
                }
            }
        }
    }

    public final CancellationException toCancellationException(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = cancellationExceptionMessage();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + E(getState$kotlinx_coroutines_core()) + '}';
    }

    public String toString() {
        return toDebugString() + '@' + c54.u(this);
    }

    public final Throwable u(Object obj) {
        if (!(obj == null ? true : obj instanceof Throwable)) {
            return ((vpa) obj).getChildJobCancellationCause();
        }
        Throwable th = (Throwable) obj;
        return th == null ? new JobCancellationException(cancellationExceptionMessage(), (Throwable) null, this) : th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0092 A[LOOP:1: B:41:0x0092->B:44:0x009d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(defpackage.t87 r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.lb3
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r10
            lb3 r0 = (defpackage.lb3) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x000e
            java.lang.Throwable r1 = r0.a
        L_0x000e:
            monitor-enter(r9)
            boolean r0 = r9.d()     // Catch:{ all -> 0x00a3 }
            java.util.ArrayList r2 = r9.e(r1)     // Catch:{ all -> 0x00a3 }
            java.lang.Throwable r3 = r8.w(r9, r2)     // Catch:{ all -> 0x00a3 }
            r4 = 1
            if (r3 == 0) goto L_0x0054
            int r5 = r2.size()     // Catch:{ all -> 0x00a3 }
            if (r5 > r4) goto L_0x0025
            goto L_0x0054
        L_0x0025:
            int r5 = r2.size()     // Catch:{ all -> 0x00a3 }
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00a3 }
            r6.<init>(r5)     // Catch:{ all -> 0x00a3 }
            java.util.Set r5 = java.util.Collections.newSetFromMap(r6)     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x0036:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r6 == 0) goto L_0x0054
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x00a3 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00a3 }
            if (r6 == r3) goto L_0x0036
            if (r6 == r3) goto L_0x0036
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00a3 }
            if (r7 != 0) goto L_0x0036
            boolean r7 = r5.add(r6)     // Catch:{ all -> 0x00a3 }
            if (r7 == 0) goto L_0x0036
            defpackage.j47.e(r3, r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x0036
        L_0x0054:
            monitor-exit(r9)
            r2 = 0
            if (r3 != 0) goto L_0x0059
            goto L_0x0061
        L_0x0059:
            if (r3 != r1) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            lb3 r10 = new lb3
            r10.<init>(r3, r2)
        L_0x0061:
            if (r3 == 0) goto L_0x007a
            boolean r1 = r8.s(r3)
            if (r1 != 0) goto L_0x006f
            boolean r1 = r8.handleJobException(r3)
            if (r1 == 0) goto L_0x007a
        L_0x006f:
            r1 = r10
            lb3 r1 = (defpackage.lb3) r1
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.lb3.b
            r5.compareAndSet(r1, r2, r4)
        L_0x007a:
            if (r0 != 0) goto L_0x007f
            r8.onCancelling(r3)
        L_0x007f:
            r8.onCompletionInternal(r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = _state$volatile$FU
            boolean r1 = r10 instanceof defpackage.nz6
            if (r1 == 0) goto L_0x0091
            oz6 r1 = new oz6
            r2 = r10
            nz6 r2 = (defpackage.nz6) r2
            r1.<init>(r2)
            goto L_0x0092
        L_0x0091:
            r1 = r10
        L_0x0092:
            boolean r2 = r0.compareAndSet(r8, r9, r1)
            if (r2 == 0) goto L_0x0099
            goto L_0x009f
        L_0x0099:
            java.lang.Object r2 = r0.get(r8)
            if (r2 == r9) goto L_0x0092
        L_0x009f:
            r8.t(r9, r10)
            return r10
        L_0x00a3:
            r8 = move-exception
            monitor-exit(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z87.v(t87, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable w(defpackage.t87 r3, java.util.ArrayList r4) {
        /*
            r2 = this;
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r3 = r3.d()
            if (r3 == 0) goto L_0x0017
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r4 = r2.cancellationExceptionMessage()
            r3.<init>(r4, r1, r2)
            return r3
        L_0x0017:
            return r1
        L_0x0018:
            java.util.Iterator r2 = r4.iterator()
        L_0x001c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r2.next()
            r0 = r3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x001c
            goto L_0x0031
        L_0x0030:
            r3 = r1
        L_0x0031:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L_0x0036
            return r3
        L_0x0036:
            r2 = 0
            java.lang.Object r2 = r4.get(r2)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r3 = r2 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r3 == 0) goto L_0x005e
            java.util.Iterator r3 = r4.iterator()
        L_0x0045:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r3.next()
            r0 = r4
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == r2) goto L_0x0045
            boolean r0 = r0 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L_0x0045
            r1 = r4
        L_0x0059:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x005e
            return r1
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z87.w(t87, java.util.ArrayList):java.lang.Throwable");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [kotlinx.coroutines.internal.LockFreeLinkedListHead, tq9] */
    public final tq9 x(nz6 nz6) {
        tq9 b = nz6.b();
        if (b != null) {
            return b;
        }
        if (nz6 instanceof ez4) {
            return new LockFreeLinkedListHead();
        }
        if (nz6 instanceof k87) {
            C((k87) nz6);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + nz6).toString());
    }

    public final Object y(Continuation continuation) {
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        nu0.w(sy1, new hy1(2, pag.q(this, true, new gm4(2, sy1))));
        Object m = sy1.m();
        return m == tx3.a ? m : e5f.a;
    }

    public /* synthetic */ boolean cancel(Throwable th) {
        Throwable th2;
        if (th == null || (th2 = toCancellationException$default(this, th, (String) null, 1, (Object) null)) == null) {
            th2 = new JobCancellationException(cancellationExceptionMessage(), (Throwable) null, this);
        }
        cancelInternal(th2);
        return true;
    }

    public lx3 plus(lx3 lx3) {
        return ema.z(this, lx3);
    }

    public final cm4 invokeOnCompletion(boolean z, boolean z2, m56 m56) {
        k87 k87;
        if (z) {
            k87 = new m67(m56);
        } else {
            k87 = new gm4(1, m56);
        }
        return invokeOnCompletionInternal$kotlinx_coroutines_core(z2, k87);
    }

    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), (Throwable) null, this);
        }
        cancelInternal(cancellationException);
    }
}
