package defpackage;

/* renamed from: vka  reason: default package */
public final class vka implements yka {
    public final int a;
    public final m56 b;

    public vka(int i, m56 m56) {
        this.a = i;
        this.b = m56;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.vka) r5;
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
            boolean r1 = r5 instanceof defpackage.vka
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            vka r5 = (defpackage.vka) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            m56 r4 = r4.b
            m56 r5 = r5.b
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vka.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Custom(iconRes=" + this.a + ", onClick=" + this.b + ")";
    }
}
