package defpackage;

/* renamed from: p29  reason: default package */
public abstract class p29 {
    public static final ruc a;

    static {
        y5f y5f = new y5f("messages-list-scope");
        ruc ruc = c37.f;
        if (ruc != null) {
            y5f.c.add(ruc);
            y5f.e(n29.class, new ze7(26));
            y5f.e(o29.class, new sx6(11));
            y5f.e(ob6.class, new sx6(12));
            y5f.e(o89.class, new sx6(13));
            a = y5f.a();
            return;
        }
        throw new IllegalArgumentException("Trying to access DI graph before initialization!".toString());
    }
}
