package defpackage;

/* renamed from: ea  reason: default package */
public final class ea {
    public final je7 a;
    public final je7 b;

    public ea(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable a(int r17, long r18, long r20, kotlin.coroutines.Continuation r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r22
            boolean r2 = r0 instanceof defpackage.da
            if (r2 == 0) goto L_0x0017
            r2 = r0
            da r2 = (defpackage.da) r2
            int r3 = r2.s0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.s0 = r3
            goto L_0x001c
        L_0x0017:
            da r2 = new da
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.Y
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.s0
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 != r6) goto L_0x0033
            ea r1 = r2.X
            ea r2 = r2.o
            defpackage.od2.a0(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0070
        L_0x0030:
            r0 = move-exception
            r1 = r2
            goto L_0x008d
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            defpackage.od2.a0(r0)
            je7 r0 = r1.a     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x008c }
            pk r0 = (defpackage.pk) r0     // Catch:{ all -> 0x008c }
            au r4 = new au     // Catch:{ all -> 0x008c }
            java.lang.Long r7 = new java.lang.Long     // Catch:{ all -> 0x008c }
            r8 = r20
            r7.<init>(r8)     // Catch:{ all -> 0x008c }
            java.util.List r11 = java.util.Collections.singletonList(r7)     // Catch:{ all -> 0x008c }
            ek2 r12 = defpackage.ek2.ADMIN     // Catch:{ all -> 0x008c }
            r13 = 1
            r14 = 0
            r10 = 1
            r7 = r4
            r8 = r18
            r15 = r17
            r7.<init>(r8, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x008c }
            r2.o = r1     // Catch:{ all -> 0x008c }
            r2.X = r1     // Catch:{ all -> 0x008c }
            r2.s0 = r6     // Catch:{ all -> 0x008c }
            k4a r0 = (defpackage.k4a) r0     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.J(r4, r2)     // Catch:{ all -> 0x008c }
            if (r0 != r3) goto L_0x006f
            return r3
        L_0x006f:
            r2 = r1
        L_0x0070:
            sk2 r0 = (defpackage.sk2) r0     // Catch:{ all -> 0x0030 }
            je7 r1 = r1.b     // Catch:{ all -> 0x0030 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0030 }
            iy2 r1 = (defpackage.iy2) r1     // Catch:{ all -> 0x0030 }
            f52 r0 = r0.c     // Catch:{ all -> 0x0030 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x0030 }
            jz2 r1 = (defpackage.jz2) r1     // Catch:{ all -> 0x0030 }
            p82 r1 = r1.l()     // Catch:{ all -> 0x0030 }
            r1.c0(r0)     // Catch:{ all -> 0x0030 }
            r1 = r2
            r2 = r5
            goto L_0x0092
        L_0x008c:
            r0 = move-exception
        L_0x008d:
            njc r2 = new njc
            r2.<init>(r0)
        L_0x0092:
            java.lang.Throwable r0 = defpackage.pjc.a(r2)
            if (r0 == 0) goto L_0x00ba
            boolean r3 = r0 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r3 == 0) goto L_0x00a1
            ru.ok.tamtam.errors.TamErrorException r0 = (ru.ok.tamtam.errors.TamErrorException) r0
            pke r0 = r0.a
            return r0
        L_0x00a1:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "unknown error: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            defpackage.hm9.p(r1, r0, r5)
        L_0x00ba:
            boolean r0 = r2 instanceof defpackage.njc
            if (r0 == 0) goto L_0x00bf
            goto L_0x00c0
        L_0x00bf:
            r5 = r2
        L_0x00c0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea.a(int, long, long, kotlin.coroutines.Continuation):java.io.Serializable");
    }
}
