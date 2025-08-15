package defpackage;

/* renamed from: ev0  reason: default package */
public enum ev0 {
    UNKNOWN("UNKNOWN");
    
    public static final ev0[] c = null;
    public final String a;

    static {
        c = values();
    }

    /* access modifiers changed from: public */
    ev0(String str) {
        this.a = str;
    }

    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
