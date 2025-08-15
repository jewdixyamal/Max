package defpackage;

/* renamed from: i42  reason: default package */
public final class i42 {
    public static final h42 b = new Object();
    public final Object a;

    public /* synthetic */ i42(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        g42 g42 = obj instanceof g42 ? (g42) obj : null;
        if (g42 != null) {
            return g42.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i42)) {
            return false;
        }
        return tpa.f(this.a, ((i42) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof g42) {
            return ((g42) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
