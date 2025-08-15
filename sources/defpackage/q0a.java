package defpackage;

/* renamed from: q0a  reason: default package */
public final class q0a extends vk0 implements f2a, Runnable {
    public dqd X;
    public zl4 Y;
    public Throwable Z;
    public final f2a a;
    public final xtc b;
    public final boolean c = false;
    public final int o;
    public volatile boolean s0;
    public volatile boolean t0;
    public int u0;
    public boolean v0;

    public q0a(f2a f2a, xtc xtc, int i) {
        this.a = f2a;
        this.b = xtc;
        this.o = i;
    }

    public final void b() {
        if (!this.s0) {
            this.s0 = true;
            if (getAndIncrement() == 0) {
                this.b.b(this);
            }
        }
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.Y, zl4)) {
            this.Y = zl4;
            if (zl4 instanceof tqb) {
                tqb tqb = (tqb) zl4;
                int n = tqb.n(7);
                if (n == 1) {
                    this.u0 = n;
                    this.X = tqb;
                    this.s0 = true;
                    this.a.c(this);
                    if (getAndIncrement() == 0) {
                        this.b.b(this);
                        return;
                    }
                    return;
                } else if (n == 2) {
                    this.u0 = n;
                    this.X = tqb;
                    this.a.c(this);
                    return;
                }
            }
            this.X = new pwd(this.o);
            this.a.c(this);
        }
    }

    public final void clear() {
        this.X.clear();
    }

    public final void e(Object obj) {
        if (!this.s0) {
            if (this.u0 != 2) {
                this.X.offer(obj);
            }
            if (getAndIncrement() == 0) {
                this.b.b(this);
            }
        }
    }

    public final boolean f(boolean z, boolean z2, f2a f2a) {
        if (this.t0) {
            this.X.clear();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.Z;
            if (this.c) {
                if (!z2) {
                    return false;
                }
                this.t0 = true;
                if (th != null) {
                    f2a.onError(th);
                } else {
                    f2a.b();
                }
                this.b.g();
                return true;
            } else if (th != null) {
                this.t0 = true;
                this.X.clear();
                f2a.onError(th);
                this.b.g();
                return true;
            } else if (!z2) {
                return false;
            } else {
                this.t0 = true;
                f2a.b();
                this.b.g();
                return true;
            }
        }
    }

    public final void g() {
        if (!this.t0) {
            this.t0 = true;
            this.Y.g();
            this.b.g();
            if (!this.v0 && getAndIncrement() == 0) {
                this.X.clear();
            }
        }
    }

    public final boolean h() {
        return this.t0;
    }

    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    public final int n(int i) {
        this.v0 = true;
        return 2;
    }

    public final void onError(Throwable th) {
        if (this.s0) {
            j47.Z(th);
            return;
        }
        this.Z = th;
        this.s0 = true;
        if (getAndIncrement() == 0) {
            this.b.b(this);
        }
    }

    public final Object poll() {
        return this.X.poll();
    }

    public final void run() {
        if (this.v0) {
            int i = 1;
            while (!this.t0) {
                boolean z = this.s0;
                Throwable th = this.Z;
                if (this.c || !z || th == null) {
                    this.a.e((Object) null);
                    if (z) {
                        this.t0 = true;
                        Throwable th2 = this.Z;
                        if (th2 != null) {
                            this.a.onError(th2);
                        } else {
                            this.a.b();
                        }
                        this.b.g();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.t0 = true;
                    this.a.onError(this.Z);
                    this.b.g();
                    return;
                }
            }
            return;
        }
        dqd dqd = this.X;
        f2a f2a = this.a;
        int i2 = 1;
        while (!f(this.s0, dqd.isEmpty(), f2a)) {
            while (true) {
                boolean z2 = this.s0;
                try {
                    Object poll = dqd.poll();
                    boolean z3 = poll == null;
                    if (!f(z2, z3, f2a)) {
                        if (z3) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            f2a.e(poll);
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    c37.B(th3);
                    this.t0 = true;
                    this.Y.g();
                    dqd.clear();
                    f2a.onError(th3);
                    this.b.g();
                    return;
                }
            }
        }
    }
}
