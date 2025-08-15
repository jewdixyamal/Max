package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\t*\u00028\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a0\u0010\u0013\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010H\b¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u000e8\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/Segment;", "S", "", "id", "Lkotlin/Function2;", "createNewSegment", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "findSegmentInternal", "(Lkotlinx/coroutines/internal/Segment;JLa66;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "close", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "Lkotlinx/atomicfu/AtomicInt;", "", "delta", "Lkotlin/Function1;", "", "condition", "addConditionally", "(Lkotlinx/atomicfu/AtomicInt;ILm56;)Z", "POINTERS_SHIFT", "I", "Lkotlinx/coroutines/internal/Symbol;", "CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
public final class ConcurrentLinkedListKt {
    /* access modifiers changed from: private */
    public static final Symbol CLOSED = new Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    private static final /* synthetic */ boolean addConditionally$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i, m56 m56) {
        int i2;
        do {
            i2 = atomicIntegerFieldUpdater.get(obj);
            if (!((Boolean) m56.invoke(Integer.valueOf(i2))).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i2, i2 + i));
        return true;
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$array(AtomicIntegerArray atomicIntegerArray, int i, int i2, m56 m56) {
        int i3;
        do {
            i3 = atomicIntegerArray.get(i);
            if (!((Boolean) m56.invoke(Integer.valueOf(i3))).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i3, i3 + i2));
        return true;
    }

    public static final <N extends ConcurrentLinkedListNode<N>> N close(N n) {
        while (true) {
            N access$getNextOrClosed = n.getNextOrClosed();
            if (access$getNextOrClosed == CLOSED) {
                return n;
            }
            N n2 = (ConcurrentLinkedListNode) access$getNextOrClosed;
            if (n2 != null) {
                n = n2;
            } else if (n.markAsClosed()) {
                return n;
            }
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j, S s, a66 a66) {
        Object findSegmentInternal;
        loop0:
        while (true) {
            findSegmentInternal = findSegmentInternal(s, j, a66);
            if (SegmentOrClosed.m38isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment r1 = SegmentOrClosed.m36getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
                if (segment.id >= r1.id) {
                    break loop0;
                } else if (r1.tryIncPointers$kotlinx_coroutines_core()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(obj, segment, r1)) {
                        if (atomicReferenceFieldUpdater.get(obj) != segment) {
                            if (r1.decPointers$kotlinx_coroutines_core()) {
                                r1.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            }
        }
        return findSegmentInternal;
    }

    public static final /* synthetic */ <S extends Segment<S>> Object findSegmentAndMoveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i, long j, S s, a66 a66) {
        Object findSegmentInternal;
        loop0:
        while (true) {
            findSegmentInternal = findSegmentInternal(s, j, a66);
            if (SegmentOrClosed.m38isClosedimpl(findSegmentInternal)) {
                break;
            }
            Segment r1 = SegmentOrClosed.m36getSegmentimpl(findSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceArray.get(i);
                if (segment.id >= r1.id) {
                    break loop0;
                } else if (r1.tryIncPointers$kotlinx_coroutines_core()) {
                    while (!atomicReferenceArray.compareAndSet(i, segment, r1)) {
                        if (atomicReferenceArray.get(i) != segment) {
                            if (r1.decPointers$kotlinx_coroutines_core()) {
                                r1.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            }
        }
        return findSegmentInternal;
    }

    public static final <S extends Segment<S>> Object findSegmentInternal(S s, long j, a66 a66) {
        while (true) {
            if (s.id >= j && !s.isRemoved()) {
                return SegmentOrClosed.m33constructorimpl(s);
            }
            S access$getNextOrClosed = s.getNextOrClosed();
            if (access$getNextOrClosed == CLOSED) {
                return SegmentOrClosed.m33constructorimpl(CLOSED);
            }
            S s2 = (Segment) ((ConcurrentLinkedListNode) access$getNextOrClosed);
            if (s2 == null) {
                s2 = (Segment) a66.invoke(Long.valueOf(s.id + 1), s);
                if (s.trySetNext(s2)) {
                    if (s.isRemoved()) {
                        s.remove();
                    }
                }
            }
            s = s2;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, S s) {
        while (true) {
            Segment segment = (Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment.id >= s.id) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, segment, s)) {
                if (atomicReferenceFieldUpdater.get(obj) != segment) {
                    if (s.decPointers$kotlinx_coroutines_core()) {
                        s.remove();
                    }
                }
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
            return true;
        }
    }

    public static final /* synthetic */ <S extends Segment<S>> boolean moveForward$atomicfu$array(AtomicReferenceArray atomicReferenceArray, int i, S s) {
        while (true) {
            Segment segment = (Segment) atomicReferenceArray.get(i);
            if (segment.id >= s.id) {
                return true;
            }
            if (!s.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            while (!atomicReferenceArray.compareAndSet(i, segment, s)) {
                if (atomicReferenceArray.get(i) != segment) {
                    if (s.decPointers$kotlinx_coroutines_core()) {
                        s.remove();
                    }
                }
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
            return true;
        }
    }
}
