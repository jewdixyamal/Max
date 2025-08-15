package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qhd  reason: default package */
public final class qhd extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ cid Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qhd(cid cid, Continuation continuation) {
        super(2, continuation);
        this.Z = cid;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qhd) n((wdd) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qhd qhd = new qhd(this.Z, continuation);
        qhd.Y = obj;
        return qhd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: w9d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: w9d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: w9d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: w9d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 == r3) goto L_0x0015
            if (r1 != r2) goto L_0x000d
            goto L_0x0015
        L_0x000d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0015:
            defpackage.od2.a0(r9)
            goto L_0x00f9
        L_0x001a:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.Y
            wdd r9 = (defpackage.wdd) r9
            boolean r1 = r9 instanceof defpackage.vdd
            r4 = 0
            cid r5 = r8.Z
            if (r1 == 0) goto L_0x009a
            vdd r9 = (defpackage.vdd) r9
            vbd r1 = r9.a
            long r1 = r1.a
            java.lang.Long r6 = r5.G0
            if (r6 != 0) goto L_0x0034
            goto L_0x00f9
        L_0x0034:
            long r6 = r6.longValue()
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x00f9
            r5.G0 = r4
            vbd r9 = r9.a
            java.util.List r9 = r9.b
            java.util.Iterator r1 = r9.iterator()
        L_0x0046:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0058
            java.lang.Object r2 = r1.next()
            r6 = r2
            w9d r6 = (defpackage.w9d) r6
            boolean r6 = r6.X
            if (r6 == 0) goto L_0x0046
            r4 = r2
        L_0x0058:
            w9d r4 = (defpackage.w9d) r4
            r5.I0 = r4
            java.util.ArrayList r1 = r5.J0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0067:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r9.next()
            r6 = r4
            w9d r6 = (defpackage.w9d) r6
            boolean r6 = r6.X
            r6 = r6 ^ r3
            if (r6 == 0) goto L_0x0067
            r2.add(r4)
            goto L_0x0067
        L_0x007d:
            ai0 r9 = new ai0
            r4 = 27
            r9.<init>(r4)
            ii4 r4 = new ii4
            r6 = 2
            r4.<init>(r9, r6)
            java.util.List r9 = defpackage.x53.x0(r2, r4)
            r1.addAll(r9)
            r8.X = r3
            java.lang.Object r8 = defpackage.cid.q(r5, r8)
            if (r8 != r0) goto L_0x00f9
            return r0
        L_0x009a:
            boolean r1 = r9 instanceof defpackage.sdd
            if (r1 != 0) goto L_0x0102
            boolean r1 = r9 instanceof defpackage.udd
            if (r1 == 0) goto L_0x00c3
            udd r9 = (defpackage.udd) r9
            tbd r9 = r9.a
            long r3 = r9.a
            java.lang.Long r9 = r5.H0
            if (r9 != 0) goto L_0x00ad
            goto L_0x00f9
        L_0x00ad:
            long r6 = r9.longValue()
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x00f9
            java.util.ArrayList r9 = r5.J0
            r9.clear()
            r8.X = r2
            java.lang.Object r8 = defpackage.cid.q(r5, r8)
            if (r8 != r0) goto L_0x00f9
            return r0
        L_0x00c3:
            boolean r8 = r9 instanceof defpackage.tdd
            if (r8 == 0) goto L_0x00fc
            tdd r9 = (defpackage.tdd) r9
            long r8 = r9.a
            java.lang.Long r0 = r5.H0
            if (r0 != 0) goto L_0x00d0
            goto L_0x00ea
        L_0x00d0:
            long r0 = r0.longValue()
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00ea
            r5.H0 = r4
            bed r8 = new bed
            int r9 = defpackage.kha.B
            eqe r0 = new eqe
            r0.<init>(r9)
            r8.<init>(r0)
            r5.w(r8)
            goto L_0x00f9
        L_0x00ea:
            java.lang.Long r0 = r5.G0
            if (r0 != 0) goto L_0x00ef
            goto L_0x00f9
        L_0x00ef:
            long r0 = r0.longValue()
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x00f9
            r5.G0 = r4
        L_0x00f9:
            e5f r8 = defpackage.e5f.a
            return r8
        L_0x00fc:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x0102:
            sdd r9 = (defpackage.sdd) r9
            r9.getClass()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhd.o(java.lang.Object):java.lang.Object");
    }
}
