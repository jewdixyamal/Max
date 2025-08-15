package defpackage;

/* renamed from: beb  reason: default package */
public final class beb implements on5 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ on5 c;
    public final /* synthetic */ feb o;

    public /* synthetic */ beb(on5 on5, feb feb, int i) {
        this.a = i;
        this.o = feb;
        this.c = on5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 0: goto L_0x0061;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r12 instanceof defpackage.deb
            if (r0 == 0) goto L_0x0018
            r0 = r12
            deb r0 = (defpackage.deb) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            deb r0 = new deb
            r0.<init>(r10, r12)
        L_0x001d:
            java.lang.Object r12 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            defpackage.od2.a0(r12)
            goto L_0x0056
        L_0x002c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0034:
            defpackage.od2.a0(r12)
            int r12 = r10.b
            int r2 = r12 + 1
            r10.b = r2
            if (r12 < 0) goto L_0x0059
            if (r12 != 0) goto L_0x004b
            r12 = r11
            pdb r12 = (defpackage.pdb) r12
            feb r2 = r10.o
            q0e r2 = r2.z0
            r2.setValue(r12)
        L_0x004b:
            r0.X = r3
            on5 r10 = r10.c
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            e5f r1 = defpackage.e5f.a
        L_0x0058:
            return r1
        L_0x0059:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "Index overflow has happened"
            r10.<init>(r11)
            throw r10
        L_0x0061:
            boolean r0 = r12 instanceof defpackage.aeb
            if (r0 == 0) goto L_0x0074
            r0 = r12
            aeb r0 = (defpackage.aeb) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0074
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0079
        L_0x0074:
            aeb r0 = new aeb
            r0.<init>(r10, r12)
        L_0x0079:
            java.lang.Object r12 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            r4 = 3
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L_0x00b5
            if (r2 == r3) goto L_0x00a5
            if (r2 == r5) goto L_0x0098
            if (r2 != r4) goto L_0x0090
            defpackage.od2.a0(r12)
            goto L_0x0122
        L_0x0090:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0098:
            java.lang.Object r10 = r0.t0
            ti9 r10 = (defpackage.ti9) r10
            java.lang.Object r11 = r0.Z
            beb r2 = r0.Y
            defpackage.od2.a0(r12)
            goto L_0x010d
        L_0x00a5:
            q0e r10 = r0.v0
            uj3 r11 = r0.u0
            java.lang.Object r2 = r0.t0
            e52 r2 = (defpackage.e52) r2
            java.lang.Object r3 = r0.Z
            beb r7 = r0.Y
            defpackage.od2.a0(r12)
            goto L_0x00ec
        L_0x00b5:
            defpackage.od2.a0(r12)
            int r12 = r10.b
            int r2 = r12 + 1
            r10.b = r2
            if (r12 < 0) goto L_0x0125
            if (r12 != 0) goto L_0x0111
            r12 = r11
            kpa r12 = (defpackage.kpa) r12
            java.lang.Object r2 = r12.a
            e52 r2 = (defpackage.e52) r2
            java.lang.Object r12 = r12.b
            uj3 r12 = (defpackage.uj3) r12
            feb r7 = r10.o
            q0e r8 = r7.z0
            r0.Y = r10
            r0.Z = r11
            r0.t0 = r2
            r0.u0 = r12
            r0.v0 = r8
            r0.X = r3
            boolean r3 = r7.A0
            pdb r3 = defpackage.feb.q(r7, r2, r12, r3)
            if (r3 != r1) goto L_0x00e6
            goto L_0x0124
        L_0x00e6:
            r7 = r10
            r10 = r8
            r9 = r3
            r3 = r11
            r11 = r12
            r12 = r9
        L_0x00ec:
            r10.setValue(r12)
            feb r10 = r7.o
            q0e r12 = r10.y0
            r0.Y = r7
            r0.Z = r3
            r0.t0 = r12
            r0.u0 = r6
            r0.v0 = r6
            r0.X = r5
            boolean r5 = r10.A0
            pdb r10 = defpackage.feb.q(r10, r2, r11, r5)
            if (r10 != r1) goto L_0x0108
            goto L_0x0124
        L_0x0108:
            r11 = r3
            r2 = r7
            r9 = r12
            r12 = r10
            r10 = r9
        L_0x010d:
            r10.setValue(r12)
            r10 = r2
        L_0x0111:
            on5 r10 = r10.c
            r0.Y = r6
            r0.Z = r6
            r0.t0 = r6
            r0.X = r4
            java.lang.Object r10 = r10.a(r11, r0)
            if (r10 != r1) goto L_0x0122
            goto L_0x0124
        L_0x0122:
            e5f r1 = defpackage.e5f.a
        L_0x0124:
            return r1
        L_0x0125:
            java.lang.ArithmeticException r10 = new java.lang.ArithmeticException
            java.lang.String r11 = "Index overflow has happened"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.beb.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
