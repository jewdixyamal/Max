package defpackage;

import android.net.Uri;

/* renamed from: pxa  reason: default package */
public final class pxa implements ol7 {
    public final Uri X;
    public final boolean Y;
    public final boolean Z;
    public final long a;
    public final long b;
    public final CharSequence c;
    public final jqe o;
    public final gza s0;
    public final CharSequence t0;
    public final boolean u0;
    public final long v0;

    public pxa(long j, long j2, CharSequence charSequence, jqe jqe, Uri uri, boolean z, boolean z2, gza gza, CharSequence charSequence2, boolean z3) {
        this.a = j;
        this.b = j2;
        this.c = charSequence;
        this.o = jqe;
        this.X = uri;
        this.Y = z;
        this.Z = z2;
        this.s0 = gza;
        this.t0 = charSequence2;
        this.u0 = z3;
        this.v0 = gza.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxa)) {
            return false;
        }
        pxa pxa = (pxa) obj;
        return this.a == pxa.a && this.b == pxa.b && tpa.f(this.c, pxa.c) && tpa.f(this.o, pxa.o) && tpa.f(this.X, pxa.X) && this.Y == pxa.Y && this.Z == pxa.Z && tpa.f(this.s0, pxa.s0) && tpa.f(this.t0, pxa.t0) && this.u0 == pxa.u0;
    }

    public final long getItemId() {
        return this.v0;
    }

    public final boolean h(ol7 ol7) {
        return this.v0 == ol7.getItemId();
    }

    public final int hashCode() {
        int f = rh4.f(this.c, h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31);
        int i = 0;
        jqe jqe = this.o;
        int hashCode = (f + (jqe == null ? 0 : jqe.hashCode())) * 31;
        Uri uri = this.X;
        if (uri != null) {
            i = uri.hashCode();
        }
        return Boolean.hashCode(this.u0) + rh4.f(this.t0, (this.s0.hashCode() + ms2.d(ms2.d((hashCode + i) * 31, 31, this.Y), 31, this.Z)) * 31, 31);
    }

    public final int l() {
        return 0;
    }

    public final Object n(Object obj) {
        boolean z;
        ol7 ol7 = (ol7) obj;
        pxa pxa = ol7 instanceof pxa ? (pxa) ol7 : null;
        if (pxa == null || this.Y == (z = pxa.Y)) {
            return null;
        }
        return new oxa(z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickerChatListItem(id=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.o);
        sb.append(", avatar=");
        sb.append(this.X);
        sb.append(", isOnline=");
        sb.append(this.Y);
        sb.append(", isVerified=");
        sb.append(this.Z);
        sb.append(", entity=");
        sb.append(this.s0);
        sb.append(", abbreviation=");
        sb.append(this.t0);
        sb.append(", isEnabled=");
        return au1.j(sb, this.u0, ")");
    }
}
