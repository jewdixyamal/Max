package defpackage;

/* renamed from: wd5  reason: default package */
public final class wd5 {
    public final long a;
    public final long b;

    public wd5(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd5)) {
            return false;
        }
        wd5 wd5 = (wd5) obj;
        return this.a == wd5.a && this.b == wd5.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FcmAnalyticsRemovedEntry(chatId=");
        sb.append(this.a);
        sb.append(", messageId=");
        return zr6.k(sb, this.b, ")");
    }
}
