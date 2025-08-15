package defpackage;

/* renamed from: y6d  reason: default package */
public final class y6d implements f2a, zl4 {
    public volatile boolean X;
    public final f2a a;
    public zl4 b;
    public boolean c;
    public jn o;

    public y6d(f2a f2a) {
        this.a = f2a;
    }

    public final void b() {
        if (!this.X) {
            synchronized (this) {
                try {
                    if (!this.X) {
                        if (this.c) {
                            jn jnVar = this.o;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.o = jnVar;
                            }
                            jnVar.c(hv9.a);
                            return;
                        }
                        this.X = true;
                        this.c = true;
                        this.a.b();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.b, zl4)) {
            this.b = zl4;
            this.a.c(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        r5.a.e(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6 = r5.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        if (r6 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0044, code lost:
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0046, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0048, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004a, code lost:
        r5.o = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004d, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004e, code lost:
        r1 = r5.a;
        r6 = (java.lang.Object[]) r6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        if (r6 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0056, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0058, code lost:
        if (r2 >= 4) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005a, code lost:
        r4 = r6[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005c, code lost:
        if (r4 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0063, code lost:
        if (defpackage.hv9.b(r1, r4) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0066, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0069, code lost:
        r6 = r6[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006f, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r5.X
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            if (r6 != 0) goto L_0x0016
            zl4 r6 = r5.b
            r6.g()
            java.lang.String r6 = "onNext called with a null value."
            java.lang.NullPointerException r6 = defpackage.q45.b(r6)
            r5.onError(r6)
            return
        L_0x0016:
            monitor-enter(r5)
            boolean r0 = r5.X     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r6 = move-exception
            goto L_0x0070
        L_0x001f:
            boolean r0 = r5.c     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0035
            jn r0 = r5.o     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x0030
            jn r0 = new jn     // Catch:{ all -> 0x001d }
            r1 = 1
            r2 = 0
            r0.<init>((int) r1, (byte) r2)     // Catch:{ all -> 0x001d }
            r5.o = r0     // Catch:{ all -> 0x001d }
        L_0x0030:
            r0.c(r6)     // Catch:{ all -> 0x001d }
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            return
        L_0x0035:
            r0 = 1
            r5.c = r0     // Catch:{ all -> 0x001d }
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            f2a r0 = r5.a
            r0.e(r6)
        L_0x003e:
            monitor-enter(r5)
            jn r6 = r5.o     // Catch:{ all -> 0x0048 }
            r0 = 0
            if (r6 != 0) goto L_0x004a
            r5.c = r0     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0065
        L_0x0048:
            r6 = move-exception
            goto L_0x006e
        L_0x004a:
            r1 = 0
            r5.o = r1     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            f2a r1 = r5.a
            java.lang.Object r6 = r6.c
            java.lang.Object[] r6 = (java.lang.Object[]) r6
        L_0x0054:
            if (r6 == 0) goto L_0x003e
            r2 = r0
        L_0x0057:
            r3 = 4
            if (r2 >= r3) goto L_0x0069
            r4 = r6[r2]
            if (r4 != 0) goto L_0x005f
            goto L_0x0069
        L_0x005f:
            boolean r3 = defpackage.hv9.b(r1, r4)
            if (r3 == 0) goto L_0x0066
        L_0x0065:
            return
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x0057
        L_0x0069:
            r6 = r6[r3]
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            goto L_0x0054
        L_0x006e:
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            throw r6
        L_0x0070:
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6d.e(java.lang.Object):void");
    }

    public final void g() {
        this.X = true;
        this.b.g();
    }

    public final boolean h() {
        return this.b.h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r1 == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        defpackage.j47.Z(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        r4.a.onError(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            boolean r0 = r4.X
            if (r0 == 0) goto L_0x0008
            defpackage.j47.Z(r5)
            return
        L_0x0008:
            monitor-enter(r4)
            boolean r0 = r4.X     // Catch:{ all -> 0x0024 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0038
        L_0x000f:
            boolean r0 = r4.c     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r0 == 0) goto L_0x0033
            r4.X = r1     // Catch:{ all -> 0x0024 }
            jn r0 = r4.o     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0026
            jn r0 = new jn     // Catch:{ all -> 0x0024 }
            r1 = 1
            r3 = 0
            r0.<init>((int) r1, (byte) r3)     // Catch:{ all -> 0x0024 }
            r4.o = r0     // Catch:{ all -> 0x0024 }
            goto L_0x0026
        L_0x0024:
            r5 = move-exception
            goto L_0x0045
        L_0x0026:
            fv9 r1 = new fv9     // Catch:{ all -> 0x0024 }
            r1.<init>(r5)     // Catch:{ all -> 0x0024 }
            java.lang.Object r5 = r0.c     // Catch:{ all -> 0x0024 }
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch:{ all -> 0x0024 }
            r5[r2] = r1     // Catch:{ all -> 0x0024 }
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            return
        L_0x0033:
            r4.X = r1     // Catch:{ all -> 0x0024 }
            r4.c = r1     // Catch:{ all -> 0x0024 }
            r1 = r2
        L_0x0038:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x003f
            defpackage.j47.Z(r5)
            return
        L_0x003f:
            f2a r4 = r4.a
            r4.onError(r5)
            return
        L_0x0045:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y6d.onError(java.lang.Throwable):void");
    }
}
