package defpackage;

/* renamed from: mib  reason: default package */
public final class mib extends cjb {
    public final int a;
    public final m56 b;
    public final kqe c;
    public final int o;

    public mib(int i, kqe kqe, int i2) {
        ww9 ww9 = new ww9(21);
        kqe = (i2 & 4) != 0 ? i4f.u : kqe;
        this.a = i;
        this.b = ww9;
        this.c = kqe;
        this.o = 4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.mib) r5;
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
            boolean r1 = r5 instanceof defpackage.mib
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            mib r5 = (defpackage.mib) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            m56 r1 = r4.b
            m56 r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            kqe r4 = r4.c
            kqe r5 = r5.c
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mib.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) 4;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final int l() {
        return this.o;
    }

    public final String toString() {
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ")";
    }
}
