package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: w0e  reason: default package */
public abstract class w0e implements Runnable {
    public final String X;
    public final AtomicInteger a = new AtomicInteger(0);
    public final fi0 b;
    public final hab c;
    public final eab o;

    public w0e(fi0 fi0, hab hab, eab eab, String str) {
        this.b = fi0;
        this.c = hab;
        this.o = eab;
        this.X = str;
        hab.j(eab, str);
    }

    public final void a() {
        if (this.a.compareAndSet(0, 2)) {
            e();
        }
    }

    public abstract void b(Object obj);

    public Map c(Object obj) {
        return null;
    }

    public abstract Object d();

    public void e() {
        hab hab = this.c;
        eab eab = this.o;
        String str = this.X;
        hab.i(eab, str);
        hab.k(eab, str);
        this.b.c();
    }

    public void f(Exception exc) {
        hab hab = this.c;
        eab eab = this.o;
        String str = this.X;
        hab.i(eab, str);
        hab.d(eab, str, exc, (Map) null);
        this.b.e(exc);
    }

    public void g(Object obj) {
        hab hab = this.c;
        eab eab = this.o;
        String str = this.X;
        hab.a(eab, str, hab.i(eab, str) ? c(obj) : null);
        this.b.g(1, obj);
    }

    public final void run() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object d = d();
                atomicInteger.set(3);
                try {
                    g(d);
                } finally {
                    b(d);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                f(e);
            }
        }
    }
}
