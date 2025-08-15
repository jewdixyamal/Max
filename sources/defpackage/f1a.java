package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: f1a  reason: default package */
public final class f1a extends AtomicReference implements c1a {
    public b1a a;
    public int b;
    public final boolean c = false;
    public final int o;

    public f1a() {
        b1a b1a = new b1a((Object) null);
        this.a = b1a;
        set(b1a);
        this.o = 1;
    }

    public final void a() {
        b1a b1a = new b1a(hv9.a);
        this.a.set(b1a);
        this.a = b1a;
        this.b++;
        b1a b1a2 = (b1a) get();
        if (b1a2.a != null) {
            b1a b1a3 = new b1a((Object) null);
            b1a3.lazySet(b1a2.get());
            set(b1a3);
        }
    }

    public final void b(Object obj) {
        b1a b1a = new b1a(obj);
        this.a.set(b1a);
        this.a = b1a;
        int i = this.b + 1;
        this.b = i;
        if (i > this.o) {
            b1a b1a2 = (b1a) ((b1a) get()).get();
            this.b--;
            if (this.c) {
                b1a b1a3 = new b1a((Object) null);
                b1a3.lazySet(b1a2.get());
                b1a2 = b1a3;
            }
            set(b1a2);
        }
    }

    public final void c(a1a a1a) {
        if (a1a.getAndIncrement() == 0) {
            int i = 1;
            do {
                b1a b1a = (b1a) a1a.c;
                if (b1a == null) {
                    b1a = (b1a) get();
                    a1a.c = b1a;
                }
                while (!a1a.o) {
                    b1a b1a2 = (b1a) b1a.get();
                    if (b1a2 != null) {
                        if (hv9.a(a1a.b, b1a2.a)) {
                            a1a.c = null;
                            return;
                        }
                        b1a = b1a2;
                    } else {
                        a1a.c = b1a;
                        i = a1a.addAndGet(-i);
                    }
                }
                a1a.c = null;
                return;
            } while (i != 0);
        }
    }

    public final void d(Throwable th) {
        b1a b1a = new b1a(new fv9(th));
        this.a.set(b1a);
        this.a = b1a;
        this.b++;
        b1a b1a2 = (b1a) get();
        if (b1a2.a != null) {
            b1a b1a3 = new b1a((Object) null);
            b1a3.lazySet(b1a2.get());
            set(b1a3);
        }
    }
}
