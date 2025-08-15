package defpackage;

/* renamed from: j31  reason: default package */
public final class j31 implements mn5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ j31(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [java.lang.Object, mec] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if (r11.a(r8, r0) == r7) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.on5 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            r0 = 3
            r1 = 1
            r2 = 2
            r3 = 0
            java.lang.Object r4 = r10.b
            java.lang.Object r5 = r10.o
            e5f r6 = defpackage.e5f.a
            tx3 r7 = defpackage.tx3.a
            java.lang.Object r8 = r10.c
            int r9 = r10.a
            switch(r9) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00e2;
                case 2: goto L_0x00cf;
                case 3: goto L_0x005d;
                case 4: goto L_0x0040;
                case 5: goto L_0x0028;
                default: goto L_0x0013;
            }
        L_0x0013:
            y40 r10 = new y40
            n79 r8 = (defpackage.n79) r8
            wxc r5 = (defpackage.wxc) r5
            r0 = 8
            r10.<init>((java.lang.Object) r11, (java.lang.Object) r8, (java.lang.Object) r5, (int) r0)
            mn5 r4 = (defpackage.mn5) r4
            java.lang.Object r10 = r4.d(r10, r12)
            if (r10 != r7) goto L_0x0027
            r6 = r10
        L_0x0027:
            return r6
        L_0x0028:
            qb1 r10 = new qb1
            mn5[] r4 = (defpackage.mn5[]) r4
            r10.<init>(r4, r0)
            ug6 r0 = new ug6
            java.util.List r8 = (java.util.List) r8
            xg6 r5 = (defpackage.xg6) r5
            r0.<init>(r3, r8, r5)
            java.lang.Object r10 = defpackage.oag.h(r11, r10, r0, r12, r4)
            if (r10 != r7) goto L_0x003f
            r6 = r10
        L_0x003f:
            return r6
        L_0x0040:
            mn5 r4 = (defpackage.mn5) r4
            mn5 r8 = (defpackage.mn5) r8
            mn5[] r10 = new defpackage.mn5[r2]
            r0 = 0
            r10[r0] = r4
            r10[r1] = r8
            bv3 r0 = defpackage.bv3.Z
            vp5 r1 = new vp5
            c66 r5 = (defpackage.c66) r5
            r2 = 4
            r1.<init>((java.lang.Object) r5, (kotlin.coroutines.Continuation) r3, (int) r2)
            java.lang.Object r10 = defpackage.oag.h(r11, r0, r1, r12, r10)
            if (r10 != r7) goto L_0x005c
            r6 = r10
        L_0x005c:
            return r6
        L_0x005d:
            boolean r0 = r12 instanceof defpackage.oq5
            if (r0 == 0) goto L_0x0070
            r0 = r12
            oq5 r0 = (defpackage.oq5) r0
            int r4 = r0.X
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r4 & r5
            if (r9 == 0) goto L_0x0070
            int r4 = r4 - r5
            r0.X = r4
            goto L_0x0075
        L_0x0070:
            oq5 r0 = new oq5
            r0.<init>(r10, r12)
        L_0x0075:
            java.lang.Object r12 = r0.o
            int r4 = r0.X
            if (r4 == 0) goto L_0x0097
            if (r4 == r1) goto L_0x008b
            if (r4 != r2) goto L_0x0083
            defpackage.od2.a0(r12)
            goto L_0x00ce
        L_0x0083:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x008b:
            mec r10 = r0.t0
            on5 r11 = r0.s0
            j31 r1 = r0.Z
            defpackage.od2.a0(r12)
            r12 = r10
            r10 = r1
            goto L_0x00b1
        L_0x0097:
            defpackage.od2.a0(r12)
            mec r12 = new mec
            r12.<init>()
            r12.a = r8
            r0.Z = r10
            r0.s0 = r11
            r0.t0 = r12
            r0.X = r1
            java.lang.Object r1 = r11.a(r8, r0)
            if (r1 != r7) goto L_0x00b1
        L_0x00af:
            r6 = r7
            goto L_0x00ce
        L_0x00b1:
            java.lang.Object r1 = r10.b
            mn5 r1 = (defpackage.mn5) r1
            y40 r4 = new y40
            java.lang.Object r10 = r10.o
            c66 r10 = (defpackage.c66) r10
            r5 = 7
            r4.<init>((java.lang.Object) r12, (java.lang.Object) r10, (defpackage.on5) r11, (int) r5)
            r0.Z = r3
            r0.s0 = r3
            r0.t0 = r3
            r0.X = r2
            java.lang.Object r10 = r1.d(r4, r0)
            if (r10 != r7) goto L_0x00ce
            goto L_0x00af
        L_0x00ce:
            return r6
        L_0x00cf:
            y40 r10 = new y40
            rq2 r8 = (defpackage.rq2) r8
            je7 r5 = (defpackage.je7) r5
            r10.<init>((java.lang.Object) r11, (java.lang.Object) r8, (java.lang.Object) r5, (int) r0)
            mn5 r4 = (defpackage.mn5) r4
            java.lang.Object r10 = r4.d(r10, r12)
            if (r10 != r7) goto L_0x00e1
            r6 = r10
        L_0x00e1:
            return r6
        L_0x00e2:
            y40 r10 = new y40
            o23 r8 = (defpackage.o23) r8
            android.content.Context r5 = (android.content.Context) r5
            r10.<init>((java.lang.Object) r11, (java.lang.Object) r8, (java.lang.Object) r5, (int) r2)
            mn5 r4 = (defpackage.mn5) r4
            java.lang.Object r10 = r4.d(r10, r12)
            if (r10 != r7) goto L_0x00f4
            r6 = r10
        L_0x00f4:
            return r6
        L_0x00f5:
            y40 r10 = new y40
            l31 r8 = (defpackage.l31) r8
            e52 r5 = (defpackage.e52) r5
            r10.<init>((java.lang.Object) r11, (java.lang.Object) r8, (java.lang.Object) r5, (int) r1)
            mn5 r4 = (defpackage.mn5) r4
            java.lang.Object r10 = r4.d(r10, r12)
            if (r10 != r7) goto L_0x0107
            r6 = r10
        L_0x0107:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j31.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public j31(Object obj, mn5 mn5, c66 c66) {
        this.a = 3;
        this.c = obj;
        this.b = mn5;
        this.o = c66;
    }
}
