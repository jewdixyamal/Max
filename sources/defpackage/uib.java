package defpackage;

/* renamed from: uib  reason: default package */
public final class uib extends vib {
    public final ycb a;
    public final int b;

    public uib(ycb ycb, int i) {
        this.a = ycb;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uib)) {
            return false;
        }
        uib uib = (uib) obj;
        return tpa.f(this.a, uib.a) && lz7.i(this.b, uib.b);
    }

    public final long getItemId() {
        return this.a.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + ey8.g(1, this.a.hashCode() * 31, 31);
    }

    public final int l() {
        return this.b;
    }

    public final String toString() {
        String U = lz7.U(this.b);
        StringBuilder sb = new StringBuilder("Result(cellModel=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append("CHAT");
        sb.append(", itemViewType=");
        return zr6.l(sb, U, ")");
    }
}
