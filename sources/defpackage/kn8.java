package defpackage;

import android.net.Uri;

/* renamed from: kn8  reason: default package */
public final class kn8 implements ol7 {
    public final Uri X;
    public final CharSequence Y;
    public final boolean Z;
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final jqe o;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final int w0;
    public final jqe x0;

    public kn8(long j, CharSequence charSequence, CharSequence charSequence2, jqe jqe, Uri uri, CharSequence charSequence3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, jqe jqe2) {
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = jqe;
        this.X = uri;
        this.Y = charSequence3;
        this.Z = z;
        this.s0 = z2;
        this.t0 = z3;
        this.u0 = z4;
        this.v0 = z5;
        this.w0 = i;
        this.x0 = jqe2;
    }

    public static kn8 k(kn8 kn8, boolean z) {
        kn8 kn82 = kn8;
        return new kn8(kn82.a, kn82.b, kn82.c, kn82.o, kn82.X, kn82.Y, kn82.Z, kn82.s0, z, kn82.u0, kn82.v0, kn82.w0, kn82.x0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn8)) {
            return false;
        }
        kn8 kn8 = (kn8) obj;
        return this.a == kn8.a && tpa.f(this.b, kn8.b) && tpa.f(this.c, kn8.c) && tpa.f(this.o, kn8.o) && tpa.f(this.X, kn8.X) && tpa.f(this.Y, kn8.Y) && this.Z == kn8.Z && this.s0 == kn8.s0 && this.t0 == kn8.t0 && this.u0 == kn8.u0 && this.v0 == kn8.v0 && this.w0 == kn8.w0 && tpa.f(this.x0, kn8.x0);
    }

    public final long getItemId() {
        return this.a;
    }

    public final boolean h(ol7 ol7) {
        return this.a == ol7.getItemId();
    }

    public final int hashCode() {
        int f = rh4.f(this.b, Long.hashCode(this.a) * 31, 31);
        int i = 0;
        CharSequence charSequence = this.c;
        int f2 = k7d.f((f + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.o);
        Uri uri = this.X;
        int e = k7d.e(this.w0, ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(rh4.f(this.Y, (f2 + (uri == null ? 0 : uri.hashCode())) * 31, 31), 31, this.Z), 31, this.s0), 31, this.t0), 31, this.u0), 31, this.v0), 31);
        jqe jqe = this.x0;
        if (jqe != null) {
            i = jqe.hashCode();
        }
        return e + i;
    }

    public final int l() {
        return 1;
    }

    public final String toString() {
        return "MemberListItem(id=" + this.a + ", name=" + this.b + ", shortName=" + this.c + ", subtitle=" + this.o + ", avatar=" + this.X + ", abbreviation=" + this.Y + ", isVerified=" + this.Z + ", isSelf=" + this.s0 + ", isOwner=" + this.t0 + ", isEnabled=" + this.u0 + ", isSelectable=" + this.v0 + ", presence=" + this.w0 + ", alias=" + this.x0 + ")";
    }
}
