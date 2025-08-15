package defpackage;

import java.util.Locale;

/* renamed from: ds7  reason: default package */
public enum ds7 {
    SEND,
    EXCEPTION(r2),
    SEND_ACK,
    QUEUE,
    ERROR(r2),
    RECEIVE,
    NOTIF;
    
    public final us7 a;
    public final String b;

    /* access modifiers changed from: public */
    ds7(us7 us7) {
        this.a = us7;
        this.b = name().toLowerCase(Locale.ROOT);
    }
}
