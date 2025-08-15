package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: td6  reason: default package */
public final class td6 extends izc {
    public final w6b X;
    public final w6b Y;
    public final boolean Z;
    public final long c;
    public final CharSequence o;
    public final boolean s0;
    public final Uri t0;
    public final r7b u0;
    public final wm3 v0;
    public final List w0;
    public final int x0 = p8a.p;
    public final long y0;

    public td6(long j, String str, w6b w6b, w6b w6b2, boolean z, boolean z2, Uri uri, r7b r7b, wm3 wm3, List list) {
        super(4, list);
        this.c = j;
        this.o = str;
        this.X = w6b;
        this.Y = w6b2;
        this.Z = z;
        this.s0 = z2;
        this.t0 = uri;
        this.u0 = r7b;
        this.v0 = wm3;
        this.w0 = list;
        this.y0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td6)) {
            return false;
        }
        td6 td6 = (td6) obj;
        return this.c == td6.c && tpa.f(this.o, td6.o) && tpa.f(this.X, td6.X) && tpa.f(this.Y, td6.Y) && this.Z == td6.Z && this.s0 == td6.s0 && tpa.f(this.t0, td6.t0) && tpa.f(this.u0, td6.u0) && tpa.f(this.v0, td6.v0) && tpa.f(this.w0, td6.w0);
    }

    public final long getItemId() {
        return this.y0;
    }

    public final int hashCode() {
        int d = ms2.d(ms2.d((this.Y.hashCode() + ((this.X.hashCode() + rh4.f(this.o, Long.hashCode(this.c) * 31, 31)) * 31)) * 31, 31, this.Z), 31, this.s0);
        Uri uri = this.t0;
        int hashCode = uri == null ? 0 : uri.hashCode();
        int hashCode2 = this.u0.hashCode();
        return Boolean.hashCode(false) + k7d.g(this.w0, (this.v0.hashCode() + ((hashCode2 + ((d + hashCode) * 31)) * 31)) * 31, 31);
    }

    public final boolean k(izc izc) {
        return equals((td6) izc);
    }

    public final int l() {
        return this.x0;
    }

    public final boolean m(izc izc) {
        return this.y0 == izc.getItemId();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalContactSearchModel(id=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append(this.o);
        sb.append(", title=");
        sb.append(this.X);
        sb.append(", subtitle=");
        sb.append(this.Y);
        sb.append(", isOnline=");
        sb.append(this.Z);
        sb.append(", isVerified=");
        sb.append(this.s0);
        sb.append(", avatar=");
        sb.append(this.t0);
        sb.append(", presence=");
        sb.append(this.u0);
        sb.append(", contactInfo=");
        sb.append(this.v0);
        sb.append(", contactHighlights=");
        return au1.i(sb, this.w0, ", selected=false)");
    }
}
