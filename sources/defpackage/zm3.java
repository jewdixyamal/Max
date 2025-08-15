package defpackage;

/* renamed from: zm3  reason: default package */
public final class zm3 implements efb {
    public final boolean X;
    public final CharSequence Y;
    public final rdb Z;
    public final long a;
    public final String b;
    public final jqe c;
    public final String o;
    public final int s0;
    public final boolean t0;

    public zm3(long j, String str, jqe jqe, String str2, boolean z, CharSequence charSequence, rdb rdb, int i, boolean z2, int i2) {
        i = (i2 & 128) != 0 ? 32768 : i;
        z2 = (i2 & 256) != 0 ? false : z2;
        this.a = j;
        this.b = str;
        this.c = jqe;
        this.o = str2;
        this.X = z;
        this.Y = charSequence;
        this.Z = rdb;
        this.s0 = i;
        this.t0 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm3)) {
            return false;
        }
        zm3 zm3 = (zm3) obj;
        return this.a == zm3.a && tpa.f(this.b, zm3.b) && tpa.f(this.c, zm3.c) && tpa.f(this.o, zm3.o) && this.X == zm3.X && tpa.f(this.Y, zm3.Y) && this.Z == zm3.Z && dy7.o(this.s0, zm3.s0) && this.t0 == zm3.t0;
    }

    public final long getItemId() {
        return this.a;
    }

    public final boolean h(ol7 ol7) {
        return this.a == ol7.getItemId();
    }

    public final int hashCode() {
        int f = rh4.f(this.Y, ms2.d(rh4.d(k7d.f(rh4.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o), 31, this.X), 31);
        return Boolean.hashCode(this.t0) + k7d.e(this.s0, (this.Z.hashCode() + f) * 31, 31);
    }

    public final int l() {
        return this.s0;
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        String J = dy7.J(this.s0);
        StringBuilder sb = new StringBuilder("ContactInfoItem(id=");
        sb.append(this.a);
        sb.append(", fullName=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.o);
        sb.append(", isOnline=");
        sb.append(this.X);
        sb.append(", abbreviation=");
        sb.append(this.Y);
        sb.append(", type=");
        sb.append(this.Z);
        sb.append(", itemViewType=");
        sb.append(J);
        sb.append(", newPermissions=");
        return au1.j(sb, this.t0, ")");
    }
}
