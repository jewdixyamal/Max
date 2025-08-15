package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: pc3  reason: default package */
public abstract class pc3 extends ej0 {
    public final HashMap h = new HashMap();
    public Handler i;
    public z0f j;

    public final void e() {
        for (nc3 nc3 : this.h.values()) {
            nc3.a.d(nc3.b);
        }
    }

    public final void g() {
        for (nc3 nc3 : this.h.values()) {
            nc3.a.f(nc3.b);
        }
    }

    public void k() {
        for (nc3 nc3 : this.h.values()) {
            nc3.a.k();
        }
    }

    public void q() {
        HashMap hashMap = this.h;
        for (nc3 nc3 : hashMap.values()) {
            nc3.a.p(nc3.b);
            ej0 ej0 = nc3.a;
            a8g a8g = nc3.c;
            ej0.s(a8g);
            ej0.r(a8g);
        }
        hashMap.clear();
    }

    public abstract yj8 u(Object obj, yj8 yj8);

    public long v(long j2, Object obj) {
        return j2;
    }

    public int w(int i2, Object obj) {
        return i2;
    }

    public abstract void x(Object obj, ej0 ej0, mue mue);

    /* JADX WARNING: type inference failed for: r2v0, types: [a8g, nr4, ik8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v2, types: [fk8, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, jr4] */
    public final void y(Object obj, ej0 ej0) {
        HashMap hashMap = this.h;
        fm9.f(!hashMap.containsKey(obj));
        lc3 lc3 = new lc3(this, obj);
        ? obj2 = new Object();
        obj2.o = this;
        obj2.b = b((yj8) null);
        obj2.c = new lr4(this.d.c, 0, (yj8) null);
        obj2.a = obj;
        hashMap.put(obj, new nc3(ej0, lc3, obj2));
        Handler handler = this.i;
        handler.getClass();
        ej0.getClass();
        jn jnVar = ej0.c;
        jnVar.getClass();
        ? obj3 = new Object();
        obj3.a = handler;
        obj3.b = obj2;
        ((CopyOnWriteArrayList) jnVar.o).add(obj3);
        Handler handler2 = this.i;
        handler2.getClass();
        lr4 lr4 = ej0.d;
        lr4.getClass();
        ? obj4 = new Object();
        obj4.a = handler2;
        obj4.b = obj2;
        lr4.c.add(obj4);
        z0f z0f = this.j;
        j4b j4b = this.g;
        fm9.l(j4b);
        ej0.l(lc3, z0f, j4b);
        if (!(!this.b.isEmpty())) {
            ej0.d(lc3);
        }
    }
}
