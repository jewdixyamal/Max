package defpackage;

/* renamed from: uw0  reason: default package */
public final class uw0 {
    public final vw0 a;
    public final long b;

    public uw0(vw0 vw0, long j) {
        this.a = vw0;
        this.b = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r6 = (defpackage.uw0) r6;
        r1 = r6.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof defpackage.uw0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            uw0 r6 = (defpackage.uw0) r6
            vw0 r1 = r6.a
            vw0 r3 = r5.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            long r3 = r5.b
            long r5 = r6.b
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x001c
            return r2
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheItem(type=");
        sb.append(this.a);
        sb.append(", sizeBytes=");
        return zr6.k(sb, this.b, ")");
    }
}
