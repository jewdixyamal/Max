package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b3d  reason: default package */
public abstract class b3d {
    public static final k2d a = new k2d(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(k2d k2d) {
        if (k2d.f != null || k2d.g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!k2d.d) {
            AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
            k2d k2d2 = (k2d) atomicReference.get();
            if (k2d2 != a) {
                int i = k2d2 != null ? k2d2.c : 0;
                if (i < 65536) {
                    k2d.f = k2d2;
                    k2d.b = 0;
                    k2d.c = i + 8192;
                    while (!atomicReference.compareAndSet(k2d2, k2d)) {
                        if (atomicReference.get() != k2d2) {
                            k2d.f = null;
                            return;
                        }
                    }
                }
            }
        }
    }

    public static final k2d b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        k2d k2d = a;
        k2d k2d2 = (k2d) atomicReference.getAndSet(k2d);
        if (k2d2 == k2d) {
            return new k2d();
        }
        if (k2d2 == null) {
            atomicReference.set((Object) null);
            return new k2d();
        }
        atomicReference.set(k2d2.f);
        k2d2.f = null;
        k2d2.c = 0;
        return k2d2;
    }
}
