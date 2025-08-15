package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: lr4  reason: default package */
public final class lr4 {
    public final int a;
    public final yj8 b;
    public final CopyOnWriteArrayList c;

    public lr4(CopyOnWriteArrayList copyOnWriteArrayList, int i, yj8 yj8) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = yj8;
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4 = (jr4) it.next();
            oaf.W(jr4.a, new hr4(this, jr4.b, 3));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4 = (jr4) it.next();
            oaf.W(jr4.a, new hr4(this, jr4.b, 1));
        }
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4 = (jr4) it.next();
            oaf.W(jr4.a, new hr4(this, jr4.b, 2));
        }
    }

    public final void d(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4 = (jr4) it.next();
            oaf.W(jr4.a, new si1((Object) this, (Object) jr4.b, i, 7));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4 = (jr4) it.next();
            oaf.W(jr4.a, new f5((Object) this, (Object) jr4.b, (Object) exc, 23));
        }
    }

    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4 = (jr4) it.next();
            oaf.W(jr4.a, new hr4(this, jr4.b, 0));
        }
    }
}
