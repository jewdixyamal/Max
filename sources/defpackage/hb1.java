package defpackage;

import android.text.SpannableStringBuilder;

/* renamed from: hb1  reason: default package */
public final class hb1 implements kb1 {
    public final iaf A0;
    public final int B0;
    public final md0 X;
    public final boolean Y;
    public final boolean Z;
    public final gg1 a;
    public final String b;
    public final CharSequence c;
    public final String o;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final haf z0;

    public hb1(gg1 gg1, String str, SpannableStringBuilder spannableStringBuilder, String str2, md0 md0, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, haf haf, iaf iaf, int i) {
        this.a = gg1;
        this.b = str;
        this.c = spannableStringBuilder;
        this.o = str2;
        this.X = md0;
        this.Y = z;
        this.Z = z2;
        this.s0 = z3;
        this.t0 = z4;
        this.u0 = z5;
        this.v0 = z6;
        this.w0 = z7;
        this.x0 = z8;
        this.y0 = z9;
        this.z0 = haf;
        this.A0 = iaf;
        this.B0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb1)) {
            return false;
        }
        hb1 hb1 = (hb1) obj;
        return tpa.f(this.a, hb1.a) && tpa.f(this.b, hb1.b) && tpa.f(this.c, hb1.c) && tpa.f(this.o, hb1.o) && tpa.f(this.X, hb1.X) && this.Y == hb1.Y && this.Z == hb1.Z && this.s0 == hb1.s0 && this.t0 == hb1.t0 && this.u0 == hb1.u0 && this.v0 == hb1.v0 && this.w0 == hb1.w0 && this.x0 == hb1.x0 && this.y0 == hb1.y0 && tpa.f(this.z0, hb1.z0) && this.A0 == hb1.A0 && this.B0 == hb1.B0;
    }

    public final long getItemId() {
        return this.a.a;
    }

    public final boolean h(ol7 ol7) {
        return this.a.a == ol7.getItemId();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.o;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        md0 md0 = this.X;
        int d = ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d((hashCode4 + (md0 == null ? 0 : md0.hashCode())) * 31, 31, this.Y), 31, this.Z), 31, this.s0), 31, this.t0), 31, this.u0), 31, this.v0), 31, this.w0), 31, this.x0), 31, this.y0);
        haf haf = this.z0;
        if (haf != null) {
            i = haf.hashCode();
        }
        return au1.s(this.B0) + ((this.A0.hashCode() + ((d + i) * 31)) * 31);
    }

    public final int l() {
        return 1;
    }

    public final Object n(Object obj) {
        hb1 hb1 = (hb1) ((ol7) obj);
        kl7 l = j1e.l();
        CharSequence charSequence = this.c;
        CharSequence charSequence2 = hb1.c;
        boolean f = tpa.f(charSequence, charSequence2);
        String str = hb1.o;
        if (!f || !tpa.f(this.o, str)) {
            l.add(new cb1((SpannableStringBuilder) charSequence2, str));
        }
        boolean z = this.s0;
        boolean z2 = hb1.s0;
        if (z != z2) {
            l.add(new bb1(z2));
        }
        boolean z3 = this.Y;
        boolean z4 = hb1.Y;
        if (z3 != z4) {
            l.add(new eb1(z4));
        }
        md0 md0 = this.X;
        md0 md02 = hb1.X;
        if (!tpa.f(md0, md02)) {
            l.add(new za1(md02));
        }
        iaf iaf = this.A0;
        iaf iaf2 = hb1.A0;
        if (iaf != iaf2) {
            l.add(new ab1(iaf2));
        }
        haf haf = this.z0;
        haf haf2 = hb1.z0;
        if (!tpa.f(haf, haf2)) {
            l.add(new fb1(haf2));
        }
        boolean z5 = this.v0;
        boolean z6 = hb1.v0;
        if (z5 != z6) {
            l.add(new db1(z6));
        }
        return j1e.d(l);
    }

    public final String toString() {
        return "CallOpponentState(opponentId=" + this.a + ", userName=" + this.b + ", userNameWithState=" + this.c + ", userNameAccessibility=" + this.o + ", avatar=" + this.X + ", isTalking=" + this.Y + ", isConnectedOnce=" + this.Z + ", isConnecting=" + this.s0 + ", isVideoEnabled=" + this.t0 + ", isMicrophoneEnabled=" + this.u0 + ", isRaiseHand=" + this.v0 + ", isMe=" + this.w0 + ", isAdmin=" + this.x0 + ", isCreator=" + this.y0 + ", videoState=" + this.z0 + ", buttonAction=" + this.A0 + ", talkingState=" + k7d.p(this.B0) + ")";
    }
}
