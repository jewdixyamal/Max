package defpackage;

/* renamed from: yj1  reason: default package */
public final class yj1 {
    public static final yj1 g = new yj1(false, false, false, (gg1) null, false, (CharSequence) null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final gg1 d;
    public final boolean e;
    public final CharSequence f;

    public yj1(boolean z, boolean z2, boolean z3, gg1 gg1, boolean z4, CharSequence charSequence) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = gg1;
        this.e = z4;
        this.f = charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.yj1) r5;
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
            boolean r1 = r5 instanceof defpackage.yj1
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            yj1 r5 = (defpackage.yj1) r5
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
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            gg1 r1 = r4.d
            gg1 r3 = r5.d
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x002c
            return r2
        L_0x002c:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x0033
            return r2
        L_0x0033:
            java.lang.CharSequence r4 = r4.f
            java.lang.CharSequence r5 = r5.f
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x003e
            return r2
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yj1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        gg1 gg1 = this.d;
        int d3 = ms2.d((d2 + (gg1 == null ? 0 : gg1.hashCode())) * 31, 31, this.e);
        CharSequence charSequence = this.f;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return d3 + i;
    }

    public final String toString() {
        return "CallScreenRecordState(isMe=" + this.a + ", meIsAdmin=" + this.b + ", isRecordStateEnabled=" + this.c + ", recordScreenOpponentId=" + this.d + ", isAdminDisableScreenRecord=" + this.e + ", userName=" + this.f + ")";
    }
}
