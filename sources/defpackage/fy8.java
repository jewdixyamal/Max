package defpackage;

/* renamed from: fy8  reason: default package */
public enum fy8 {
    UNKNOWN("UNKNOWN"),
    USER("USER"),
    GROUP("GROUP"),
    CHANNEL("CHANNEL"),
    CHANNEL_ADMIN("CHANNEL_ADMIN");
    
    public final String a;

    /* access modifiers changed from: public */
    fy8(String str) {
        this.a = str;
    }

    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
