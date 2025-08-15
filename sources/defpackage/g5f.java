package defpackage;

/* renamed from: g5f  reason: default package */
public final class g5f {
    public final long a;

    public g5f(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5f) && this.a == ((g5f) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("UnknownContactState(contactId="), this.a, ")");
    }
}
