package defpackage;

/* renamed from: i19  reason: default package */
public final class i19 implements m19 {
    public final long a;
    public final wgf b;

    public i19(long j, wgf wgf) {
        this.a = j;
        this.b = wgf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i19)) {
            return false;
        }
        i19 i19 = (i19) obj;
        return this.a == i19.a && tpa.f(this.b, i19.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final long j() {
        return this.a;
    }

    public final String toString() {
        return "OnPlayRequested(messageId=" + this.a + ", model=" + this.b + ")";
    }
}
