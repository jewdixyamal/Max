package defpackage;

import java.util.List;

/* renamed from: ix8  reason: default package */
public final class ix8 {
    public final List a;
    public final int b;
    public final c6c c;

    public ix8(List list, int i, c6c c6c) {
        this.a = list;
        this.b = i;
        this.c = c6c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix8)) {
            return false;
        }
        ix8 ix8 = (ix8) obj;
        return tpa.f(this.a, ix8.a) && this.b == ix8.b && tpa.f(this.c, ix8.c);
    }

    public final int hashCode() {
        int e = k7d.e(this.b, this.a.hashCode() * 31, 31);
        c6c c6c = this.c;
        return e + (c6c == null ? 0 : c6c.hashCode());
    }

    public final String toString() {
        return "MessageReactionsData(reactions=" + this.a + ", totalCount=" + this.b + ", yourReaction=" + this.c + ")";
    }
}
