package defpackage;

/* renamed from: x71  reason: default package */
public final class x71 implements y71 {
    public final long a;

    public x71(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x71) && this.a == ((x71) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
