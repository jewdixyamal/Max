package defpackage;

/* renamed from: d39  reason: default package */
public final class d39 implements f39 {
    public final long a;

    public d39(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d39) && this.a == ((d39) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("SetEditedMessage(messageId="), this.a, ")");
    }
}
