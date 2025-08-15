package defpackage;

/* renamed from: b7d  reason: default package */
public final class b7d extends vg3 implements as {
    public final vg3 a;
    public boolean b;
    public jn c;
    public volatile boolean o;

    public b7d(xpb xpb) {
        this.a = xpb;
    }

    public final void b() {
        if (!this.o) {
            synchronized (this) {
                try {
                    if (!this.o) {
                        this.o = true;
                        if (this.b) {
                            jn jnVar = this.c;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.c = jnVar;
                            }
                            jnVar.c(hv9.a);
                            return;
                        }
                        this.b = true;
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
        boolean z = true;
        if (!this.o) {
            synchronized (this) {
                try {
                    if (!this.o) {
                        if (this.b) {
                            jn jnVar = this.c;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.c = jnVar;
                            }
                            jnVar.c(new ev9(zl4));
                            return;
                        }
                        this.b = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            zl4.g();
            return;
        }
        this.a.c(zl4);
        z();
    }

    public final void e(Object obj) {
        if (!this.o) {
            synchronized (this) {
                try {
                    if (!this.o) {
                        if (this.b) {
                            jn jnVar = this.c;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.c = jnVar;
                            }
                            jnVar.c(obj);
                            return;
                        }
                        this.b = true;
                        this.a.e(obj);
                        z();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r1 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        defpackage.j47.Z(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        r4.a.onError(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            boolean r0 = r4.o
            if (r0 == 0) goto L_0x0008
            defpackage.j47.Z(r5)
            return
        L_0x0008:
            monitor-enter(r4)
            boolean r0 = r4.o     // Catch:{ all -> 0x0024 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0036
        L_0x000f:
            r4.o = r1     // Catch:{ all -> 0x0024 }
            boolean r0 = r4.b     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r0 == 0) goto L_0x0033
            jn r0 = r4.c     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0026
            jn r0 = new jn     // Catch:{ all -> 0x0024 }
            r1 = 1
            r3 = 0
            r0.<init>((int) r1, (byte) r3)     // Catch:{ all -> 0x0024 }
            r4.c = r0     // Catch:{ all -> 0x0024 }
            goto L_0x0026
        L_0x0024:
            r5 = move-exception
            goto L_0x0043
        L_0x0026:
            fv9 r1 = new fv9     // Catch:{ all -> 0x0024 }
            r1.<init>(r5)     // Catch:{ all -> 0x0024 }
            java.lang.Object r5 = r0.c     // Catch:{ all -> 0x0024 }
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch:{ all -> 0x0024 }
            r5[r2] = r1     // Catch:{ all -> 0x0024 }
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            return
        L_0x0033:
            r4.b = r1     // Catch:{ all -> 0x0024 }
            r1 = r2
        L_0x0036:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x003d
            defpackage.j47.Z(r5)
            return
        L_0x003d:
            vg3 r4 = r4.a
            r4.onError(r5)
            return
        L_0x0043:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7d.onError(java.lang.Throwable):void");
    }

    public final void q(f2a f2a) {
        this.a.a(f2a);
    }

    public final boolean test(Object obj) {
        return hv9.b(this.a, obj);
    }

    public final void z() {
        jn jnVar;
        while (true) {
            synchronized (this) {
                try {
                    jnVar = this.c;
                    if (jnVar == null) {
                        this.b = false;
                        return;
                    }
                    this.c = null;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            jnVar.p(this);
        }
    }
}
