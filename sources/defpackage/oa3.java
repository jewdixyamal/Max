package defpackage;

/* renamed from: oa3  reason: default package */
public final class oa3 extends pnf {
    public final s35 X = new s35(0);
    public final long b;
    public final je7 c;
    public final w7c o;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0055, code lost:
        r9 = (java.lang.String[]) r9.toArray(new java.lang.String[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public oa3(long r8) {
        /*
            r7 = this;
            ja3 r0 = defpackage.ja3.a
            v4 r1 = r0.getAccessor()
            java.lang.Class<db6> r2 = defpackage.db6.class
            java.lang.Object r1 = r1.c(r2)
            db6 r1 = (defpackage.db6) r1
            v4 r0 = r0.getAccessor()
            java.lang.Class<pk> r2 = defpackage.pk.class
            khe r0 = r0.d(r2)
            r7.<init>()
            r7.b = r8
            r7.c = r0
            nz4 r8 = defpackage.nz4.a
            q0e r8 = defpackage.r0e.a(r8)
            w7c r9 = new w7c
            r9.<init>(r8)
            r7.o = r9
            s35 r9 = new s35
            r0 = 0
            r9.<init>(r0)
            r7.X = r9
            java.lang.Class<da3> r7 = defpackage.da3.class
            java.util.EnumSet r7 = java.util.EnumSet.noneOf(r7)
            je7 r9 = r1.a
            java.lang.Object r9 = r9.getValue()
            y7d r9 = (defpackage.y7d) r9
            qyc r9 = (defpackage.qyc) r9
            r9.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f9availablecomplaints
            java.lang.String r0 = r0.name()
            r1 = 0
            java.util.List r9 = r9.h(r0, r1)
            r0 = 0
            if (r9 == 0) goto L_0x005f
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.Object[] r9 = r9.toArray(r2)
            java.lang.String[] r9 = (java.lang.String[]) r9
            if (r9 != 0) goto L_0x0061
        L_0x005f:
            java.lang.String[] r9 = new java.lang.String[r0]
        L_0x0061:
            int r2 = r9.length
            r3 = r0
        L_0x0063:
            if (r3 >= r2) goto L_0x0082
            r4 = r9[r3]
            da3 r4 = defpackage.da3.a(r4)     // Catch:{ all -> 0x006c }
            goto L_0x0073
        L_0x006c:
            r4 = move-exception
            njc r5 = new njc
            r5.<init>(r4)
            r4 = r5
        L_0x0073:
            boolean r5 = r4 instanceof defpackage.njc
            if (r5 == 0) goto L_0x0078
            r4 = r1
        L_0x0078:
            da3 r4 = (defpackage.da3) r4
            if (r4 == 0) goto L_0x007f
            r7.add(r4)
        L_0x007f:
            int r3 = r3 + 1
            goto L_0x0063
        L_0x0082:
            java.util.ArrayList r9 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.z53.S(r7, r2)
            r9.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L_0x0091:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x010d
            java.lang.Object r2 = r7.next()
            da3 r2 = (defpackage.da3) r2
            int r3 = r2.ordinal()
            int r2 = r2.ordinal()
            r4 = 2
            if (r2 == 0) goto L_0x00fd
            r5 = 1
            if (r2 == r5) goto L_0x00f0
            if (r2 == r4) goto L_0x00e3
            r5 = 3
            if (r2 == r5) goto L_0x00d6
            r5 = 4
            if (r2 == r5) goto L_0x00c9
            r5 = 5
            if (r2 != r5) goto L_0x00c3
            mg3 r2 = new mg3
            int r5 = defpackage.maa.g
            eqe r6 = new eqe
            r6.<init>(r5)
            r2.<init>(r3, r6, r4, r0)
            goto L_0x0109
        L_0x00c3:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x00c9:
            mg3 r2 = new mg3
            int r5 = defpackage.maa.j
            eqe r6 = new eqe
            r6.<init>(r5)
            r2.<init>(r3, r6, r4, r0)
            goto L_0x0109
        L_0x00d6:
            mg3 r2 = new mg3
            int r5 = defpackage.maa.f
            eqe r6 = new eqe
            r6.<init>(r5)
            r2.<init>(r3, r6, r4, r0)
            goto L_0x0109
        L_0x00e3:
            mg3 r2 = new mg3
            int r5 = defpackage.maa.e
            eqe r6 = new eqe
            r6.<init>(r5)
            r2.<init>(r3, r6, r4, r0)
            goto L_0x0109
        L_0x00f0:
            mg3 r2 = new mg3
            int r5 = defpackage.maa.h
            eqe r6 = new eqe
            r6.<init>(r5)
            r2.<init>(r3, r6, r4, r0)
            goto L_0x0109
        L_0x00fd:
            mg3 r2 = new mg3
            int r5 = defpackage.maa.i
            eqe r6 = new eqe
            r6.<init>(r5)
            r2.<init>(r3, r6, r4, r0)
        L_0x0109:
            r9.add(r2)
            goto L_0x0091
        L_0x010d:
            r8.m(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oa3.<init>(long):void");
    }
}
