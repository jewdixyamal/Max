package defpackage;

/* renamed from: hv9  reason: default package */
public enum hv9 {
    ;

    public static boolean a(f2a f2a, Object obj) {
        if (obj == a) {
            f2a.b();
            return true;
        } else if (obj instanceof fv9) {
            f2a.onError(((fv9) obj).a);
            return true;
        } else {
            f2a.e(obj);
            return false;
        }
    }

    public static boolean b(f2a f2a, Object obj) {
        if (obj == a) {
            f2a.b();
            return true;
        } else if (obj instanceof fv9) {
            f2a.onError(((fv9) obj).a);
            return true;
        } else if (obj instanceof ev9) {
            f2a.c(((ev9) obj).a);
            return false;
        } else {
            f2a.e(obj);
            return false;
        }
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }
}
