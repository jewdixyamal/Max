package defpackage;

import java.util.Map;

/* renamed from: rx9  reason: default package */
public final class rx9 {
    public static final /* synthetic */ bc7[] c;
    public static final String d;
    public final rm4 a;
    public final rm4 b;

    static {
        Class<rx9> cls = rx9.class;
        c = new bc7[]{new hob(cls, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0), zr6.e(nec.a, cls, "analytics", "getAnalytics()Lru/ok/tamtam/stats/Analytics;", 0)};
        d = cls.getName();
    }

    public rx9(rm4 rm4, rm4 rm42) {
        this.a = rm42;
        this.b = rm4;
    }

    public static void a(Map map, vd5 vd5) {
        map.put("trid", Long.valueOf(vd5.a));
        String str = vd5.h;
        if (str != null) {
            map.put("eKey", str);
        }
        Long l = vd5.g;
        if (l != null) {
            map.put("ttime", l);
            map.put("dtime", Long.valueOf(vd5.j - l.longValue()));
            map.put("fcmdtime", Long.valueOf(vd5.i - l.longValue()));
        }
        Long l2 = vd5.e;
        if (l2 != null) {
            map.put("suid", l2);
        }
    }

    public final ad b() {
        bc7 bc7 = c[1];
        return (ad) this.b.get();
    }

    public final o45 c() {
        bc7 bc7 = c[0];
        return (o45) this.a.get();
    }
}
