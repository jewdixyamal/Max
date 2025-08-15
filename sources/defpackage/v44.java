package defpackage;

/* renamed from: v44  reason: default package */
public enum v44 {
    DISABLED(0),
    FILE_LOGS(2),
    DEV_OPTIONS_MENU(3);
    
    public static final v44[] X = null;
    public final int a;

    static {
        X = values();
    }

    /* access modifiers changed from: public */
    v44(int i) {
        this.a = i;
    }

    public static v44 a(int i) {
        for (v44 v44 : X) {
            if (v44.a == i) {
                return v44;
            }
        }
        return DISABLED;
    }
}
