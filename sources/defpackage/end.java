package defpackage;

import java.util.List;

/* renamed from: end  reason: default package */
public final class end extends ln3 {
    public final long a;
    public final jqe b;
    public final jqe c;
    public final List d;

    public end(long j, jqe jqe, eqe eqe, List list) {
        this.a = j;
        this.b = jqe;
        this.c = eqe;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof end)) {
            return false;
        }
        end end = (end) obj;
        return this.a == end.a && tpa.f(this.b, end.b) && tpa.f(this.c, end.c) && tpa.f(this.d, end.d);
    }

    public final int hashCode() {
        int f = k7d.f(Long.hashCode(this.a) * 31, 31, this.b);
        jqe jqe = this.c;
        return this.d.hashCode() + ((f + (jqe == null ? 0 : jqe.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(contactServerId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
