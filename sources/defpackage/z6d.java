package defpackage;

/* renamed from: z6d  reason: default package */
public final class z6d extends vr5 {
    public volatile boolean X;
    public final vr5 b;
    public boolean c;
    public jn o;

    public z6d(c5f c5f) {
        this.b = c5f;
    }

    public final void b() {
        if (!this.X) {
            synchronized (this) {
                try {
                    if (!this.X) {
                        this.X = true;
                        if (this.c) {
                            jn jnVar = this.o;
                            if (jnVar == null) {
                                jnVar = new jn(1, (byte) 0);
                                this.o = jnVar;
                            }
                            jnVar.c(hv9.a);
                            return;
                        }
                        this.c = true;
                        this.b.b();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void e(Object obj) {
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
                            jnVar.c(obj);
                            return;
                        }
                        this.c = true;
                        this.b.e(obj);
                        h();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void f(xae xae) {
        boolean z = true;
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
                            jnVar.c(new gv9(xae));
                            return;
                        }
                        this.c = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            xae.cancel();
            return;
        }
        this.b.f(xae);
        h();
    }

    public final void g(vae vae) {
        this.b.d(vae);
    }

    public final void h() {
        jn jnVar;
        while (true) {
            synchronized (this) {
                try {
                    jnVar = this.o;
                    if (jnVar == null) {
                        this.c = false;
                        return;
                    }
                    this.o = null;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            jnVar.b(this.b);
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
        r4.b.onError(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
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
            goto L_0x0036
        L_0x000f:
            r4.X = r1     // Catch:{ all -> 0x0024 }
            boolean r0 = r4.c     // Catch:{ all -> 0x0024 }
            r2 = 0
            if (r0 == 0) goto L_0x0033
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
            r4.c = r1     // Catch:{ all -> 0x0024 }
            r1 = r2
        L_0x0036:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x003d
            defpackage.j47.Z(r5)
            return
        L_0x003d:
            vr5 r4 = r4.b
            r4.onError(r5)
            return
        L_0x0043:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z6d.onError(java.lang.Throwable):void");
    }
}
