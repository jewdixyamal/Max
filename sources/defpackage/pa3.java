package defpackage;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* renamed from: pa3  reason: default package */
public abstract class pa3 {
    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CountDownLatch, ab3, mp0] */
    public final void a() {
        ? countDownLatch = new CountDownLatch(1);
        i(countDownLatch);
        countDownLatch.d();
    }

    public final qa3 e(pa3 pa3) {
        Objects.requireNonNull(pa3, "other is null");
        return new qa3(this, 0, pa3);
    }

    public final db3 f(f6 f6Var) {
        return new db3(this, ft.e, f6Var);
    }

    public final db3 g(qj3 qj3) {
        return new db3(this, qj3, ft.d);
    }

    public final za3 h(ztc ztc) {
        Objects.requireNonNull(ztc, "scheduler is null");
        return new za3(this, ztc, 0);
    }

    public final void i(ab3 ab3) {
        Objects.requireNonNull(ab3, "observer is null");
        try {
            j(ab3);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            j47.Z(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void j(ab3 ab3);

    public final za3 k(ztc ztc) {
        Objects.requireNonNull(ztc, "scheduler is null");
        return new za3(this, ztc, 1);
    }

    public final qy9 l() {
        return this instanceof x66 ? ((x66) this).d() : new hb3(0, this);
    }
}
