package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cfc  reason: default package */
public final class cfc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ j4d Y;
    public final /* synthetic */ dfc Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cfc(j4d j4d, dfc dfc, Continuation continuation) {
        super(2, continuation);
        this.Y = j4d;
        this.Z = dfc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cfc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cfc(this.Y, this.Z, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = 3
            tx3 r4 = defpackage.tx3.a
            int r5 = r12.X
            j4d r6 = r12.Y
            dfc r7 = r12.Z
            if (r5 == 0) goto L_0x0023
            if (r5 == r2) goto L_0x001f
            if (r5 != r0) goto L_0x0017
            defpackage.od2.a0(r13)
            goto L_0x00ab
        L_0x0017:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001f:
            defpackage.od2.a0(r13)
            goto L_0x0058
        L_0x0023:
            defpackage.od2.a0(r13)
            boolean r13 = r6 instanceof defpackage.h4d
            if (r13 == 0) goto L_0x003d
            afc r13 = r7.b
            r5 = r6
            h4d r5 = (defpackage.h4d) r5
            long r8 = r5.c
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r8)
            afc r13 = defpackage.afc.a(r13, r5)
            r7.b = r13
            goto L_0x0045
        L_0x003d:
            afc r13 = r7.b
            afc r13 = defpackage.afc.a(r13, r1)
            r7.b = r13
        L_0x0045:
            je7 r13 = r7.Y
            java.lang.Object r13 = r13.getValue()
            b80 r13 = (defpackage.b80) r13
            afc r5 = r7.b
            r12.X = r2
            java.lang.Object r13 = r13.a(r5, r12)
            if (r13 != r4) goto L_0x0058
            return r4
        L_0x0058:
            z70 r13 = (defpackage.z70) r13
            nab r5 = r13.Y
            wm3 r5 = r5.a
            if (r5 == 0) goto L_0x0068
            java.lang.Long r8 = new java.lang.Long
            long r9 = r5.a
            r8.<init>(r9)
            goto L_0x0069
        L_0x0068:
            r8 = r1
        L_0x0069:
            if (r8 == 0) goto L_0x0094
            je7 r5 = r7.u0
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0077:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0094
            java.lang.Object r9 = r5.next()
            z2a r9 = (defpackage.z2a) r9
            long r10 = r8.longValue()
            ul9 r9 = (defpackage.ul9) r9
            r9.getClass()
            java.lang.String r9 = java.lang.String.valueOf(r10)
            com.my.tracker.MyTracker.trackRegistrationEvent(r9, r1)
            goto L_0x0077
        L_0x0094:
            je7 r5 = r7.Z
            java.lang.Object r5 = r5.getValue()
            hu7 r5 = (defpackage.hu7) r5
            afc r8 = r7.b
            java.lang.String r8 = r8.b
            r12.X = r0
            java.lang.String r13 = r13.c
            java.lang.Object r12 = r5.a(r13, r8, r12)
            if (r12 != r4) goto L_0x00ab
            return r4
        L_0x00ab:
            boolean r12 = r6 instanceof defpackage.i4d
            if (r12 == 0) goto L_0x00c3
            je7 r12 = r7.s0
            java.lang.Object r12 = r12.getValue()
            pk r12 = (defpackage.pk) r12
            r13 = r6
            i4d r13 = (defpackage.i4d) r13
            java.lang.String r4 = r13.c
            a20 r13 = r13.d
            k4a r12 = (defpackage.k4a) r12
            r12.F(r4, r13)
        L_0x00c3:
            bc7[] r12 = defpackage.dfc.z0
            r7.getClass()
            if (r6 != 0) goto L_0x00cc
            goto L_0x0133
        L_0x00cc:
            boolean r12 = r6 instanceof defpackage.h4d
            if (r12 == 0) goto L_0x00d4
            r13 = r6
            h4d r13 = (defpackage.h4d) r13
            goto L_0x00d5
        L_0x00d4:
            r13 = r1
        L_0x00d5:
            if (r13 == 0) goto L_0x00da
            long r4 = r13.c
            goto L_0x00dc
        L_0x00da:
            r4 = 0
        L_0x00dc:
            if (r12 == 0) goto L_0x00e0
            r12 = r2
            goto L_0x00f9
        L_0x00e0:
            boolean r12 = r6 instanceof defpackage.i4d
            if (r12 == 0) goto L_0x013b
            i4d r6 = (defpackage.i4d) r6
            int r12 = r6.e
            int r12 = defpackage.au1.s(r12)
            if (r12 == 0) goto L_0x00f8
            if (r12 != r2) goto L_0x00f2
            r12 = r0
            goto L_0x00f9
        L_0x00f2:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x00f8:
            r12 = r3
        L_0x00f9:
            je7 r13 = r7.t0
            java.lang.Object r13 = r13.getValue()
            d80 r13 = (defpackage.d80) r13
            c80 r6 = new c80
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            kpa r5 = new kpa
            java.lang.String r8 = "value"
            r5.<init>(r8, r4)
            if (r12 == r2) goto L_0x0117
            if (r12 == r0) goto L_0x0118
            if (r12 != r3) goto L_0x0116
            r0 = r3
            goto L_0x0118
        L_0x0116:
            throw r1
        L_0x0117:
            r0 = r2
        L_0x0118:
            java.lang.Short r12 = java.lang.Short.valueOf(r0)
            kpa r0 = new kpa
            java.lang.String r1 = "source"
            r0.<init>(r1, r12)
            kpa[] r12 = new defpackage.kpa[]{r5, r0}
            qi9 r12 = defpackage.usc.b(r12)
            java.lang.String r0 = "choose_avatar"
            r6.<init>(r0, r3, r12)
            r13.a(r6)
        L_0x0133:
            k56 r12 = r7.o
            r12.invoke()
            e5f r12 = defpackage.e5f.a
            return r12
        L_0x013b:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfc.o(java.lang.Object):java.lang.Object");
    }
}
