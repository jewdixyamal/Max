package defpackage;

import java.util.List;

/* renamed from: q3e  reason: default package */
public final class q3e {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final List h;
    public final boolean i;

    public q3e(k3e k3e) {
        this.a = k3e.a;
        this.b = k3e.b;
        this.c = k3e.c;
        this.d = k3e.d;
        this.e = k3e.e;
        this.f = k3e.f;
        this.g = k3e.g;
        this.h = k3e.h;
        this.i = k3e.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q3e.class != obj.getClass()) {
            return false;
        }
        q3e q3e = (q3e) obj;
        if (this.a != q3e.a || this.d != q3e.d || this.e != q3e.e || this.f != q3e.f || this.i != q3e.i) {
            return false;
        }
        String str = q3e.b;
        String str2 = this.b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = q3e.c;
        String str4 = this.c;
        if (str4 == null ? str3 != null : !str4.equals(str3)) {
            return false;
        }
        if (!this.g.equals(q3e.g)) {
            return false;
        }
        return this.h.equals(q3e.h);
    }

    public final int hashCode() {
        long j = this.a;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        int i3 = 0;
        String str = this.b;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        long j2 = this.d;
        long j3 = this.e;
        long j4 = this.f;
        return ((this.h.hashCode() + rh4.d((((((((hashCode + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.g)) * 31) + (this.i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSetData{id=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', iconUrl='");
        sb.append(this.c);
        sb.append("', authorId=");
        sb.append(this.d);
        sb.append(", createTime=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", link='");
        sb.append(this.g);
        sb.append("', stickers=");
        sb.append(this.h);
        sb.append(", draft=");
        return au1.j(sb, this.i, "}");
    }
}
