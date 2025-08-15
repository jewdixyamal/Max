package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: y0a  reason: default package */
public final class y0a extends qy9 {
    public final vg3 a;
    public final int b = 1;
    public w0a c;

    public y0a(vg3 vg3) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.a = vg3;
    }

    public final void q(f2a f2a) {
        w0a w0a;
        boolean z;
        synchronized (this) {
            try {
                w0a = this.c;
                if (w0a == null) {
                    w0a = new w0a(this);
                    this.c = w0a;
                }
                long j = w0a.b + 1;
                w0a.b = j;
                if (w0a.c || j != ((long) this.b)) {
                    z = false;
                } else {
                    z = true;
                    w0a.c = true;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.a.a(new x0a(f2a, this, w0a));
        if (z) {
            this.a.x(w0a);
        }
    }

    public final void x(w0a w0a) {
        synchronized (this) {
            try {
                if (this.c == w0a) {
                    w0a.getClass();
                    long j = w0a.b - 1;
                    w0a.b = j;
                    if (j == 0) {
                        this.c = null;
                        this.a.y();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(w0a w0a) {
        synchronized (this) {
            try {
                if (w0a.b == 0 && w0a == this.c) {
                    this.c = null;
                    zl4 zl4 = (zl4) w0a.get();
                    dm4.a(w0a);
                    if (zl4 == null) {
                        w0a.o = true;
                    } else {
                        this.a.y();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
