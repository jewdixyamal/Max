package defpackage;

import java.util.List;

/* renamed from: o2d  reason: default package */
public final class o2d extends m2d {
    public final List j;

    public o2d(r4c r4c, long j2, long j3, long j4, long j5, List list, long j6, List list2, long j7, long j8) {
        super(r4c, j2, j3, j4, j5, list, j6, j7, j8);
        this.j = list2;
    }

    public final long e(long j2) {
        return (long) this.j.size();
    }

    public final r4c i(long j2, lhc lhc) {
        return (r4c) this.j.get((int) (j2 - this.d));
    }

    public final boolean j() {
        return true;
    }
}
