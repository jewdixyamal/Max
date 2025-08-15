package defpackage;

/* renamed from: n86  reason: default package */
public final class n86 implements r86 {
    public final int a;
    public final String b;
    public final zp7 c;

    public n86(int i, String str, zp7 zp7) {
        this.a = i;
        this.b = str;
        this.c = zp7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.n86) r5;
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
            boolean r1 = r5 instanceof defpackage.n86
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            n86 r5 = (defpackage.n86) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            zp7 r4 = r4.c
            zp7 r5 = r5.c
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n86.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "OpenFullScreenMedia(uiPosition=" + this.a + ", albumId=" + this.b + ", item=" + this.c + ")";
    }
}
