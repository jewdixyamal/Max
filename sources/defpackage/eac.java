package defpackage;

/* renamed from: eac  reason: default package */
public final class eac implements iac {
    public final bac a;
    public final boolean b;

    public eac(bac bac, boolean z) {
        this.a = bac;
        this.b = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.eac) r5;
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
            boolean r1 = r5 instanceof defpackage.eac
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            eac r5 = (defpackage.eac) r5
            bac r1 = r5.a
            bac r3 = r4.a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eac.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTyping(type=" + this.a + ", isTyping=" + this.b + ")";
    }
}
