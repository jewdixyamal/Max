package defpackage;

/* renamed from: gx7  reason: default package */
public final class gx7 {
    public final String a;
    public final long b;
    public final long c;
    public final long d;

    public gx7(String str, long j, long j2, long j3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx7)) {
            return false;
        }
        gx7 gx7 = (gx7) obj;
        return tpa.f(this.a, gx7.a) && this.b == gx7.b && this.c == gx7.c && this.d == gx7.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + h4f.m(h4f.m(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LooperMessage(message=");
        sb.append(this.a);
        sb.append(", startTime=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", messageQueueSize=");
        return zr6.k(sb, this.d, ")");
    }
}
