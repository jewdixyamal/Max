package defpackage;

/* renamed from: j37  reason: default package */
public final class j37 extends h37 {
    public static final j37 o = new h37(1, 0, 1);

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3 = (defpackage.j37) r3;
        r0 = r3.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = r3.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.j37
            if (r0 == 0) goto L_0x0023
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            j37 r0 = (defpackage.j37) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0021
        L_0x0013:
            j37 r3 = (defpackage.j37) r3
            int r0 = r3.a
            int r1 = r2.a
            if (r1 != r0) goto L_0x0023
            int r3 = r3.b
            int r2 = r2.b
            if (r2 != r3) goto L_0x0023
        L_0x0021:
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j37.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.b + (this.a * 31);
    }

    public final boolean isEmpty() {
        return this.a > this.b;
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
