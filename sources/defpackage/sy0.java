package defpackage;

/* renamed from: sy0  reason: default package */
public final class sy0 implements kfd {
    public final jfd X;
    public final jqe Y;
    public final hfd Z;
    public final int a;
    public final jqe b;
    public final int c;
    public final long o;
    public final Integer s0;
    public final int t0;
    public final boolean u0;

    public sy0(eqe eqe, long j, jfd jfd, eqe eqe2, hfd hfd, Integer num, int i, boolean z, int i2) {
        jfd = (i2 & 16) != 0 ? jfd.b : jfd;
        eqe2 = (i2 & 32) != 0 ? null : eqe2;
        hfd = (i2 & 64) != 0 ? null : hfd;
        i = (i2 & 256) != 0 ? y7a.l0 : i;
        z = (i2 & 512) != 0 ? true : z;
        this.a = 4;
        this.b = eqe;
        this.c = 0;
        this.o = j;
        this.X = jfd;
        this.Y = eqe2;
        this.Z = hfd;
        this.s0 = num;
        this.t0 = i;
        this.u0 = z;
    }

    public final jqe b() {
        return this.Y;
    }

    public final bfd c() {
        return null;
    }

    public final jqe d() {
        return null;
    }

    public final hfd e() {
        return this.Z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.sy0) r8;
        r1 = r8.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof defpackage.sy0
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            sy0 r8 = (defpackage.sy0) r8
            int r1 = r8.a
            int r3 = r7.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            jqe r1 = r7.b
            jqe r3 = r8.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            int r1 = r7.c
            int r3 = r8.c
            if (r1 == r3) goto L_0x0025
            return r2
        L_0x0025:
            long r3 = r7.o
            long r5 = r8.o
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x002e
            return r2
        L_0x002e:
            jfd r1 = r7.X
            jfd r3 = r8.X
            if (r1 == r3) goto L_0x0035
            return r2
        L_0x0035:
            jqe r1 = r7.Y
            jqe r3 = r8.Y
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0040
            return r2
        L_0x0040:
            hfd r1 = r7.Z
            hfd r3 = r8.Z
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x004b
            return r2
        L_0x004b:
            java.lang.Integer r1 = r7.s0
            java.lang.Integer r3 = r8.s0
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0056
            return r2
        L_0x0056:
            int r1 = r7.t0
            int r3 = r8.t0
            if (r1 == r3) goto L_0x005d
            return r2
        L_0x005d:
            boolean r7 = r7.u0
            boolean r8 = r8.u0
            if (r7 == r8) goto L_0x0064
            return r2
        L_0x0064:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy0.equals(java.lang.Object):boolean");
    }

    public final Integer f() {
        return this.s0;
    }

    public final long getItemId() {
        return this.o;
    }

    public final jqe getTitle() {
        return this.b;
    }

    public final jfd getType() {
        return this.X;
    }

    public final int hashCode() {
        int hashCode = (this.X.hashCode() + h4f.m(k7d.e(this.c, k7d.f(au1.s(this.a) * 31, 31, this.b), 31), 31, this.o)) * 31;
        int i = 0;
        jqe jqe = this.Y;
        int hashCode2 = (hashCode + (jqe == null ? 0 : jqe.hashCode())) * 31;
        hfd hfd = this.Z;
        int hashCode3 = (hashCode2 + (hfd == null ? 0 : hfd.hashCode())) * 31;
        Integer num = this.s0;
        if (num != null) {
            i = num.hashCode();
        }
        return Boolean.hashCode(this.u0) + k7d.e(this.t0, (hashCode3 + i) * 31, 31);
    }

    public final int l() {
        return this.t0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionItem(sectionItemType=");
        sb.append(z7b.m(this.a));
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=");
        sb.append(this.c);
        sb.append(", itemId=");
        sb.append(this.o);
        sb.append(", type=");
        sb.append(this.X);
        sb.append(", descriptionRes=");
        sb.append(this.Y);
        sb.append(", endView=");
        sb.append(this.Z);
        sb.append(", startIconRes=");
        sb.append(this.s0);
        sb.append(", viewType=");
        sb.append(this.t0);
        sb.append(", isAvailable=");
        return au1.j(sb, this.u0, ")");
    }

    public final int u() {
        return this.c;
    }
}
