package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: vq2  reason: default package */
public final class vq2 extends izc {
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final boolean D0;
    public final CharSequence E0;
    public final boolean F0;
    public final int G0 = p8a.l;
    public final long H0;
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final long c;
    public final boolean o;
    public final CharSequence s0;
    public final int t0;
    public final l62 u0;
    public final Uri v0;
    public final long w0;
    public final w6b x0;
    public final CharSequence y0;
    public final List z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vq2(long r7, boolean r9, boolean r10, boolean r11, boolean r12, java.lang.String r13, int r14, defpackage.l62 r15, android.net.Uri r16, long r17, defpackage.w6b r19, java.lang.CharSequence r20, java.util.List r21, boolean r22, boolean r23, boolean r24, boolean r25, java.lang.CharSequence r26, boolean r27) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r3 = r21
            r4 = 1
            r6.<init>(r4, r3)
            r0.c = r1
            r4 = r9
            r0.o = r4
            r4 = r10
            r0.X = r4
            r4 = r11
            r0.Y = r4
            r4 = r12
            r0.Z = r4
            r4 = r13
            r0.s0 = r4
            r4 = r14
            r0.t0 = r4
            r4 = r15
            r0.u0 = r4
            r4 = r16
            r0.v0 = r4
            r4 = r17
            r0.w0 = r4
            r4 = r19
            r0.x0 = r4
            r4 = r20
            r0.y0 = r4
            r0.z0 = r3
            r3 = r22
            r0.A0 = r3
            r3 = r23
            r0.B0 = r3
            r3 = r24
            r0.C0 = r3
            r3 = r25
            r0.D0 = r3
            r3 = r26
            r0.E0 = r3
            r3 = r27
            r0.F0 = r3
            int r3 = defpackage.p8a.l
            r0.G0 = r3
            r0.H0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq2.<init>(long, boolean, boolean, boolean, boolean, java.lang.String, int, l62, android.net.Uri, long, w6b, java.lang.CharSequence, java.util.List, boolean, boolean, boolean, boolean, java.lang.CharSequence, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq2)) {
            return false;
        }
        vq2 vq2 = (vq2) obj;
        return this.c == vq2.c && this.o == vq2.o && this.X == vq2.X && this.Y == vq2.Y && this.Z == vq2.Z && tpa.f(this.s0, vq2.s0) && this.t0 == vq2.t0 && this.u0 == vq2.u0 && tpa.f(this.v0, vq2.v0) && this.w0 == vq2.w0 && tpa.f(this.x0, vq2.x0) && tpa.f(this.y0, vq2.y0) && tpa.f(this.z0, vq2.z0) && this.A0 == vq2.A0 && this.B0 == vq2.B0 && this.C0 == vq2.C0 && this.D0 == vq2.D0 && tpa.f(this.E0, vq2.E0) && this.F0 == vq2.F0;
    }

    public final long getItemId() {
        return this.H0;
    }

    public final int hashCode() {
        int d = ms2.d(ms2.d(ms2.d(ms2.d(Long.hashCode(this.c) * 31, 31, this.o), 31, this.X), 31, this.Y), 31, this.Z);
        CharSequence charSequence = this.s0;
        int hashCode = (this.u0.hashCode() + k7d.e(this.t0, (d + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31)) * 31;
        Uri uri = this.v0;
        int hashCode2 = (this.x0.hashCode() + h4f.m((hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.w0)) * 31;
        CharSequence charSequence2 = this.y0;
        return Boolean.hashCode(this.F0) + rh4.f(this.E0, ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(k7d.g(this.z0, (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31), 31, this.A0), 31, this.B0), 31, this.C0), 31, this.D0), 31, false), 31);
    }

    public final boolean k(izc izc) {
        return equals((vq2) izc);
    }

    public final int l() {
        return this.G0;
    }

    public final boolean m(izc izc) {
        return izc.getItemId() == this.H0;
    }

    public final String toString() {
        String x = pag.x(this.x0.a);
        String x2 = pag.x(this.y0);
        String n0 = x53.n0(this.z0, (String) null, (String) null, (String) null, new we1(23), 31);
        StringBuilder sb = new StringBuilder("ChatSearchModel(id=");
        sb.append(this.c);
        sb.append(", viewType=");
        sb.append(this.G0);
        sb.append(", itemId=");
        sb.append(this.H0);
        sb.append(", isPinned=");
        sb.append(this.o);
        sb.append(", isMuted=");
        sb.append(this.X);
        sb.append(", hasUnreadReplyOrMention=");
        sb.append(this.Y);
        sb.append(", hasReaction=");
        sb.append(this.Z);
        sb.append(", lastMessageTime=");
        sb.append(this.s0);
        sb.append(", unreadCount=");
        sb.append(this.t0);
        sb.append(", status=");
        sb.append(this.u0);
        sb.append(", avatar=");
        sb.append(this.v0);
        sb.append(", avatarSourceId=");
        sb.append(this.w0);
        sb.append(", preProcessedChatTitle=");
        sb.append(x);
        sb.append(", subtitle=");
        sb.append(x2);
        sb.append(", titleHighlights=");
        sb.append(n0);
        sb.append(", isChannel=");
        sb.append(this.A0);
        sb.append(", highlightTitle=");
        sb.append(this.B0);
        sb.append(", highlightLink=");
        sb.append(this.C0);
        sb.append(", highlightContactName=");
        sb.append(this.D0);
        sb.append(", selected=false, abbreviation=*, isVerified=");
        return au1.j(sb, this.F0, ")");
    }
}
