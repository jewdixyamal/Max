package defpackage;

/* renamed from: xib  reason: default package */
public final class xib extends bjb {
    public final long a;

    public xib(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xib) && this.a == ((xib) obj).a;
    }

    public final long getItemId() {
        return (long) 4096;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final int l() {
        return 4096;
    }

    public final String toString() {
        return zr6.k(new StringBuilder("DebugProfileInfo(id="), this.a, ")");
    }
}
