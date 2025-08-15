package defpackage;

/* renamed from: x80  reason: default package */
public final class x80 implements my9 {
    public static final x80 a = new Object();
    public static final kf5 b;
    public static final kf5 c;
    public static final kf5 d;
    public static final kf5 e;

    /* JADX WARNING: type inference failed for: r0v0, types: [x80, java.lang.Object] */
    static {
        Class<pob> cls = pob.class;
        b = new kf5("window", au1.o(au1.n(cls, new jy(1))));
        c = new kf5("logSourceMetrics", au1.o(au1.n(cls, new jy(2))));
        d = new kf5("globalMetrics", au1.o(au1.n(cls, new jy(3))));
        e = new kf5("appNamespace", au1.o(au1.n(cls, new jy(4))));
    }

    public final void a(Object obj, Object obj2) {
        p33 p33 = (p33) obj;
        ny9 ny9 = (ny9) obj2;
        ny9.a(b, p33.a);
        ny9.a(c, p33.b);
        ny9.a(d, p33.c);
        ny9.a(e, p33.d);
    }
}
