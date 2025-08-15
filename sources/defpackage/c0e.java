package defpackage;

/* renamed from: c0e  reason: default package */
public final class c0e {
    public final long a;
    public final int b;
    public final ms7 c;
    public final boolean d;

    public c0e(int i, long j, ms7 ms7, boolean z) {
        this.a = j;
        this.b = i;
        this.c = ms7;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0e)) {
            return false;
        }
        c0e c0e = (c0e) obj;
        return this.a == c0e.a && this.b == c0e.b && tpa.f(this.c, c0e.c) && this.d == c0e.d;
    }

    public final int hashCode() {
        int g = ey8.g(this.b, Long.hashCode(this.a) * 31, 31);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + g) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatEntity(id=");
        sb.append(this.a);
        sb.append(", status=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "SENDING" : "WAITING");
        sb.append(", data=");
        sb.append(this.c);
        sb.append(", isCritical=");
        return au1.j(sb, this.d, ")");
    }
}
