package defpackage;

import java.util.Set;

/* renamed from: yy8  reason: default package */
public final class yy8 {
    public final Set a;
    public final Long b;
    public final boolean c;

    public yy8(Set set, Long l, boolean z) {
        this.a = set;
        this.b = l;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy8)) {
            return false;
        }
        yy8 yy8 = (yy8) obj;
        return tpa.f(this.a, yy8.a) && tpa.f(this.b, yy8.b) && this.c == yy8.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForwardIds(messageIds=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", isForwardAttach=");
        return au1.j(sb, this.c, ")");
    }
}
