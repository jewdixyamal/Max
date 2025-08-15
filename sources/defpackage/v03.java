package defpackage;

/* renamed from: v03  reason: default package */
public final class v03 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ qp4 c;

    public /* synthetic */ v03(on5 on5, qp4 qp4, int i) {
        this.a = i;
        this.b = on5;
        this.c = qp4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x00e0;
                case 1: goto L_0x008c;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r8 = r9 instanceof defpackage.e13
            if (r8 == 0) goto L_0x0018
            r8 = r9
            e13 r8 = (defpackage.e13) r8
            int r0 = r8.X
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0018
            int r0 = r0 - r1
            r8.X = r0
            goto L_0x001d
        L_0x0018:
            e13 r8 = new e13
            r8.<init>(r7, r9)
        L_0x001d:
            java.lang.Object r9 = r8.o
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.X
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            defpackage.od2.a0(r9)
            goto L_0x0089
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            defpackage.od2.a0(r9)
            on5 r9 = r7.b
            qp4 r1 = r7.c
            java.lang.Object r1 = r1.a
            java.lang.String r1 = (java.lang.String) r1
            ir6 r3 = defpackage.hm9.m
            r4 = 0
            if (r3 != 0) goto L_0x0045
            goto L_0x0052
        L_0x0045:
            boolean r5 = r3.c()
            if (r5 == 0) goto L_0x0052
            us7 r5 = defpackage.us7.X
            java.lang.String r6 = "big_flow: map"
            r3.d(r5, r1, r6, r4)
        L_0x0052:
            qp4 r1 = r7.c
            java.lang.Object r3 = r1.X
            adb r3 = (defpackage.adb) r3
            java.lang.Object r1 = r1.Y
            pl8 r1 = (defpackage.pl8) r1
            java.lang.Object r1 = r1.c
            je7 r1 = (defpackage.je7) r1
            java.lang.Object r1 = r1.getValue()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            sba r5 = defpackage.sba.d
            java.lang.String r5 = r5.a
            java.lang.String r6 = "themename"
            java.lang.String r1 = r1.getString(r6, r5)
            sba r1 = r3.f(r1)
            if (r1 == 0) goto L_0x0080
            qp4 r7 = r7.c
            boolean r7 = r7.j()
            fka r4 = r1.a(r7)
        L_0x0080:
            r8.X = r2
            java.lang.Object r7 = r9.a(r4, r8)
            if (r7 != r0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            e5f r0 = defpackage.e5f.a
        L_0x008b:
            return r0
        L_0x008c:
            boolean r0 = r9 instanceof defpackage.d13
            if (r0 == 0) goto L_0x009f
            r0 = r9
            d13 r0 = (defpackage.d13) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x009f
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x00a4
        L_0x009f:
            d13 r0 = new d13
            r0.<init>(r7, r9)
        L_0x00a4:
            java.lang.Object r9 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00bb
            if (r2 != r3) goto L_0x00b3
            defpackage.od2.a0(r9)
            goto L_0x00dd
        L_0x00b3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x00bb:
            defpackage.od2.a0(r9)
            r9 = r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.floatValue()
            qp4 r9 = r7.c
            java.lang.Object r9 = r9.Y
            pl8 r9 = (defpackage.pl8) r9
            gq9 r9 = r9.y()
            boolean r9 = r9 instanceof defpackage.bq9
            if (r9 == 0) goto L_0x00dd
            r0.X = r3
            on5 r7 = r7.b
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            e5f r1 = defpackage.e5f.a
        L_0x00df:
            return r1
        L_0x00e0:
            boolean r0 = r9 instanceof defpackage.u03
            if (r0 == 0) goto L_0x00f3
            r0 = r9
            u03 r0 = (defpackage.u03) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00f3
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x00f8
        L_0x00f3:
            u03 r0 = new u03
            r0.<init>(r7, r9)
        L_0x00f8:
            java.lang.Object r9 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x010f
            if (r2 != r3) goto L_0x0107
            defpackage.od2.a0(r9)
            goto L_0x0129
        L_0x0107:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x010f:
            defpackage.od2.a0(r9)
            java.lang.String r8 = (java.lang.String) r8
            qp4 r8 = r7.c
            java.lang.Object r8 = r8.Y
            pl8 r8 = (defpackage.pl8) r8
            gq9 r8 = r8.y()
            r0.X = r3
            on5 r7 = r7.b
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            e5f r1 = defpackage.e5f.a
        L_0x012b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v03.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
