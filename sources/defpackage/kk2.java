package defpackage;

/* renamed from: kk2  reason: default package */
public final class kk2 {
    public final int a;
    public final jqe b;
    public final boolean c;

    public kk2(int i, cqe cqe, boolean z) {
        this.a = i;
        this.b = cqe;
        this.c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.kk2) r5;
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
            boolean r1 = r5 instanceof defpackage.kk2
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            kk2 r5 = (defpackage.kk2) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            jqe r1 = r4.b
            jqe r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk2.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k7d.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMembersInfo(titleRes=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", isAdminWithPermission=");
        return au1.j(sb, this.c, ")");
    }
}
