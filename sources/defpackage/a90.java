package defpackage;

/* renamed from: a90  reason: default package */
public final class a90 implements my9 {
    public static final a90 a = new Object();
    public static final kf5 b;
    public static final kf5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [a90, java.lang.Object] */
    static {
        Class<pob> cls = pob.class;
        b = new kf5("logSource", au1.o(au1.n(cls, new jy(1))));
        c = new kf5("logEventDropped", au1.o(au1.n(cls, new jy(2))));
    }

    public final void a(Object obj, Object obj2) {
        xs7 xs7 = (xs7) obj;
        ny9 ny9 = (ny9) obj2;
        ny9.a(b, xs7.a);
        ny9.a(c, xs7.b);
    }
}
