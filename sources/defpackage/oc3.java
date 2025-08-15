package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: oc3  reason: default package */
public abstract class oc3 extends dj0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public y0f j;

    public final void c() {
        for (mc3 mc3 : this.h.values()) {
            mc3.a.b(mc3.b);
        }
    }

    public final void e() {
        for (mc3 mc3 : this.h.values()) {
            mc3.a.d(mc3.b);
        }
    }

    public void g() {
        for (mc3 mc3 : this.h.values()) {
            mc3.a.g();
        }
    }

    public void m() {
        HashMap hashMap = this.h;
        for (mc3 mc3 : hashMap.values()) {
            mc3.a.l(mc3.b);
            dj0 dj0 = mc3.a;
            die die = mc3.c;
            dj0.o(die);
            dj0.n(die);
        }
        hashMap.clear();
    }

    public xj8 p(Object obj, xj8 xj8) {
        return xj8;
    }

    public abstract void q(Integer num, dj0 dj0, lue lue);

    /* JADX WARNING: type inference failed for: r2v0, types: [die, hk8, java.lang.Object, mr4] */
    /* JADX WARNING: type inference failed for: r3v5, types: [ek8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.Object, ir4] */
    public final void r(Integer num, dj0 dj0) {
        HashMap hashMap = this.h;
        np8.d(!hashMap.containsKey(num));
        kc3 kc3 = new kc3(this, num);
        ? obj = new Object();
        obj.o = this;
        obj.b = new gk8((CopyOnWriteArrayList) this.c.d, 0, (xj8) null, 0);
        obj.c = new kr4(this.d.c, 0, (xj8) null);
        obj.a = num;
        hashMap.put(num, new mc3(dj0, kc3, obj));
        Handler handler = this.i;
        handler.getClass();
        dj0.getClass();
        gk8 gk8 = dj0.c;
        gk8.getClass();
        ? obj2 = new Object();
        obj2.a = handler;
        obj2.b = obj;
        ((CopyOnWriteArrayList) gk8.d).add(obj2);
        Handler handler2 = this.i;
        handler2.getClass();
        kr4 kr4 = dj0.d;
        kr4.getClass();
        ? obj3 = new Object();
        obj3.a = handler2;
        obj3.b = obj;
        kr4.c.add(obj3);
        y0f y0f = this.j;
        i4b i4b = this.g;
        np8.g(i4b);
        dj0.h(kc3, y0f, i4b);
        if (!(!this.b.isEmpty())) {
            dj0.b(kc3);
        }
    }
}
