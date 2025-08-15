package defpackage;

/* renamed from: f90  reason: default package */
public final class f90 implements my9 {
    public static final f90 a = new Object();
    public static final kf5 b;
    public static final kf5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, f90] */
    static {
        Class<pob> cls = pob.class;
        b = new kf5("currentCacheSizeBytes", au1.o(au1.n(cls, new jy(1))));
        c = new kf5("maxCacheSizeBytes", au1.o(au1.n(cls, new jy(2))));
    }

    public final void a(Object obj, Object obj2) {
        r8e r8e = (r8e) obj;
        ny9 ny9 = (ny9) obj2;
        ny9.e(b, r8e.a);
        ny9.e(c, r8e.b);
    }
}
