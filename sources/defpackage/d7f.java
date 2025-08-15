package defpackage;

import java.util.Objects;

/* renamed from: d7f  reason: default package */
public final class d7f {
    public final String a;
    public final long b;
    public final int c;
    public final String d;

    public d7f(gk8 gk8) {
        this.a = (String) gk8.c;
        this.b = gk8.a;
        this.c = gk8.b;
        this.d = (String) gk8.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d7f.class != obj.getClass()) {
            return false;
        }
        d7f d7f = (d7f) obj;
        if (this.b != d7f.b) {
            return false;
        }
        String str = d7f.a;
        String str2 = this.a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        if (!Objects.equals(this.d, d7f.d)) {
            return false;
        }
        return this.c == d7f.c;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.b;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i3 = this.c;
        int s = (i2 + (i3 != 0 ? au1.s(i3) : 0)) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return s + i;
    }

    public final String toString() {
        return "UploadData{path='" + this.a + "'attachLocalId='" + this.d + "', lastModified=" + this.b + ", uploadType=" + h4f.t(this.c) + '}';
    }
}
