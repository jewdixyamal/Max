package defpackage;

/* renamed from: x73  reason: default package */
public final class x73 implements y73 {
    public final long a;

    public x73(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x73) && this.a == ((x73) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("Remove(chatId="), this.a, ")");
    }
}
