package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cge  reason: default package */
public final class cge {
    public final w0f a;
    public final String b = cge.class.getName();
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final aj9 h;
    public final qi9 i;

    public cge(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, w0f w0f) {
        this.a = w0f;
        this.c = je7;
        this.d = je72;
        this.e = je73;
        this.f = je74;
        this.g = je75;
        this.h = bj9.a();
        long[] jArr = usc.a;
        this.i = new qi9();
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [u6f, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.cge r4, defpackage.d7f r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ife
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ife r0 = (defpackage.ife) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            ife r0 = new ife
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            d7f r5 = r0.X
            cge r4 = r0.o
            defpackage.od2.a0(r6)     // Catch:{ all -> 0x002b }
            goto L_0x0067
        L_0x002b:
            r6 = move-exception
            goto L_0x006a
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            defpackage.od2.a0(r6)
            je7 r6 = r4.f     // Catch:{ all -> 0x002b }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x002b }
            y8f r6 = (defpackage.y8f) r6     // Catch:{ all -> 0x002b }
            f28 r6 = r6.d(r5)     // Catch:{ all -> 0x002b }
            r0.o = r4     // Catch:{ all -> 0x002b }
            r0.X = r5     // Catch:{ all -> 0x002b }
            r0.s0 = r3     // Catch:{ all -> 0x002b }
            sy1 r2 = new sy1     // Catch:{ all -> 0x002b }
            kotlin.coroutines.Continuation r0 = defpackage.v3c.u(r0)     // Catch:{ all -> 0x002b }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x002b }
            r2.n()     // Catch:{ all -> 0x002b }
            spc r0 = new spc     // Catch:{ all -> 0x002b }
            r3 = 2
            r0.<init>(r2, r3)     // Catch:{ all -> 0x002b }
            r6.a(r0)     // Catch:{ all -> 0x002b }
            java.lang.Object r6 = r2.m()     // Catch:{ all -> 0x002b }
            if (r6 != r1) goto L_0x0067
            goto L_0x00f5
        L_0x0067:
            v6f r6 = (defpackage.v6f) r6     // Catch:{ all -> 0x002b }
            goto L_0x0070
        L_0x006a:
            njc r0 = new njc
            r0.<init>(r6)
            r6 = r0
        L_0x0070:
            boolean r0 = r6 instanceof defpackage.njc
            r1 = 0
            if (r0 == 0) goto L_0x0076
            r6 = r1
        L_0x0076:
            v6f r6 = (defpackage.v6f) r6
            if (r6 != 0) goto L_0x00d4
            java.lang.String r4 = r4.b
            ir6 r6 = defpackage.hm9.m
            if (r6 != 0) goto L_0x0081
            goto L_0x008e
        L_0x0081:
            boolean r0 = r6.c()
            if (r0 == 0) goto L_0x008e
            us7 r0 = defpackage.us7.X
            java.lang.String r2 = "No upload in repository, created new"
            r6.d(r0, r4, r2, r1)
        L_0x008e:
            u6f r4 = new u6f
            r4.<init>()
            q8f r6 = defpackage.q8f.UNKNOWN
            r4.g = r6
            r4.a = r5
            q8f r6 = defpackage.q8f.UPLOADING
            r4.g = r6
            java.lang.String r5 = r5.a
            java.io.File r6 = new java.io.File     // Catch:{ all -> 0x00ad }
            r6.<init>(r5)     // Catch:{ all -> 0x00ad }
            long r5 = r6.length()     // Catch:{ all -> 0x00ad }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00ad }
            goto L_0x00b4
        L_0x00ad:
            r5 = move-exception
            njc r6 = new njc
            r6.<init>(r5)
            r5 = r6
        L_0x00b4:
            r0 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            boolean r0 = r5 instanceof defpackage.njc
            if (r0 == 0) goto L_0x00bf
            r5 = r6
        L_0x00bf:
            java.lang.Number r5 = (java.lang.Number) r5
            long r5 = r5.longValue()
            r4.f = r5
            long r5 = java.lang.System.currentTimeMillis()
            r4.i = r5
            v6f r5 = new v6f
            r5.<init>(r4)
            r1 = r5
            goto L_0x00f5
        L_0x00d4:
            java.lang.String r4 = r4.b
            ir6 r5 = defpackage.hm9.m
            if (r5 != 0) goto L_0x00db
            goto L_0x00f4
        L_0x00db:
            boolean r0 = r5.c()
            if (r0 == 0) goto L_0x00f4
            us7 r0 = defpackage.us7.X
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Found upload in repository = "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.d(r0, r4, r2, r1)
        L_0x00f4:
            r1 = r6
        L_0x00f5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.a(cge, d7f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r10v9, types: [java.lang.Object, o8f] */
    /* JADX WARNING: type inference failed for: r10v12, types: [java.lang.Object, o8f] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.cge r8, defpackage.v6f r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof defpackage.kfe
            if (r0 == 0) goto L_0x0016
            r0 = r10
            kfe r0 = (defpackage.kfe) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            kfe r0 = new kfe
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            v6f r9 = r0.o
            defpackage.od2.a0(r10)
            goto L_0x00f0
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            defpackage.od2.a0(r10)
            java.lang.String r10 = r9.d
            r2 = 0
            if (r10 == 0) goto L_0x0067
            int r10 = r10.length()
            if (r10 != 0) goto L_0x0044
            goto L_0x0067
        L_0x0044:
            java.lang.String r8 = r8.b
            ir6 r10 = defpackage.hm9.m
            if (r10 != 0) goto L_0x004c
            goto L_0x0184
        L_0x004c:
            boolean r0 = r10.c()
            if (r0 == 0) goto L_0x0184
            us7 r0 = defpackage.us7.X
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "requestUploadUrl: already has upload url for="
            r1.<init>(r3)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r10.d(r0, r8, r1, r2)
            goto L_0x0184
        L_0x0067:
            java.lang.String r10 = r8.b
            ir6 r4 = defpackage.hm9.m
            if (r4 != 0) goto L_0x006e
            goto L_0x0087
        L_0x006e:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x0087
            us7 r5 = defpackage.us7.X
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "requestUploadUrl: requesting uploadUrl for="
            r6.<init>(r7)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r4.d(r5, r10, r6, r2)
        L_0x0087:
            je7 r10 = r8.c
            java.lang.Object r10 = r10.getValue()
            pk r10 = (defpackage.pk) r10
            d7f r10 = r9.a
            int r10 = r10.c
            int r4 = defpackage.au1.s(r10)
            switch(r4) {
                case 1: goto L_0x00d6;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00c6;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00ce;
                case 7: goto L_0x00b1;
                case 8: goto L_0x00aa;
                default: goto L_0x009a;
            }
        L_0x009a:
            one.me.sdk.transfer.domain.UploadException r8 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r9 = defpackage.h4f.t(r10)
            java.lang.String r10 = "tamRequestFromUploadType, can't request url for unknown media type="
            java.lang.String r9 = r10.concat(r9)
            r8.<init>(r9)
            throw r8
        L_0x00aa:
            gs9 r10 = new gs9
            r2 = 2
            r10.<init>((int) r2, (int) r3)
            goto L_0x00db
        L_0x00b1:
            gs9 r10 = new gs9
            r4 = 11
            r10.<init>((defpackage.sla) r2, (int) r4)
            goto L_0x00db
        L_0x00b9:
            gs9 r10 = new gs9
            r2 = 3
            r10.<init>((int) r2, (int) r3)
            goto L_0x00db
        L_0x00c0:
            tq2 r10 = new tq2
            r10.<init>()
            goto L_0x00db
        L_0x00c6:
            gs9 r10 = new gs9
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r10.<init>((java.lang.Boolean) r2)
            goto L_0x00db
        L_0x00ce:
            gs9 r10 = new gs9
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r10.<init>((java.lang.Boolean) r2)
            goto L_0x00db
        L_0x00d6:
            gs9 r10 = new gs9
            r10.<init>((int) r3, (int) r3)
        L_0x00db:
            int r2 = defpackage.ft4.o
            kt4 r2 = defpackage.kt4.SECONDS
            long r4 = defpackage.z7.R(r3, r2)
            r0.o = r9
            r0.Z = r3
            java.lang.Object r10 = r8.i(r10, r4, r0)
            if (r10 != r1) goto L_0x00f0
            r9 = r1
            goto L_0x0184
        L_0x00f0:
            gle r10 = (defpackage.gle) r10
            boolean r8 = r10 instanceof defpackage.plf
            r0 = 0
            if (r8 == 0) goto L_0x012d
            plf r10 = (defpackage.plf) r10
            java.util.ArrayList r8 = r10.c
            if (r8 == 0) goto L_0x0102
            java.util.List r8 = defpackage.x53.D0(r8)
            goto L_0x0104
        L_0x0102:
            nz4 r8 = defpackage.nz4.a
        L_0x0104:
            java.lang.Object r8 = r8.get(r0)
            qlf r8 = (defpackage.qlf) r8
            u6f r9 = r9.b()
            java.lang.String r10 = r8.a
            r9.d = r10
            o8f r10 = new o8f
            r10.<init>()
            java.lang.String r0 = r8.c
            r10.a = r0
            long r0 = r8.b
            r10.b = r0
            p8f r8 = new p8f
            r8.<init>(r10)
            r9.h = r8
            v6f r8 = new v6f
            r8.<init>(r9)
        L_0x012b:
            r9 = r8
            goto L_0x0184
        L_0x012d:
            boolean r8 = r10 instanceof defpackage.mj5
            if (r8 == 0) goto L_0x015d
            mj5 r10 = (defpackage.mj5) r10
            java.util.List r8 = r10.c
            java.lang.Object r8 = r8.get(r0)
            nj5 r8 = (defpackage.nj5) r8
            u6f r9 = r9.b()
            java.lang.String r10 = r8.c
            r9.d = r10
            o8f r10 = new o8f
            r10.<init>()
            java.lang.String r0 = r8.b
            r10.a = r0
            long r0 = r8.a
            r10.b = r0
            p8f r8 = new p8f
            r8.<init>(r10)
            r9.h = r8
            v6f r8 = new v6f
            r8.<init>(r9)
            goto L_0x012b
        L_0x015d:
            boolean r8 = r10 instanceof defpackage.gwa
            if (r8 == 0) goto L_0x0171
            u6f r8 = r9.b()
            gwa r10 = (defpackage.gwa) r10
            java.lang.String r9 = r10.c
            r8.d = r9
            v6f r9 = new v6f
            r9.<init>(r8)
            goto L_0x0184
        L_0x0171:
            boolean r8 = r10 instanceof defpackage.i4e
            if (r8 == 0) goto L_0x0185
            u6f r8 = r9.b()
            i4e r10 = (defpackage.i4e) r10
            java.lang.String r9 = r10.c
            r8.d = r9
            v6f r9 = new v6f
            r9.<init>(r8)
        L_0x0184:
            return r9
        L_0x0185:
            one.me.sdk.transfer.domain.UploadException r8 = new one.me.sdk.transfer.domain.UploadException
            d7f r9 = r9.a
            int r9 = r9.c
            java.lang.String r9 = defpackage.h4f.t(r9)
            java.lang.String r10 = "can't request url for unknown media type="
            java.lang.String r9 = r10.concat(r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.b(cge, v6f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b6, code lost:
        if (r7 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.cge r5, java.lang.Throwable r6, kotlin.coroutines.Continuation r7) {
        /*
            r0 = 1
            r5.getClass()
            boolean r1 = r7 instanceof defpackage.nfe
            if (r1 == 0) goto L_0x0017
            r1 = r7
            nfe r1 = (defpackage.nfe) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.Y = r2
            goto L_0x001c
        L_0x0017:
            nfe r1 = new nfe
            r1.<init>(r5, r7)
        L_0x001c:
            java.lang.Object r7 = r1.o
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.Y
            r4 = 2
            if (r3 == 0) goto L_0x003a
            if (r3 == r0) goto L_0x0036
            if (r3 != r4) goto L_0x002e
            defpackage.od2.a0(r7)
            goto L_0x00d1
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            defpackage.od2.a0(r7)
            goto L_0x0085
        L_0x003a:
            defpackage.od2.a0(r7)
            je7 r7 = r5.e
            java.lang.Object r7 = r7.getValue()
            hbd r7 = (defpackage.hbd) r7
            jbd r7 = (defpackage.jbd) r7
            int r7 = r7.h
            boolean r7 = defpackage.fme.a(r7)
            if (r7 != 0) goto L_0x0088
            java.lang.String r6 = r5.b
            java.lang.String r7 = "shouldRetryOnException: no connection, await for connection available"
            defpackage.hm9.m(r6, r7, new java.lang.Object[0])
            je7 r6 = r5.e
            java.lang.Object r6 = r6.getValue()
            hbd r6 = (defpackage.hbd) r6
            jbd r6 = (defpackage.jbd) r6
            ml0 r6 = r6.e
            kj6 r7 = defpackage.kj6.Y
            r6.getClass()
            ty9 r3 = new ty9
            r3.<init>(r6, r7, r0)
            bkg r6 = new bkg
            r7 = 27
            r6.<init>(r7, r5)
            kj6 r5 = defpackage.ft.e
            r66 r7 = defpackage.ft.d
            oz9 r4 = new oz9
            r4.<init>(r3, r6, r5, r7)
            r1.Y = r0
            java.lang.Object r5 = defpackage.s36.g(r4, r1)
            if (r5 != r2) goto L_0x0085
            goto L_0x00d5
        L_0x0085:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L_0x00d5
        L_0x0088:
            boolean r7 = r6 instanceof one.me.sdk.transfer.exceptions.HttpUrlExpiredException
            r3 = 0
            if (r7 == 0) goto L_0x0096
            java.lang.String r5 = r5.b
            java.lang.String r6 = "shouldRetryOnException: skipped retry on TamHttpUrlExpiredException"
            defpackage.hm9.m0(r5, r6, new java.lang.Object[0])
        L_0x0094:
            r0 = r3
            goto L_0x00d1
        L_0x0096:
            boolean r7 = r6 instanceof one.me.sdk.transfer.exceptions.HttpErrorException
            if (r7 == 0) goto L_0x00b9
            r7 = r6
            one.me.sdk.transfer.exceptions.HttpErrorException r7 = (one.me.sdk.transfer.exceptions.HttpErrorException) r7
            eq6 r7 = r7.a
            boolean r7 = defpackage.nu0.x(r7)
            java.lang.String r5 = r5.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "shouldRetryOnException: error isCritical="
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            defpackage.hm9.p(r5, r1, r6)
            if (r7 != 0) goto L_0x0094
            goto L_0x00d1
        L_0x00b9:
            java.lang.String r5 = r5.b
            java.lang.String r7 = "shouldRetryOnException: can retry error"
            defpackage.hm9.l0(r5, r7, r6)
            int r5 = defpackage.ft4.o
            kt4 r5 = defpackage.kt4.SECONDS
            long r5 = defpackage.z7.R(r0, r5)
            r1.Y = r4
            java.lang.Object r5 = defpackage.j47.y(r5, r1)
            if (r5 != r2) goto L_0x00d1
            goto L_0x00d5
        L_0x00d1:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L_0x00d5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.c(cge, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.d7f r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.gfe
            if (r0 == 0) goto L_0x0013
            r0 = r11
            gfe r0 = (defpackage.gfe) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            gfe r0 = new gfe
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r5) goto L_0x0033
            if (r2 != r4) goto L_0x002b
            defpackage.od2.a0(r11)
            goto L_0x0078
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            d7f r10 = r0.X
            cge r9 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x006b
        L_0x003b:
            defpackage.od2.a0(r11)
            java.lang.String r11 = r9.b
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0045
            goto L_0x005e
        L_0x0045:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x005e
            us7 r6 = defpackage.us7.X
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Cancelling upload="
            r7.<init>(r8)
            r7.append(r10)
            java.lang.String r7 = r7.toString()
            r2.d(r6, r11, r7, r3)
        L_0x005e:
            r0.o = r9
            r0.X = r10
            r0.s0 = r5
            java.lang.Object r11 = r9.h(r10, r0)
            if (r11 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r0.o = r3
            r0.X = r3
            r0.s0 = r4
            java.lang.Object r9 = r9.g(r10, r0)
            if (r9 != r1) goto L_0x0078
            return r1
        L_0x0078:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.d(d7f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.v6f r9, defpackage.it3 r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.hfe
            if (r0 == 0) goto L_0x0013
            r0 = r11
            hfe r0 = (defpackage.hfe) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            hfe r0 = new hfe
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            it3 r10 = r0.Y
            v6f r9 = r0.X
            cge r8 = r0.o
            defpackage.od2.a0(r11)
            goto L_0x006b
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            defpackage.od2.a0(r11)
            java.lang.String r11 = r8.b
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x0040
            goto L_0x0055
        L_0x0040:
            boolean r5 = r2.c()
            if (r5 == 0) goto L_0x0055
            us7 r5 = defpackage.us7.X
            d7f r6 = r9.a
            java.lang.String r6 = r6.a
            java.lang.String r7 = "copyFromUri: started for uri="
            java.lang.String r6 = defpackage.wg0.i(r7, r6)
            r2.d(r5, r11, r6, r3)
        L_0x0055:
            a81 r11 = new a81
            r2 = 13
            r11.<init>(r8, r9, r10, r2)
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.t0 = r4
            java.lang.Object r11 = defpackage.ema.C(r11, r0)
            if (r11 != r1) goto L_0x006b
            return r1
        L_0x006b:
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = defpackage.kj6.h(r11)
            if (r0 == 0) goto L_0x00a3
            java.lang.String r8 = r8.b
            ir6 r0 = defpackage.hm9.m
            if (r0 != 0) goto L_0x007a
            goto L_0x008f
        L_0x007a:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x008f
            us7 r1 = defpackage.us7.X
            d7f r2 = r9.a
            java.lang.String r2 = r2.a
            java.lang.String r4 = "copyFromUri: finished for uri="
            java.lang.String r2 = defpackage.wg0.i(r4, r2)
            r0.d(r1, r8, r2, r3)
        L_0x008f:
            u6f r8 = r9.b()
            r8.b = r11
            java.lang.String r9 = r10.c
            r8.c = r9
            long r9 = r10.b
            r8.f = r9
            v6f r9 = new v6f
            r9.<init>(r8)
            return r9
        L_0x00a3:
            one.me.sdk.transfer.domain.UploadException r8 = new one.me.sdk.transfer.domain.UploadException
            java.lang.String r9 = "failed to copy file"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.e(v6f, it3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object f(v6f v6f, Continuation continuation) {
        String str = this.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "putInRepository: started for=" + v6f, (Throwable) null);
        }
        Object e2 = s36.e(((y8f) this.f.getValue()).a(v6f), continuation);
        return e2 == tx3.a ? e2 : e5f.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(defpackage.d7f r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jfe
            if (r0 == 0) goto L_0x0013
            r0 = r6
            jfe r0 = (defpackage.jfe) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.t0 = r1
            goto L_0x0018
        L_0x0013:
            jfe r0 = new jfe
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            aj9 r4 = r0.Y
            d7f r5 = r0.X
            cge r0 = r0.o
            defpackage.od2.a0(r6)
            r6 = r4
            r4 = r0
            goto L_0x004b
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            defpackage.od2.a0(r6)
            r0.o = r4
            r0.X = r5
            aj9 r6 = r4.h
            r0.Y = r6
            r0.t0 = r3
            java.lang.Object r0 = r6.d(r0)
            if (r0 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = 0
            qi9 r4 = r4.i     // Catch:{ all -> 0x0058 }
            java.lang.Object r4 = r4.i(r5)     // Catch:{ all -> 0x0058 }
            mn5 r4 = (defpackage.mn5) r4     // Catch:{ all -> 0x0058 }
            r6.e(r0)
            return r4
        L_0x0058:
            r4 = move-exception
            r6.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.g(d7f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object h(d7f d7f, Continuation continuation) {
        String str = this.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "removeFromRepository: started for=" + d7f, (Throwable) null);
        }
        Object e2 = s36.e(((y8f) this.f.getValue()).c(d7f), continuation);
        return e2 == tx3.a ? e2 : e5f.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(defpackage.dle r18, long r19, kotlin.coroutines.Continuation r21) {
        /*
            r17 = this;
            r0 = r21
            boolean r1 = r0 instanceof defpackage.lfe
            if (r1 == 0) goto L_0x0017
            r1 = r0
            lfe r1 = (defpackage.lfe) r1
            int r2 = r1.u0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.u0 = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            lfe r1 = new lfe
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r0 = r1.s0
            tx3 r3 = defpackage.tx3.a
            int r4 = r1.u0
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0053
            if (r4 == r7) goto L_0x0045
            if (r4 == r6) goto L_0x0038
            if (r4 != r5) goto L_0x0030
            goto L_0x0038
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            long r8 = r1.Z
            gle r2 = r1.Y
            dle r4 = r1.X
            cge r10 = r1.o
            defpackage.od2.a0(r0)
            goto L_0x0100
        L_0x0045:
            long r8 = r1.Z
            gle r2 = r1.Y
            dle r4 = r1.X
            cge r10 = r1.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x0051 }
            goto L_0x0080
        L_0x0051:
            r0 = move-exception
            goto L_0x0094
        L_0x0053:
            defpackage.od2.a0(r0)
            r0 = 0
            r8 = r19
            r10 = r0
            r4 = r1
            r1 = r18
        L_0x005d:
            je7 r0 = r2.c     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0092 }
            pk r0 = (defpackage.pk) r0     // Catch:{ all -> 0x0092 }
            r4.o = r2     // Catch:{ all -> 0x0092 }
            r4.X = r1     // Catch:{ all -> 0x0092 }
            r4.Y = r10     // Catch:{ all -> 0x0092 }
            r4.Z = r8     // Catch:{ all -> 0x0092 }
            r4.u0 = r7     // Catch:{ all -> 0x0092 }
            k4a r0 = (defpackage.k4a) r0     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r0.J(r1, r4)     // Catch:{ all -> 0x0092 }
            if (r0 != r3) goto L_0x0078
            return r3
        L_0x0078:
            r15 = r4
            r4 = r1
            r1 = r15
            r16 = r10
            r10 = r2
            r2 = r16
        L_0x0080:
            gle r0 = (defpackage.gle) r0     // Catch:{ all -> 0x0051 }
            r2 = r10
            r10 = r0
            r15 = r4
            r4 = r1
            r1 = r15
            goto L_0x0108
        L_0x0089:
            r15 = r4
            r4 = r1
            r1 = r15
            r16 = r10
            r10 = r2
            r2 = r16
            goto L_0x0094
        L_0x0092:
            r0 = move-exception
            goto L_0x0089
        L_0x0094:
            boolean r11 = defpackage.fme.d(r0)
            if (r11 == 0) goto L_0x00e9
            je7 r11 = r10.e
            java.lang.Object r11 = r11.getValue()
            hbd r11 = (defpackage.hbd) r11
            jbd r11 = (defpackage.jbd) r11
            int r11 = r11.h
            boolean r11 = defpackage.fme.a(r11)
            if (r11 != 0) goto L_0x00e9
            java.lang.String r0 = r10.b
            java.lang.String r11 = "retry api request: no connection, await for connection available"
            defpackage.hm9.m(r0, r11, new java.lang.Object[0])
            je7 r0 = r10.e
            java.lang.Object r0 = r0.getValue()
            hbd r0 = (defpackage.hbd) r0
            jbd r0 = (defpackage.jbd) r0
            ml0 r0 = r0.e
            ob6 r11 = defpackage.ob6.Y
            r0.getClass()
            ty9 r12 = new ty9
            r13 = 1
            r12.<init>(r0, r11, r13)
            mfe r0 = new mfe
            r0.<init>(r10)
            kj6 r11 = defpackage.ft.e
            r66 r13 = defpackage.ft.d
            oz9 r14 = new oz9
            r14.<init>(r12, r0, r11, r13)
            r1.o = r10
            r1.X = r4
            r1.Y = r2
            r1.Z = r8
            r1.u0 = r6
            java.lang.Object r0 = defpackage.s36.g(r14, r1)
            if (r0 != r3) goto L_0x0100
            return r3
        L_0x00e9:
            boolean r11 = defpackage.fme.c(r0)
            if (r11 == 0) goto L_0x0121
            r1.o = r10
            r1.X = r4
            r1.Y = r2
            r1.Z = r8
            r1.u0 = r5
            java.lang.Object r0 = defpackage.j47.y(r8, r1)
            if (r0 != r3) goto L_0x0100
            return r3
        L_0x0100:
            r15 = r4
            r4 = r1
            r1 = r15
            r16 = r10
            r10 = r2
            r2 = r16
        L_0x0108:
            lx3 r0 = r4.b
            boolean r0 = defpackage.pag.r(r0)
            if (r0 == 0) goto L_0x0112
            if (r10 == 0) goto L_0x005d
        L_0x0112:
            if (r10 == 0) goto L_0x0115
            return r10
        L_0x0115:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0121:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.i(dle, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
