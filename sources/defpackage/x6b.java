package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: x6b  reason: default package */
public abstract class x6b {
    public static final long a = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    public static final long b = SystemClock.elapsedRealtimeNanos();
}
