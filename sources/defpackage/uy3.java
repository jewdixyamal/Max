package defpackage;

/* renamed from: uy3  reason: default package */
public final class uy3 implements ol7 {
    public final int a;
    public final int b;
    public final jqe c;

    public uy3(int i, int i2, eqe eqe) {
        this.a = i;
        this.b = i2;
        this.c = eqe;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.uy3) r5;
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
            boolean r1 = r5 instanceof defpackage.uy3
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            uy3 r5 = (defpackage.uy3) r5
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
            jqe r4 = r4.c
            jqe r5 = r5.c
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy3.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final int l() {
        return zia.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateButton(id=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", text=");
        return rh4.l(sb, this.c, ")");
    }
}
