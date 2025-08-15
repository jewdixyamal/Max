package defpackage;

/* renamed from: mxf  reason: default package */
public final class mxf extends oxf {
    public final long a;

    public mxf(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mxf) && this.a == ((mxf) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("Completed(requestId="), this.a, ")");
    }
}
