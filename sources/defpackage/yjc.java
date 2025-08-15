package defpackage;

/* renamed from: yjc  reason: default package */
public final /* synthetic */ class yjc implements b66, mq1 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ yjc(zm4 zm4, see see, bue bue, nc0 nc0, ab0 ab0) {
        this.a = zm4;
        this.b = see;
        this.c = bue;
        this.o = nc0;
        this.X = ab0;
    }

    public Object apply(Object obj) {
        return ((qy9) obj).h(new o23((m56) this.a, (lf0) this.c, (a66) this.o, (ztc) this.X, (m56) this.b));
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [mde] */
    /* JADX WARNING: type inference failed for: r3v5, types: [cff] */
    /* JADX WARNING: type inference failed for: r3v6, types: [fc3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String q(defpackage.lq1 r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.a
            zm4 r0 = (defpackage.zm4) r0
            java.lang.Object r1 = r12.b
            see r1 = (defpackage.see) r1
            java.lang.Object r2 = r12.c
            r5 = r2
            bue r5 = (defpackage.bue) r5
            java.lang.Object r2 = r12.o
            nc0 r2 = (defpackage.nc0) r2
            java.lang.Object r12 = r12.X
            ab0 r12 = (defpackage.ab0) r12
            r0.getClass()
            eu4 r9 = r1.c
            kc0 r2 = defpackage.eef.b(r12, r9, r2)
            mc0 r6 = r12.a
            android.util.Size r7 = r1.b
            android.util.Range r12 = r1.d
            ha0 r8 = r2.c
            if (r8 == 0) goto L_0x0032
            fc3 r11 = new fc3
            java.lang.String r4 = r2.a
            r3 = r11
            r10 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x003c
        L_0x0032:
            cff r11 = new cff
            java.lang.String r4 = r2.a
            r3 = r11
            r8 = r9
            r9 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
        L_0x003c:
            java.lang.Object r12 = r11.get()
            ic0 r12 = (defpackage.ic0) r12
            java.lang.Object r2 = r0.e     // Catch:{ InvalidConfigException -> 0x0095 }
            av1 r2 = (defpackage.av1) r2     // Catch:{ InvalidConfigException -> 0x0095 }
            java.lang.Object r3 = r0.c     // Catch:{ InvalidConfigException -> 0x0095 }
            java.util.concurrent.Executor r3 = (java.util.concurrent.Executor) r3     // Catch:{ InvalidConfigException -> 0x0095 }
            r2.getClass()     // Catch:{ InvalidConfigException -> 0x0095 }
            d15 r2 = new d15     // Catch:{ InvalidConfigException -> 0x0095 }
            r2.<init>(r3, r12)     // Catch:{ InvalidConfigException -> 0x0095 }
            r0.f = r2     // Catch:{ InvalidConfigException -> 0x0095 }
            k05 r12 = r2.f
            boolean r2 = r12 instanceof defpackage.c15
            if (r2 != 0) goto L_0x0065
            java.lang.AssertionError r12 = new java.lang.AssertionError
            java.lang.String r1 = "The EncoderInput of video isn't a SurfaceInput."
            r12.<init>(r1)
            r13.d(r12)
            goto L_0x0099
        L_0x0065:
            c15 r12 = (defpackage.c15) r12
            java.lang.Object r2 = r0.d
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            tef r3 = new tef
            r4 = 1
            r3.<init>(r0, r13, r1, r4)
            java.lang.Object r1 = r12.a
            monitor-enter(r1)
            r12.o = r3     // Catch:{ all -> 0x0092 }
            r2.getClass()     // Catch:{ all -> 0x0092 }
            r12.X = r2     // Catch:{ all -> 0x0092 }
            android.view.Surface r13 = r12.b     // Catch:{ all -> 0x0092 }
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            if (r13 == 0) goto L_0x0099
            q6d r2 = (defpackage.q6d) r2
            kl4 r1 = new kl4     // Catch:{ RejectedExecutionException -> 0x008d }
            r4 = 17
            r1.<init>((java.lang.Object) r3, (int) r4, (java.lang.Object) r13)     // Catch:{ RejectedExecutionException -> 0x008d }
            r2.execute(r1)     // Catch:{ RejectedExecutionException -> 0x008d }
            goto L_0x0099
        L_0x008d:
            d15 r12 = r12.Y
            java.lang.String r12 = r12.a
            goto L_0x0099
        L_0x0092:
            r12 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            throw r12
        L_0x0095:
            r12 = move-exception
            r13.d(r12)
        L_0x0099:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "ConfigureVideoEncoderFuture "
            r12.<init>(r13)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjc.q(lq1):java.lang.String");
    }

    public /* synthetic */ yjc(m56 m56, lf0 lf0, a66 a66, ztc ztc, m56 m562) {
        this.a = m56;
        this.c = lf0;
        this.o = a66;
        this.X = ztc;
        this.b = m562;
    }
}
