package defpackage;

/* renamed from: ab9  reason: default package */
public final class ab9 implements bb9 {
    public final jqe a;
    public final jqe b;
    public final d3b c;
    public final boolean d;
    public final int e;

    public ab9(jqe jqe, jqe jqe2, d3b d3b, boolean z, int i) {
        this.a = jqe;
        this.b = jqe2;
        this.c = d3b;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab9)) {
            return false;
        }
        ab9 ab9 = (ab9) obj;
        return tpa.f(this.a, ab9.a) && tpa.f(this.b, ab9.b) && this.c == ab9.c && this.d == ab9.d && this.e == ab9.e;
    }

    public final int hashCode() {
        int f = k7d.f(this.a.hashCode() * 31, 31, this.b);
        d3b d3b = this.c;
        return au1.s(this.e) + ms2.d((f + (d3b == null ? 0 : d3b.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", speed=");
        sb.append(this.c);
        sb.append(", isPlaying=");
        sb.append(this.d);
        sb.append(", type=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "VIDEO_MSG" : "AUDIO");
        sb.append(")");
        return sb.toString();
    }
}
