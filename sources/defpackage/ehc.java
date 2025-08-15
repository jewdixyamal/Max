package defpackage;

import java.util.Objects;

/* renamed from: ehc  reason: default package */
public final class ehc implements hoc {
    public final long a;
    public final long b;

    public ehc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ehc.class != obj.getClass()) {
            return false;
        }
        ehc ehc = (ehc) obj;
        return this.a == ehc.a && this.b == ehc.b;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportPerfStatCommand{framesReceived=");
        sb.append(this.a);
        sb.append(", framesDecoded=");
        return z7b.i(sb, this.b, '}');
    }
}
