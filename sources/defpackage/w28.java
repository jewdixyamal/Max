package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: w28  reason: default package */
public final class w28 extends wk0 implements b38 {
    public final az X = new AtomicReference();
    public final int Y;
    public volatile boolean Z;
    public final vae a;
    public final hc3 b = new Object();
    public final AtomicLong c = new AtomicLong();
    public final y28 o;
    public boolean s0;
    public long t0;

    /* JADX WARNING: type inference failed for: r1v1, types: [hc3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [az, java.util.concurrent.atomic.AtomicReference] */
    public w28(vae vae, int i, y28 y28) {
        this.a = vae;
        this.Y = i;
        this.o = y28;
    }

    public final void a(Object obj) {
        this.o.offer(obj);
        g();
    }

    public final void b() {
        this.o.offer(hv9.a);
        g();
    }

    public final void c(zl4 zl4) {
        this.b.a(zl4);
    }

    public final void cancel() {
        if (!this.Z) {
            this.Z = true;
            this.b.g();
            if (getAndIncrement() == 0) {
                this.o.clear();
            }
        }
    }

    public final void clear() {
        this.o.clear();
    }

    public final void g() {
        int i;
        hv9 hv9;
        if (getAndIncrement() == 0) {
            int i2 = 1;
            if (this.s0) {
                vae vae = this.a;
                y28 y28 = this.o;
                int i3 = 1;
                while (!this.Z) {
                    Throwable th = (Throwable) this.X.get();
                    if (th != null) {
                        y28.clear();
                        vae.onError(th);
                        return;
                    }
                    boolean z = y28.d() == this.Y;
                    if (!y28.isEmpty()) {
                        vae.e((Object) null);
                    }
                    if (z) {
                        vae.b();
                        return;
                    }
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
                y28.clear();
                return;
            }
            vae vae2 = this.a;
            y28 y282 = this.o;
            long j = this.t0;
            do {
                long j2 = this.c.get();
                while (true) {
                    i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    hv9 = hv9.a;
                    if (i == 0) {
                        break;
                    } else if (this.Z) {
                        y282.clear();
                        return;
                    } else if (((Throwable) this.X.get()) != null) {
                        y282.clear();
                        this.X.e(this.a);
                        return;
                    } else if (y282.i() == this.Y) {
                        vae2.b();
                        return;
                    } else {
                        Object poll = y282.poll();
                        if (poll == null) {
                            break;
                        } else if (poll != hv9) {
                            vae2.e(poll);
                            j++;
                        }
                    }
                }
                if (i == 0) {
                    if (((Throwable) this.X.get()) != null) {
                        y282.clear();
                        this.X.e(this.a);
                        return;
                    }
                    while (y282.peek() == hv9) {
                        y282.k();
                    }
                    if (y282.i() == this.Y) {
                        vae2.b();
                        return;
                    }
                }
                this.t0 = j;
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }
    }

    public final boolean isEmpty() {
        return this.o.isEmpty();
    }

    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.c, j);
            g();
        }
    }

    public final int n(int i) {
        this.s0 = true;
        return 2;
    }

    public final void onError(Throwable th) {
        if (this.X.a(th)) {
            this.b.g();
            this.o.offer(hv9.a);
            g();
        }
    }

    public final Object poll() {
        Object poll;
        do {
            poll = this.o.poll();
        } while (poll == hv9.a);
        return poll;
    }
}
