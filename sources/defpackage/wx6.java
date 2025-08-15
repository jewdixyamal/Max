package defpackage;

/* renamed from: wx6  reason: default package */
public final class wx6 {
    public final ux6 a;
    public final int b;

    public wx6(ux6 ux6, int i) {
        this.a = ux6;
        this.b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.wx6) r5;
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
            boolean r1 = r5 instanceof defpackage.wx6
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            wx6 r5 = (defpackage.wx6) r5
            ux6 r1 = r5.a
            ux6 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TriggeredCondition(key=");
        sb.append(this.a);
        sb.append(", quantity=");
        return zr6.j(sb, this.b, ")");
    }
}
