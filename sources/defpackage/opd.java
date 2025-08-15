package defpackage;

/* renamed from: opd  reason: default package */
public final class opd implements ol7 {
    public final jqe a;
    public final jqe b;
    public final long c;
    public final int o = f4a.a;

    public opd(int i, eqe eqe, iqe iqe) {
        this.a = eqe;
        this.b = iqe;
        this.c = (long) i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opd)) {
            return false;
        }
        opd opd = (opd) obj;
        opd.getClass();
        int i = f4a.a;
        return tpa.f(this.a, opd.a) && tpa.f(this.b, opd.b);
    }

    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + k7d.f(Integer.hashCode(f4a.b) * 31, 31, this.a);
    }

    public final int l() {
        return this.o;
    }

    public final String toString() {
        return "SimpleActionItem(id=" + f4a.b + ", title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
