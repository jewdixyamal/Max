package defpackage;

/* renamed from: z80  reason: default package */
public final class z80 implements my9 {
    public static final z80 a = new Object();
    public static final kf5 b;
    public static final kf5 c;

    /* JADX WARNING: type inference failed for: r0v0, types: [z80, java.lang.Object] */
    static {
        Class<pob> cls = pob.class;
        b = new kf5("eventsDroppedCount", au1.o(au1.n(cls, new jy(1))));
        c = new kf5("reason", au1.o(au1.n(cls, new jy(3))));
    }

    public final void a(Object obj, Object obj2) {
        ss7 ss7 = (ss7) obj;
        ny9 ny9 = (ny9) obj2;
        ny9.e(b, ss7.a);
        ny9.a(c, ss7.b);
    }
}
