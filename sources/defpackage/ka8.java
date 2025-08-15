package defpackage;

/* renamed from: ka8  reason: default package */
public abstract class ka8 {
    public static final ruc a;

    static {
        y5f y5f = new y5f("media-gallery-scope");
        ruc ruc = c37.f;
        if (ruc != null) {
            y5f.c.add(ruc);
            a = y5f.a();
            return;
        }
        throw new IllegalArgumentException("Trying to access DI graph before initialization!".toString());
    }
}
