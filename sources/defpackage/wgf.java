package defpackage;

/* renamed from: wgf  reason: default package */
public final class wgf implements zcf {
    public final long a;
    public final String b;
    public final wcf c;
    public final j0e d;
    public final b00 e;
    public final gld f;

    public wgf(long j, String str, wcf wcf, w7c w7c, b00 b00, v7c v7c) {
        this.a = j;
        this.b = str;
        this.c = wcf;
        this.d = w7c;
        this.e = b00;
        this.f = v7c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r7 = this;
            ijf r0 = r7.d()
            r1 = 0
            r2 = 1
            long r3 = r7.a
            if (r0 == 0) goto L_0x001f
            long r5 = r0.a
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
            ijf r0 = r7.d()
            if (r0 == 0) goto L_0x0019
            int r0 = r0.X
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            r5 = 5
            if (r0 != r5) goto L_0x001f
            r0 = r2
            goto L_0x0020
        L_0x001f:
            r0 = r1
        L_0x0020:
            b00 r5 = r7.e
            boolean r5 = r5 instanceof defpackage.zz
            if (r5 == 0) goto L_0x002e
            boolean r5 = r7.e()
            if (r5 != 0) goto L_0x002e
            r5 = r2
            goto L_0x002f
        L_0x002e:
            r5 = r1
        L_0x002f:
            if (r5 == 0) goto L_0x0040
            ijf r7 = r7.d()
            if (r7 == 0) goto L_0x003f
            long r5 = r7.a
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x003f
            if (r0 == 0) goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wgf.a():boolean");
    }

    public final wcf b() {
        return this.c;
    }

    public final ijf d() {
        return (ijf) x53.i0(this.f.b());
    }

    public final boolean e() {
        j0e j0e = this.d;
        return (j0e.getValue() instanceof xz) || (j0e.getValue() instanceof a00);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgf)) {
            return false;
        }
        wgf wgf = (wgf) obj;
        if (this.a != wgf.a) {
            return false;
        }
        if (!tpa.f(this.b, wgf.b)) {
            return false;
        }
        return tpa.f(this.c, wgf.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String i() {
        return this.b;
    }

    public final long j() {
        return this.a;
    }
}
