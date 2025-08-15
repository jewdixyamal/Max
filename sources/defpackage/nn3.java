package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: nn3  reason: default package */
public final class nn3 implements ol7 {
    public final boolean A0;
    public final int B0;
    public final CharSequence X;
    public final CharSequence Y;
    public final Uri Z;
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final List o;
    public final boolean s0;
    public final boolean t0;
    public final CharSequence u0;
    public final boolean v0;
    public final pua w0;
    public final Boolean x0;
    public final boolean y0;
    public final int z0;

    public nn3(long j, CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, CharSequence charSequence4, Uri uri, boolean z, boolean z2, CharSequence charSequence5, boolean z3, pua pua, Boolean bool, boolean z4, int i, boolean z5) {
        int i2;
        CharSequence charSequence6 = charSequence4;
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.o = list;
        this.X = charSequence3;
        this.Y = charSequence6;
        this.Z = uri;
        this.s0 = z;
        this.t0 = z2;
        this.u0 = charSequence5;
        this.v0 = z3;
        this.w0 = pua;
        this.x0 = bool;
        this.y0 = z4;
        this.z0 = i;
        this.A0 = z5;
        if (charSequence6 == null) {
            i2 = z8a.m;
        } else {
            i2 = z8a.s;
        }
        this.B0 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn3)) {
            return false;
        }
        nn3 nn3 = (nn3) obj;
        return this.a == nn3.a && tpa.f(this.b, nn3.b) && tpa.f(this.c, nn3.c) && tpa.f(this.o, nn3.o) && tpa.f(this.X, nn3.X) && tpa.f(this.Y, nn3.Y) && tpa.f(this.Z, nn3.Z) && this.s0 == nn3.s0 && this.t0 == nn3.t0 && tpa.f(this.u0, nn3.u0) && this.v0 == nn3.v0 && tpa.f(this.w0, nn3.w0) && tpa.f(this.x0, nn3.x0) && this.y0 == nn3.y0 && this.z0 == nn3.z0 && this.A0 == nn3.A0;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int f = rh4.f(this.b, Long.hashCode(this.a) * 31, 31);
        int i = 0;
        CharSequence charSequence = this.c;
        int hashCode = (f + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List list = this.o;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        CharSequence charSequence2 = this.X;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.Y;
        int hashCode4 = (hashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Uri uri = this.Z;
        int d = ms2.d(rh4.f(this.u0, ms2.d(ms2.d((hashCode4 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.s0), 31, this.t0), 31), 31, this.v0);
        pua pua = this.w0;
        int hashCode5 = (d + (pua == null ? 0 : pua.hashCode())) * 31;
        Boolean bool = this.x0;
        if (bool != null) {
            i = bool.hashCode();
        }
        return Boolean.hashCode(this.A0) + k7d.e(this.z0, ms2.d((hashCode5 + i) * 31, 31, this.y0), 31);
    }

    public final int l() {
        return this.B0;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        nn3 nn3 = ol7 instanceof nn3 ? (nn3) ol7 : null;
        if (nn3 == null) {
            return null;
        }
        Boolean bool = this.x0;
        Boolean bool2 = nn3.x0;
        if (!tpa.f(bool, bool2)) {
            return new mn3(bool2);
        }
        return null;
    }

    public final String toString() {
        return "ContactListItem(id=" + this.a + ", name=" + this.b + ", shortName=" + this.c + ", phones=" + this.o + ", subtitle=" + this.X + ", button=" + this.Y + ", avatar=" + this.Z + ", isOnline=" + this.s0 + ", isVerified=" + this.t0 + ", abbreviation=" + this.u0 + ", isSelf=" + this.v0 + ", availablePhone=" + this.w0 + ", isSelected=" + this.x0 + ", hasCallActions=" + this.y0 + ", presence=" + this.z0 + ", isBot=" + this.A0 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ nn3(long r22, java.lang.CharSequence r24, java.lang.String r25, java.util.List r26, java.lang.CharSequence r27, java.lang.CharSequence r28, android.net.Uri r29, boolean r30, boolean r31, java.lang.CharSequence r32, boolean r33, defpackage.pua r34, int r35, boolean r36, int r37) {
        /*
            r21 = this;
            r0 = r37
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r15 = r2
            goto L_0x000b
        L_0x0009:
            r15 = r33
        L_0x000b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r16 = r1
            goto L_0x0015
        L_0x0013:
            r16 = r34
        L_0x0015:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x001c
            r19 = r2
            goto L_0x001e
        L_0x001c:
            r19 = r35
        L_0x001e:
            r17 = 0
            r18 = 0
            r3 = r21
            r4 = r22
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r20 = r36
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn3.<init>(long, java.lang.CharSequence, java.lang.String, java.util.List, java.lang.CharSequence, java.lang.CharSequence, android.net.Uri, boolean, boolean, java.lang.CharSequence, boolean, pua, int, boolean, int):void");
    }
}
