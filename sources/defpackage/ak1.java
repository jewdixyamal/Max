package defpackage;

/* renamed from: ak1  reason: default package */
public final class ak1 {
    public static final ak1 g = new ak1(false, false, (gg1) null, false, false, false);
    public final boolean a;
    public final boolean b;
    public final gg1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ak1(boolean z, boolean z2, gg1 gg1, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = gg1;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    public final boolean a() {
        return this.a && this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ak1) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.ak1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ak1 r5 = (defpackage.ak1) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            gg1 r1 = r4.c
            gg1 r3 = r5.c
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L_0x002c
            return r2
        L_0x002c:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x0033
            return r2
        L_0x0033:
            boolean r4 = r4.f
            boolean r5 = r5.f
            if (r4 == r5) goto L_0x003a
            return r2
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        gg1 gg1 = this.c;
        return Boolean.hashCode(this.f) + ms2.d(ms2.d((d2 + (gg1 == null ? 0 : gg1.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallScreenSharingState(isMe=");
        sb.append(this.a);
        sb.append(", isSharingStateEnabled=");
        sb.append(this.b);
        sb.append(", sharedScreenOpponentId=");
        sb.append(this.c);
        sb.append(", isAdminDisableScreenSharing=");
        sb.append(this.d);
        sb.append(", isMeAudioSharingEnabled=");
        sb.append(this.e);
        sb.append(", isMeAdmin=");
        return au1.j(sb, this.f, ")");
    }
}
