package defpackage;

/* renamed from: tdd  reason: default package */
public final class tdd implements wdd {
    public final long a;

    public tdd(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdd) && this.a == ((tdd) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
