package defpackage;

/* renamed from: l3d  reason: default package */
public final class l3d implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ q3d c;

    public /* synthetic */ l3d(on5 on5, q3d q3d, int i) {
        this.a = i;
        this.b = on5;
        this.c = q3d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00da A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 0: goto L_0x009c;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r11 instanceof defpackage.n3d
            if (r0 == 0) goto L_0x0018
            r0 = r11
            n3d r0 = (defpackage.n3d) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            n3d r0 = new n3d
            r0.<init>(r9, r11)
        L_0x001d:
            java.lang.Object r11 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            defpackage.od2.a0(r11)
            goto L_0x0099
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0034:
            defpackage.od2.a0(r11)
            kpa r10 = (defpackage.kpa) r10
            java.lang.Object r11 = r10.a
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r10 = r10.b
            b86 r10 = (defpackage.b86) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r11, r4)
            r2.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L_0x0050:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r11.next()
            b86 r4 = (defpackage.b86) r4
            c86 r5 = new c86
            q3d r6 = r9.c
            hq7 r6 = r6.b
            a86 r7 = r4.a
            fz6 r6 = (defpackage.fz6) r6
            java.util.concurrent.ConcurrentHashMap r6 = r6.B0
            java.lang.Object r6 = r6.get(r7)
            zp7 r6 = (defpackage.zp7) r6
            r7 = 0
            if (r6 == 0) goto L_0x0074
            android.net.Uri r6 = r6.v0
            goto L_0x0075
        L_0x0074:
            r6 = r7
        L_0x0075:
            if (r10 == 0) goto L_0x007d
            a86 r7 = r10.a
            java.lang.String r7 = r7.b()
        L_0x007d:
            a86 r8 = r4.a
            java.lang.String r8 = r8.b()
            boolean r7 = defpackage.tpa.f(r7, r8)
            r5.<init>(r4, r6, r7)
            r2.add(r5)
            goto L_0x0050
        L_0x008e:
            r0.X = r3
            on5 r9 = r9.b
            java.lang.Object r9 = r9.a(r2, r0)
            if (r9 != r1) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            e5f r1 = defpackage.e5f.a
        L_0x009b:
            return r1
        L_0x009c:
            boolean r0 = r11 instanceof defpackage.k3d
            if (r0 == 0) goto L_0x00af
            r0 = r11
            k3d r0 = (defpackage.k3d) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00af
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x00b4
        L_0x00af:
            k3d r0 = new k3d
            r0.<init>(r9, r11)
        L_0x00b4:
            java.lang.Object r11 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00cc
            if (r2 != r3) goto L_0x00c4
            defpackage.od2.a0(r11)
            goto L_0x0127
        L_0x00c4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x00cc:
            defpackage.od2.a0(r11)
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00da:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x011c
            java.lang.Object r2 = r10.next()
            b86 r2 = (defpackage.b86) r2
            boolean r4 = r2.d
            if (r4 == 0) goto L_0x00ff
            x76 r4 = defpackage.x76.a
            a86 r5 = r2.a
            boolean r4 = defpackage.tpa.f(r5, r4)
            if (r4 != 0) goto L_0x00ff
            y76 r4 = defpackage.y76.a
            boolean r4 = defpackage.tpa.f(r5, r4)
            if (r4 == 0) goto L_0x00fd
            goto L_0x00ff
        L_0x00fd:
            r4 = 0
            goto L_0x0100
        L_0x00ff:
            r4 = r3
        L_0x0100:
            q3d r5 = r9.c
            e3d r5 = r5.c
            boolean r6 = r5.a
            r7 = 0
            if (r6 == 0) goto L_0x010d
            if (r4 == 0) goto L_0x010d
        L_0x010b:
            r2 = r7
            goto L_0x0116
        L_0x010d:
            boolean r4 = r5.b
            if (r4 != 0) goto L_0x0116
            int r4 = r2.b
            if (r4 != 0) goto L_0x0116
            goto L_0x010b
        L_0x0116:
            if (r2 == 0) goto L_0x00da
            r11.add(r2)
            goto L_0x00da
        L_0x011c:
            r0.X = r3
            on5 r9 = r9.b
            java.lang.Object r9 = r9.a(r11, r0)
            if (r9 != r1) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            e5f r1 = defpackage.e5f.a
        L_0x0129:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l3d.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
