package defpackage;

import androidx.work.WorkRequest;

/* renamed from: q38  reason: default package */
public final class q38 {
    public final double a = 90.0d;
    public final double b = 0.02d;
    public final double c = 700.0d;
    public final double d = 0.02d;
    public final long e = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q38)) {
            return false;
        }
        q38 q38 = (q38) obj;
        return Double.compare(this.a, q38.a) == 0 && Double.compare(this.b, q38.b) == 0 && Double.compare(this.c, q38.c) == 0 && Double.compare(this.d, q38.d) == 0 && this.e == q38.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + c37.b(c37.b(c37.b(Double.hashCode(this.a) * 31, this.b), this.c), this.d);
    }

    public final String toString() {
        return "GoodNetworkCondition(rttLowBound=" + this.a + ", lostPacketsLimitForRttLowBound=" + this.b + ", rttHighBound=" + this.c + ", lostPacketsLimitForRttHighBound=" + this.d + ", recoveryTimeoutMs=" + this.e + ")";
    }
}
