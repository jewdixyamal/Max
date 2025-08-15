package defpackage;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* renamed from: iqd  reason: default package */
public abstract class iqd {
    public static oqd f(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new oqd(new t66(th), 1);
    }

    public static q1a g(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new q1a(3, obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CountDownLatch, erd, mp0] */
    public final Object e() {
        ? countDownLatch = new CountDownLatch(1);
        k(countDownLatch);
        return countDownLatch.d();
    }

    public final uqd h(b66 b66) {
        Objects.requireNonNull(b66, "mapper is null");
        return new uqd(this, b66, 1);
    }

    public final drd i(ztc ztc) {
        Objects.requireNonNull(ztc, "scheduler is null");
        return new drd(this, ztc, 0);
    }

    public final ds5 j(dme dme) {
        return new ds5(new yr5(this instanceof w66 ? ((w66) this).b() : new gr5(3, this), dme, 0), 0);
    }

    public final void k(erd erd) {
        Objects.requireNonNull(erd, "observer is null");
        try {
            l(erd);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void l(erd erd);

    public final drd m(ztc ztc) {
        Objects.requireNonNull(ztc, "scheduler is null");
        return new drd(this, ztc, 1);
    }

    public final qy9 n() {
        return this instanceof x66 ? ((x66) this).d() : new hb3(6, this);
    }
}
