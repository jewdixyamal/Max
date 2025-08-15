package defpackage;

/* renamed from: jn8  reason: default package */
public final class jn8 implements ol7 {
    public final boolean X;
    public final long Y;
    public final CharSequence Z;
    public final long a;
    public final CharSequence b;
    public final jqe c;
    public final String o;
    public final v5c s0;
    public final boolean t0;
    public final boolean u0;

    public jn8(long j, CharSequence charSequence, jqe jqe, String str, boolean z, long j2, CharSequence charSequence2, v5c v5c, boolean z2, boolean z3) {
        this.a = j;
        this.b = charSequence;
        this.c = jqe;
        this.o = str;
        this.X = z;
        this.Y = j2;
        this.Z = charSequence2;
        this.s0 = v5c;
        this.t0 = z2;
        this.u0 = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn8)) {
            return false;
        }
        jn8 jn8 = (jn8) obj;
        return this.a == jn8.a && tpa.f(this.b, jn8.b) && tpa.f(this.c, jn8.c) && tpa.f(this.o, jn8.o) && this.X == jn8.X && this.Y == jn8.Y && tpa.f(this.Z, jn8.Z) && tpa.f(this.s0, jn8.s0) && this.t0 == jn8.t0 && this.u0 == jn8.u0;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int f = rh4.f(this.Z, h4f.m(ms2.d(rh4.d(k7d.f(rh4.f(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.o), 31, this.X), 31, this.Y), 31);
        v5c v5c = this.s0;
        return Boolean.hashCode(this.u0) + ms2.d((f + (v5c == null ? 0 : v5c.hashCode())) * 31, 31, this.t0);
    }

    public final int l() {
        return mda.F;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        if (!(ol7 instanceof jn8)) {
            return null;
        }
        v5c v5c = this.s0;
        v5c v5c2 = ((jn8) ol7).s0;
        if (!tpa.f(v5c, v5c2)) {
            return new in8(v5c2);
        }
        return null;
    }

    public final String toString() {
        return "MemberListItem(id=" + this.a + ", name=" + this.b + ", subtitle=" + this.c + ", avatar=" + this.o + ", isOnline=" + this.X + ", lastReadMark=" + this.Y + ", abbreviation=" + this.Z + ", reaction=" + this.s0 + ", isRead=" + this.t0 + ", isSelf=" + this.u0 + ")";
    }
}
