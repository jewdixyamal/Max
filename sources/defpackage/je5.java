package defpackage;

/* renamed from: je5  reason: default package */
public final class je5 {
    public final long a;
    public final long b;
    public final ne5 c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;

    public je5(long j2, long j3, ne5 ne5, String str, String str2, long j4, long j5, String str3, long j6, String str4, String str5, boolean z, boolean z2) {
        this.a = j2;
        this.b = j3;
        this.c = ne5;
        this.d = str;
        this.e = str2;
        this.f = j4;
        this.g = j5;
        this.h = str3;
        this.i = j6;
        this.j = str4;
        this.k = str5;
        this.l = z;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je5)) {
            return false;
        }
        je5 je5 = (je5) obj;
        return this.a == je5.a && this.b == je5.b && this.c == je5.c && tpa.f(this.d, je5.d) && tpa.f(this.e, je5.e) && this.f == je5.f && this.g == je5.g && tpa.f(this.h, je5.h) && this.i == je5.i && tpa.f(this.j, je5.j) && tpa.f(this.k, je5.k) && this.l == je5.l && this.m == je5.m;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + h4f.m(Long.hashCode(this.a) * 31, 31, this.b)) * 31;
        int i2 = 0;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int m2 = h4f.m(rh4.d(h4f.m(h4f.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str3 = this.j;
        int hashCode3 = (m2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return Boolean.hashCode(this.m) + ms2.d((hashCode3 + i2) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sb.getClass().getSimpleName());
        sb.append('(');
        sb.append("pushId=");
        sb.append(this.i);
        sb.append(",sender=");
        sb.append(this.f);
        sb.append(",chatServerId=");
        sb.append(this.a);
        sb.append(",messageId=");
        sb.append(this.b);
        sb.append(",type=");
        sb.append(this.c);
        sb.append(",time=");
        sb.append(this.g);
        sb.append(",hasText=");
        return au1.j(sb, this.h.length() > 0, ")");
    }
}
