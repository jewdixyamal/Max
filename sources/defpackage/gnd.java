package defpackage;

import java.util.List;

/* renamed from: gnd  reason: default package */
public final class gnd extends tt2 {
    public final long a;
    public final jqe b;
    public final jqe c;
    public final List d;

    public gnd(long j, jqe jqe, jqe jqe2, List list) {
        this.a = j;
        this.b = jqe;
        this.c = jqe2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnd)) {
            return false;
        }
        gnd gnd = (gnd) obj;
        return this.a == gnd.a && tpa.f(this.b, gnd.b) && tpa.f(this.c, gnd.c) && tpa.f(this.d, gnd.d);
    }

    public final int hashCode() {
        int f = k7d.f(Long.hashCode(this.a) * 31, 31, this.b);
        jqe jqe = this.c;
        return this.d.hashCode() + ((f + (jqe == null ? 0 : jqe.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(chatId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
