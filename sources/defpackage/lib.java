package defpackage;

/* renamed from: lib  reason: default package */
public final class lib extends cjb {
    public final int a;
    public final c7a b;
    public final b7a c;
    public final z6a o;

    public lib(int i, z6a z6a, int i2) {
        c7a c7a = c7a.c;
        b7a b7a = b7a.a;
        z6a = (i2 & 8) != 0 ? z6a.o : z6a;
        this.a = i;
        this.b = c7a;
        this.c = b7a;
        this.o = z6a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.lib) r5;
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
            boolean r1 = r5 instanceof defpackage.lib
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            lib r5 = (defpackage.lib) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            c7a r1 = r4.b
            c7a r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            b7a r1 = r4.c
            b7a r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            z6a r4 = r4.o
            z6a r5 = r5.o
            if (r4 == r5) goto L_0x0028
            return r2
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lib.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) 2;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.o.hashCode() + ((hashCode2 + ((hashCode + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final int l() {
        return 2;
    }

    public final String toString() {
        return "MainButtonAction(title=" + this.a + ", size=" + this.b + ", mode=" + this.c + ", appearance=" + this.o + ")";
    }
}
