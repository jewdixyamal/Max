package defpackage;

import java.util.List;

/* renamed from: n2d  reason: default package */
public final class n2d extends l2d {
    public final List j;

    public n2d(q4c q4c, long j2, long j3, long j4, long j5, List list, long j6, List list2, long j7, long j8) {
        super(q4c, j2, j3, j4, j5, list, j6, j7, j8);
        this.j = list2;
    }

    public final long e(long j2) {
        return (long) this.j.size();
    }

    public final q4c i(long j2, khc khc) {
        return (q4c) this.j.get((int) (j2 - this.d));
    }

    public final boolean j() {
        return true;
    }
}
