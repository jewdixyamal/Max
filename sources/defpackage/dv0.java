package defpackage;

/* renamed from: dv0  reason: default package */
public enum dv0 {
    DEFAULT("DEFAULT"),
    POSITIVE("POSITIVE"),
    NEGATIVE("NEGATIVE"),
    UNKNOWN("UNKNOWN");
    
    public static final dv0[] Y = null;
    public final String a;

    static {
        Y = values();
    }

    /* access modifiers changed from: public */
    dv0(String str) {
        this.a = str;
    }

    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
