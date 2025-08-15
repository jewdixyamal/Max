package defpackage;

/* renamed from: rs7  reason: default package */
public enum rs7 implements mob {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    
    public final int a;

    /* access modifiers changed from: public */
    rs7(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }
}
