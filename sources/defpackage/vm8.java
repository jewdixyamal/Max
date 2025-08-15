package defpackage;

import android.os.Parcelable;

/* renamed from: vm8  reason: default package */
public final class vm8 extends xm8 {
    public final String X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final int s0 = 2;

    public vm8(long j, long j2, long j3, String str, String str2, CharSequence charSequence, CharSequence charSequence2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.X = str2;
        this.Y = charSequence;
        this.Z = charSequence2;
        Parcelable.Creator<ih2> creator = ih2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm8)) {
            return false;
        }
        vm8 vm8 = (vm8) obj;
        return this.a == vm8.a && this.b == vm8.b && this.c == vm8.c && tpa.f(this.o, vm8.o) && tpa.f(this.X, vm8.X) && tpa.f(this.Y, vm8.Y) && tpa.f(this.Z, vm8.Z);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int m = h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.o;
        int d = rh4.d((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.X);
        CharSequence charSequence = this.Y;
        int hashCode = (d + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.Z;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return hashCode + i;
    }

    public final long i() {
        return this.c;
    }

    public final long j() {
        return this.b;
    }

    public final int l() {
        return this.s0;
    }

    public final String toString() {
        return "Link(itemId=" + this.a + ", messageId=" + this.b + ", attachId=" + this.c + ", previewUrl=" + this.o + ", title=" + this.X + ", subtitle=" + this.Y + ", link=" + this.Z + ")";
    }
}
