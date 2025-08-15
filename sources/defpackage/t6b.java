package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: t6b  reason: default package */
public final class t6b {
    public final av0 a;
    public final je7 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public t6b(av0 av0, je7 je7) {
        this.a = av0;
        this.b = je7;
    }

    public final void a() {
        ConcurrentHashMap concurrentHashMap = this.c;
        for (Map.Entry value : concurrentHashMap.entrySet()) {
            u6b u6b = (u6b) value.getValue();
            u6b.g = null;
            u6b.h = null;
            u6b.i = null;
            u6b.j = null;
            u6b.k = null;
            u6b.l = null;
            u6b.m = null;
            u6b.n = null;
            u6b.o = false;
            u6b.p = false;
            u6b.q = false;
        }
        concurrentHashMap.clear();
    }

    public final void b(e52 e52, cu8 cu8) {
        u6b a2 = ((v6b) this.b.getValue()).a((e52) null, cu8);
        this.c.put(Long.valueOf(cu8.b), a2);
        a2.h(e52);
    }

    public final u6b c(cu8 cu8) {
        return (u6b) this.c.computeIfAbsent(Long.valueOf(cu8.b), new di(15, new ga(this, 26, cu8)));
    }

    public final void d() {
        for (Map.Entry value : this.c.entrySet()) {
            u6b u6b = (u6b) value.getValue();
            u6b.g = null;
            u6b.h = null;
            u6b.i = null;
            u6b.j = null;
            u6b.k = null;
            u6b.l = null;
            u6b.m = null;
            u6b.n = null;
            u6b.o = false;
            u6b.p = false;
            u6b.q = false;
            e52 e52 = u6b.f;
            if (e52 != null) {
                u6b.h(e52);
            }
        }
    }

    public final void e(cu8 cu8) {
        String format;
        u6b c2 = c(cu8);
        c2.d();
        if (c2.m == null) {
            ida ida = c2.a;
            long j = c2.d.o;
            Locale v = ida.c.v();
            synchronized (ay7.o) {
                if (ay7.n == null) {
                    ay7.n = new SimpleDateFormat("LLLL yyyy", v);
                }
                format = ay7.n.format(Long.valueOf(j));
            }
            c2.m = format;
        }
    }
}
