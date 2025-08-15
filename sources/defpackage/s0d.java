package defpackage;

/* renamed from: s0d  reason: default package */
public final class s0d implements efb {
    public final int X;
    public final jqe a;
    public final m56 b;
    public final kqe c;
    public final int o;

    public s0d(jqe jqe, kqe kqe, int i, int i2) {
        w8c w8c = new w8c(3);
        kqe = (i2 & 4) != 0 ? i4f.u : kqe;
        i = (i2 & 8) != 0 ? 2048 : i;
        this.a = jqe;
        this.b = w8c;
        this.c = kqe;
        this.o = i;
        this.X = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0d)) {
            return false;
        }
        s0d s0d = (s0d) obj;
        return tpa.f(this.a, s0d.a) && tpa.f(this.b, s0d.b) && tpa.f(this.c, s0d.c) && dy7.o(this.o, s0d.o);
    }

    public final long getItemId() {
        return (long) this.o;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Integer.hashCode(this.o) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final int l() {
        return this.X;
    }

    public final String toString() {
        String J = dy7.J(this.o);
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ", itemViewType=" + J + ")";
    }
}
