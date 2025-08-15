package defpackage;

/* renamed from: c1d  reason: default package */
public final class c1d implements d1d {
    public final jfd X;
    public final jqe Y = null;
    public final hfd Z;
    public final int a;
    public final jqe b;
    public final int c;
    public final long o;
    public final int s0;

    public c1d(int i, eqe eqe, int i2, long j, hfd hfd) {
        jfd jfd = jfd.b;
        this.a = i;
        this.b = eqe;
        this.c = i2;
        this.o = j;
        this.X = jfd;
        this.Z = hfd;
        this.s0 = fha.D;
    }

    public final int a() {
        return this.a;
    }

    public final jqe b() {
        return this.Y;
    }

    public final hfd e() {
        return this.Z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r8 = (defpackage.c1d) r8;
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
            boolean r1 = r8 instanceof defpackage.c1d
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            c1d r8 = (defpackage.c1d) r8
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
            hfd r7 = r7.Z
            hfd r8 = r8.Z
            boolean r7 = defpackage.tpa.f(r7, r8)
            if (r7 != 0) goto L_0x004b
            return r2
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1d.equals(java.lang.Object):boolean");
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
        if (hfd != null) {
            i = hfd.hashCode();
        }
        return hashCode2 + i;
    }

    public final int l() {
        return this.s0;
    }

    public final String toString() {
        return "SettingPrivacyItem(sectionItemType=" + z7b.m(this.a) + ", title=" + this.b + ", sectionId=" + this.c + ", itemId=" + this.o + ", type=" + this.X + ", descriptionRes=" + this.Y + ", endView=" + this.Z + ")";
    }

    public final int u() {
        return this.c;
    }
}
