package defpackage;

/* renamed from: nxf  reason: default package */
public final class nxf extends oxf {
    public final long a;

    public nxf(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxf) && this.a == ((nxf) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("Error(requestId="), this.a, ")");
    }
}
