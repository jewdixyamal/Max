package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;

/* renamed from: j42  reason: default package */
public final class j42 extends Segment {
    public final zt0 a;
    public final /* synthetic */ AtomicReferenceArray b = new AtomicReferenceArray(bu0.b * 2);

    public j42(long j, j42 j42, zt0 zt0, int i) {
        super(j, j42, i);
        this.a = zt0;
    }

    public final boolean a(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.b;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object c(int i) {
        return this.b.get((i * 2) + 1);
    }

    public final void d(int i, boolean z) {
        if (z) {
            this.a.J((this.id * ((long) bu0.b)) + ((long) i));
        }
        onSlotCleaned();
    }

    public final void e(int i, Object obj) {
        this.b.set(i * 2, obj);
    }

    public final void f(int i, Object obj) {
        this.b.set((i * 2) + 1, obj);
    }

    public final int getNumberOfSlots() {
        return bu0.b;
    }

    public final void onCancellation(int i, Throwable th, lx3 lx3) {
        zt0 zt0;
        m56 m56;
        m56 m562;
        int i2 = bu0.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        Object obj = this.b.get(i * 2);
        while (true) {
            Object c = c(i);
            boolean z2 = c instanceof irf;
            zt0 = this.a;
            if (z2 || (c instanceof jrf)) {
                if (a(c, i, z ? bu0.j : bu0.k)) {
                    e(i, (Object) null);
                    d(i, !z);
                    if (z && (m56 = zt0.b) != null) {
                        OnUndeliveredElementKt.callUndeliveredElement(m56, obj, lx3);
                        return;
                    }
                    return;
                }
            } else if (c == bu0.j || c == bu0.k) {
                e(i, (Object) null);
            } else if (!(c == bu0.g || c == bu0.f)) {
                if (c != bu0.i && c != bu0.d && c != bu0.l) {
                    throw new IllegalStateException(("unexpected state: " + c).toString());
                }
                return;
            }
        }
        e(i, (Object) null);
        if (z && (m562 = zt0.b) != null) {
            OnUndeliveredElementKt.callUndeliveredElement(m562, obj, lx3);
        }
    }
}
