package defpackage;

/* renamed from: w02  reason: default package */
public final class w02 extends hbe implements Comparable {
    public long v0;

    public final int compareTo(Object obj) {
        w02 w02 = (w02) obj;
        if (f(4) == w02.f(4)) {
            long j = this.Y - w02.Y;
            if (j == 0) {
                j = this.v0 - w02.v0;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        } else if (!f(4)) {
            return -1;
        }
        return 1;
    }
}
