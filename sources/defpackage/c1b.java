package defpackage;

/* renamed from: c1b  reason: default package */
public final class c1b implements d1b {
    public final long a;
    public final jqe b;
    public final boolean c;

    public c1b(long j, iqe iqe, boolean z) {
        this.a = j;
        this.b = iqe;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1b)) {
            return false;
        }
        c1b c1b = (c1b) obj;
        return this.a == c1b.a && tpa.f(this.b, c1b.b) && this.c == c1b.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k7d.f(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "State(messageId=" + this.a + ", text=" + this.b + ", canClose=" + this.c + ")";
    }
}
