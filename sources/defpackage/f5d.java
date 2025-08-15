package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: f5d  reason: default package */
public class f5d implements c5d {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicIntegerFieldUpdater g;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final vq0 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Class<f5d> cls = f5d.class;
        Class<Object> cls2 = Object.class;
        c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head$volatile");
        d = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx$volatile");
        e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail$volatile");
        f = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx$volatile");
        g = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits$volatile");
    }

    public f5d(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(zr6.h(i, "Semaphore should have at least 1 permit, but had ").toString());
        } else if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(zr6.h(i, "The number of acquired permits should be in 0..").toString());
        } else {
            h5d h5d = new h5d(0, (h5d) null, 2);
            this.head$volatile = h5d;
            this.tail$volatile = h5d;
            this._availablePermits$volatile = i - i2;
            this.b = new vq0(5, this);
        }
    }

    public final Object a(hu3 hu3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.a;
        } while (andDecrement > i);
        e5f e5f = e5f.a;
        if (andDecrement > 0) {
            return e5f;
        }
        sy1 o = nu0.o(v3c.u(hu3));
        try {
            if (!b(o)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i) {
                        if (andDecrement2 > 0) {
                            o.e(e5f, this.b);
                            break;
                        } else if (b(o)) {
                            break;
                        }
                    }
                }
            }
            Object m = o.m();
            tx3 tx3 = tx3.a;
            if (m != tx3) {
                m = e5f;
            }
            return m == tx3 ? m : e5f;
        } catch (Throwable th) {
            o.u();
            throw th;
        }
    }

    public final boolean b(irf irf) {
        Object findSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        h5d h5d = (h5d) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        d5d d5d = d5d.a;
        long j = andIncrement / ((long) g5d.f);
        loop0:
        while (true) {
            findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(h5d, j, d5d);
            if (SegmentOrClosed.m38isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment r8 = SegmentOrClosed.m36getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= r8.id) {
                    break loop0;
                } else if (r8.tryIncPointers$kotlinx_coroutines_core()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, r8)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (r8.decPointers$kotlinx_coroutines_core()) {
                                r8.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            }
        }
        h5d h5d2 = (h5d) SegmentOrClosed.m36getSegmentimpl(findSegmentInternal);
        int i = (int) (andIncrement % ((long) g5d.f));
        AtomicReferenceArray atomicReferenceArray = h5d2.a;
        while (!atomicReferenceArray.compareAndSet(i, (Object) null, irf)) {
            if (atomicReferenceArray.get(i) != null) {
                Symbol symbol = g5d.b;
                Symbol symbol2 = g5d.c;
                AtomicReferenceArray atomicReferenceArray2 = h5d2.a;
                while (!atomicReferenceArray2.compareAndSet(i, symbol, symbol2)) {
                    if (atomicReferenceArray2.get(i) != symbol) {
                        return false;
                    }
                }
                ((ry1) irf).e(e5f.a, this.b);
                return true;
            }
        }
        irf.a(h5d2, i);
        return true;
    }

    public final void c() {
        int i;
        Object findSegmentInternal;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2 || atomicIntegerFieldUpdater.compareAndSet(this, i, i2)) {
                    }
                    i = atomicIntegerFieldUpdater.get(this);
                    break;
                } while (atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            } else if (andIncrement < 0) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
                h5d h5d = (h5d) atomicReferenceFieldUpdater.get(this);
                long andIncrement2 = d.getAndIncrement(this);
                long j = andIncrement2 / ((long) g5d.f);
                e5d e5d = e5d.a;
                while (true) {
                    findSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(h5d, j, e5d);
                    if (SegmentOrClosed.m38isClosedimpl(findSegmentInternal)) {
                        break;
                    }
                    Segment r8 = SegmentOrClosed.m36getSegmentimpl(findSegmentInternal);
                    while (true) {
                        Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                        if (segment.id >= r8.id) {
                            break;
                        } else if (r8.tryIncPointers$kotlinx_coroutines_core()) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, r8)) {
                                if (atomicReferenceFieldUpdater.get(this) != segment) {
                                    if (r8.decPointers$kotlinx_coroutines_core()) {
                                        r8.remove();
                                    }
                                }
                            }
                            if (segment.decPointers$kotlinx_coroutines_core()) {
                                segment.remove();
                            }
                        }
                    }
                }
                h5d h5d2 = (h5d) SegmentOrClosed.m36getSegmentimpl(findSegmentInternal);
                h5d2.cleanPrev();
                int i3 = (h5d2.id > j ? 1 : (h5d2.id == j ? 0 : -1));
                z = false;
                if (i3 <= 0) {
                    int i4 = (int) (andIncrement2 % ((long) g5d.f));
                    Symbol symbol = g5d.b;
                    AtomicReferenceArray atomicReferenceArray = h5d2.a;
                    Object andSet = atomicReferenceArray.getAndSet(i4, symbol);
                    if (andSet == null) {
                        int i5 = g5d.a;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                Symbol symbol2 = g5d.b;
                                Symbol symbol3 = g5d.d;
                                while (true) {
                                    if (!atomicReferenceArray.compareAndSet(i4, symbol2, symbol3)) {
                                        if (atomicReferenceArray.get(i4) != symbol2) {
                                            break;
                                        }
                                    } else {
                                        z = true;
                                        break;
                                    }
                                }
                                z = !z;
                                continue;
                            } else if (atomicReferenceArray.get(i4) == g5d.c) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                    } else if (andSet == g5d.e) {
                        continue;
                    } else {
                        boolean z2 = andSet instanceof ry1;
                        e5f e5f = e5f.a;
                        if (z2) {
                            ry1 ry1 = (ry1) andSet;
                            Symbol l = ry1.l(e5f, this.b);
                            if (l != null) {
                                ry1.q(l);
                            } else {
                                continue;
                            }
                        } else if (andSet instanceof z3d) {
                            z = ((y3d) ((z3d) andSet)).g(this, e5f);
                            continue;
                        } else {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                    }
                    z = true;
                    continue;
                }
            } else {
                return;
            }
        } while (!z);
    }
}
