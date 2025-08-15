package defpackage;

/* renamed from: ue0  reason: default package */
public final class ue0 {
    public final int a;

    public ue0(int i) {
        this.a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r4 = ((defpackage.ue0) r4).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof defpackage.ue0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ue0 r4 = (defpackage.ue0) r4
            int r4 = r4.a
            int r3 = r3.a
            if (r3 == r4) goto L_0x0013
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ue0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(-592138) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("BackgroundLocalChipsColors(active="), this.a, ", default=-592138)");
    }
}
