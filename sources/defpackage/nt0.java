package defpackage;

/* renamed from: nt0  reason: default package */
public abstract class nt0 {
    public static final bdb a;
    public static final ThreadLocal b = new ThreadLocal();

    static {
        boolean z;
        try {
            z = "true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers"));
        } catch (SecurityException unused) {
            z = false;
        }
        a = z ? tse.a : null;
    }
}
