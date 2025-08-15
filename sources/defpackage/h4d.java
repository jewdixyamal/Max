package defpackage;

/* renamed from: h4d  reason: default package */
public final class h4d extends j4d {
    public final String b;
    public final long c;
    public final int d;

    public h4d(long j, String str, int i) {
        super(str);
        this.b = str;
        this.c = j;
        this.d = i;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4d)) {
            return false;
        }
        h4d h4d = (h4d) obj;
        return tpa.f(this.b, h4d.b) && this.c == h4d.c && this.d == h4d.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + h4f.m(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Neuro(uri=");
        sb.append(this.b);
        sb.append(", photoId=");
        sb.append(this.c);
        sb.append(", categoryId=");
        return zr6.j(sb, this.d, ")");
    }
}
