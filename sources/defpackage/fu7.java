package defpackage;

/* renamed from: fu7  reason: default package */
public enum fu7 {
    LOGIN("LOGIN"),
    RECOVERY("RECOVERY"),
    PHONE_BINDING("PHONE_BINDING"),
    PHONE_CONFIRM("PHONE_CONFIRM");
    
    public final String a;

    /* access modifiers changed from: public */
    fu7(String str) {
        this.a = str;
    }

    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
