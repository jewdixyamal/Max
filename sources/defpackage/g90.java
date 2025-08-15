package defpackage;

/* renamed from: g90  reason: default package */
public final class g90 implements my9 {
    public static final g90 a = new Object();
    public static final kf5 b;
    public static final kf5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, g90] */
    static {
        Class<pob> cls = pob.class;
        b = new kf5("startMs", au1.o(au1.n(cls, new jy(1))));
        c = new kf5("endMs", au1.o(au1.n(cls, new jy(2))));
    }

    public final void a(Object obj, Object obj2) {
        aue aue = (aue) obj;
        ny9 ny9 = (ny9) obj2;
        ny9.e(b, aue.a);
        ny9.e(c, aue.b);
    }
}
