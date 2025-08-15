package defpackage;

import android.net.Uri;
import android.os.Parcelable;

/* renamed from: wm8  reason: default package */
public final class wm8 extends xm8 {
    public final int X;
    public final Long Y;
    public final String Z;
    public final long a;
    public final long b;
    public final long c;
    public final Uri o;
    public final boolean s0;
    public final Uri t0;
    public final boolean u0;

    public wm8(long j, long j2, long j3, Uri uri, int i, Long l, String str, boolean z, Uri uri2, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = uri;
        this.X = i;
        this.Y = l;
        this.Z = str;
        this.s0 = z;
        this.t0 = uri2;
        this.u0 = z2;
        Parcelable.Creator<ih2> creator = ih2.CREATOR;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm8)) {
            return false;
        }
        wm8 wm8 = (wm8) obj;
        return this.a == wm8.a && this.b == wm8.b && this.c == wm8.c && tpa.f(this.o, wm8.o) && this.X == wm8.X && tpa.f(this.Y, wm8.Y) && tpa.f(this.Z, wm8.Z) && this.s0 == wm8.s0 && tpa.f(this.t0, wm8.t0) && this.u0 == wm8.u0;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int m = h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        Uri uri = this.o;
        int g = ey8.g(this.X, (m + (uri == null ? 0 : uri.hashCode())) * 31, 31);
        Long l = this.Y;
        int d = ms2.d(rh4.d((g + (l == null ? 0 : l.hashCode())) * 31, 31, this.Z), 31, this.s0);
        Uri uri2 = this.t0;
        if (uri2 != null) {
            i = uri2.hashCode();
        }
        return Boolean.hashCode(this.u0) + ((d + i) * 31);
    }

    public final long i() {
        return this.c;
    }

    public final long j() {
        return this.b;
    }

    public final int l() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoVideo(itemId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", attachId=");
        sb.append(this.c);
        sb.append(", previewUri=");
        sb.append(this.o);
        sb.append(", type=");
        int i = this.X;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "GIF" : "VIDEO" : "PHOTO");
        sb.append(", duration=");
        sb.append(this.Y);
        sb.append(", attachLocalId=");
        sb.append(this.Z);
        sb.append(", isInCollage=");
        sb.append(this.s0);
        sb.append(", lowResUri=");
        sb.append(this.t0);
        sb.append(", isAutoloadDisabled=");
        return au1.j(sb, this.u0, ")");
    }
}
