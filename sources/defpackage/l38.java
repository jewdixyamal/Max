package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: l38  reason: default package */
public final class l38 implements Comparable {
    public final String X;
    public final long Y;
    public final String a;
    public final long b;
    public final long c;
    public final TimeUnit o;

    public l38(String str, long j, long j2, TimeUnit timeUnit, String str2, long j3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.o = timeUnit;
        this.X = str2;
        this.Y = j3;
    }

    public final int compareTo(Object obj) {
        l38 l38 = (l38) obj;
        TimeUnit timeUnit = this.o;
        long nanos = timeUnit.toNanos(this.c);
        long j = l38.c;
        TimeUnit timeUnit2 = l38.o;
        int n = tpa.n(timeUnit.toNanos(this.b) + nanos, timeUnit2.toNanos(l38.b) + timeUnit2.toNanos(j));
        Integer valueOf = Integer.valueOf(n);
        if (n == 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.a.compareTo(l38.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l38)) {
            return false;
        }
        l38 l38 = (l38) obj;
        return tpa.f(this.a, l38.a) && this.b == l38.b && this.c == l38.c && this.o == l38.o && tpa.f(this.X, l38.X) && this.Y == l38.Y;
    }

    public final int hashCode() {
        return Long.hashCode(this.Y) + rh4.d((this.o.hashCode() + h4f.m(h4f.m(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.X);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Measurement(taskName=");
        sb.append(this.a);
        sb.append(", dependencyDuration=");
        sb.append(this.b);
        sb.append(", executionDuration=");
        sb.append(this.c);
        sb.append(", unit=");
        sb.append(this.o);
        sb.append(", threadName=");
        sb.append(this.X);
        sb.append(", startTime=");
        return zr6.k(sb, this.Y, ")");
    }
}
