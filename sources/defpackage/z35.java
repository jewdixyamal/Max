package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* renamed from: z35  reason: default package */
public abstract class z35 extends a45 implements hg4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X;
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y;
    public static final /* synthetic */ AtomicIntegerFieldUpdater Z;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Class<z35> cls = z35.class;
        Class<Object> cls2 = Object.class;
        X = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue$volatile");
        Y = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed$volatile");
        Z = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted$volatile");
    }

    public final Object delay(long j, Continuation continuation) {
        return c37.j(this, j, continuation);
    }

    public final void dispatch(lx3 lx3, Runnable runnable) {
        o0(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[LOOP:1: B:12:0x002d->B:15:0x0038, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long e0() {
        /*
            r8 = this;
            boolean r0 = r8.m0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            r8.p0()
        L_0x000c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X
            java.lang.Object r3 = r0.get(r8)
            r4 = 0
            if (r3 != 0) goto L_0x0016
            goto L_0x0049
        L_0x0016:
            boolean r5 = r3 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r5 == 0) goto L_0x003b
            r4 = r3
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r4 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r4
            java.lang.Object r5 = r4.removeFirstOrNull()
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            if (r5 == r6) goto L_0x0029
            r4 = r5
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            goto L_0x0049
        L_0x0029:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r5 = r4.next()
        L_0x002d:
            boolean r4 = r0.compareAndSet(r8, r3, r5)
            if (r4 == 0) goto L_0x0034
            goto L_0x000c
        L_0x0034:
            java.lang.Object r4 = r0.get(r8)
            if (r4 == r3) goto L_0x002d
            goto L_0x000c
        L_0x003b:
            kotlinx.coroutines.internal.Symbol r5 = defpackage.b45.b
            if (r3 != r5) goto L_0x0040
            goto L_0x0049
        L_0x0040:
            boolean r5 = r0.compareAndSet(r8, r3, r4)
            if (r5 == 0) goto L_0x009f
            r4 = r3
            java.lang.Runnable r4 = (java.lang.Runnable) r4
        L_0x0049:
            if (r4 == 0) goto L_0x004f
            r4.run()
            return r1
        L_0x004f:
            hs r3 = r8.c
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != 0) goto L_0x005a
        L_0x0058:
            r6 = r4
            goto L_0x0062
        L_0x005a:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0061
            goto L_0x0058
        L_0x0061:
            r6 = r1
        L_0x0062:
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0067
            goto L_0x009e
        L_0x0067:
            java.lang.Object r0 = r0.get(r8)
            if (r0 == 0) goto L_0x0080
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r3 == 0) goto L_0x007a
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0080
            goto L_0x009e
        L_0x007a:
            kotlinx.coroutines.internal.Symbol r8 = defpackage.b45.b
            if (r0 != r8) goto L_0x009e
        L_0x007e:
            r1 = r4
            goto L_0x009e
        L_0x0080:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Y
            java.lang.Object r8 = r0.get(r8)
            y35 r8 = (defpackage.y35) r8
            if (r8 == 0) goto L_0x007e
            kotlinx.coroutines.internal.ThreadSafeHeapNode r8 = r8.peek()
            x35 r8 = (defpackage.x35) r8
            if (r8 != 0) goto L_0x0093
            goto L_0x007e
        L_0x0093:
            long r3 = r8.a
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            long r1 = defpackage.ote.c(r3, r1)
        L_0x009e:
            return r1
        L_0x009f:
            java.lang.Object r5 = r0.get(r8)
            if (r5 == r3) goto L_0x0040
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z35.e0():long");
    }

    public cm4 invokeOnTimeout(long j, Runnable runnable, lx3 lx3) {
        return c37.r(j, runnable, lx3);
    }

    public void o0(Runnable runnable) {
        p0();
        if (q0(runnable)) {
            Thread o = o();
            if (Thread.currentThread() != o) {
                LockSupport.unpark(o);
                return;
            }
            return;
        }
        pa4.s0.o0(runnable);
    }

    public final void p0() {
        ThreadSafeHeapNode threadSafeHeapNode;
        y35 y35 = (y35) Y.get(this);
        if (y35 != null && !y35.isEmpty()) {
            long nanoTime = System.nanoTime();
            do {
                synchronized (y35) {
                    try {
                        ThreadSafeHeapNode firstImpl = y35.firstImpl();
                        threadSafeHeapNode = null;
                        if (firstImpl != null) {
                            x35 x35 = (x35) firstImpl;
                            if (((nanoTime - x35.a) > 0 ? 1 : ((nanoTime - x35.a) == 0 ? 0 : -1)) >= 0 ? q0(x35) : false) {
                                threadSafeHeapNode = y35.removeAtImpl(0);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((x35) threadSafeHeapNode) != null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[LOOP:2: B:21:0x003f->B:24:0x004a, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = Z
            int r2 = r2.get(r6)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0012
            r2 = r4
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            if (r2 == 0) goto L_0x0016
            return r3
        L_0x0016:
            if (r1 != 0) goto L_0x0027
        L_0x0018:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L_0x0020
            return r4
        L_0x0020:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L_0x0018
            goto L_0x0000
        L_0x0027:
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r2 == 0) goto L_0x004e
            r2 = r1
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r2
            int r5 = r2.addLast(r7)
            if (r5 == 0) goto L_0x004d
            if (r5 == r4) goto L_0x003b
            r0 = 2
            if (r5 == r0) goto L_0x003a
            goto L_0x0000
        L_0x003a:
            return r3
        L_0x003b:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = r2.next()
        L_0x003f:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L_0x0046
            goto L_0x0000
        L_0x0046:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L_0x003f
            goto L_0x0000
        L_0x004d:
            return r4
        L_0x004e:
            kotlinx.coroutines.internal.Symbol r2 = defpackage.b45.b
            if (r1 != r2) goto L_0x0053
            return r3
        L_0x0053:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r3 = 8
            r2.<init>(r3, r4)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.addLast(r3)
            r2.addLast(r7)
        L_0x0063:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L_0x006a
            return r4
        L_0x006a:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L_0x0063
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z35.q0(java.lang.Runnable):boolean");
    }

    public final boolean r0() {
        hs hsVar = this.c;
        if (!(hsVar != null ? hsVar.isEmpty() : true)) {
            return false;
        }
        y35 y35 = (y35) Y.get(this);
        if (y35 != null && !y35.isEmpty()) {
            return false;
        }
        Object obj = X.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof LockFreeTaskQueueCore ? ((LockFreeTaskQueueCore) obj).isEmpty() : obj == b45.b;
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [kotlinx.coroutines.internal.ThreadSafeHeapNode] */
    /* JADX WARNING: type inference failed for: r4v0, types: [kotlinx.coroutines.internal.ThreadSafeHeap, y35, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[LOOP:0: B:10:0x0022->B:13:0x002d, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s0(long r6, defpackage.x35 r8) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = Z
            int r0 = r0.get(r5)
            r1 = 1
            if (r0 == 0) goto L_0x000b
            r0 = r1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r2 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = Y
            if (r0 == 0) goto L_0x0013
            r0 = r1
            goto L_0x0039
        L_0x0013:
            java.lang.Object r0 = r3.get(r5)
            y35 r0 = (defpackage.y35) r0
            if (r0 != 0) goto L_0x0035
            y35 r4 = new y35
            r4.<init>()
            r4.b = r6
        L_0x0022:
            boolean r0 = r3.compareAndSet(r5, r2, r4)
            if (r0 == 0) goto L_0x0029
            goto L_0x002f
        L_0x0029:
            java.lang.Object r0 = r3.get(r5)
            if (r0 == 0) goto L_0x0022
        L_0x002f:
            java.lang.Object r0 = r3.get(r5)
            y35 r0 = (defpackage.y35) r0
        L_0x0035:
            int r0 = r8.b(r6, r0, r5)
        L_0x0039:
            if (r0 == 0) goto L_0x0051
            if (r0 == r1) goto L_0x004d
            r5 = 2
            if (r0 != r5) goto L_0x0041
            goto L_0x006f
        L_0x0041:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "unexpected result"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x004d:
            r5.n0(r6, r8)
            goto L_0x006f
        L_0x0051:
            java.lang.Object r6 = r3.get(r5)
            y35 r6 = (defpackage.y35) r6
            if (r6 == 0) goto L_0x0060
            kotlinx.coroutines.internal.ThreadSafeHeapNode r6 = r6.peek()
            r2 = r6
            x35 r2 = (defpackage.x35) r2
        L_0x0060:
            if (r2 != r8) goto L_0x006f
            java.lang.Thread r5 = r5.o()
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            if (r6 == r5) goto L_0x006f
            java.util.concurrent.locks.LockSupport.unpark(r5)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z35.s0(long, x35):void");
    }

    public final void scheduleResumeAfterDelay(long j, ry1 ry1) {
        Symbol symbol = b45.a;
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            v35 v35 = new v35(this, j2 + nanoTime, ry1);
            s0(nanoTime, v35);
            nu0.w(ry1, new hy1(2, v35));
        }
    }

    public void shutdown() {
        x35 x35;
        ThreadLocal threadLocal = use.a;
        use.a.set((Object) null);
        Z.set(this, 1);
        loop0:
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof LockFreeTaskQueueCore)) {
                    if (obj != b45.b) {
                        LockFreeTaskQueueCore lockFreeTaskQueueCore = new LockFreeTaskQueueCore(8, true);
                        lockFreeTaskQueueCore.addLast((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lockFreeTaskQueueCore)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((LockFreeTaskQueueCore) obj).close();
                break;
            }
            Symbol symbol = b45.b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                }
            }
            break loop0;
        }
        do {
        } while (e0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            y35 y35 = (y35) Y.get(this);
            if (y35 != null && (x35 = (x35) y35.removeFirstOrNull()) != null) {
                n0(nanoTime, x35);
            } else {
                return;
            }
        }
    }
}
