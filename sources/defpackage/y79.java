package defpackage;

/* renamed from: y79  reason: default package */
public final class y79 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final long f;

    public y79(int i, boolean z, boolean z2, boolean z3, long j, long j2, int i2) {
        z = (i2 & 2) != 0 ? false : z;
        z2 = (i2 & 4) != 0 ? false : z2;
        z3 = (i2 & 8) != 0 ? false : z3;
        j = (i2 & 16) != 0 ? 0 : j;
        j2 = (i2 & 32) != 0 ? 0 : j2;
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = j2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.y79) r8;
        r1 = r8.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.y79
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            y79 r8 = (defpackage.y79) r8
            int r1 = r8.a
            int r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r7.b
            boolean r3 = r8.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r7.c
            boolean r3 = r8.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            boolean r1 = r7.d
            boolean r3 = r8.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            long r3 = r7.e
            long r5 = r8.e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0031
            return r2
        L_0x0031:
            long r3 = r7.f
            long r7 = r8.f
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x003a
            return r2
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y79.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + h4f.m(ms2.d(ms2.d(ms2.d(au1.s(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollWork(scrollType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "TO_ANCHOR" : "TO_LAST_NEW" : "TO_LAST" : "TO_UNREAD");
        sb.append(", highlight=");
        sb.append(this.b);
        sb.append(", instant=");
        sb.append(this.c);
        sb.append(", alignToBottom=");
        sb.append(this.d);
        sb.append(", msgId=");
        sb.append(this.e);
        sb.append(", time=");
        return zr6.k(sb, this.f, ")");
    }
}
