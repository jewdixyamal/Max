package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: jq3  reason: default package */
public final class jq3 extends izc {
    public final CharSequence X;
    public final boolean Y;
    public final boolean Z;
    public final long c;
    public final CharSequence o;
    public final List s0;
    public final Uri t0;
    public final CharSequence u0;
    public final int v0 = p8a.m;
    public final long w0;

    public jq3(long j, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, List list, Uri uri, CharSequence charSequence3) {
        super(3, list);
        this.c = j;
        this.o = charSequence;
        this.X = charSequence2;
        this.Y = z;
        this.Z = z2;
        this.s0 = list;
        this.t0 = uri;
        this.u0 = charSequence3;
        this.w0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq3)) {
            return false;
        }
        jq3 jq3 = (jq3) obj;
        return this.c == jq3.c && tpa.f(this.o, jq3.o) && tpa.f(this.X, jq3.X) && this.Y == jq3.Y && this.Z == jq3.Z && tpa.f(this.s0, jq3.s0) && tpa.f(this.t0, jq3.t0) && tpa.f(this.u0, jq3.u0);
    }

    public final long getItemId() {
        return this.w0;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        CharSequence charSequence = this.o;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.X;
        int g = k7d.g(this.s0, ms2.d(ms2.d((hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.Y), 31, this.Z), 31);
        Uri uri = this.t0;
        return this.u0.hashCode() + ms2.d((g + (uri == null ? 0 : uri.hashCode())) * 31, 31, false);
    }

    public final boolean k(izc izc) {
        return equals((jq3) izc);
    }

    public final int l() {
        return this.v0;
    }

    public final boolean m(izc izc) {
        return this.w0 == izc.getItemId();
    }

    public final String toString() {
        return "ContactSearchModel(id=" + this.c + ", title=" + this.o + ", subtitle=" + this.X + ", isOnline=" + this.Y + ", isVerified=" + this.Z + ", contactHighlights=" + this.s0 + ", avatar=" + this.t0 + ", selected=false, abbreviation=" + this.u0 + ")";
    }
}
