package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: kt4  reason: default package */
public enum kt4 {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    public final TimeUnit a;

    /* access modifiers changed from: public */
    kt4(TimeUnit timeUnit) {
        this.a = timeUnit;
    }
}
