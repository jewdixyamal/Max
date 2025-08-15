package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: pb0  reason: default package */
public final class pb0 {
    public final d9f a;
    public final Map b;

    public pb0(d9f d9f, HashMap hashMap) {
        this.a = d9f;
        this.b = hashMap;
    }

    public final long a(z8b z8b, long j, int i) {
        long a2 = j - this.a.a();
        qb0 qb0 = (qb0) this.b.get(z8b);
        long j2 = qb0.a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i2) * ((double) j2) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j2 > 1 ? j2 : 2) * ((long) i2))))), a2), qb0.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pb0)) {
            return false;
        }
        pb0 pb0 = (pb0) obj;
        return this.a.equals(pb0.a) && this.b.equals(pb0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
