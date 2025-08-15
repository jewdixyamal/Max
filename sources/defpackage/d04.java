package defpackage;

/* renamed from: d04  reason: default package */
public final class d04 {
    public static final d04 k = new d04((j1e) null, (String) null, (String) null, false, false, (i95) null, 1022);
    public final j1e a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final u8b i;
    public final i95 j;

    public d04(j1e j1e, long j2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, u8b u8b, i95 i95) {
        this.a = j1e;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = u8b;
        this.j = i95;
    }

    public static d04 a(d04 d04, j1e j1e, long j2, String str, String str2, boolean z, boolean z2, boolean z3, u8b u8b, i95 i95, int i2) {
        d04 d042 = d04;
        int i3 = i2;
        j1e j1e2 = (i3 & 1) != 0 ? d042.a : j1e;
        long j3 = (i3 & 2) != 0 ? d042.b : j2;
        String str3 = (i3 & 4) != 0 ? d042.c : str;
        String str4 = (i3 & 8) != 0 ? d042.d : str2;
        boolean z4 = (i3 & 16) != 0 ? d042.e : z;
        boolean z5 = (i3 & 32) != 0 ? d042.f : z2;
        boolean z6 = d042.g;
        boolean z7 = (i3 & 128) != 0 ? d042.h : z3;
        u8b u8b2 = (i3 & 256) != 0 ? d042.i : u8b;
        i95 i952 = (i3 & 512) != 0 ? d042.j : i95;
        d04.getClass();
        return new d04(j1e2, j3, str3, str4, z4, z5, z6, z7, u8b2, i952);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d04)) {
            return false;
        }
        d04 d04 = (d04) obj;
        return tpa.f(this.a, d04.a) && this.b == d04.b && tpa.f(this.c, d04.c) && tpa.f(this.d, d04.d) && this.e == d04.e && this.f == d04.f && this.g == d04.g && this.h == d04.h && tpa.f(this.i, d04.i) && tpa.f(this.j, d04.j);
    }

    public final int hashCode() {
        int i2 = 0;
        j1e j1e = this.a;
        int m = h4f.m((j1e == null ? 0 : j1e.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int d2 = ms2.d(ms2.d(ms2.d(ms2.d((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        u8b u8b = this.i;
        if (u8b != null) {
            i2 = u8b.hashCode();
        }
        return this.j.hashCode() + ((d2 + i2) * 31);
    }

    public final String toString() {
        return "CurrentCallInfo(target=" + this.a + ", startedAt=" + this.b + ", conversationId=" + this.c + ", joinLink=" + this.d + ", hasOpponentsOnce=" + this.e + ", isConnectedOnce=" + this.f + ", isIncoming=" + this.g + ", isGroupCall=" + this.h + ", previousCallState=" + this.i + ", state=" + this.j + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ d04(defpackage.j1e r14, java.lang.String r15, java.lang.String r16, boolean r17, boolean r18, defpackage.i95 r19, int r20) {
        /*
            r13 = this;
            r0 = r20
            long r2 = java.lang.System.currentTimeMillis()
            r1 = r0 & 4
            r4 = 0
            if (r1 == 0) goto L_0x000d
            r5 = r4
            goto L_0x000e
        L_0x000d:
            r5 = r15
        L_0x000e:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0014
            r6 = r4
            goto L_0x0016
        L_0x0014:
            r6 = r16
        L_0x0016:
            r1 = r0 & 64
            r4 = 0
            if (r1 == 0) goto L_0x001d
            r8 = r4
            goto L_0x001f
        L_0x001d:
            r8 = r17
        L_0x001f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0025
            r9 = r4
            goto L_0x0027
        L_0x0025:
            r9 = r18
        L_0x0027:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x002f
            d95 r0 = defpackage.d95.b
            r11 = r0
            goto L_0x0031
        L_0x002f:
            r11 = r19
        L_0x0031:
            r7 = 0
            r10 = 0
            r12 = 0
            r0 = r13
            r1 = r14
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r10
            r10 = r12
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d04.<init>(j1e, java.lang.String, java.lang.String, boolean, boolean, i95, int):void");
    }
}
