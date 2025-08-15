package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Segment;

/* renamed from: h5d  reason: default package */
public final class h5d extends Segment {
    public final /* synthetic */ AtomicReferenceArray a = new AtomicReferenceArray(g5d.f);

    public h5d(long j, h5d h5d, int i) {
        super(j, h5d, i);
    }

    public final int getNumberOfSlots() {
        return g5d.f;
    }

    public final void onCancellation(int i, Throwable th, lx3 lx3) {
        this.a.set(i, g5d.e);
        onSlotCleaned();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }
}
