package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: c8g  reason: default package */
public final class c8g {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ AtomicIntegerFieldUpdater d;
    public static final /* synthetic */ AtomicIntegerFieldUpdater e;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Class<c8g> cls = c8g.class;
        b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask$volatile");
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex$volatile");
        e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer$volatile");
    }

    public final nne a(nne nne) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return nne;
        }
        if (((fm5) nne.taskContext).b == 1) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i, nne);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final nne b() {
        nne nne;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (nne = (nne) this.a.getAndSet(i2, (Object) null)) != null) {
                if (((fm5) nne.taskContext).b == 1) {
                    e.decrementAndGet(this);
                }
                return nne;
            }
        }
    }

    public final nne c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        nne nne = (nne) atomicReferenceArray.get(i2);
        if (nne != null) {
            boolean z2 = true;
            if (((fm5) nne.taskContext).b != 1) {
                z2 = false;
            }
            if (z2 == z) {
                while (!atomicReferenceArray.compareAndSet(i2, nne, (Object) null)) {
                    if (atomicReferenceArray.get(i2) != nne) {
                    }
                }
                if (z) {
                    e.decrementAndGet(this);
                }
                return nne;
            }
        }
        return null;
    }
}
