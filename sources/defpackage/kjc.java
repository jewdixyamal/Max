package defpackage;

/* renamed from: kjc  reason: default package */
public final class kjc {
    public final long a;

    public kjc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjc) && this.a == ((kjc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("RestrictionsInfo(expiration="), this.a, ")");
    }
}
