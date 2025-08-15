package defpackage;

/* renamed from: cae  reason: default package */
public abstract class cae extends bae {
    public static Double d0(String str) {
        try {
            if (hvc.a.a(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
