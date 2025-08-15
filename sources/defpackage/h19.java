package defpackage;

/* renamed from: h19  reason: default package */
public final class h19 implements m19 {
    public final long a;
    public final wgf b;

    public h19(long j, wgf wgf) {
        this.a = j;
        this.b = wgf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h19)) {
            return false;
        }
        h19 h19 = (h19) obj;
        return this.a == h19.a && tpa.f(this.b, h19.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final long j() {
        return this.a;
    }

    public final String toString() {
        return "OnPauseRequested(messageId=" + this.a + ", model=" + this.b + ")";
    }
}
