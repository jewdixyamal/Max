package defpackage;

/* renamed from: nv0  reason: default package */
public enum nv0 {
    CALLBACK("CALLBACK"),
    LINK("LINK"),
    REQUEST_CONTACT("REQUEST_CONTACT"),
    REQUEST_GEO_LOCATION("REQUEST_GEO_LOCATION"),
    CHAT("CHAT"),
    OPEN_APP("OPEN_APP"),
    MESSAGE("MESSAGE"),
    UNKNOWN("UNKNOWN");
    
    public static final nv0[] u0 = null;
    public final String a;

    static {
        u0 = values();
    }

    /* access modifiers changed from: public */
    nv0(String str) {
        this.a = str;
    }
}
