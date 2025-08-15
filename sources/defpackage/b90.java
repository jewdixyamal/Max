package defpackage;

import org.apache.commons.logging.LogFactory;

/* renamed from: b90  reason: default package */
public final class b90 implements my9 {
    public static final b90 a = new Object();
    public static final kf5 b;
    public static final kf5 c;
    public static final kf5 d;
    public static final kf5 e;
    public static final kf5 f;
    public static final kf5 g;
    public static final kf5 h;
    public static final kf5 i;
    public static final kf5 j;
    public static final kf5 k;
    public static final kf5 l;
    public static final kf5 m;
    public static final kf5 n;
    public static final kf5 o;
    public static final kf5 p;

    /* JADX WARNING: type inference failed for: r0v0, types: [b90, java.lang.Object] */
    static {
        Class<pob> cls = pob.class;
        b = new kf5("projectNumber", au1.o(au1.n(cls, new jy(1))));
        c = new kf5("messageId", au1.o(au1.n(cls, new jy(2))));
        d = new kf5("instanceId", au1.o(au1.n(cls, new jy(3))));
        e = new kf5("messageType", au1.o(au1.n(cls, new jy(4))));
        f = new kf5("sdkPlatform", au1.o(au1.n(cls, new jy(5))));
        g = new kf5("packageName", au1.o(au1.n(cls, new jy(6))));
        h = new kf5("collapseKey", au1.o(au1.n(cls, new jy(7))));
        i = new kf5(LogFactory.PRIORITY_KEY, au1.o(au1.n(cls, new jy(8))));
        j = new kf5("ttl", au1.o(au1.n(cls, new jy(9))));
        k = new kf5("topic", au1.o(au1.n(cls, new jy(10))));
        l = new kf5("bulkId", au1.o(au1.n(cls, new jy(11))));
        m = new kf5("event", au1.o(au1.n(cls, new jy(12))));
        n = new kf5("analyticsLabel", au1.o(au1.n(cls, new jy(13))));
        o = new kf5("campaignId", au1.o(au1.n(cls, new jy(14))));
        p = new kf5("composerLabel", au1.o(au1.n(cls, new jy(15))));
    }

    public final void a(Object obj, Object obj2) {
        z89 z89 = (z89) obj;
        ny9 ny9 = (ny9) obj2;
        ny9.e(b, z89.a);
        ny9.a(c, z89.b);
        ny9.a(d, z89.c);
        ny9.a(e, z89.d);
        ny9.a(f, z89.e);
        ny9.a(g, z89.f);
        ny9.a(h, z89.g);
        ny9.d(i, 0);
        ny9.d(j, z89.h);
        ny9.a(k, z89.i);
        ny9.e(l, 0);
        ny9.a(m, z89.j);
        ny9.a(n, z89.k);
        ny9.e(o, 0);
        ny9.a(p, z89.l);
    }
}
