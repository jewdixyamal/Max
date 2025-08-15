package defpackage;

/* renamed from: hd2  reason: default package */
public final class hd2 {
    public final long a;
    public final fi9 b;

    public hd2(long j, fi9 fi9) {
        this.a = j;
        this.b = fi9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd2)) {
            return false;
        }
        hd2 hd2 = (hd2) obj;
        return this.a == hd2.a && tpa.f(this.b, hd2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TypingCacheKey(chatId=" + this.a + ", notifs=" + this.b + ")";
    }
}
