package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fx8  reason: default package */
public final class fx8 implements Serializable {
    public final List a;
    public final int b;
    public final bx8 c;

    public fx8(ArrayList arrayList, int i, bx8 bx8) {
        this.a = arrayList;
        this.b = i;
        this.c = bx8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx8)) {
            return false;
        }
        fx8 fx8 = (fx8) obj;
        return tpa.f(this.a, fx8.a) && this.b == fx8.b && tpa.f(this.c, fx8.c);
    }

    public final int hashCode() {
        int e = k7d.e(this.b, this.a.hashCode() * 31, 31);
        bx8 bx8 = this.c;
        return e + (bx8 == null ? 0 : bx8.hashCode());
    }

    public final String toString() {
        return "MessageReactionInfo(counters=" + this.a + ", totalCount=" + this.b + ", yourReaction=" + this.c + ")";
    }
}
