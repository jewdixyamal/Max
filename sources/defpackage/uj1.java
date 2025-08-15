package defpackage;

/* renamed from: uj1  reason: default package */
public final class uj1 extends wj1 {
    public final jqe D;
    public final Integer E;

    public uj1(jqe jqe, Integer num) {
        this.D = jqe;
        this.E = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj1)) {
            return false;
        }
        uj1 uj1 = (uj1) obj;
        uj1.getClass();
        return tpa.f(this.D, uj1.D) && tpa.f(this.E, uj1.E);
    }

    public final int hashCode() {
        int f = k7d.f(dj1.a.hashCode() * 31, 31, this.D);
        Integer num = this.E;
        return f + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(priority=" + dj1.a + ", textSource=" + this.D + ", icon=" + this.E + ")";
    }
}
