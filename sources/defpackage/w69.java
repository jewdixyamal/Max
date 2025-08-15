package defpackage;

/* renamed from: w69  reason: default package */
public final class w69 implements y69 {
    public final long a;
    public final String b;

    public w69(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w69)) {
            return false;
        }
        w69 w69 = (w69) obj;
        return this.a == w69.a && tpa.f(this.b, w69.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadCompleted(messageId=");
        sb.append(this.a);
        sb.append(", attachLocalId=");
        return zr6.l(sb, this.b, ")");
    }
}
