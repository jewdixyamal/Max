package defpackage;

/* renamed from: i1d  reason: default package */
public final class i1d implements l1d {
    public final jqe a;
    public final long b;
    public final jqe c;
    public final int o = nha.F;

    public i1d(eqe eqe, long j, iqe iqe) {
        this.a = eqe;
        this.b = j;
        this.c = iqe;
    }

    public final int a() {
        return 3;
    }

    public final jqe b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1d)) {
            return false;
        }
        i1d i1d = (i1d) obj;
        return tpa.f(this.a, i1d.a) && this.b == i1d.b && tpa.f(this.c, i1d.c);
    }

    public final long getItemId() {
        return this.b;
    }

    public final jqe getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int g = ey8.g(3, h4f.m(k7d.e(1, this.a.hashCode() * 31, 31), 31, this.b), 31);
        jqe jqe = this.c;
        return g + (jqe == null ? 0 : jqe.hashCode());
    }

    public final int l() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClearCacheButton(title=");
        sb.append(this.a);
        sb.append(", sectionId=1, itemId=");
        ms2.j(this.b, ", sectionItemType=", "LAST", sb);
        sb.append(", descriptionRes=");
        return rh4.l(sb, this.c, ")");
    }

    public final int u() {
        return 1;
    }
}
