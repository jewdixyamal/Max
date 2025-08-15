package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: mp0  reason: default package */
public final class mp0 extends CountDownLatch implements erd, ab3, b38 {
    public Object a;
    public Throwable b;
    public zl4 c;
    public volatile boolean o;

    public final void a(Object obj) {
        this.a = obj;
        countDown();
    }

    public final void b() {
        countDown();
    }

    public final void c(zl4 zl4) {
        this.c = zl4;
        if (this.o) {
            zl4.g();
        }
    }

    public final Object d() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.o = true;
                zl4 zl4 = this.c;
                if (zl4 != null) {
                    zl4.g();
                }
                throw q45.f(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw q45.f(th);
    }

    public final void onError(Throwable th) {
        this.b = th;
        countDown();
    }
}
