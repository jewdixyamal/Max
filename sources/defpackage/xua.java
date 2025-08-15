package defpackage;

/* renamed from: xua  reason: default package */
public final class xua {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;

    public xua(long j2, long j3, int i2, String str, long j4, String str2, String str3, String str4, String str5, int i3) {
        this.a = j2;
        this.b = j3;
        this.c = i2;
        this.d = str;
        this.e = j4;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xua)) {
            return false;
        }
        xua xua = (xua) obj;
        return this.a == xua.a && this.b == xua.b && this.c == xua.c && tpa.f(this.d, xua.d) && this.e == xua.e && tpa.f(this.f, xua.f) && tpa.f(this.g, xua.g) && tpa.f(this.h, xua.h) && tpa.f(this.i, xua.i) && this.j == xua.j;
    }

    public final int hashCode() {
        int m = h4f.m(rh4.d(k7d.e(this.c, h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        int i2 = 0;
        String str = this.f;
        int d2 = rh4.d((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int hashCode = (d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return au1.s(this.j) + ((hashCode + i2) * 31);
    }

    public final String toString() {
        return "PhoneEntity(id=" + this.a + ", phonebookId=" + this.b + ", contactId=" + this.c + ", phone=" + this.d + ", serverPhone=" + this.e + ", email=" + this.f + ", firstName=" + this.g + ", lastName=" + this.h + ", avatarPath=" + this.i + ", type=" + ey8.q(this.j) + ")";
    }
}
