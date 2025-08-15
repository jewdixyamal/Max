package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: i1a  reason: default package */
public final class i1a extends AtomicInteger implements f2a {
    public long X;
    public final f2a a;
    public final uy1 b;
    public final r1a c;
    public final b7b o;

    public i1a(f2a f2a, long j, b7b b7b, uy1 uy1, r1a r1a) {
        this.a = f2a;
        this.b = uy1;
        this.c = r1a;
        this.o = b7b;
        this.X = j;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int i = 1;
            while (!this.b.h()) {
                this.c.a(this);
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public final void b() {
        this.a.b();
    }

    public final void c(zl4 zl4) {
        uy1 uy1 = this.b;
        uy1.getClass();
        dm4.c(uy1, zl4);
    }

    public final void e(Object obj) {
        this.a.e(obj);
    }

    public final void onError(Throwable th) {
        long j = this.X;
        if (j != Long.MAX_VALUE) {
            this.X = j - 1;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        f2a f2a = this.a;
        if (i == 0) {
            f2a.onError(th);
            return;
        }
        try {
            if (!this.o.test(th)) {
                f2a.onError(th);
            } else {
                a();
            }
        } catch (Throwable th2) {
            c37.B(th2);
            f2a.onError(new CompositeException(th, th2));
        }
    }
}
