package defpackage;

import java.util.List;

/* renamed from: tab  reason: default package */
public final class tab {
    public final long a;
    public final boolean b;
    public final List c;
    public final String d;
    public final CharSequence e;
    public final CharSequence f;
    public final od0 g;
    public final jqe h;
    public final jqe i;
    public final boolean j;
    public final boolean k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ tab(long r16, boolean r18, java.util.List r19, java.lang.String r20, java.lang.CharSequence r21, java.lang.CharSequence r22, defpackage.od0 r23, defpackage.jqe r24, defpackage.iqe r25, boolean r26, boolean r27, int r28) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r10 = r1
            goto L_0x000b
        L_0x0009:
            r10 = r23
        L_0x000b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0012
            r0 = 0
            r13 = r0
            goto L_0x0014
        L_0x0012:
            r13 = r26
        L_0x0014:
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r11 = r24
            r12 = r25
            r14 = r27
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tab.<init>(long, boolean, java.util.List, java.lang.String, java.lang.CharSequence, java.lang.CharSequence, od0, jqe, iqe, boolean, boolean, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tab)) {
            return false;
        }
        tab tab = (tab) obj;
        return this.a == tab.a && this.b == tab.b && tpa.f(this.c, tab.c) && tpa.f(this.d, tab.d) && tpa.f(this.e, tab.e) && tpa.f(this.f, tab.f) && tpa.f(this.g, tab.g) && tpa.f(this.h, tab.h) && tpa.f(this.i, tab.i) && this.j == tab.j && this.k == tab.k;
    }

    public final int hashCode() {
        int d2 = ms2.d(Long.hashCode(this.a) * 31, 31, this.b);
        int i2 = 0;
        List list = this.c;
        int hashCode = (d2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        od0 od0 = this.g;
        int hashCode5 = (hashCode4 + (od0 == null ? 0 : od0.hashCode())) * 31;
        jqe jqe = this.h;
        int hashCode6 = (hashCode5 + (jqe == null ? 0 : jqe.hashCode())) * 31;
        jqe jqe2 = this.i;
        if (jqe2 != null) {
            i2 = jqe2.hashCode();
        }
        return Boolean.hashCode(this.k) + ms2.d((hashCode6 + i2) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileAppBarState(idForAvatar=");
        sb.append(this.a);
        sb.append(", editEnabled=");
        sb.append(this.b);
        sb.append(", avatarUrls=");
        sb.append(this.c);
        sb.append(", lowResAvatarUrl=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", abbreviation=");
        sb.append(this.f);
        sb.append(", avatarOverlay=");
        sb.append(this.g);
        sb.append(", subtitle=");
        sb.append(this.h);
        sb.append(", link=");
        sb.append(this.i);
        sb.append(", isBlocked=");
        sb.append(this.j);
        sb.append(", isVerified=");
        return au1.j(sb, this.k, ")");
    }

    public tab(long j2, boolean z, List list, String str, CharSequence charSequence, CharSequence charSequence2, od0 od0, jqe jqe, jqe jqe2, boolean z2, boolean z3) {
        this.a = j2;
        this.b = z;
        this.c = list;
        this.d = str;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = od0;
        this.h = jqe;
        this.i = jqe2;
        this.j = z2;
        this.k = z3;
    }
}
