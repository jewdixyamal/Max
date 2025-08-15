package defpackage;

import java.util.Objects;

/* renamed from: chc  reason: default package */
public final class chc implements hoc {
    public final long a;
    public final long b;

    public chc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || chc.class != obj.getClass()) {
            return false;
        }
        chc chc = (chc) obj;
        return this.a == chc.a && this.b == chc.b;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportNetworkStat{timestamp=");
        sb.append(this.a);
        sb.append(", sendBitrate=");
        return z7b.i(sb, this.b, '}');
    }
}
