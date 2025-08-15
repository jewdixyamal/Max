package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: y1a  reason: default package */
public final class y1a extends AtomicReference implements f2a, zl4, a2a {
    public final uy1 X = new uy1(2);
    public final AtomicLong Y = new AtomicLong();
    public final AtomicReference Z = new AtomicReference();
    public final f2a a;
    public final long b;
    public final TimeUnit c;
    public final xtc o;
    public r1a s0 = null;

    public y1a(f2a f2a, long j, TimeUnit timeUnit, xtc xtc) {
        this.a = f2a;
        this.b = j;
        this.c = timeUnit;
        this.o = xtc;
    }

    public final void a(long j) {
        if (this.Y.compareAndSet(j, Long.MAX_VALUE)) {
            dm4.a(this.Z);
            r1a r1a = this.s0;
            this.s0 = null;
            r1a.a(new va8((Object) this.a, 27, (Object) this));
            this.o.g();
        }
    }

    public final void b() {
        if (this.Y.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            uy1 uy1 = this.X;
            uy1.getClass();
            dm4.a(uy1);
            this.a.b();
            this.o.g();
        }
    }

    public final void c(zl4 zl4) {
        dm4.e(this.Z, zl4);
    }

    public final void e(Object obj) {
        AtomicLong atomicLong = this.Y;
        long j = atomicLong.get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (atomicLong.compareAndSet(j, j2)) {
                uy1 uy1 = this.X;
                ((zl4) uy1.get()).g();
                this.a.e(obj);
                zl4 c2 = this.o.c(new es5(j2, (a2a) this), this.b, this.c);
                uy1.getClass();
                dm4.c(uy1, c2);
            }
        }
    }

    public final void g() {
        dm4.a(this.Z);
        dm4.a(this);
        this.o.g();
    }

    public final boolean h() {
        return dm4.b((zl4) get());
    }

    public final void onError(Throwable th) {
        if (this.Y.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            uy1 uy1 = this.X;
            uy1.getClass();
            dm4.a(uy1);
            this.a.onError(th);
            this.o.g();
            return;
        }
        j47.Z(th);
    }
}
