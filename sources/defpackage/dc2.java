package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: dc2  reason: default package */
public final class dc2 extends gle {
    public final Set X;
    public final List c;
    public final f52 o;

    public dc2(List list, f52 f52, LinkedHashSet linkedHashSet) {
        this.c = list;
        this.o = f52;
        this.X = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc2)) {
            return false;
        }
        dc2 dc2 = (dc2) obj;
        return tpa.f(this.c, dc2.c) && tpa.f(this.o, dc2.o) && tpa.f(this.X, dc2.X);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        f52 f52 = this.o;
        return this.X.hashCode() + ((hashCode + (f52 == null ? 0 : f52.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatHistory.Response(messages=");
        sb.append(x53.n0(this.c, ",", "[", "]", new we1(9), 24));
        sb.append(", chat=");
        sb.append(this.o);
        if (this.c.isEmpty()) {
            sb.append(", messageIds=");
            sb.append(this.X);
        }
        sb.append(")");
        return sb.toString();
    }
}
