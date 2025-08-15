package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: as5  reason: default package */
public final class as5 extends AtomicInteger implements gs5, xae {
    public final int X;
    public final int Y;
    public volatile boolean Z;
    public final vae a;
    public final pl0 b;
    public final owd c;
    public final AtomicLong o = new AtomicLong();
    public volatile boolean s0;
    public Throwable t0;
    public xae u0;
    public Object v0;
    public int w0;

    public as5(vae vae, pl0 pl0, Object obj, int i) {
        this.a = vae;
        this.b = pl0;
        this.v0 = obj;
        this.X = i;
        this.Y = i - (i >> 2);
        owd owd = new owd(i);
        this.c = owd;
        owd.offer(obj);
    }

    public final void a() {
        int i;
        int i2;
        Throwable th;
        if (getAndIncrement() == 0) {
            vae vae = this.a;
            owd owd = this.c;
            int i3 = this.Y;
            int i4 = this.w0;
            int i5 = 1;
            do {
                long j = this.o.get();
                long j2 = 0;
                while (true) {
                    i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    if (i == 0) {
                        i2 = i5;
                        break;
                    } else if (this.Z) {
                        owd.clear();
                        return;
                    } else {
                        boolean z = this.s0;
                        if (!z || (th = this.t0) == null) {
                            AtomicLong atomicLong = owd.o;
                            i2 = i5;
                            long j3 = atomicLong.get();
                            int i6 = ((int) j3) & owd.a;
                            Object obj = owd.get(i6);
                            long j4 = j;
                            if (obj == null) {
                                obj = null;
                            } else {
                                atomicLong.lazySet(j3 + 1);
                                owd.lazySet(i6, (Object) null);
                            }
                            boolean z2 = obj == null;
                            if (z && z2) {
                                vae.b();
                                return;
                            } else if (z2) {
                                break;
                            } else {
                                vae.e(obj);
                                j2++;
                                i4++;
                                if (i4 == i3) {
                                    this.u0.j((long) i3);
                                    i4 = 0;
                                }
                                i5 = i2;
                                j = j4;
                            }
                        } else {
                            owd.clear();
                            vae.onError(th);
                            return;
                        }
                    }
                }
                if (i == 0 && this.s0) {
                    Throwable th2 = this.t0;
                    if (th2 != null) {
                        owd.clear();
                        vae.onError(th2);
                        return;
                    } else if (owd.isEmpty()) {
                        vae.b();
                        return;
                    }
                }
                if (j2 != 0) {
                    ngg.D(this.o, j2);
                }
                this.w0 = i4;
                i5 = addAndGet(-i2);
            } while (i5 != 0);
        }
    }

    public final void b() {
        if (!this.s0) {
            this.s0 = true;
            a();
        }
    }

    public final void cancel() {
        this.Z = true;
        this.u0.cancel();
        if (getAndIncrement() == 0) {
            this.c.clear();
        }
    }

    public final void e(Object obj) {
        if (!this.s0) {
            try {
                Object apply = this.b.apply(this.v0, obj);
                this.v0 = apply;
                this.c.offer(apply);
                a();
            } catch (Throwable th) {
                c37.B(th);
                this.u0.cancel();
                onError(th);
            }
        }
    }

    public final void f(xae xae) {
        if (zae.e(this.u0, xae)) {
            this.u0 = xae;
            this.a.f(this);
            xae.j((long) (this.X - 1));
        }
    }

    public final void j(long j) {
        if (zae.d(j)) {
            ngg.b(this.o, j);
            a();
        }
    }

    public final void onError(Throwable th) {
        if (this.s0) {
            j47.Z(th);
            return;
        }
        this.t0 = th;
        this.s0 = true;
        a();
    }
}
