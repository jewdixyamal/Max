package defpackage;

/* renamed from: ucb  reason: default package */
public final class ucb extends vcb {
    public final jqe b;
    public final jqe c;
    public final boolean d;
    public final Integer e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ucb(jqe jqe, Integer num, int i) {
        this(jqe, (jqe) null, false, (i & 8) != 0 ? null : num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucb)) {
            return false;
        }
        ucb ucb = (ucb) obj;
        return tpa.f(this.b, ucb.b) && tpa.f(this.c, ucb.c) && this.d == ucb.d && tpa.f(this.e, ucb.e);
    }

    public final int hashCode() {
        int i = 0;
        jqe jqe = this.b;
        int hashCode = (jqe == null ? 0 : jqe.hashCode()) * 31;
        jqe jqe2 = this.c;
        int d2 = ms2.d((hashCode + (jqe2 == null ? 0 : jqe2.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", description=" + this.c + ", showOnTop=" + this.d + ", icon=" + this.e + ")";
    }

    public ucb(jqe jqe, jqe jqe2, boolean z, Integer num) {
        this.b = jqe;
        this.c = jqe2;
        this.d = z;
        this.e = num;
    }
}
