package defpackage;

import java.util.List;

/* renamed from: urf  reason: default package */
public final class urf {
    public final String a;
    public final long b;
    public final long c;
    public final Thread d;
    public final List e;

    public urf(String str, long j, long j2, Thread thread, List list) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = thread;
        this.e = list;
    }

    public static urf a(urf urf, long j, Thread thread, int i) {
        if ((i & 4) != 0) {
            j = urf.c;
        }
        return new urf(urf.a, urf.b, j, thread, urf.e);
    }

    public final long b(long j) {
        long j2 = this.b;
        long j3 = this.c;
        if (ft4.d(j3, j2)) {
            j3 = j;
        }
        return ft4.g(j, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urf)) {
            return false;
        }
        urf urf = (urf) obj;
        return tpa.f(this.a, urf.a) && ft4.d(this.b, urf.b) && ft4.d(this.c, urf.c) && tpa.f(this.d, urf.d) && tpa.f(this.e, urf.e);
    }

    public final int hashCode() {
        int i = ft4.o;
        int m = h4f.m(h4f.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Thread thread = this.d;
        return this.e.hashCode() + ((m + (thread == null ? 0 : thread.hashCode())) * 31);
    }

    public final String toString() {
        String j = ft4.j(this.b);
        String j2 = ft4.j(this.c);
        StringBuilder sb = new StringBuilder("WatchdogTask(submitThread=");
        sb.append(this.a);
        sb.append(", submitTime=");
        sb.append(j);
        sb.append(", startTime=");
        sb.append(j2);
        sb.append(", runningThread=");
        sb.append(this.d);
        sb.append(", stacktrace=");
        return au1.i(sb, this.e, ")");
    }
}
