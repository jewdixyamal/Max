package defpackage;

/* renamed from: yn5  reason: default package */
public final class yn5 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ a66 c;

    public /* synthetic */ yn5(on5 on5, a66 a66, int i) {
        this.a = i;
        this.b = on5;
        this.c = a66;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x019d;
                case 1: goto L_0x0133;
                case 2: goto L_0x00c1;
                case 3: goto L_0x0065;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r8 instanceof defpackage.nq5
            if (r0 == 0) goto L_0x0018
            r0 = r8
            nq5 r0 = (defpackage.nq5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            nq5 r0 = new nq5
            r0.<init>(r6, r8)
        L_0x001d:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            defpackage.od2.a0(r8)
            goto L_0x0062
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            on5 r6 = r0.s0
            java.lang.Object r7 = r0.Z
            defpackage.od2.a0(r8)
            goto L_0x0054
        L_0x003f:
            defpackage.od2.a0(r8)
            r0.Z = r7
            on5 r8 = r6.b
            r0.s0 = r8
            r0.X = r4
            a66 r6 = r6.c
            java.lang.Object r6 = r6.invoke(r7, r0)
            if (r6 != r1) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            r6 = r8
        L_0x0054:
            r8 = 0
            r0.Z = r8
            r0.s0 = r8
            r0.X = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            e5f r1 = defpackage.e5f.a
        L_0x0064:
            return r1
        L_0x0065:
            boolean r0 = r8 instanceof defpackage.tp5
            if (r0 == 0) goto L_0x0078
            r0 = r8
            tp5 r0 = (defpackage.tp5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0078
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x007d
        L_0x0078:
            tp5 r0 = new tp5
            r0.<init>(r6, r8)
        L_0x007d:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x009d
            if (r2 == r4) goto L_0x0097
            if (r2 != r3) goto L_0x008f
            defpackage.od2.a0(r8)
            goto L_0x00be
        L_0x008f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0097:
            on5 r6 = r0.Y
            defpackage.od2.a0(r8)
            goto L_0x00b2
        L_0x009d:
            defpackage.od2.a0(r8)
            on5 r8 = r6.b
            r0.Y = r8
            r0.X = r4
            a66 r6 = r6.c
            java.lang.Object r6 = r6.invoke(r7, r0)
            if (r6 != r1) goto L_0x00af
            goto L_0x00c0
        L_0x00af:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x00b2:
            r7 = 0
            r0.Y = r7
            r0.X = r3
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            e5f r1 = defpackage.e5f.a
        L_0x00c0:
            return r1
        L_0x00c1:
            boolean r0 = r8 instanceof defpackage.pp5
            if (r0 == 0) goto L_0x00d4
            r0 = r8
            pp5 r0 = (defpackage.pp5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00d4
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x00d9
        L_0x00d4:
            pp5 r0 = new pp5
            r0.<init>(r6, r8)
        L_0x00d9:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x00fd
            if (r2 == r4) goto L_0x00f5
            if (r2 != r3) goto L_0x00ed
            yn5 r6 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x0128
        L_0x00ed:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x00f5:
            java.lang.Object r7 = r0.s0
            yn5 r6 = r0.o
            defpackage.od2.a0(r8)
            goto L_0x010f
        L_0x00fd:
            defpackage.od2.a0(r8)
            r0.o = r6
            r0.s0 = r7
            r0.Y = r4
            a66 r8 = r6.c
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L_0x010f
            goto L_0x012c
        L_0x010f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0127
            on5 r8 = r6.b
            r0.o = r6
            r2 = 0
            r0.s0 = r2
            r0.Y = r3
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L_0x0128
            goto L_0x012c
        L_0x0127:
            r4 = 0
        L_0x0128:
            if (r4 == 0) goto L_0x012d
            e5f r1 = defpackage.e5f.a
        L_0x012c:
            return r1
        L_0x012d:
            kotlinx.coroutines.flow.internal.AbortFlowException r7 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r7.<init>(r6)
            throw r7
        L_0x0133:
            boolean r0 = r8 instanceof defpackage.do5
            if (r0 == 0) goto L_0x0146
            r0 = r8
            do5 r0 = (defpackage.do5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0146
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x014b
        L_0x0146:
            do5 r0 = new do5
            r0.<init>(r6, r8)
        L_0x014b:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x016d
            if (r2 == r4) goto L_0x0165
            if (r2 != r3) goto L_0x015d
            defpackage.od2.a0(r8)
            goto L_0x019a
        L_0x015d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0165:
            on5 r6 = r0.Z
            java.lang.Object r7 = r0.Y
            defpackage.od2.a0(r8)
            goto L_0x0184
        L_0x016d:
            defpackage.od2.a0(r8)
            r0.Y = r7
            on5 r8 = r6.b
            r0.Z = r8
            r0.X = r4
            a66 r6 = r6.c
            java.lang.Object r6 = r6.invoke(r7, r0)
            if (r6 != r1) goto L_0x0181
            goto L_0x019c
        L_0x0181:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0184:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x019a
            r8 = 0
            r0.Y = r8
            r0.Z = r8
            r0.X = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            e5f r1 = defpackage.e5f.a
        L_0x019c:
            return r1
        L_0x019d:
            boolean r0 = r8 instanceof defpackage.xn5
            if (r0 == 0) goto L_0x01b0
            r0 = r8
            xn5 r0 = (defpackage.xn5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x01b0
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x01b5
        L_0x01b0:
            xn5 r0 = new xn5
            r0.<init>(r6, r8)
        L_0x01b5:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x01cc
            if (r2 != r3) goto L_0x01c4
            defpackage.od2.a0(r8)
            goto L_0x01fb
        L_0x01c4:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x01cc:
            defpackage.od2.a0(r8)
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01fe
            java.lang.Object r8 = r7.next()
        L_0x01df:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x01f0
            a66 r2 = r6.c
            java.lang.Object r4 = r7.next()
            java.lang.Object r8 = r2.invoke(r8, r4)
            goto L_0x01df
        L_0x01f0:
            r0.X = r3
            on5 r6 = r6.b
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L_0x01fb
            goto L_0x01fd
        L_0x01fb:
            e5f r1 = defpackage.e5f.a
        L_0x01fd:
            return r1
        L_0x01fe:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r7 = "Empty collection can't be reduced."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn5.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public yn5(a66 a66, on5 on5) {
        this.a = 2;
        this.c = a66;
        this.b = on5;
    }
}
