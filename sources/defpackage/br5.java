package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: br5  reason: default package */
public final class br5 extends AtomicReference implements erd, f2a {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ br5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 0:
                cr5 cr5 = (cr5) this.b;
                cr5.z0 = obj;
                cr5.A0 = 2;
                cr5.a();
                return;
            case 1:
                dz9 dz9 = (dz9) this.b;
                dz9.v0 = obj;
                dz9.w0 = 2;
                dz9.a();
                return;
            default:
                ((erd) this.b).a(obj);
                return;
        }
    }

    public void b() {
        k1a k1a = (k1a) this.b;
        dm4.a(k1a.Y);
        if (k1a.getAndIncrement() == 0) {
            k1a.c.d(k1a.a);
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                dm4.c(this, zl4);
                return;
            case 1:
                dm4.c(this, zl4);
                return;
            case 2:
                dm4.e(this, zl4);
                return;
            default:
                dm4.e(this, zl4);
                return;
        }
    }

    public void e(Object obj) {
        ((k1a) this.b).a();
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                cr5 cr5 = (cr5) this.b;
                if (cr5.a.a(th)) {
                    if (cr5.c != 3) {
                        cr5.X.cancel();
                    }
                    cr5.A0 = 0;
                    cr5.a();
                    return;
                }
                return;
            case 1:
                dz9 dz9 = (dz9) this.b;
                if (dz9.a.a(th)) {
                    if (dz9.c != 3) {
                        dz9.X.g();
                    }
                    dz9.w0 = 0;
                    dz9.a();
                    return;
                }
                return;
            case 2:
                k1a k1a = (k1a) this.b;
                dm4.a(k1a.Y);
                az azVar = k1a.c;
                if (azVar.a(th) && k1a.getAndIncrement() == 0) {
                    azVar.d(k1a.a);
                    return;
                }
                return;
            default:
                ((erd) this.b).onError(th);
                return;
        }
    }

    public br5(k1a k1a) {
        this.a = 2;
        this.b = k1a;
    }
}
