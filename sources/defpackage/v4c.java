package defpackage;

/* renamed from: v4c  reason: default package */
public final class v4c {
    public final int a;
    public final s4c b;
    public final CharSequence c;
    public final boolean d;

    public v4c(int i, s4c s4c, CharSequence charSequence, boolean z) {
        this.a = i;
        this.b = s4c;
        this.c = charSequence;
        this.d = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.v4c) r5;
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
            boolean r1 = r5 instanceof defpackage.v4c
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            v4c r5 = (defpackage.v4c) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            s4c r1 = r4.b
            s4c r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            java.lang.CharSequence r1 = r4.c
            java.lang.CharSequence r3 = r5.c
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            boolean r4 = r4.d
            boolean r5 = r5.d
            if (r4 == r5) goto L_0x002c
            return r2
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        CharSequence charSequence = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        return "RateCallButtonData(id=" + this.a + ", size=" + this.b + ", text=" + this.c + ", isEnabled=" + this.d + ")";
    }
}
