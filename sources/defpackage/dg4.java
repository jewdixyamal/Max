package defpackage;

/* renamed from: dg4  reason: default package */
public abstract class dg4 extends wk0 {
    public final vae a;
    public Object b;

    public dg4(vae vae) {
        this.a = vae;
    }

    public void a(Object obj) {
        g(obj);
    }

    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final void g(Object obj) {
        int i = get();
        do {
            vae vae = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                vae.e((Object) null);
                if (get() != 4) {
                    vae.b();
                    return;
                }
                return;
            } else if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    vae.e(obj);
                    if (get() != 4) {
                        vae.b();
                        return;
                    }
                    return;
                }
                this.b = obj;
                if (!compareAndSet(0, 1)) {
                    i = get();
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (i != 4);
        this.b = null;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final void j(long j) {
        Object obj;
        if (zae.d(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3) && (obj = this.b) != null) {
                            this.b = null;
                            vae vae = this.a;
                            vae.e(obj);
                            if (get() != 4) {
                                vae.b();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final int n(int i) {
        lazySet(8);
        return 2;
    }

    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.b;
        this.b = null;
        return obj;
    }
}
