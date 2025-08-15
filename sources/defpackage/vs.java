package defpackage;

/* renamed from: vs  reason: default package */
public abstract class vs {
    public static final int a;

    static {
        Object obj;
        try {
            obj = dae.e0(System.getProperty("kotlinx.serialization.json.pool.size"));
        } catch (Throwable th) {
            obj = new njc(th);
        }
        if (obj instanceof njc) {
            obj = null;
        }
        Integer num = (Integer) obj;
        a = num != null ? num.intValue() : 2097152;
    }
}
