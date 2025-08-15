package defpackage;

import android.os.Parcelable;

/* renamed from: um8  reason: default package */
public final class um8 extends xm8 {
    public final String X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final long a;
    public final long b;
    public final long c;
    public final String o;
    public final String s0;
    public final String t0;
    public final int u0;
    public final hm9 v0;
    public final uf5 w0;
    public final int x0 = 1;

    public um8(long j, long j2, long j3, String str, String str2, String str3, String str4, String str5, String str6, int i, hm9 hm9, uf5 uf5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = str;
        this.X = str2;
        this.Y = str3;
        this.Z = str4;
        this.s0 = str5;
        this.t0 = str6;
        this.u0 = i;
        this.v0 = hm9;
        this.w0 = uf5;
        Parcelable.Creator<ih2> creator = ih2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um8)) {
            return false;
        }
        um8 um8 = (um8) obj;
        return this.a == um8.a && this.b == um8.b && this.c == um8.c && tpa.f(this.o, um8.o) && tpa.f(this.X, um8.X) && tpa.f(this.Y, um8.Y) && tpa.f(this.Z, um8.Z) && tpa.f(this.s0, um8.s0) && tpa.f(this.t0, um8.t0) && this.u0 == um8.u0 && tpa.f(this.v0, um8.v0) && tpa.f(this.w0, um8.w0);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int m = h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.o;
        int d = rh4.d(rh4.f(this.Z, rh4.f(this.Y, rh4.d((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.X), 31), 31), 31, this.s0);
        String str2 = this.t0;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.w0.hashCode() + ((this.v0.hashCode() + ey8.g(this.u0, (d + i) * 31, 31)) * 31);
    }

    public final long i() {
        return this.c;
    }

    public final long j() {
        return this.b;
    }

    public final int l() {
        return this.x0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("File(itemId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", attachId=");
        sb.append(this.c);
        sb.append(", previewUrl=");
        sb.append(this.o);
        sb.append(", title=");
        sb.append(this.X);
        sb.append(", uploadTime=");
        sb.append(this.Y);
        sb.append(", fileSize=");
        sb.append(this.Z);
        sb.append(", attachLocalId=");
        sb.append(this.s0);
        sb.append(", localPath=");
        sb.append(this.t0);
        sb.append(", type=");
        int i = this.u0;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "UNKNOWN" : "VIDEO" : "PHOTO");
        sb.append(", state=");
        sb.append(this.v0);
        sb.append(", extension=");
        sb.append(this.w0);
        sb.append(")");
        return sb.toString();
    }
}
