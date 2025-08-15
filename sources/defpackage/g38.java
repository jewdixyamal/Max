package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g38  reason: default package */
public final class g38 implements b38 {
    public final /* synthetic */ int a = 0;
    public final AtomicReference b;
    public final b38 c;

    public g38(b38 b38, AtomicReference atomicReference) {
        this.c = b38;
        this.b = atomicReference;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.c.a(obj);
                return;
            default:
                this.c.a(obj);
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                this.c.b();
                return;
            default:
                this.c.b();
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                dm4.e(this.b, zl4);
                return;
            default:
                dm4.c(this.b, zl4);
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.c.onError(th);
                return;
            default:
                this.c.onError(th);
                return;
        }
    }

    public g38(AtomicReference atomicReference, b38 b38) {
        this.b = atomicReference;
        this.c = b38;
    }
}
