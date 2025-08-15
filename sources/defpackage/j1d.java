package defpackage;

/* renamed from: j1d  reason: default package */
public final class j1d implements l1d {
    public final jqe a;
    public final long b;
    public final int c = nha.G;

    public j1d(eqe eqe, long j) {
        this.a = eqe;
        this.b = j;
    }

    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1d)) {
            return false;
        }
        j1d j1d = (j1d) obj;
        return tpa.f(this.a, j1d.a) && this.b == j1d.b;
    }

    public final boolean g() {
        return false;
    }

    public final long getItemId() {
        return this.b;
    }

    public final jqe getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return au1.s(4) + h4f.m(k7d.e(1, this.a.hashCode() * 31, 31), 31, this.b);
    }

    public final int l() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(title=");
        sb.append(this.a);
        sb.append(", sectionId=1, itemId=");
        ms2.j(this.b, ", sectionItemType=", "SOLO", sb);
        sb.append(")");
        return sb.toString();
    }

    public final int u() {
        return 1;
    }
}
