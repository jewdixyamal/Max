package defpackage;

/* renamed from: axc  reason: default package */
public final class axc {
    public final long a;
    public final long b;
    public final v5c c;

    public axc(long j, long j2, v5c v5c) {
        this.a = j;
        this.b = j2;
        this.c = v5c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axc)) {
            return false;
        }
        axc axc = (axc) obj;
        return this.a == axc.a && this.b == axc.b && tpa.f(this.c, axc.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ReactionInfo(messageServerId=" + this.a + ", messageTime=" + this.b + ", reaction=" + this.c + ")";
    }
}
