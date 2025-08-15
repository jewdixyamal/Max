package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: hc9  reason: default package */
public interface hc9 {
    @pm4
    long now() {
        return TimeUnit.NANOSECONDS.toMillis(nowNanos());
    }

    @pm4
    long nowNanos();
}
