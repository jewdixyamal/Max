package defpackage;

import java.util.Set;

/* renamed from: qs9  reason: default package */
public final class qs9 extends gle {
    public final boolean X;
    public final f52 c;
    public final Set o;

    public qs9(f52 f52, Set set, boolean z) {
        this.c = f52;
        this.o = set;
        this.X = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs9)) {
            return false;
        }
        qs9 qs9 = (qs9) obj;
        return tpa.f(this.c, qs9.c) && tpa.f(this.o, qs9.o) && this.X == qs9.X;
    }

    public final int hashCode() {
        int hashCode = this.o.hashCode();
        return Boolean.hashCode(this.X) + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(chat=");
        sb.append(this.c);
        sb.append(", messageIds=");
        sb.append(this.o);
        sb.append(", isTtl=");
        return au1.j(sb, this.X, ")");
    }
}
