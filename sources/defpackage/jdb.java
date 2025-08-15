package defpackage;

import java.util.List;

/* renamed from: jdb  reason: default package */
public final class jdb implements ldb {
    public final jqe a;
    public final jqe b;
    public final List c;

    public jdb(jqe jqe, jqe jqe2, List list) {
        this.a = jqe;
        this.b = jqe2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdb)) {
            return false;
        }
        jdb jdb = (jdb) obj;
        return tpa.f(this.a, jdb.a) && tpa.f(this.b, jdb.b) && tpa.f(this.c, jdb.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jqe jqe = this.b;
        return this.c.hashCode() + ((hashCode + (jqe == null ? 0 : jqe.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return au1.i(sb, this.c, ")");
    }
}
