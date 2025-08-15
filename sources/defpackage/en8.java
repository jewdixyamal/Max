package defpackage;

/* renamed from: en8  reason: default package */
public final class en8 implements ol7 {
    public final hfd X;
    public final long Y;
    public final int Z = eda.a;
    public final int a;
    public final jqe b;
    public final jfd c;
    public final Integer o;

    public en8(int i, jqe jqe, jfd jfd, Integer num, hfd hfd) {
        this.a = i;
        this.b = jqe;
        this.c = jfd;
        this.o = num;
        this.X = hfd;
        this.Y = (long) i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.en8) r5;
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
            boolean r1 = r5 instanceof defpackage.en8
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            en8 r5 = (defpackage.en8) r5
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
            jfd r1 = r4.c
            jfd r3 = r5.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            java.lang.Integer r1 = r4.o
            java.lang.Integer r3 = r5.o
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            hfd r4 = r4.X
            hfd r5 = r5.X
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x003b
            return r2
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en8.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return this.Y;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + k7d.f(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        int i = 0;
        Integer num = this.o;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        hfd hfd = this.X;
        if (hfd != null) {
            i = hfd.hashCode();
        }
        return hashCode2 + i;
    }

    public final int l() {
        return this.Z;
    }

    public final String toString() {
        return "MemberListActionItem(id=" + this.a + ", text=" + this.b + ", type=" + this.c + ", startIconRes=" + this.o + ", endViewType=" + this.X + ")";
    }
}
