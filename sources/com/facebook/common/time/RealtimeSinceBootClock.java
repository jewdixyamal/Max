package com.facebook.common.time;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

@pm4
public class RealtimeSinceBootClock implements hc9 {
    public static final RealtimeSinceBootClock a = new RealtimeSinceBootClock();

    private RealtimeSinceBootClock() {
    }

    @pm4
    public static RealtimeSinceBootClock get() {
        return a;
    }

    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
    }
}
