package defpackage;

/* renamed from: gd2  reason: default package */
public final class gd2 {
    public final e52 a;

    public gd2(e52 e52) {
        this.a = e52;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r3 = ((defpackage.gd2) r10).a.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 1
            if (r9 != r10) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r10 instanceof defpackage.gd2
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            e52 r9 = r9.a
            es8 r1 = r9.c
            if (r1 == 0) goto L_0x001e
            r3 = r10
            gd2 r3 = (defpackage.gd2) r3
            e52 r3 = r3.a
            es8 r3 = r3.c
            if (r3 == 0) goto L_0x001e
            boolean r1 = defpackage.s5c.h(r1, r3)
            goto L_0x001f
        L_0x001e:
            r1 = r0
        L_0x001f:
            k92 r3 = r9.b
            long r4 = r3.l
            gd2 r10 = (defpackage.gd2) r10
            e52 r6 = r10.a
            k92 r6 = r6.b
            long r7 = r6.l
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x00af
            long r4 = r3.a
            long r7 = r6.a
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x00af
            long r3 = r3.k
            long r5 = r6.k
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00af
            es8 r9 = r9.c
            r3 = 0
            if (r9 == 0) goto L_0x0051
            cu8 r4 = r9.a
            if (r4 == 0) goto L_0x0051
            long r4 = r4.h()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0052
        L_0x0051:
            r4 = r3
        L_0x0052:
            e52 r10 = r10.a
            es8 r5 = r10.c
            if (r5 == 0) goto L_0x0065
            cu8 r5 = r5.a
            if (r5 == 0) goto L_0x0065
            long r5 = r5.h()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x0066
        L_0x0065:
            r5 = r3
        L_0x0066:
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 == 0) goto L_0x00af
            if (r1 == 0) goto L_0x00af
            if (r9 == 0) goto L_0x0079
            uj3 r1 = r9.b
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = r1.d()
            goto L_0x007a
        L_0x0079:
            r1 = r3
        L_0x007a:
            es8 r4 = r10.c
            if (r4 == 0) goto L_0x0087
            uj3 r4 = r4.b
            if (r4 == 0) goto L_0x0087
            java.lang.String r4 = r4.d()
            goto L_0x0088
        L_0x0087:
            r4 = r3
        L_0x0088:
            boolean r1 = defpackage.tpa.f(r1, r4)
            if (r1 == 0) goto L_0x00af
            kk0 r1 = defpackage.kk0.a
            if (r9 == 0) goto L_0x009b
            uj3 r9 = r9.b
            if (r9 == 0) goto L_0x009b
            java.lang.String r9 = r9.p(r1)
            goto L_0x009c
        L_0x009b:
            r9 = r3
        L_0x009c:
            es8 r10 = r10.c
            if (r10 == 0) goto L_0x00a8
            uj3 r10 = r10.b
            if (r10 == 0) goto L_0x00a8
            java.lang.String r3 = r10.p(r1)
        L_0x00a8:
            boolean r9 = defpackage.tpa.f(r9, r3)
            if (r9 == 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r0 = r2
        L_0x00b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd2.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002d, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r12 = this;
            java.lang.Class<gd2> r0 = defpackage.gd2.class
            int r0 = r0.hashCode()
            e52 r12 = r12.a
            k92 r1 = r12.b
            long r1 = r1.l
            int r1 = java.lang.Long.hashCode(r1)
            r2 = 31
            int r1 = r1 * r2
            int r1 = r1 + r0
            k92 r0 = r12.b
            long r3 = r0.a
            int r0 = java.lang.Long.hashCode(r3)
            int r0 = r0 * r2
            int r0 = r0 + r1
            k92 r1 = r12.b
            long r3 = r1.k
            int r1 = java.lang.Long.hashCode(r3)
            int r1 = r1 * r2
            int r1 = r1 + r0
            es8 r0 = r12.c
            r3 = 0
            if (r0 == 0) goto L_0x003a
            cu8 r0 = r0.a
            if (r0 == 0) goto L_0x003a
            long r4 = r0.h()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            goto L_0x003b
        L_0x003a:
            r0 = r3
        L_0x003b:
            r4 = 0
            if (r0 == 0) goto L_0x0043
            int r0 = r0.hashCode()
            goto L_0x0044
        L_0x0043:
            r0 = r4
        L_0x0044:
            int r0 = r0 * r2
            int r0 = r0 + r1
            es8 r1 = r12.c
            if (r1 == 0) goto L_0x0051
            cu8 r1 = r1.a
            if (r1 == 0) goto L_0x0051
            k8g r1 = r1.z0
            goto L_0x0052
        L_0x0051:
            r1 = r3
        L_0x0052:
            if (r1 == 0) goto L_0x0129
            int r5 = r1.i()
            if (r5 != 0) goto L_0x005c
            goto L_0x0129
        L_0x005c:
            r5 = r4
            r6 = r5
        L_0x005e:
            int r7 = r1.i()
            if (r5 >= r7) goto L_0x012a
            l20 r7 = r1.h(r5)
            if (r7 == 0) goto L_0x0125
            int r6 = r6 * 31
            g20 r8 = r7.a
            int r8 = java.util.Objects.hashCode(r8)
            int r8 = r8 * r2
            x10 r9 = r7.b
            int r9 = java.util.Objects.hashCode(r9)
            int r9 = r9 + r8
            int r9 = r9 * r2
            q10 r8 = r7.c
            int r8 = java.util.Objects.hashCode(r8)
            int r8 = r8 + r9
            int r8 = r8 * r2
            k20 r9 = r7.d
            int r9 = java.util.Objects.hashCode(r9)
            int r9 = r9 + r8
            int r9 = r9 * r2
            i10 r8 = r7.e
            int r8 = java.util.Objects.hashCode(r8)
            int r8 = r8 + r9
            int r8 = r8 * r2
            f20 r9 = r7.f
            int r9 = java.util.Objects.hashCode(r9)
            int r9 = r9 + r8
            int r9 = r9 * r2
            c20 r8 = r7.g
            int r8 = java.util.Objects.hashCode(r8)
            int r8 = r8 + r9
            int r8 = r8 * r2
            g10 r9 = r7.h
            int r9 = java.util.Objects.hashCode(r9)
            int r9 = r9 + r8
            int r9 = r9 * r2
            l10 r8 = r7.i
            int r8 = java.util.Objects.hashCode(r8)
            int r8 = r8 + r9
            int r8 = r8 * r2
            s10 r9 = r7.j
            int r9 = java.util.Objects.hashCode(r9)
            int r9 = r9 + r8
            int r9 = r9 * r2
            n10 r8 = r7.k
            int r8 = java.util.Objects.hashCode(r8)
            int r8 = r8 + r9
            int r8 = r8 * r2
            y10 r9 = r7.l
            int r9 = java.util.Objects.hashCode(r9)
            int r9 = r9 + r8
            int r9 = r9 * r2
            u10 r8 = r7.m
            int r8 = java.util.Objects.hashCode(r8)
            int r8 = r8 + r9
            int r8 = r8 * r2
            d20 r9 = r7.o
            int r9 = java.util.Objects.hashCode(r9)
            int r9 = r9 + r8
            int r9 = r9 * r2
            long r10 = r7.p
            int r8 = defpackage.h4f.m(r9, r2, r10)
            float r9 = r7.q
            int r8 = defpackage.ms2.c(r8, r9, r2)
            java.lang.String r9 = r7.r
            int r9 = java.util.Objects.hashCode(r9)
            int r9 = r9 + r8
            int r9 = r9 * r2
            java.lang.String r8 = r7.s
            int r8 = java.util.Objects.hashCode(r8)
            int r8 = r8 + r9
            int r8 = r8 * r2
            boolean r9 = r7.t
            int r8 = defpackage.ms2.d(r8, r2, r9)
            long r9 = r7.u
            int r8 = defpackage.h4f.m(r8, r2, r9)
            long r9 = r7.v
            int r8 = defpackage.h4f.m(r8, r2, r9)
            long r9 = r7.w
            int r8 = defpackage.h4f.m(r8, r2, r9)
            z10 r9 = r7.x
            int r9 = java.util.Objects.hashCode(r9)
            int r9 = r9 + r8
            int r9 = r9 * r2
            boolean r8 = r7.y
            int r8 = defpackage.ms2.d(r9, r2, r8)
            boolean r7 = r7.z
            int r7 = java.lang.Boolean.hashCode(r7)
            int r7 = r7 + r8
            int r6 = r6 + r7
        L_0x0125:
            int r5 = r5 + 1
            goto L_0x005e
        L_0x0129:
            r6 = r4
        L_0x012a:
            int r6 = r6 * r2
            int r6 = r6 + r0
            es8 r0 = r12.c
            if (r0 == 0) goto L_0x0139
            uj3 r0 = r0.b
            if (r0 == 0) goto L_0x0139
            java.lang.String r0 = r0.d()
            goto L_0x013a
        L_0x0139:
            r0 = r3
        L_0x013a:
            if (r0 == 0) goto L_0x0141
            int r0 = r0.hashCode()
            goto L_0x0142
        L_0x0141:
            r0 = r4
        L_0x0142:
            int r0 = r0 * r2
            int r0 = r0 + r6
            es8 r12 = r12.c
            if (r12 == 0) goto L_0x0152
            uj3 r12 = r12.b
            if (r12 == 0) goto L_0x0152
            kk0 r1 = defpackage.kk0.a
            java.lang.String r3 = r12.p(r1)
        L_0x0152:
            if (r3 == 0) goto L_0x0158
            int r4 = r3.hashCode()
        L_0x0158:
            int r4 = r4 * r2
            int r4 = r4 + r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd2.hashCode():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r9 = r9.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r9 = this;
            e52 r9 = r9.a
            k92 r0 = r9.b
            long r1 = r0.l
            long r3 = r0.a
            long r5 = r0.k
            es8 r9 = r9.c
            if (r9 == 0) goto L_0x0017
            cu8 r9 = r9.a
            if (r9 == 0) goto L_0x0017
            long r7 = r9.h()
            goto L_0x0019
        L_0x0017:
            r7 = 0
        L_0x0019:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            java.lang.String r0 = ":"
            r9.append(r0)
            r9.append(r3)
            defpackage.au1.q(r5, r0, r0, r9)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd2.toString():java.lang.String");
    }
}
