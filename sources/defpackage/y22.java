package defpackage;

/* renamed from: y22  reason: default package */
public final class y22 extends wm9 {
    public final jqe b;
    public final jqe c;
    public final long d;

    public y22(eqe eqe, gqe gqe, long j) {
        super(e5f.a);
        this.b = eqe;
        this.c = gqe;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y22)) {
            return false;
        }
        y22 y22 = (y22) obj;
        return tpa.f(this.b, y22.b) && tpa.f(this.c, y22.c) && this.d == y22.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + k7d.f(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowChangeOwnerBottomSheetEvent(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", contactId=");
        return zr6.k(sb, this.d, ")");
    }
}
