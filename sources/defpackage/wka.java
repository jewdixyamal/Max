package defpackage;

/* renamed from: wka  reason: default package */
public final class wka implements yka {
    public final int a;
    public final int b;
    public final float c;
    public final int d;
    public final m56 e;

    public wka(int i, int i2, m56 m56, int i3) {
        i2 = (i3 & 8) != 0 ? wfa.O : i2;
        this.a = i;
        this.b = 4;
        this.c = 12.0f;
        this.d = i2;
        this.e = m56;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.wka) r5;
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
            boolean r1 = r5 instanceof defpackage.wka
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            wka r5 = (defpackage.wka) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            float r1 = r4.c
            float r3 = r5.c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L_0x0025
            return r2
        L_0x0025:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 == r3) goto L_0x002c
            return r2
        L_0x002c:
            m56 r4 = r4.e
            m56 r5 = r5.e
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0037
            return r2
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wka.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.e.hashCode() + k7d.e(this.d, ms2.c(k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), 31);
    }

    public final String toString() {
        return "CustomIcon(iconRes=" + this.a + ", padding=" + this.b + ", cornersRadius=" + this.c + ", iconColor=" + this.d + ", onClick=" + this.e + ")";
    }
}
