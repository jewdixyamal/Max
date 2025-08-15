package defpackage;

/* renamed from: hkb  reason: default package */
public final class hkb extends ka1 {
    public final long b;
    public final ek2 c;

    public hkb(long j, ek2 ek2) {
        super(11);
        this.b = j;
        this.c = ek2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkb)) {
            return false;
        }
        hkb hkb = (hkb) obj;
        return this.b == hkb.b && this.c == hkb.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "ChatMembers(chatId=" + this.b + ", type=" + this.c + ")";
    }
}
