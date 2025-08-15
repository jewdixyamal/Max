package defpackage;

/* renamed from: fbd  reason: default package */
public final class fbd {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final bjd g;
    public final boolean h;

    public fbd(long j, String str, String str2, String str3, String str4, int i, bjd bjd, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = bjd;
        this.h = z;
    }

    public static fbd a(fbd fbd, int i, bjd bjd, boolean z, int i2) {
        long j = fbd.a;
        String str = fbd.b;
        String str2 = fbd.c;
        String str3 = fbd.d;
        String str4 = fbd.e;
        if ((i2 & 64) != 0) {
            bjd = fbd.g;
        }
        bjd bjd2 = bjd;
        if ((i2 & 128) != 0) {
            z = fbd.h;
        }
        fbd.getClass();
        return new fbd(j, str, str2, str3, str4, i, bjd2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbd)) {
            return false;
        }
        fbd fbd = (fbd) obj;
        return this.a == fbd.a && tpa.f(this.b, fbd.b) && tpa.f(this.c, fbd.c) && tpa.f(this.d, fbd.d) && tpa.f(this.e, fbd.e) && this.f == fbd.f && tpa.f(this.g, fbd.g) && this.h == fbd.h;
    }

    public final int hashCode() {
        int d2 = rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int d3 = rh4.d((d2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int g2 = ey8.g(this.f, (d3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        bjd bjd = this.g;
        if (bjd != null) {
            i = bjd.a.hashCode();
        }
        int i2 = (g2 + i) * 31;
        boolean z = this.h;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionState(versionCode=");
        sb.append(this.a);
        sb.append(", versionName=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", sessionUuid=");
        sb.append(this.d);
        sb.append(", processName=");
        sb.append(this.e);
        sb.append(", status=");
        int i = this.f;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NATIVE" : "ANR" : "CRASH" : "BLANK");
        sb.append(", maxSeverity=");
        sb.append(this.g);
        sb.append(", isInBackground=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}
