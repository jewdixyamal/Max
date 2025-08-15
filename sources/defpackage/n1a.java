package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: n1a  reason: default package */
public abstract class n1a extends AtomicReference implements f2a, zl4, Runnable {
    public final qj3 X;
    public final AtomicReference Y = new AtomicReference();
    public zl4 Z;
    public final f2a a;
    public final long b;
    public final TimeUnit c;
    public final ztc o;

    public n1a(y6d y6d, long j, TimeUnit timeUnit, ztc ztc) {
        this.a = y6d;
        this.b = j;
        this.c = timeUnit;
        this.o = ztc;
        this.X = null;
    }

    public abstract void a();

    public final void b() {
        dm4.a(this.Y);
        a();
    }

    public final void c(zl4 zl4) {
        if (dm4.f(this.Z, zl4)) {
            this.Z = zl4;
            this.a.c(this);
            long j = this.b;
            dm4.c(this.Y, this.o.d(this, j, j, this.c));
        }
    }

    public final void d() {
        Object andSet = getAndSet((Object) null);
        if (andSet != null) {
            this.a.e(andSet);
        }
    }

    public final void e(Object obj) {
        qj3 qj3;
        Object andSet = getAndSet(obj);
        if (andSet != null && (qj3 = this.X) != null) {
            try {
                qj3.accept(andSet);
            } catch (Throwable th) {
                c37.B(th);
                dm4.a(this.Y);
                this.Z.g();
                this.a.onError(th);
            }
        }
    }

    public final void g() {
        dm4.a(this.Y);
        this.Z.g();
    }

    public final boolean h() {
        return this.Z.h();
    }

    public final void onError(Throwable th) {
        dm4.a(this.Y);
        this.a.onError(th);
    }

    public void run() {
        d();
    }
}
