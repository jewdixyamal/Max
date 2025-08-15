package defpackage;

/* renamed from: ucg  reason: default package */
public final class ucg {
    public final int a;
    public final boolean b;

    public ucg(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.ucg) r5;
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
            boolean r1 = r5 instanceof defpackage.ucg
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ucg r5 = (defpackage.ucg) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r4 = r4.b
            boolean r5 = r5.b
            if (r4 == r5) goto L_0x001a
            return r2
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ucg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (au1.s(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkParameters(condition=");
        sb.append(zr6.s(this.a));
        sb.append(", preferHardwareVPX=");
        return au1.j(sb, this.b, ")");
    }
}
