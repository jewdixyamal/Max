package defpackage;

/* renamed from: jm2  reason: default package */
public enum jm2 {
    SOUND("SOUND"),
    VIBRATION("VIBR"),
    LED("LED");
    
    public static final int X = 0;
    public final String a;

    static {
        X = values().length;
    }

    /* access modifiers changed from: public */
    jm2(String str) {
        this.a = str;
    }

    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
