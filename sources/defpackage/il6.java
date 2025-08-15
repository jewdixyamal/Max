package defpackage;

/* renamed from: il6  reason: default package */
public final class il6 implements ol7 {
    public final boolean X;
    public final String Y;
    public final String Z;
    public final long a;
    public final long b;
    public final CharSequence c;
    public final String o;
    public final boolean s0;
    public final CharSequence t0;
    public final int u0;
    public final al6 v0;
    public final long w0;

    public il6(long j, long j2, CharSequence charSequence, String str, boolean z, String str2, String str3, boolean z2, CharSequence charSequence2, int i, al6 al6) {
        this.a = j;
        this.b = j2;
        this.c = charSequence;
        this.o = str;
        this.X = z;
        this.Y = str2;
        this.Z = str3;
        this.s0 = z2;
        this.t0 = charSequence2;
        this.u0 = i;
        this.v0 = al6;
        this.w0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il6)) {
            return false;
        }
        il6 il6 = (il6) obj;
        return this.a == il6.a && this.b == il6.b && tpa.f(this.c, il6.c) && tpa.f(this.o, il6.o) && this.X == il6.X && tpa.f(this.Y, il6.Y) && tpa.f(this.Z, il6.Z) && this.s0 == il6.s0 && tpa.f(this.t0, il6.t0) && this.u0 == il6.u0 && tpa.f(this.v0, il6.v0);
    }

    public final long getItemId() {
        return this.w0;
    }

    public final boolean h(ol7 ol7) {
        return this.w0 == ol7.getItemId();
    }

    public final int hashCode() {
        int f = rh4.f(this.c, h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31);
        String str = this.o;
        return this.v0.hashCode() + ey8.g(this.u0, rh4.f(this.t0, ms2.d(rh4.d(rh4.d(ms2.d((f + (str == null ? 0 : str.hashCode())) * 31, 31, this.X), 31, this.Y), 31, this.Z), 31, this.s0), 31), 31);
    }

    public final int l() {
        return 1;
    }

    public final Object n(Object obj) {
        il6 il6 = (il6) ((ol7) obj);
        kl7 l = j1e.l();
        String str = this.Y;
        String str2 = il6.Y;
        if (!tpa.f(str, str2)) {
            l.add(new fl6(str2));
        }
        if (!tpa.f(this.o, il6.o) || this.b != il6.b || !tpa.f(this.c, il6.c) || this.X != il6.X) {
            l.add(new bl6(il6.b, il6.c, il6.o, il6.X));
        }
        String str3 = this.Z;
        String str4 = il6.Z;
        if (!tpa.f(str3, str4)) {
            l.add(new gl6(str4));
        }
        boolean z = this.s0;
        boolean z2 = il6.s0;
        if (z != z2) {
            l.add(new el6(z2));
        }
        CharSequence charSequence = this.t0;
        CharSequence charSequence2 = il6.t0;
        if (!tpa.f(charSequence, charSequence2)) {
            l.add(new dl6(charSequence2));
        }
        int i = this.u0;
        int i2 = il6.u0;
        if (i != i2) {
            l.add(new cl6(i2));
        }
        return j1e.d(l);
    }

    public final String toString() {
        return "HistoryItemState(id=" + this.a + ", avatarColorId=" + this.b + ", abbreviation=" + this.c + ", avatar=" + this.o + ", isCallLink=" + this.X + ", callName=" + this.Y + ", time=" + this.Z + ", isMissing=" + this.s0 + ", description=" + this.t0 + ", callMediaType=" + rh4.s(this.u0) + ", callType=" + this.v0 + ")";
    }
}
