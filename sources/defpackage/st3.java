package defpackage;

/* renamed from: st3  reason: default package */
public final class st3 {
    public final jqe a;
    public final Integer b;
    public final rme c;
    public final rme d;
    public final k56 e;

    public st3(jqe jqe, Integer num, rme rme, rme rme2, k56 k56) {
        this.a = jqe;
        this.b = num;
        this.c = rme;
        this.d = rme2;
        this.e = k56;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st3)) {
            return false;
        }
        st3 st3 = (st3) obj;
        return tpa.f(this.a, st3.a) && tpa.f(this.b, st3.b) && this.c == st3.c && this.d == st3.d && tpa.f(this.e, st3.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.c.hashCode();
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContextMenuAction(title=" + this.a + ", icon=" + this.b + ", iconColor=" + this.c + ", titleColor=" + this.d + ", clickAction=" + this.e + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st3(eqe eqe, Integer num, k56 k56, int i) {
        this(eqe, (i & 2) != 0 ? null : num, rme.u0, rme.D0, k56);
    }
}
