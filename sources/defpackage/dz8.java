package defpackage;

/* renamed from: dz8  reason: default package */
public final class dz8 {
    public final int a;
    public final jqe b;
    public final boolean c;
    public final ez d;
    public final boolean e;
    public final Integer f;
    public final boolean g;

    public dz8(int i, jqe jqe, boolean z, ez ezVar, boolean z2, Integer num, boolean z3) {
        this.a = i;
        this.b = jqe;
        this.c = z;
        this.d = ezVar;
        this.e = z2;
        this.f = num;
        this.g = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.dz8) r5;
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
            boolean r1 = r5 instanceof defpackage.dz8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            dz8 r5 = (defpackage.dz8) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            jqe r1 = r4.b
            jqe r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            ez r1 = r4.d
            ez r3 = r5.d
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L_0x0037
            return r2
        L_0x0037:
            java.lang.Integer r1 = r4.f
            java.lang.Integer r3 = r5.f
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0042
            return r2
        L_0x0042:
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 == r5) goto L_0x0049
            return r2
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = ms2.d(k7d.f(au1.s(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        ez ezVar = this.d;
        int d3 = ms2.d((d2 + (ezVar == null ? 0 : ezVar.hashCode())) * 31, 31, this.e);
        Integer num = this.f;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.g) + ((d3 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuoteData(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "FORWARD" : "REPLY" : "EDIT");
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", showVerificationMark=");
        sb.append(this.c);
        sb.append(", attachDescription=");
        sb.append(this.d);
        sb.append(", isForwardAuthorHidden=");
        sb.append(this.e);
        sb.append(", startIconResId=");
        sb.append(this.f);
        sb.append(", isAuthorVisibilityAvailable=");
        return au1.j(sb, this.g, ")");
    }
}
