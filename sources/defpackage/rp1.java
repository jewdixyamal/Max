package defpackage;

import java.util.List;

/* renamed from: rp1  reason: default package */
public final class rp1 implements up1 {
    public final jqe a;
    public final jqe b;
    public final List c;
    public final long d;

    public rp1(gqe gqe, iqe iqe, kl7 kl7, long j) {
        this.a = gqe;
        this.b = iqe;
        this.c = kl7;
        this.d = j;
    }

    public final long a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp1)) {
            return false;
        }
        rp1 rp1 = (rp1) obj;
        return tpa.f(this.a, rp1.a) && tpa.f(this.b, rp1.b) && tpa.f(this.c, rp1.c) && this.d == rp1.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + k7d.g(this.c, k7d.f(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "Multi(title=" + this.a + ", subtitle=" + this.b + ", avatarInfo=" + this.c + ", lastUpdate=" + this.d + ")";
    }
}
