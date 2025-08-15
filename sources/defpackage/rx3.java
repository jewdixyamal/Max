package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.LockFreeTaskQueue;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: rx3  reason: default package */
public final class rx3 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater s0;
    public static final /* synthetic */ AtomicLongFieldUpdater t0;
    public static final /* synthetic */ AtomicIntegerFieldUpdater u0;
    public static final Symbol v0 = new Symbol("NOT_IN_STACK");
    public final yd6 X;
    public final yd6 Y;
    public final ResizableAtomicArray Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String o;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    static {
        Class<rx3> cls = rx3.class;
        s0 = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack$volatile");
        t0 = AtomicLongFieldUpdater.newUpdater(cls, "controlState$volatile");
        u0 = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated$volatile");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [yd6, kotlinx.coroutines.internal.LockFreeTaskQueue] */
    /* JADX WARNING: type inference failed for: r4v4, types: [yd6, kotlinx.coroutines.internal.LockFreeTaskQueue] */
    public rx3(int i, int i2, long j) {
        String str = joe.a;
        this.a = i;
        this.b = i2;
        this.c = j;
        this.o = str;
        if (i < 1) {
            throw new IllegalArgumentException(wg0.g(i, "Core pool size ", " should be at least 1").toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(rh4.h("Max pool size ", i2, i, " should be greater than or equals to core pool size ").toString());
        } else if (i2 > 2097150) {
            throw new IllegalArgumentException(wg0.g(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j > 0) {
            this.X = new LockFreeTaskQueue(false);
            this.Y = new LockFreeTaskQueue(false);
            this.Z = new ResizableAtomicArray((i + 1) * 2);
            this.controlState$volatile = ((long) i) << 42;
            this._isTerminated$volatile = 0;
        } else {
            throw new IllegalArgumentException(ey8.i(j, "Idle worker keep alive time ", " must be positive").toString());
        }
    }

    public static /* synthetic */ void o(rx3 rx3, Runnable runnable, boolean z, int i) {
        fm5 fm5 = joe.g;
        if ((i & 4) != 0) {
            z = false;
        }
        rx3.n(runnable, fm5, z);
    }

    public final void S(qx3 qx3, int i, int i2) {
        while (true) {
            long j = s0.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & -2097152;
            if (i3 == i) {
                if (i2 == 0) {
                    Object c2 = qx3.c();
                    while (true) {
                        if (c2 == v0) {
                            i3 = -1;
                            break;
                        } else if (c2 == null) {
                            i3 = 0;
                            break;
                        } else {
                            qx3 qx32 = (qx3) c2;
                            int b2 = qx32.b();
                            if (b2 != 0) {
                                i3 = b2;
                                break;
                            }
                            c2 = qx32.c();
                        }
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (s0.compareAndSet(this, j, ((long) i3) | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean U(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int m = m();
            if (m == 1 && i2 > 1) {
                m();
            }
            if (m > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r1 == null) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = u0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto L_0x000c
            goto L_0x00ae
        L_0x000c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.qx3
            r3 = 0
            if (r1 == 0) goto L_0x0018
            qx3 r0 = (defpackage.qx3) r0
            goto L_0x0019
        L_0x0018:
            r0 = r3
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            rx3 r1 = r0.s0
            boolean r1 = defpackage.tpa.f(r1, r8)
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = r3
        L_0x0025:
            kotlinx.coroutines.internal.ResizableAtomicArray r1 = r8.Z
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = t0     // Catch:{ all -> 0x00c0 }
            long r4 = r4.get(r8)     // Catch:{ all -> 0x00c0 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L_0x0076
            r1 = r2
        L_0x0037:
            kotlinx.coroutines.internal.ResizableAtomicArray r5 = r8.Z
            java.lang.Object r5 = r5.get(r1)
            qx3 r5 = (defpackage.qx3) r5
            if (r5 == r0) goto L_0x0071
        L_0x0041:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L_0x0052
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L_0x0041
        L_0x0052:
            c8g r5 = r5.a
            yd6 r6 = r8.Y
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.c8g.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            nne r7 = (defpackage.nne) r7
            if (r7 == 0) goto L_0x0066
            r6.addLast(r7)
        L_0x0066:
            nne r7 = r5.b()
            if (r7 != 0) goto L_0x006d
            goto L_0x0071
        L_0x006d:
            r6.addLast(r7)
            goto L_0x0066
        L_0x0071:
            if (r1 == r4) goto L_0x0076
            int r1 = r1 + 1
            goto L_0x0037
        L_0x0076:
            yd6 r1 = r8.Y
            r1.close()
            yd6 r1 = r8.X
            r1.close()
        L_0x0080:
            if (r0 == 0) goto L_0x0088
            nne r1 = r0.a(r2)
            if (r1 != 0) goto L_0x00af
        L_0x0088:
            yd6 r1 = r8.X
            java.lang.Object r1 = r1.removeFirstOrNull()
            nne r1 = (defpackage.nne) r1
            if (r1 != 0) goto L_0x00af
            yd6 r1 = r8.Y
            java.lang.Object r1 = r1.removeFirstOrNull()
            nne r1 = (defpackage.nne) r1
            if (r1 != 0) goto L_0x00af
            if (r0 == 0) goto L_0x00a2
            r1 = 5
            r0.h(r1)
        L_0x00a2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = s0
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = t0
            r0.set(r8, r1)
        L_0x00ae:
            return
        L_0x00af:
            r1.run()     // Catch:{ all -> 0x00b3 }
            goto L_0x0080
        L_0x00b3:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L_0x0080
        L_0x00c0:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx3.close():void");
    }

    public final boolean e0() {
        Symbol symbol;
        int i;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = s0;
            long j = atomicLongFieldUpdater.get(this);
            qx3 qx3 = (qx3) this.Z.get((int) (2097151 & j));
            if (qx3 == null) {
                qx3 = null;
            } else {
                long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & -2097152;
                Object c2 = qx3.c();
                while (true) {
                    symbol = v0;
                    if (c2 == symbol) {
                        i = -1;
                        break;
                    } else if (c2 == null) {
                        i = 0;
                        break;
                    } else {
                        qx3 qx32 = (qx3) c2;
                        i = qx32.b();
                        if (i != 0) {
                            break;
                        }
                        c2 = qx32.c();
                    }
                }
                if (i >= 0) {
                    if (atomicLongFieldUpdater.compareAndSet(this, j, j2 | ((long) i))) {
                        qx3.g(symbol);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (qx3 == null) {
                return false;
            }
            if (qx3.t0.compareAndSet(qx3, -1, 0)) {
                LockSupport.unpark(qx3);
                return true;
            }
        }
    }

    public final void execute(Runnable runnable) {
        o(this, runnable, false, 6);
    }

    public final int m() {
        synchronized (this.Z) {
            try {
                if (u0.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = t0;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.Z.get(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                qx3 qx3 = new qx3(this, i3);
                this.Z.setSynchronized(i3, qx3);
                if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i4 = i2 + 1;
                    qx3.start();
                    return i4;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(Runnable runnable, sne sne, boolean z) {
        nne nne;
        int i;
        joe.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof nne) {
            nne = (nne) runnable;
            nne.submissionTime = nanoTime;
            nne.taskContext = sne;
        } else {
            nne = new zne(runnable, nanoTime, sne);
        }
        boolean z2 = false;
        boolean z3 = ((fm5) nne.taskContext).b == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = t0;
        long addAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0;
        Thread currentThread = Thread.currentThread();
        qx3 qx3 = currentThread instanceof qx3 ? (qx3) currentThread : null;
        if (qx3 == null || !tpa.f(qx3.s0, this)) {
            qx3 = null;
        }
        if (!(qx3 == null || (i = qx3.c) == 5 || (((fm5) nne.taskContext).b == 0 && i == 2))) {
            qx3.Z = true;
            c8g c8g = qx3.a;
            if (z) {
                nne = c8g.a(nne);
            } else {
                c8g.getClass();
                nne nne2 = (nne) c8g.b.getAndSet(c8g, nne);
                nne = nne2 == null ? null : c8g.a(nne2);
            }
        }
        if (nne != null) {
            if (!(((fm5) nne.taskContext).b == 1 ? this.Y.addLast(nne) : this.X.addLast(nne))) {
                throw new RejectedExecutionException(zr6.l(new StringBuilder(), this.o, " was terminated"));
            }
        }
        if (z && qx3 != null) {
            z2 = true;
        }
        if (z3) {
            if (!z2 && !e0() && !U(addAndGet)) {
                e0();
            }
        } else if (!z2 && !e0() && !U(atomicLongFieldUpdater.get(this))) {
            e0();
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResizableAtomicArray resizableAtomicArray = this.Z;
        int currentLength = resizableAtomicArray.currentLength();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < currentLength; i6++) {
            qx3 qx3 = (qx3) resizableAtomicArray.get(i6);
            if (qx3 != null) {
                c8g c8g = qx3.a;
                c8g.getClass();
                int i7 = c8g.b.get(c8g) != null ? (c8g.c.get(c8g) - c8g.d.get(c8g)) + 1 : c8g.c.get(c8g) - c8g.d.get(c8g);
                int s = au1.s(qx3.c);
                if (s == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (s == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (s == 2) {
                    i3++;
                } else if (s == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (s == 4) {
                    i5++;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        long j = t0.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.o);
        sb4.append('@');
        sb4.append(c54.u(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        ms2.k(sb4, this.b, "}, Worker States {CPU = ", i, ", blocking = ");
        ms2.k(sb4, i2, ", parked = ", i3, ", dormant = ");
        ms2.k(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.X.getSize());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.Y.getSize());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
