package defpackage;

/* renamed from: faf  reason: default package */
public enum faf {
    TTL_1M(1, "1M"),
    TTL_3M(3, "3M"),
    TTL_6M(6, "6M");
    
    public final String a;
    public final int b;

    /* access modifiers changed from: public */
    faf(int i, String str) {
        this.a = str;
        this.b = i;
    }
}
