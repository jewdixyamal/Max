package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: v1a  reason: default package */
public final class v1a extends AtomicReference implements f2a, zl4, Runnable {
    public final qj3 X = null;
    public zl4 Y;
    public volatile boolean Z;
    public final f2a a;
    public final long b;
    public final TimeUnit c;
    public final xtc o;

    public v1a(y6d y6d, long j, TimeUnit timeUnit, xtc xtc) {
        this.a = y6d;
        this.b = j;
        this.c = timeUnit;
        this.o = xtc;
    }

    public final void b() {
        this.a.b();
        this.o.g();
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.Y, zl4)) {
            this.Y = zl4;
            this.a.c(this);
        }
    }

    public final void e(Object obj) {
        if (!this.Z) {
            this.Z = true;
            this.a.e(obj);
            zl4 zl4 = (zl4) get();
            if (zl4 != null) {
                zl4.g();
            }
            dm4.c(this, this.o.c(this, this.b, this.c));
            return;
        }
        qj3 qj3 = this.X;
        if (qj3 != null) {
            try {
                qj3.accept(obj);
            } catch (Throwable th) {
                c37.B(th);
                this.Y.g();
                this.a.onError(th);
                this.o.g();
            }
        }
    }

    public final void g() {
        this.Y.g();
        this.o.g();
    }

    public final boolean h() {
        return this.o.h();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
        this.o.g();
    }

    public final void run() {
        this.Z = false;
    }
}
