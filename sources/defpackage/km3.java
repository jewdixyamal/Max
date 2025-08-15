package defpackage;

/* renamed from: km3  reason: default package */
public final class km3 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final pl3 e;

    public km3(long j, long j2, int i, int i2, pl3 pl3) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = pl3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km3)) {
            return false;
        }
        km3 km3 = (km3) obj;
        return this.a == km3.a && this.b == km3.b && this.c == km3.c && this.d == km3.d && tpa.f(this.e, km3.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k7d.e(this.d, k7d.e(this.c, h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        return "ContactEntity(id=" + this.a + ", serverId=" + this.b + ", presence=" + this.c + ", presenceType=" + this.d + ", contactData=" + this.e + ")";
    }
}
