package defpackage;

/* renamed from: t6a  reason: default package */
public final class t6a {
    public final int a;
    public final s6a b;
    public final int c;
    public final String d;
    public final int e;

    public t6a(int i, s6a s6a, int i2, String str, int i3) {
        this.a = i;
        this.b = s6a;
        this.c = i2;
        this.d = str;
        this.e = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.t6a) r5;
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
            boolean r1 = r5 instanceof defpackage.t6a
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            t6a r5 = (defpackage.t6a) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            s6a r1 = r4.b
            s6a r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            int r4 = r4.e
            int r5 = r5.e
            if (r4 == r5) goto L_0x0037
            return r2
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(this.e) + rh4.d(k7d.e(this.c, (hashCode + (Integer.hashCode(this.a) * 31)) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Item(title=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", screenId=");
        sb.append(this.c);
        sb.append(", tag=");
        sb.append(this.d);
        sb.append(", bottomBarItemId=");
        return zr6.j(sb, this.e, ")");
    }
}
