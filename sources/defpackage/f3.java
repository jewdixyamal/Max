package defpackage;

import java.io.Closeable;

/* renamed from: f3  reason: default package */
public final class f3 extends fi0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f3(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final void d() {
        switch (this.b) {
            case 0:
                m43 m43 = (m43) this.c;
                synchronized (m43) {
                    od2.p(m43.g());
                }
                return;
            default:
                try {
                    f46.I();
                    vg9 vg9 = (vg9) this.c;
                    synchronized (vg9) {
                        if (vg9.g == this) {
                            vg9.g = null;
                            vg9.f = null;
                            vg9.b(vg9.c);
                            vg9.c = null;
                            vg9.i(3);
                        }
                    }
                    f46.I();
                    return;
                } catch (Throwable th) {
                    f46.I();
                    throw th;
                }
        }
    }

    public final void f(Throwable th) {
        switch (this.b) {
            case 0:
                m43 m43 = (m43) this.c;
                fcd fcd = m43.h;
                if (m43.j(th, fcd.Y)) {
                    m43.i.f(fcd, th);
                    return;
                }
                return;
            default:
                try {
                    if (f46.W()) {
                        f46.e("MultiplexProducer#onFailure");
                    }
                    ((vg9) this.c).f(this, th);
                    if (f46.W()) {
                        f46.A();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (f46.W()) {
                        f46.A();
                    }
                    throw th2;
                }
        }
    }

    public final void h(int i, Object obj) {
        switch (this.b) {
            case 0:
                m43 m43 = (m43) this.c;
                m43.o(obj, i, m43.h);
                return;
            default:
                Closeable closeable = (Closeable) obj;
                try {
                    if (f46.W()) {
                        f46.e("MultiplexProducer#onNewResult");
                    }
                    ((vg9) this.c).g(this, closeable, i);
                    if (f46.W()) {
                        f46.A();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (f46.W()) {
                        f46.A();
                    }
                    throw th;
                }
        }
    }

    public final void j(float f) {
        switch (this.b) {
            case 0:
                ((m43) this.c).k(f);
                return;
            default:
                try {
                    if (f46.W()) {
                        f46.e("MultiplexProducer#onProgressUpdate");
                    }
                    ((vg9) this.c).h(this, f);
                    if (f46.W()) {
                        f46.A();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (f46.W()) {
                        f46.A();
                    }
                    throw th;
                }
        }
    }
}
