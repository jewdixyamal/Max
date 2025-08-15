package defpackage;

import android.os.Looper;
import java.util.Map;

/* renamed from: xm7  reason: default package */
public abstract class xm7 {
    public static final Object k = new Object();
    public final Object a;
    public final rqc b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final q57 j;

    public xm7(Object obj) {
        this.a = new Object();
        this.b = new rqc();
        this.c = 0;
        this.f = k;
        this.j = new q57(4, this);
        this.e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        ds.g0().d.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(zr6.i("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(wm7 wm7) {
        if (wm7.b) {
            if (!wm7.d()) {
                wm7.a(false);
                return;
            }
            int i2 = wm7.c;
            int i3 = this.g;
            if (i2 < i3) {
                wm7.c = i3;
                wm7.a.a(this.e);
            }
        }
    }

    public final void c(wm7 wm7) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (wm7 == null) {
                rqc rqc = this.b;
                rqc.getClass();
                pqc pqc = new pqc(rqc);
                rqc.c.put(pqc, Boolean.FALSE);
                while (pqc.hasNext()) {
                    b((wm7) ((Map.Entry) pqc.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            } else {
                b(wm7);
                wm7 = null;
            }
        } while (this.i);
        this.h = false;
    }

    public Object d() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public final void e(eh7 eh7, g2a g2a) {
        a("observe");
        if (eh7.Q().d != fg7.a) {
            vm7 vm7 = new vm7(this, eh7, g2a);
            wm7 wm7 = (wm7) this.b.b(g2a, vm7);
            if (wm7 != null && !wm7.c(eh7)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (wm7 == null) {
                eh7.Q().a(vm7);
            }
        }
    }

    public final void f(g2a g2a) {
        a("observeForever");
        wm7 wm7 = new wm7(this, g2a);
        wm7 wm72 = (wm7) this.b.b(g2a, wm7);
        if (wm72 instanceof vm7) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (wm72 == null) {
            wm7.a(true);
        }
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            ds.g0().i0(this.j);
        }
    }

    public void j(g2a g2a) {
        a("removeObserver");
        wm7 wm7 = (wm7) this.b.c(g2a);
        if (wm7 != null) {
            wm7.b();
            wm7.a(false);
        }
    }

    public void k(Object obj) {
        a("setValue");
        this.g++;
        this.e = obj;
        c((wm7) null);
    }

    public xm7() {
        this.a = new Object();
        this.b = new rqc();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new q57(4, this);
        this.e = obj;
        this.g = -1;
    }
}
