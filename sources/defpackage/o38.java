package defpackage;

/* renamed from: o38  reason: default package */
public final class o38 {
    public final int a;
    public final ssa b;
    public final boolean c;

    public o38(int i, ssa ssa, boolean z) {
        this.a = i;
        this.b = ssa;
        this.c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.o38) r5;
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
            boolean r1 = r5 instanceof defpackage.o38
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            o38 r5 = (defpackage.o38) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ssa r1 = r4.b
            ssa r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o38.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int s = au1.s(this.a) * 31;
        ssa ssa = this.b;
        return Boolean.hashCode(this.c) + ((s + (ssa == null ? 0 : ssa.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConditionChange(condition=");
        sb.append(zr6.s(this.a));
        sb.append(", suggestedVideoSettings=");
        sb.append(this.b);
        sb.append(", preferHardwarePVXEncoder=");
        return au1.j(sb, this.c, ")");
    }
}
