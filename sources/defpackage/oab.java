package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: oab  reason: default package */
public final class oab {
    public final long a;
    public final Map b;
    public final List c;
    public final uj3 d;

    public oab(long j, Map map, List list, uj3 uj3) {
        this.a = j;
        this.b = map;
        this.c = list;
        this.d = uj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oab)) {
            return false;
        }
        oab oab = (oab) obj;
        return this.a == oab.a && tpa.f(this.b, oab.b) && tpa.f(this.c, oab.c) && tpa.f(this.d, oab.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.d.hashCode() + k7d.g(this.c, (hashCode + (Long.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "Profile(serverId=" + this.a + ", restrictions=" + this.b + ", profileOptions=" + this.c + ", contact=" + this.d + ")";
    }
}
