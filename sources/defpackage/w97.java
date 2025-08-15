package defpackage;

/* renamed from: w97  reason: default package */
public abstract class w97 implements z97 {
    public final zt0 a = c37.a(Integer.MAX_VALUE, 0, 6);
    public final ua3 b = ngg.a();

    public final void a(Object obj) {
        this.a.i((Throwable) null);
        this.b.makeCompleting$kotlinx_coroutines_core(new pjc(obj));
    }

    public final void b(Throwable th) {
        this.a.i((Throwable) null);
        ua3 ua3 = this.b;
        ua3.getClass();
        ua3.makeCompleting$kotlinx_coroutines_core(new lb3(th, false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[Catch:{ all -> 0x006c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.a66 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.s97
            if (r0 == 0) goto L_0x0013
            r0 = r7
            s97 r0 = (defpackage.s97) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            s97 r0 = new s97
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r5 = r0.o
            w97 r5 = (defpackage.w97) r5
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x006c }
            goto L_0x006c
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            w97 r5 = r0.X
            java.lang.Object r6 = r0.o
            a66 r6 = (defpackage.a66) r6
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x006c }
            goto L_0x0052
        L_0x0040:
            defpackage.od2.a0(r7)
            ua3 r7 = r5.b     // Catch:{ all -> 0x006c }
            r0.o = r6     // Catch:{ all -> 0x006c }
            r0.X = r5     // Catch:{ all -> 0x006c }
            r0.s0 = r4     // Catch:{ all -> 0x006c }
            java.lang.Object r7 = r7.awaitInternal(r0)     // Catch:{ all -> 0x006c }
            if (r7 != r1) goto L_0x0052
            return r1
        L_0x0052:
            pjc r7 = (defpackage.pjc) r7     // Catch:{ all -> 0x006c }
            java.lang.Object r7 = r7.a     // Catch:{ all -> 0x006c }
            boolean r2 = r7 instanceof defpackage.njc     // Catch:{ all -> 0x006c }
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x006c
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x006c }
            r0.o = r5     // Catch:{ all -> 0x006c }
            r2 = 0
            r0.X = r2     // Catch:{ all -> 0x006c }
            r0.s0 = r3     // Catch:{ all -> 0x006c }
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch:{ all -> 0x006c }
            if (r6 != r1) goto L_0x006c
            return r1
        L_0x006c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w97.c(a66, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e A[Catch:{ all -> 0x0046 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(defpackage.a66 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.t97
            if (r0 == 0) goto L_0x0013
            r0 = r8
            t97 r0 = (defpackage.t97) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            t97 r0 = new t97
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0054
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r6 = r0.o
            w97 r6 = (defpackage.w97) r6
            defpackage.od2.a0(r8)
            goto L_0x00a9
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            java.lang.Object r6 = r0.X
            w97 r6 = (defpackage.w97) r6
            java.lang.Object r7 = r0.o
            a66 r7 = (defpackage.a66) r7
            defpackage.od2.a0(r8)     // Catch:{ all -> 0x0046 }
            goto L_0x008d
        L_0x0046:
            r8 = move-exception
            goto L_0x0090
        L_0x0048:
            java.lang.Object r6 = r0.X
            w97 r6 = (defpackage.w97) r6
            java.lang.Object r7 = r0.o
            a66 r7 = (defpackage.a66) r7
            defpackage.od2.a0(r8)     // Catch:{ all -> 0x0046 }
            goto L_0x0066
        L_0x0054:
            defpackage.od2.a0(r8)
            ua3 r8 = r6.b     // Catch:{ all -> 0x0046 }
            r0.o = r7     // Catch:{ all -> 0x0046 }
            r0.X = r6     // Catch:{ all -> 0x0046 }
            r0.s0 = r5     // Catch:{ all -> 0x0046 }
            java.lang.Object r8 = r8.awaitInternal(r0)     // Catch:{ all -> 0x0046 }
            if (r8 != r1) goto L_0x0066
            return r1
        L_0x0066:
            pjc r8 = (defpackage.pjc) r8     // Catch:{ all -> 0x0046 }
            java.lang.Object r8 = r8.a     // Catch:{ all -> 0x0046 }
            boolean r2 = r8 instanceof defpackage.njc     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x008d
            java.lang.Throwable r8 = defpackage.pjc.a(r8)     // Catch:{ all -> 0x0046 }
            if (r8 == 0) goto L_0x0081
            r0.o = r7     // Catch:{ all -> 0x0046 }
            r0.X = r6     // Catch:{ all -> 0x0046 }
            r0.s0 = r4     // Catch:{ all -> 0x0046 }
            java.lang.Object r8 = r7.invoke(r8, r0)     // Catch:{ all -> 0x0046 }
            if (r8 != r1) goto L_0x008d
            return r1
        L_0x0081:
            java.lang.String r8 = "Required value was null."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0046 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0046 }
            r2.<init>(r8)     // Catch:{ all -> 0x0046 }
            throw r2     // Catch:{ all -> 0x0046 }
        L_0x008d:
            e5f r8 = defpackage.e5f.a     // Catch:{ all -> 0x0046 }
            goto L_0x0096
        L_0x0090:
            njc r2 = new njc
            r2.<init>(r8)
            r8 = r2
        L_0x0096:
            java.lang.Throwable r2 = defpackage.pjc.a(r8)
            if (r2 == 0) goto L_0x00a9
            r0.o = r6
            r0.X = r8
            r0.s0 = r3
            java.lang.Object r7 = r7.invoke(r2, r0)
            if (r7 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w97.d(a66, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.xwf r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.u97
            if (r0 == 0) goto L_0x0013
            r0 = r6
            u97 r0 = (defpackage.u97) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            u97 r0 = new u97
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            w97 r4 = r0.o
            defpackage.od2.a0(r6)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.od2.a0(r6)
            v97 r6 = new v97
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.o = r4
            r0.Z = r3
            java.lang.Object r5 = defpackage.j1e.k(r6, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w97.e(xwf, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
