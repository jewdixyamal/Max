package defpackage;

import java.io.Serializable;
import java.util.Map;

/* renamed from: ng4  reason: default package */
public final class ng4 implements Serializable {
    public final long a;
    public final boolean b;

    public ng4(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final Map a() {
        return mz7.a0(new kpa("timeToFire", Long.valueOf(this.a)), new kpa("notifySender", Boolean.valueOf(this.b)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng4)) {
            return false;
        }
        ng4 ng4 = (ng4) obj;
        return this.a == ng4.a && this.b == ng4.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String G = nu0.G(Long.valueOf(this.a));
        return "DelayedAttributes(timeToFire=" + G + ", notifySender=" + this.b + ")";
    }
}
