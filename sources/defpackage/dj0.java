package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: dj0  reason: default package */
public abstract class dj0 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final gk8 c = new gk8();
    public final kr4 d = new kr4();
    public Looper e;
    public lue f;
    public i4b g;

    public abstract yd8 a(xj8 xj8, n64 n64, long j);

    public final void b(zj8 zj8) {
        HashSet hashSet = this.b;
        boolean z = !hashSet.isEmpty();
        hashSet.remove(zj8);
        if (z && hashSet.isEmpty()) {
            c();
        }
    }

    public void c() {
    }

    public final void d(zj8 zj8) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(zj8);
        if (isEmpty) {
            e();
        }
    }

    public void e() {
    }

    public abstract rb8 f();

    public abstract void g();

    public final void h(zj8 zj8, y0f y0f, i4b i4b) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        np8.d(looper == null || looper == myLooper);
        this.g = i4b;
        lue lue = this.f;
        this.a.add(zj8);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(zj8);
            i(y0f);
        } else if (lue != null) {
            d(zj8);
            zj8.a(this, lue);
        }
    }

    public abstract void i(y0f y0f);

    public final void j(lue lue) {
        this.f = lue;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zj8) it.next()).a(this, lue);
        }
    }

    public abstract void k(yd8 yd8);

    public final void l(zj8 zj8) {
        ArrayList arrayList = this.a;
        arrayList.remove(zj8);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            m();
            return;
        }
        b(zj8);
    }

    public abstract void m();

    public final void n(mr4 mr4) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ir4 ir4 = (ir4) it.next();
            if (ir4.b == mr4) {
                copyOnWriteArrayList.remove(ir4);
            }
        }
    }

    public final void o(hk8 hk8) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ek8 ek8 = (ek8) it.next();
            if (ek8.b == hk8) {
                copyOnWriteArrayList.remove(ek8);
            }
        }
    }
}
