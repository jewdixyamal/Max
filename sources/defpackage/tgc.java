package defpackage;

/* renamed from: tgc  reason: default package */
public final class tgc {
    public final int a;
    public final int b;
    public final String c;
    public final x10 d;
    public final long e;

    public tgc(int i, int i2, String str, x10 x10, long j) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = x10;
        this.e = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r6 = (defpackage.tgc) r6;
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
            boolean r1 = r6 instanceof defpackage.tgc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            tgc r6 = (defpackage.tgc) r6
            int r1 = r6.a
            int r3 = r5.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r5.b
            int r3 = r6.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.String r1 = r5.c
            java.lang.String r3 = r6.c
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            x10 r1 = r5.d
            x10 r3 = r6.d
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            long r3 = r5.e
            long r5 = r6.e
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0039
            return r2
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tgc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = rh4.d(ey8.g(this.b, au1.s(this.a) * 31, 31), 31, this.c);
        x10 x10 = this.d;
        return Long.hashCode(this.e) + ((d2 + (x10 == null ? 0 : x10.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReplyButton(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "UNKNOWN" : "LOCATION" : "CONTACT" : "IMAGE" : "MESSAGE");
        sb.append(", intent=");
        int i2 = this.b;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "UNKNOWN" : "NEGATIVE" : "POSITIVE" : "DEFAULT");
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", outgoingMessageId=");
        return zr6.k(sb, this.e, ")");
    }
}
