package defpackage;

/* renamed from: zn5  reason: default package */
public final class zn5 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn5 b;
    public final /* synthetic */ a66 c;

    public /* synthetic */ zn5(mn5 mn5, a66 a66, int i) {
        this.a = i;
        this.b = mn5;
        this.c = a66;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.on5 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L_0x0114;
                case 1: goto L_0x00fe;
                case 2: goto L_0x0085;
                case 3: goto L_0x0031;
                case 4: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            yn5 r0 = new yn5
            a66 r1 = r5.c
            r2 = 4
            r0.<init>(r6, r1, r2)
            mn5 r5 = r5.b
            java.lang.Object r5 = r5.d(r0, r7)
            tx3 r6 = defpackage.tx3.a
            if (r5 != r6) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            e5f r5 = defpackage.e5f.a
        L_0x001a:
            return r5
        L_0x001b:
            yn5 r0 = new yn5
            a66 r1 = r5.c
            r2 = 3
            r0.<init>(r6, r1, r2)
            mn5 r5 = r5.b
            java.lang.Object r5 = r5.d(r0, r7)
            tx3 r6 = defpackage.tx3.a
            if (r5 != r6) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            e5f r5 = defpackage.e5f.a
        L_0x0030:
            return r5
        L_0x0031:
            boolean r0 = r7 instanceof defpackage.op5
            if (r0 == 0) goto L_0x0044
            r0 = r7
            op5 r0 = (defpackage.op5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0044
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0049
        L_0x0044:
            op5 r0 = new op5
            r0.<init>(r5, r7)
        L_0x0049:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0064
            if (r2 != r3) goto L_0x005c
            yn5 r5 = r0.Z
            defpackage.od2.a0(r7)     // Catch:{ AbortFlowException -> 0x005a }
            goto L_0x0081
        L_0x005a:
            r6 = move-exception
            goto L_0x007d
        L_0x005c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0064:
            defpackage.od2.a0(r7)
            mn5 r7 = r5.b
            yn5 r2 = new yn5
            a66 r5 = r5.c
            r2.<init>(r5, r6)
            r0.Z = r2     // Catch:{ AbortFlowException -> 0x007b }
            r0.X = r3     // Catch:{ AbortFlowException -> 0x007b }
            java.lang.Object r5 = r7.d(r2, r0)     // Catch:{ AbortFlowException -> 0x007b }
            if (r5 != r1) goto L_0x0081
            goto L_0x0083
        L_0x007b:
            r6 = move-exception
            r5 = r2
        L_0x007d:
            java.lang.Object r7 = r6.a
            if (r7 != r5) goto L_0x0084
        L_0x0081:
            e5f r1 = defpackage.e5f.a
        L_0x0083:
            return r1
        L_0x0084:
            throw r6
        L_0x0085:
            boolean r0 = r7 instanceof defpackage.dp5
            if (r0 == 0) goto L_0x0098
            r0 = r7
            dp5 r0 = (defpackage.dp5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0098
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x009d
        L_0x0098:
            dp5 r0 = new dp5
            r0.<init>(r5, r7)
        L_0x009d:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x00c3
            if (r2 == r4) goto L_0x00b7
            if (r2 != r3) goto L_0x00af
            defpackage.od2.a0(r7)
            goto L_0x00f5
        L_0x00af:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x00b7:
            iqc r5 = r0.t0
            on5 r6 = r0.s0
            zn5 r2 = r0.Z
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x00c1 }
            goto L_0x00e0
        L_0x00c1:
            r6 = move-exception
            goto L_0x00fa
        L_0x00c3:
            defpackage.od2.a0(r7)
            iqc r7 = new iqc
            lx3 r2 = r0.b
            r7.<init>(r6, r2)
            a66 r2 = r5.c     // Catch:{ all -> 0x00f8 }
            r0.Z = r5     // Catch:{ all -> 0x00f8 }
            r0.s0 = r6     // Catch:{ all -> 0x00f8 }
            r0.t0 = r7     // Catch:{ all -> 0x00f8 }
            r0.X = r4     // Catch:{ all -> 0x00f8 }
            java.lang.Object r2 = r2.invoke(r7, r0)     // Catch:{ all -> 0x00f8 }
            if (r2 != r1) goto L_0x00de
            goto L_0x00f7
        L_0x00de:
            r2 = r5
            r5 = r7
        L_0x00e0:
            r5.p()
            mn5 r5 = r2.b
            r7 = 0
            r0.Z = r7
            r0.s0 = r7
            r0.t0 = r7
            r0.X = r3
            java.lang.Object r5 = r5.d(r6, r0)
            if (r5 != r1) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            e5f r1 = defpackage.e5f.a
        L_0x00f7:
            return r1
        L_0x00f8:
            r6 = move-exception
            r5 = r7
        L_0x00fa:
            r5.p()
            throw r6
        L_0x00fe:
            yn5 r0 = new yn5
            a66 r1 = r5.c
            r2 = 1
            r0.<init>(r6, r1, r2)
            mn5 r5 = r5.b
            java.lang.Object r5 = r5.d(r0, r7)
            tx3 r6 = defpackage.tx3.a
            if (r5 != r6) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            e5f r5 = defpackage.e5f.a
        L_0x0113:
            return r5
        L_0x0114:
            yn5 r0 = new yn5
            a66 r1 = r5.c
            r2 = 0
            r0.<init>(r6, r1, r2)
            mn5 r5 = r5.b
            java.lang.Object r5 = r5.d(r0, r7)
            tx3 r6 = defpackage.tx3.a
            if (r5 != r6) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            e5f r5 = defpackage.e5f.a
        L_0x0129:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn5.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public zn5(mn5 mn5, a66 a66) {
        this.a = 2;
        this.c = a66;
        this.b = mn5;
    }
}
