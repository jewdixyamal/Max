package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zy9  reason: default package */
public final class zy9 extends AtomicReference implements f2a {
    public final /* synthetic */ int a;
    public final f2a b;
    public final AtomicInteger c;

    public /* synthetic */ zy9(f2a f2a, AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = f2a;
        this.c = atomicInteger;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                az9 az9 = (az9) this.c;
                az9.t0 = false;
                az9.a();
                return;
            default:
                bz9 bz9 = (bz9) this.c;
                bz9.Z = false;
                bz9.a();
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                dm4.c(this, zl4);
                return;
            default:
                dm4.c(this, zl4);
                return;
        }
    }

    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                this.b.e(obj);
                return;
            default:
                this.b.e(obj);
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                az9 az9 = (az9) this.c;
                if (az9.o.a(th)) {
                    if (!az9.Y) {
                        az9.s0.g();
                    }
                    az9.t0 = false;
                    az9.a();
                    return;
                }
                return;
            default:
                ((bz9) this.c).g();
                this.b.onError(th);
                return;
        }
    }
}
