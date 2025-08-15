package defpackage;

/* renamed from: g01  reason: default package */
public final class g01 implements h01 {
    public final jqe a;
    public final jqe b = null;
    public final int c = y7a.e;

    public g01(eqe eqe) {
        int i = z7a.c;
        this.a = eqe;
    }

    public final int a() {
        return 4;
    }

    public final jqe b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g01)) {
            return false;
        }
        g01 g01 = (g01) obj;
        if (!tpa.f(this.a, g01.a)) {
            return false;
        }
        long j = z7a.a;
        return j == j && tpa.f(this.b, g01.b);
    }

    public final boolean g() {
        return false;
    }

    public final long getItemId() {
        return z7a.a;
    }

    public final jqe getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int i = 0;
        int g = ey8.g(4, h4f.m(k7d.e(0, this.a.hashCode() * 31, 31), 31, z7a.a), 31);
        jqe jqe = this.b;
        if (jqe != null) {
            i = jqe.hashCode();
        }
        return g + i;
    }

    public final int l() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderBottom(title=");
        sb.append(this.a);
        sb.append(", sectionId=0, itemId=");
        ms2.j(z7a.a, ", sectionItemType=", "SOLO", sb);
        sb.append(", descriptionRes=");
        return rh4.l(sb, this.b, ")");
    }

    public final int u() {
        return 0;
    }
}
