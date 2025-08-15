package defpackage;

/* renamed from: puf  reason: default package */
public final class puf {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public puf(long j, long j2, long j3, String str, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    public static puf a(puf puf, boolean z, boolean z2, int i) {
        String str = (i & 8) != 0 ? puf.d : null;
        if ((i & 16) != 0) {
            z = puf.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = puf.f;
        }
        return new puf(puf.a, puf.b, puf.c, str, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puf)) {
            return false;
        }
        puf puf = (puf) obj;
        return this.a == puf.a && this.b == puf.b && this.c == puf.c && tpa.f(this.d, puf.d) && this.e == puf.e && this.f == puf.f;
    }

    public final int hashCode() {
        int m = h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + ms2.d((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppBiometryEntity(id=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(", botId=");
        sb.append(this.c);
        sb.append(", token=");
        sb.append(this.d);
        sb.append(", accessRequested=");
        sb.append(this.e);
        sb.append(", accessGranted=");
        return au1.j(sb, this.f, ")");
    }

    public puf(long j, long j2, boolean z) {
        this(0, j, j2, (String) null, true, z);
    }
}
