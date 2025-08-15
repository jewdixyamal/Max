package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: j28  reason: default package */
public final class j28 extends AtomicReference implements l28, zl4, erd, b38 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j28(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(Object obj) {
        zl4 zl4;
        switch (this.a) {
            case 0:
                Object obj2 = get();
                dm4 dm4 = dm4.a;
                if (obj2 != dm4 && (zl4 = (zl4) getAndSet(dm4)) != dm4) {
                    b38 b38 = (b38) this.b;
                    if (obj == null) {
                        try {
                            b38.onError(q45.b("onSuccess called with a null value."));
                        } finally {
                            if (zl4 != null) {
                                zl4.g();
                            }
                        }
                    } else {
                        b38.a(obj);
                    }
                    if (zl4 == null) {
                        return;
                    }
                    return;
                }
                return;
            case 1:
                try {
                    lazySet(dm4.a);
                    ((ol0) this.b).accept(obj, (Object) null);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    j47.Z(th);
                    return;
                }
            default:
                d0a d0a = (d0a) this.b;
                d0a.o.c(this);
                if (d0a.get() == 0) {
                    boolean z = false;
                    if (d0a.compareAndSet(0, 1)) {
                        d0a.b.e(obj);
                        if (d0a.X.decrementAndGet() == 0) {
                            z = true;
                        }
                        pwd pwd = (pwd) d0a.s0.get();
                        if (!z || (pwd != null && !pwd.isEmpty())) {
                            if (d0a.decrementAndGet() == 0) {
                                return;
                            }
                            d0a.a();
                            return;
                        }
                        d0a.Y.d(d0a.b);
                        return;
                    }
                }
                AtomicReference atomicReference = d0a.s0;
                pwd pwd2 = (pwd) atomicReference.get();
                if (pwd2 == null) {
                    pwd pwd3 = new pwd(wq5.a);
                    while (true) {
                        if (atomicReference.compareAndSet((Object) null, pwd3)) {
                            pwd2 = pwd3;
                        } else if (atomicReference.get() != null) {
                            pwd2 = (pwd) atomicReference.get();
                        }
                    }
                }
                synchronized (pwd2) {
                    pwd2.offer(obj);
                }
                d0a.X.decrementAndGet();
                if (d0a.getAndIncrement() != 0) {
                    return;
                }
                d0a.a();
                return;
        }
    }

    public void b() {
        zl4 zl4;
        switch (this.a) {
            case 0:
                Object obj = get();
                dm4 dm4 = dm4.a;
                if (obj != dm4 && (zl4 = (zl4) getAndSet(dm4)) != dm4) {
                    try {
                        ((b38) this.b).b();
                        if (zl4 == null) {
                            return;
                        }
                        return;
                    } finally {
                        if (zl4 != null) {
                            zl4.g();
                        }
                    }
                } else {
                    return;
                }
            default:
                d0a d0a = (d0a) this.b;
                d0a.o.c(this);
                int i = d0a.get();
                AtomicInteger atomicInteger = d0a.X;
                if (i == 0) {
                    boolean z = false;
                    if (d0a.compareAndSet(0, 1)) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            z = true;
                        }
                        pwd pwd = (pwd) d0a.s0.get();
                        if (z && (pwd == null || pwd.isEmpty())) {
                            d0a.Y.d(d0a.b);
                            return;
                        } else if (d0a.decrementAndGet() != 0) {
                            d0a.a();
                            return;
                        } else {
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (d0a.getAndIncrement() == 0) {
                    d0a.a();
                    return;
                }
                return;
        }
    }

    public void c(zl4 zl4) {
        switch (this.a) {
            case 1:
                dm4.e(this, zl4);
                return;
            default:
                dm4.e(this, zl4);
                return;
        }
    }

    public final void g() {
        switch (this.a) {
            case 0:
                dm4.a(this);
                return;
            case 1:
                dm4.a(this);
                return;
            default:
                dm4.a(this);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return dm4.b((zl4) get());
            case 1:
                return get() == dm4.a;
            default:
                return dm4.b((zl4) get());
        }
    }

    public final void onError(Throwable th) {
        zl4 zl4;
        switch (this.a) {
            case 0:
                Throwable b2 = th == null ? q45.b("onError called with a null Throwable.") : th;
                Object obj = get();
                dm4 dm4 = dm4.a;
                if (obj == dm4 || (zl4 = (zl4) getAndSet(dm4)) == dm4) {
                    j47.Z(th);
                    return;
                }
                try {
                    ((b38) this.b).onError(b2);
                    if (zl4 == null) {
                        return;
                    }
                    return;
                } finally {
                    if (zl4 != null) {
                        zl4.g();
                    }
                }
            case 1:
                try {
                    lazySet(dm4.a);
                    ((ol0) this.b).accept((Object) null, th);
                    return;
                } catch (Throwable th2) {
                    c37.B(th2);
                    j47.Z(new CompositeException(th, th2));
                    return;
                }
            default:
                d0a d0a = (d0a) this.b;
                hc3 hc3 = d0a.o;
                hc3.c(this);
                if (d0a.Y.a(th)) {
                    if (!d0a.c) {
                        d0a.t0.g();
                        hc3.g();
                    }
                    d0a.X.decrementAndGet();
                    if (d0a.getAndIncrement() == 0) {
                        d0a.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String simpleName = j28.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public j28(d0a d0a) {
        this.a = 2;
        this.b = d0a;
    }
}
