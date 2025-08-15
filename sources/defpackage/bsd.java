package defpackage;

/* renamed from: bsd  reason: default package */
public final class bsd implements zcf, x38 {
    public final long a;
    public final String b;
    public final wcf c;
    public final j0e d;
    public final boolean e;

    public bsd(long j, String str, wcf wcf, q0e q0e, boolean z) {
        this.a = j;
        this.b = str;
        this.c = wcf;
        this.d = q0e;
        this.e = z;
    }

    public final boolean a() {
        return true;
    }

    public final wcf b() {
        return this.c;
    }

    public final boolean c() {
        return this.e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r8 = r8.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.bsd
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            bsd r8 = (defpackage.bsd) r8
            long r3 = r8.a
            long r5 = r7.a
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0015
            return r2
        L_0x0015:
            java.lang.String r1 = r8.b
            java.lang.String r3 = r7.b
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 != 0) goto L_0x0020
            return r2
        L_0x0020:
            wcf r1 = r8.c
            wcf r3 = r7.c
            boolean r1 = defpackage.tpa.f(r3, r1)
            if (r1 != 0) goto L_0x002b
            return r2
        L_0x002b:
            boolean r8 = r8.e
            boolean r7 = r7.e
            if (r7 == r8) goto L_0x0032
            return r2
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsd.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
        return Boolean.hashCode(this.e) + ((this.c.hashCode() + d2) * 31);
    }

    public final String i() {
        return this.b;
    }

    public final long j() {
        return this.a;
    }
}
