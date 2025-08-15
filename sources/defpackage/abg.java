package defpackage;

/* renamed from: abg  reason: default package */
public final class abg {
    public final long a;
    public final z9b b;

    public abg(long j, z9b z9b) {
        this.a = j;
        this.b = z9b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abg)) {
            return false;
        }
        abg abg = (abg) obj;
        return this.a == abg.a && tpa.f(this.b, abg.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "State(uptime=" + this.a + ", processorInfo=" + this.b + ")";
    }
}
