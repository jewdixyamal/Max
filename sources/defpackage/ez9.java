package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ez9  reason: default package */
public final class ez9 extends AtomicReference implements uz9, zl4, erd {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ez9(AtomicInteger atomicInteger, int i) {
        this.a = i;
        this.b = atomicInteger;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 1:
                kr5 kr5 = (kr5) this.b;
                kr5.X.c(this);
                if (kr5.get() == 0) {
                    boolean z = false;
                    if (kr5.compareAndSet(0, 1)) {
                        if (kr5.Y.decrementAndGet() == 0) {
                            z = true;
                        }
                        if (kr5.o.get() != 0) {
                            kr5.a.e(obj);
                            pwd pwd = (pwd) kr5.t0.get();
                            if (!z || (pwd != null && !pwd.isEmpty())) {
                                ngg.D(kr5.o, 1);
                                if (kr5.c != Integer.MAX_VALUE) {
                                    kr5.u0.j(1);
                                }
                            } else {
                                kr5.Z.e(kr5.a);
                                return;
                            }
                        } else {
                            pwd g = kr5.g();
                            synchronized (g) {
                                g.offer(obj);
                            }
                        }
                        if (kr5.decrementAndGet() == 0) {
                            return;
                        }
                        kr5.d();
                        return;
                    }
                }
                pwd g2 = kr5.g();
                synchronized (g2) {
                    g2.offer(obj);
                }
                kr5.Y.decrementAndGet();
                if (kr5.getAndIncrement() != 0) {
                    return;
                }
                kr5.d();
                return;
            default:
                d0a d0a = (d0a) this.b;
                d0a.o.c(this);
                if (d0a.get() == 0) {
                    boolean z2 = false;
                    if (d0a.compareAndSet(0, 1)) {
                        d0a.b.e(obj);
                        if (d0a.X.decrementAndGet() == 0) {
                            z2 = true;
                        }
                        pwd pwd2 = (pwd) d0a.s0.get();
                        if (!z2 || (pwd2 != null && !pwd2.isEmpty())) {
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
                pwd pwd3 = (pwd) atomicReference.get();
                if (pwd3 == null) {
                    pwd pwd4 = new pwd(wq5.a);
                    while (true) {
                        if (atomicReference.compareAndSet((Object) null, pwd4)) {
                            pwd3 = pwd4;
                        } else if (atomicReference.get() != null) {
                            pwd3 = (pwd) atomicReference.get();
                        }
                    }
                }
                synchronized (pwd3) {
                    pwd3.offer(obj);
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
        if (!h()) {
            try {
                ((f2a) this.b).b();
            } finally {
                dm4.a(this);
            }
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

    public void d(Object obj) {
        if (obj == null) {
            NullPointerException b2 = q45.b("onNext called with a null value.");
            if (!e(b2)) {
                j47.Z(b2);
            }
        } else if (!h()) {
            ((f2a) this.b).e(obj);
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean e(Throwable th) {
        if (h()) {
            return false;
        }
        try {
            ((f2a) this.b).onError(th);
            dm4.a(this);
            return true;
        } catch (Throwable th2) {
            dm4.a(this);
            throw th2;
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
                return dm4.b((zl4) get());
            default:
                return dm4.b((zl4) get());
        }
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 1:
                kr5 kr5 = (kr5) this.b;
                hc3 hc3 = kr5.X;
                hc3.c(this);
                if (kr5.Z.a(th)) {
                    if (!kr5.b) {
                        kr5.u0.cancel();
                        hc3.g();
                    } else if (kr5.c != Integer.MAX_VALUE) {
                        kr5.u0.j(1);
                    }
                    kr5.Y.decrementAndGet();
                    kr5.c();
                    return;
                }
                return;
            default:
                d0a d0a = (d0a) this.b;
                hc3 hc32 = d0a.o;
                hc32.c(this);
                if (d0a.Y.a(th)) {
                    if (!d0a.c) {
                        d0a.t0.g();
                        hc32.g();
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
                String simpleName = ez9.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public ez9(f2a f2a) {
        this.a = 0;
        this.b = f2a;
    }
}
