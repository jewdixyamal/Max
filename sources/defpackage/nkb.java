package defpackage;

/* renamed from: nkb  reason: default package */
public final class nkb extends ka1 {
    public final long b;
    public final hdb c;

    public nkb(long j, hdb hdb) {
        super(11);
        this.b = j;
        this.c = hdb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkb)) {
            return false;
        }
        nkb nkb = (nkb) obj;
        return this.b == nkb.b && this.c == nkb.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "OpenChat(chatId=" + this.b + ", type=" + this.c + ")";
    }
}
