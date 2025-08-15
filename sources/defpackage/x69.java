package defpackage;

/* renamed from: x69  reason: default package */
public final class x69 implements y69 {
    public final long a;
    public final String b;

    public x69(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x69)) {
            return false;
        }
        x69 x69 = (x69) obj;
        return this.a == x69.a && tpa.f(this.b, x69.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadFailed(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return zr6.l(sb, this.b, ")");
    }
}
