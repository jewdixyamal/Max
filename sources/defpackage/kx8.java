package defpackage;

import java.util.List;

/* renamed from: kx8  reason: default package */
public final class kx8 {
    public final List a;
    public final ix8 b;
    public final ex8 c;
    public final long d;

    public kx8(List list, ix8 ix8, ex8 ex8, long j) {
        this.a = list;
        this.b = ix8;
        this.c = ex8;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx8)) {
            return false;
        }
        kx8 kx8 = (kx8) obj;
        return tpa.f(this.a, kx8.a) && tpa.f(this.b, kx8.b) && tpa.f(this.c, kx8.c) && this.d == kx8.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        ix8 ix8 = this.b;
        int hashCode2 = (hashCode + (ix8 == null ? 0 : ix8.hashCode())) * 31;
        ex8 ex8 = this.c;
        if (ex8 != null) {
            i = ex8.hashCode();
        }
        return Long.hashCode(this.d) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        return "MessageReactionsDetailedData(reactionEntries=" + this.a + ", reactionsInfo=" + this.b + ", yourReactionEntry=" + this.c + ", markerForNextQuery=" + this.d + ")";
    }
}
