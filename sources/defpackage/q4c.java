package defpackage;

import android.net.Uri;

/* renamed from: q4c  reason: default package */
public final class q4c {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public q4c(long j, String str, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final q4c a(q4c q4c, String str) {
        long j;
        q4c q4c2 = q4c;
        String str2 = str;
        String D = kq0.D(str2, this.c);
        if (q4c2 == null || !D.equals(kq0.D(str2, q4c2.c))) {
            return null;
        }
        long j2 = this.b;
        long j3 = -1;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        long j4 = q4c2.b;
        if (i != 0) {
            long j5 = this.a;
            j = j2;
            if (j5 + j2 == q4c2.a) {
                if (j4 != -1) {
                    j3 = j + j4;
                }
                return new q4c(j5, D, j3);
            }
        } else {
            j = j2;
        }
        if (j4 != -1) {
            long j6 = q4c2.a;
            if (j6 + j4 == this.a) {
                if (j != -1) {
                    j3 = j4 + j;
                }
                return new q4c(j6, D, j3);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return kq0.F(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q4c.class != obj.getClass()) {
            return false;
        }
        q4c q4c = (q4c) obj;
        return this.a == q4c.a && this.b == q4c.b && this.c.equals(q4c.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        String str = this.c;
        StringBuilder sb = new StringBuilder(rh4.e(81, str));
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return zr6.k(sb, this.b, ")");
    }
}
