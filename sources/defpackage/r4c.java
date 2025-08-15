package defpackage;

import android.net.Uri;

/* renamed from: r4c  reason: default package */
public final class r4c {
    public final long a;
    public final long b;
    public final String c;
    public int d;

    public r4c(long j, String str, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final r4c a(r4c r4c, String str) {
        long j;
        r4c r4c2 = r4c;
        String str2 = str;
        String R = mr0.R(str2, this.c);
        if (r4c2 == null || !R.equals(mr0.R(str2, r4c2.c))) {
            return null;
        }
        long j2 = this.b;
        long j3 = -1;
        int i = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
        long j4 = r4c2.b;
        if (i != 0) {
            long j5 = this.a;
            j = j2;
            if (j5 + j2 == r4c2.a) {
                if (j4 != -1) {
                    j3 = j + j4;
                }
                return new r4c(j5, R, j3);
            }
        } else {
            j = j2;
        }
        if (j4 != -1) {
            long j6 = r4c2.a;
            if (j6 + j4 == this.a) {
                if (j != -1) {
                    j3 = j4 + j;
                }
                return new r4c(j6, R, j3);
            }
        }
        return null;
    }

    public final Uri b(String str) {
        return mr0.S(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r4c.class != obj.getClass()) {
            return false;
        }
        r4c r4c = (r4c) obj;
        return this.a == r4c.a && this.b == r4c.b && this.c.equals(r4c.c);
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode() + ((((527 + ((int) this.a)) * 31) + ((int) this.b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RangedUri(referenceUri=");
        sb.append(this.c);
        sb.append(", start=");
        sb.append(this.a);
        sb.append(", length=");
        return zr6.k(sb, this.b, ")");
    }
}
