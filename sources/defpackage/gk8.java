package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: gk8  reason: default package */
public final class gk8 {
    public long a;
    public int b;
    public Object c;
    public Serializable d;

    public gk8() {
        this(new CopyOnWriteArrayList(), 0, (xj8) null, 0);
    }

    public long a(long j) {
        long M = maf.M(j);
        if (M == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.a + M;
    }

    public void b(int i, oy5 oy5, int i2, Object obj, long j) {
        c(new pc8(1, i, oy5, i2, obj, a(j), -9223372036854775807L));
    }

    public void c(pc8 pc8) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8 = (ek8) it.next();
            maf.H(ek8.a, new v05((Object) this, (Object) ek8.b, (Object) pc8, 17));
        }
    }

    public void d(xn7 xn7, int i, int i2, oy5 oy5, int i3, Object obj, long j, long j2) {
        xn7 xn72 = xn7;
        e(xn7, new pc8(i, i2, oy5, i3, obj, a(j), a(j2)));
    }

    public void e(xn7 xn7, pc8 pc8) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8 = (ek8) it.next();
            maf.H(ek8.a, new bk8(this, ek8.b, xn7, pc8, 2));
        }
    }

    public void f(xn7 xn7, int i, int i2, oy5 oy5, int i3, Object obj, long j, long j2) {
        xn7 xn72 = xn7;
        g(xn7, new pc8(i, i2, oy5, i3, obj, a(j), a(j2)));
    }

    public void g(xn7 xn7, pc8 pc8) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8 = (ek8) it.next();
            maf.H(ek8.a, new bk8(this, ek8.b, xn7, pc8, 1));
        }
    }

    public void h(xn7 xn7, int i, int i2, oy5 oy5, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        xn7 xn72 = xn7;
        j(xn7, new pc8(i, i2, oy5, i3, obj, a(j), a(j2)), iOException, z);
    }

    public void i(xn7 xn7, int i, IOException iOException, boolean z) {
        h(xn7, i, -1, (oy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void j(xn7 xn7, pc8 pc8, IOException iOException, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8 = (ek8) it.next();
            maf.H(ek8.a, new dk8((Object) this, (Object) ek8.b, (Object) xn7, (Object) pc8, iOException, z, 0));
        }
    }

    public void k(xn7 xn7, int i, int i2, oy5 oy5, int i3, Object obj, long j, long j2) {
        xn7 xn72 = xn7;
        l(xn7, new pc8(i, i2, oy5, i3, obj, a(j), a(j2)));
    }

    public void l(xn7 xn7, pc8 pc8) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8 = (ek8) it.next();
            maf.H(ek8.a, new bk8(this, ek8.b, xn7, pc8, 0));
        }
    }

    public void m(pc8 pc8) {
        xj8 xj8 = (xj8) this.c;
        xj8.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8 = (ek8) it.next();
            maf.H(ek8.a, new yg3((Object) this, (Object) ek8.b, (Object) xj8, (Object) pc8, 12));
        }
    }

    public gk8(CopyOnWriteArrayList copyOnWriteArrayList, int i, xj8 xj8, long j) {
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = xj8;
        this.a = j;
    }
}
