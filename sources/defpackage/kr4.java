package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: kr4  reason: default package */
public final class kr4 {
    public final int a;
    public final xj8 b;
    public final CopyOnWriteArrayList c;

    public kr4() {
        this(new CopyOnWriteArrayList(), 0, (xj8) null);
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4 = (ir4) it.next();
            maf.H(ir4.a, new gr4(this, ir4.b, 3));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4 = (ir4) it.next();
            maf.H(ir4.a, new gr4(this, ir4.b, 1));
        }
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4 = (ir4) it.next();
            maf.H(ir4.a, new gr4(this, ir4.b, 2));
        }
    }

    public final void d(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4 = (ir4) it.next();
            maf.H(ir4.a, new si1((Object) this, (Object) ir4.b, i, 8));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4 = (ir4) it.next();
            maf.H(ir4.a, new f5((Object) this, (Object) ir4.b, (Object) exc, 22));
        }
    }

    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4 = (ir4) it.next();
            maf.H(ir4.a, new gr4(this, ir4.b, 0));
        }
    }

    public kr4(CopyOnWriteArrayList copyOnWriteArrayList, int i, xj8 xj8) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = xj8;
    }
}
