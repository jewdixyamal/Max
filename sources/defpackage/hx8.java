package defpackage;

/* renamed from: hx8  reason: default package */
public final class hx8 {
    public final c6c a;
    public final int b;

    public hx8(c6c c6c, int i) {
        this.a = c6c;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx8)) {
            return false;
        }
        hx8 hx8 = (hx8) obj;
        return tpa.f(this.a, hx8.a) && this.b == hx8.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MessageReactionWithCount(reaction=" + this.a + ", count=" + this.b + ")";
    }
}
