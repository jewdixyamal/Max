package defpackage;

/* renamed from: guc  reason: default package */
public abstract class guc {
    public static final boolean a;

    static {
        boolean z = true;
        try {
            String property = System.getProperty("rx3.purge-enabled");
            if (property != null) {
                z = "true".equals(property);
            }
        } catch (Throwable th) {
            c37.B(th);
        }
        a = z;
    }
}
