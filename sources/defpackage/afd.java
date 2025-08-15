package defpackage;

/* renamed from: afd  reason: default package */
public final class afd implements bfd {
    public final int a;
    public final boolean b = false;
    public final x9a c;

    public afd(int i) {
        x9a x9a = x9a.a;
        this.a = i;
        this.c = x9a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.afd) r5;
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
            boolean r1 = r5 instanceof defpackage.afd
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            afd r5 = (defpackage.afd) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            x9a r4 = r4.c
            x9a r5 = r5.c
            if (r4 == r5) goto L_0x0021
            return r2
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.c.hashCode() + ms2.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Count(count=" + this.a + ", animated=" + this.b + ", appearance=" + this.c + ")";
    }
}
