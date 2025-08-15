package defpackage;

/* renamed from: a72  reason: default package */
public final class a72 implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ k72 c;

    public /* synthetic */ a72(on5 on5, k72 k72, int i) {
        this.a = i;
        this.b = on5;
        this.c = k72;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            e5f r2 = defpackage.e5f.a
            on5 r3 = r0.b
            k72 r4 = r0.c
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            tx3 r7 = defpackage.tx3.a
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r9 = r0.a
            switch(r9) {
                case 0: goto L_0x00f8;
                default: goto L_0x0016;
            }
        L_0x0016:
            boolean r9 = r1 instanceof defpackage.c72
            if (r9 == 0) goto L_0x0027
            r9 = r1
            c72 r9 = (defpackage.c72) r9
            int r10 = r9.X
            r11 = r10 & r8
            if (r11 == 0) goto L_0x0027
            int r10 = r10 - r8
            r9.X = r10
            goto L_0x002c
        L_0x0027:
            c72 r9 = new c72
            r9.<init>(r0, r1)
        L_0x002c:
            java.lang.Object r0 = r9.o
            int r1 = r9.X
            if (r1 == 0) goto L_0x003f
            if (r1 != r6) goto L_0x0039
            defpackage.od2.a0(r0)
            goto L_0x00f7
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x003f:
            defpackage.od2.a0(r0)
            r0 = r19
            ph0 r0 = (defpackage.ph0) r0
            boolean r1 = r0 instanceof defpackage.ph0
            r5 = 0
            if (r1 != 0) goto L_0x004d
            goto L_0x00ec
        L_0x004d:
            long r10 = r0.a
            java.util.concurrent.atomic.AtomicLong r1 = r4.t
            long r12 = r1.get()
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            c22 r8 = defpackage.c22.a
            b22 r12 = defpackage.b22.a
            pke r0 = r0.b
            java.lang.String r13 = "io.exception"
            java.lang.String r14 = "service.timeout"
            java.lang.String r15 = "service.unavailable"
            if (r1 != 0) goto L_0x00a9
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.w
            r4 = 0
            r1.set(r4)
            java.lang.String r1 = r0.o
            if (r1 == 0) goto L_0x0083
            int r4 = r1.length()
            if (r4 != 0) goto L_0x0076
            goto L_0x0083
        L_0x0076:
            a22 r0 = new a22
            iqe r4 = new iqe
            r4.<init>(r1)
            r0.<init>(r4)
        L_0x0080:
            r5 = r0
            goto L_0x00ec
        L_0x0083:
            java.lang.String r0 = r0.b
            boolean r1 = defpackage.tpa.f(r0, r15)
            if (r1 != 0) goto L_0x00a7
            boolean r1 = defpackage.tpa.f(r0, r14)
            if (r1 == 0) goto L_0x0092
            goto L_0x00a7
        L_0x0092:
            boolean r0 = defpackage.tpa.f(r0, r13)
            if (r0 == 0) goto L_0x009a
        L_0x0098:
            r5 = r12
            goto L_0x00ec
        L_0x009a:
            d22 r0 = new d22
            int r1 = defpackage.jpc.F
            eqe r4 = new eqe
            r4.<init>(r1)
            r0.<init>(r4)
            goto L_0x0080
        L_0x00a7:
            r5 = r8
            goto L_0x00ec
        L_0x00a9:
            java.util.concurrent.atomic.AtomicLong r1 = r4.u
            long r16 = r1.get()
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x00ec
            java.lang.String r1 = r0.o
            if (r1 == 0) goto L_0x00c9
            int r4 = r1.length()
            if (r4 != 0) goto L_0x00be
            goto L_0x00c9
        L_0x00be:
            a22 r0 = new a22
            iqe r4 = new iqe
            r4.<init>(r1)
            r0.<init>(r4)
            goto L_0x0080
        L_0x00c9:
            java.lang.String r0 = r0.b
            boolean r1 = defpackage.tpa.f(r0, r15)
            if (r1 != 0) goto L_0x00a7
            boolean r1 = defpackage.tpa.f(r0, r14)
            if (r1 == 0) goto L_0x00d8
            goto L_0x00a7
        L_0x00d8:
            boolean r0 = defpackage.tpa.f(r0, r13)
            if (r0 == 0) goto L_0x00df
            goto L_0x0098
        L_0x00df:
            d22 r0 = new d22
            int r1 = defpackage.jpc.F
            eqe r4 = new eqe
            r4.<init>(r1)
            r0.<init>(r4)
            goto L_0x0080
        L_0x00ec:
            if (r5 == 0) goto L_0x00f7
            r9.X = r6
            java.lang.Object r0 = r3.a(r5, r9)
            if (r0 != r7) goto L_0x00f7
            r2 = r7
        L_0x00f7:
            return r2
        L_0x00f8:
            boolean r9 = r1 instanceof defpackage.z62
            if (r9 == 0) goto L_0x0109
            r9 = r1
            z62 r9 = (defpackage.z62) r9
            int r10 = r9.X
            r11 = r10 & r8
            if (r11 == 0) goto L_0x0109
            int r10 = r10 - r8
            r9.X = r10
            goto L_0x010e
        L_0x0109:
            z62 r9 = new z62
            r9.<init>(r0, r1)
        L_0x010e:
            java.lang.Object r0 = r9.o
            int r1 = r9.X
            if (r1 == 0) goto L_0x0120
            if (r1 != r6) goto L_0x011a
            defpackage.od2.a0(r0)
            goto L_0x0139
        L_0x011a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r5)
            throw r0
        L_0x0120:
            defpackage.od2.a0(r0)
            r0 = r19
            e52 r0 = (defpackage.e52) r0
            bc7[] r1 = defpackage.k72.x
            r4.getClass()
            o22 r0 = defpackage.k72.t(r0)
            r9.X = r6
            java.lang.Object r0 = r3.a(r0, r9)
            if (r0 != r7) goto L_0x0139
            r2 = r7
        L_0x0139:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a72.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
