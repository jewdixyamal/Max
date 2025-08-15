package defpackage;

/* renamed from: k19  reason: default package */
public final class k19 implements m19 {
    public final long a;
    public final wgf b;

    public k19(long j, wgf wgf) {
        this.a = j;
        this.b = wgf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k19)) {
            return false;
        }
        k19 k19 = (k19) obj;
        return this.a == k19.a && tpa.f(this.b, k19.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final long j() {
        return this.a;
    }

    public final String toString() {
        return "OnSurfaceClick(messageId=" + this.a + ", model=" + this.b + ")";
    }
}
