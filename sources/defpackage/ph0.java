package defpackage;

/* renamed from: ph0  reason: default package */
public final class ph0 {
    public final long a;
    public final pke b;

    public ph0(long j, pke pke) {
        this.a = j;
        this.b = pke;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph0)) {
            return false;
        }
        ph0 ph0 = (ph0) obj;
        return this.a == ph0.a && tpa.f(this.b, ph0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BaseError(requestId=" + this.a + ", error=" + this.b + ")";
    }
}
