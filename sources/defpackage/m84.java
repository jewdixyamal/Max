package defpackage;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

/* renamed from: m84  reason: default package */
public final class m84 implements ide {
    public static final long b = TimeUnit.MINUTES.toMillis(5);
    public final ActivityManager a;

    public m84(ActivityManager activityManager) {
        this.a = activityManager;
    }

    public final Object get() {
        int min = Math.min(this.a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        return new mq8(min < 33554432 ? 4194304 : min < 67108864 ? 6291456 : min / 4, 256, Integer.MAX_VALUE, b, Integer.MAX_VALUE);
    }
}
