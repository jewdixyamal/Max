package defpackage;

/* renamed from: c6c  reason: default package */
public final class c6c {
    public final d6c a;
    public final v5c b;

    public c6c(d6c d6c, v5c v5c) {
        this.a = d6c;
        this.b = v5c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.c6c) r5;
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
            boolean r1 = r5 instanceof defpackage.c6c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            c6c r5 = (defpackage.c6c) r5
            d6c r1 = r5.a
            d6c r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            v5c r4 = r4.b
            v5c r5 = r5.b
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x001e
            return r2
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReactionData(type=" + this.a + ", id=" + this.b + ")";
    }
}
