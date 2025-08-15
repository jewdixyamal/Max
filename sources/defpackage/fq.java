package defpackage;

/* renamed from: fq  reason: default package */
public final class fq implements ol7 {
    public final bq a;
    public final Boolean b;
    public final jqe c;

    public fq(bq bqVar, Boolean bool, jqe jqe) {
        this.a = bqVar;
        this.b = bool;
        this.c = jqe;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.fq) r5;
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
            boolean r1 = r5 instanceof defpackage.fq
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            fq r5 = (defpackage.fq) r5
            bq r1 = r5.a
            bq r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.Boolean r1 = r4.b
            java.lang.Boolean r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            jqe r4 = r4.c
            jqe r5 = r5.c
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0029
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fq.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) this.a.ordinal();
    }

    public final boolean h(ol7 ol7) {
        return getItemId() == ol7.getItemId();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return this.c.hashCode() + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final int l() {
        return 0;
    }

    public final Object n(Object obj) {
        ol7 ol7 = (ol7) obj;
        fq fqVar = ol7 instanceof fq ? (fq) ol7 : null;
        if (fqVar == null) {
            return null;
        }
        Boolean bool = this.b;
        Boolean bool2 = fqVar.b;
        if (!tpa.f(bool, bool2)) {
            return new dq(bool2);
        }
        return null;
    }

    public final String toString() {
        return "AppearanceModeItem(mode=" + this.a + ", isSelected=" + this.b + ", title=" + this.c + ")";
    }
}
