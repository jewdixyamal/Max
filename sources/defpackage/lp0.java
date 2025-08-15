package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: lp0  reason: default package */
public final class lp0 extends CountDownLatch implements f2a, zl4 {
    public Object a;
    public Throwable b;
    public zl4 c;
    public volatile boolean o;

    public final void b() {
        countDown();
    }

    public final void c(zl4 zl4) {
        this.c = zl4;
        if (this.o) {
            zl4.g();
        }
    }

    public final void e(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.g();
            countDown();
        }
    }

    public final void g() {
        this.o = true;
        zl4 zl4 = this.c;
        if (zl4 != null) {
            zl4.g();
        }
    }

    public final boolean h() {
        return this.o;
    }

    public final void onError(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }
}
