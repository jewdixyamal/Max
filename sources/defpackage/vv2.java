package defpackage;

/* renamed from: vv2  reason: default package */
public final class vv2 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ gw2 c;

    public /* synthetic */ vv2(on5 on5, gw2 gw2, int i) {
        this.a = i;
        this.b = on5;
        this.c = gw2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ec A[LOOP:0: B:35:0x00e6->B:37:0x00ec, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            int r0 = r11.a
            switch(r0) {
                case 0: goto L_0x011e;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r13 instanceof defpackage.xv2
            if (r0 == 0) goto L_0x0018
            r0 = r13
            xv2 r0 = (defpackage.xv2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            xv2 r0 = new xv2
            r0.<init>(r11, r13)
        L_0x001d:
            java.lang.Object r13 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 2
            r4 = 1
            r5 = 10
            if (r2 == 0) goto L_0x0053
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            defpackage.od2.a0(r13)
            goto L_0x011b
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            java.util.Collection r11 = r0.x0
            java.util.Iterator r12 = r0.w0
            java.util.Collection r2 = r0.v0
            java.util.List r6 = r0.u0
            java.util.List r7 = r0.t0
            on5 r8 = r0.s0
            vv2 r9 = r0.Y
            defpackage.od2.a0(r13)
            r10 = r6
            r6 = r12
            r12 = r9
            r9 = r8
            r8 = r7
            r7 = r10
            goto L_0x00cc
        L_0x0053:
            defpackage.od2.a0(r13)
            java.util.List r12 = (java.util.List) r12
            gw2 r13 = r11.c
            k9c r2 = r13.b
            java.util.List r2 = r2.b()
            rr3 r6 = r13.c
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.m
            boolean r7 = r7.get()
            if (r7 == 0) goto L_0x007c
            java.lang.String r7 = r6.k
            boolean r7 = defpackage.oag.t(r7)
            if (r7 == 0) goto L_0x0075
            java.util.List r6 = r6.f
            goto L_0x0077
        L_0x0075:
            java.util.List r6 = r6.g
        L_0x0077:
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)
            goto L_0x0080
        L_0x007c:
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x0080:
            java.util.List r13 = defpackage.gw2.r(r13)
            boolean r7 = r13.isEmpty()
            if (r7 == 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r12 = r13
        L_0x008c:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r7 = defpackage.z53.S(r2, r5)
            r13.<init>(r7)
            java.util.Iterator r2 = r2.iterator()
            on5 r7 = r11.b
            r8 = r7
            r7 = r6
            r6 = r12
            r12 = r11
            r11 = r13
        L_0x00a0:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x00d7
            java.lang.Object r13 = r2.next()
            kzc r13 = (defpackage.kzc) r13
            gw2 r9 = r12.c
            nzc r9 = r9.Y
            r0.Y = r12
            r0.s0 = r8
            r0.t0 = r7
            r0.u0 = r6
            r0.v0 = r11
            r0.w0 = r2
            r0.x0 = r11
            r0.X = r4
            java.lang.Object r13 = r9.b(r13, r0)
            if (r13 != r1) goto L_0x00c7
            goto L_0x011d
        L_0x00c7:
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r2
            r2 = r11
        L_0x00cc:
            izc r13 = (defpackage.izc) r13
            r11.add(r13)
            r11 = r2
            r2 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            goto L_0x00a0
        L_0x00d7:
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r13 = new java.util.ArrayList
            int r2 = defpackage.z53.S(r7, r5)
            r13.<init>(r2)
            java.util.Iterator r2 = r7.iterator()
        L_0x00e6:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00fe
            java.lang.Object r4 = r2.next()
            uj3 r4 = (defpackage.uj3) r4
            gw2 r5 = r12.c
            kz2 r5 = r5.X
            nn3 r4 = r5.a(r4)
            r13.add(r4)
            goto L_0x00e6
        L_0x00fe:
            it6 r12 = new it6
            r12.<init>(r6, r11, r13)
            r11 = 0
            r0.Y = r11
            r0.s0 = r11
            r0.t0 = r11
            r0.u0 = r11
            r0.v0 = r11
            r0.w0 = r11
            r0.x0 = r11
            r0.X = r3
            java.lang.Object r11 = r8.a(r12, r0)
            if (r11 != r1) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            e5f r1 = defpackage.e5f.a
        L_0x011d:
            return r1
        L_0x011e:
            boolean r12 = r13 instanceof defpackage.uv2
            if (r12 == 0) goto L_0x0131
            r12 = r13
            uv2 r12 = (defpackage.uv2) r12
            int r0 = r12.X
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0131
            int r0 = r0 - r1
            r12.X = r0
            goto L_0x0136
        L_0x0131:
            uv2 r12 = new uv2
            r12.<init>(r11, r13)
        L_0x0136:
            java.lang.Object r13 = r12.o
            tx3 r0 = defpackage.tx3.a
            int r1 = r12.X
            r2 = 1
            if (r1 == 0) goto L_0x014d
            if (r1 != r2) goto L_0x0145
            defpackage.od2.a0(r13)
            goto L_0x0188
        L_0x0145:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x014d:
            defpackage.od2.a0(r13)
            gw2 r13 = r11.c
            k9c r1 = r13.b
            java.util.List r1 = r1.a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.z53.S(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x0167:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x017d
            java.lang.Object r4 = r1.next()
            uj3 r4 = (defpackage.uj3) r4
            kz2 r5 = r13.X
            v8c r4 = r5.b(r4)
            r3.add(r4)
            goto L_0x0167
        L_0x017d:
            r12.X = r2
            on5 r11 = r11.b
            java.lang.Object r11 = r11.a(r3, r12)
            if (r11 != r0) goto L_0x0188
            goto L_0x018a
        L_0x0188:
            e5f r0 = defpackage.e5f.a
        L_0x018a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
