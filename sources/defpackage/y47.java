package defpackage;

/* renamed from: y47  reason: default package */
public final class y47 implements ol7 {
    public final long X;
    public final x47 a;
    public final jqe b;
    public final Integer c;
    public final int o = gca.c;

    public y47(x47 x47, eqe eqe, Integer num) {
        this.a = x47;
        this.b = eqe;
        this.c = num;
        this.X = (long) x47.ordinal();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.y47) r5;
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
            boolean r1 = r5 instanceof defpackage.y47
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            y47 r5 = (defpackage.y47) r5
            x47 r1 = r5.a
            x47 r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            jqe r1 = r4.b
            jqe r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.Integer r4 = r4.c
            java.lang.Integer r5 = r5.c
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y47.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return this.X;
    }

    public final boolean h(ol7 ol7) {
        return this.X == ol7.getItemId();
    }

    public final int hashCode() {
        int f = k7d.f(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return f + (num == null ? 0 : num.hashCode());
    }

    public final int l() {
        return this.o;
    }

    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        return "InviteActionListItem(type=" + this.a + ", text=" + this.b + ", icon=" + this.c + ")";
    }
}
