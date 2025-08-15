package defpackage;

/* renamed from: mfb  reason: default package */
public final class mfb extends ka1 {
    public final long b;

    public mfb(long j) {
        super(9);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mfb) && this.b == ((mfb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("OpenChat(chatId="), this.b, ")");
    }
}
