package defpackage;

/* renamed from: yrc  reason: default package */
public final class yrc {
    public final long a;
    public final long b;

    public yrc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrc)) {
            return false;
        }
        yrc yrc = (yrc) obj;
        return this.a == yrc.a && this.b == yrc.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedMessagesChatEntity(userId=");
        sb.append(this.a);
        sb.append(", chatId=");
        return zr6.k(sb, this.b, ")");
    }
}
