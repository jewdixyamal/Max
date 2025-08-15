package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: tm1  reason: default package */
public abstract class tm1 {
    public static final uv7 a;

    /* JADX WARNING: type inference failed for: r2v0, types: [sv7, uv7] */
    static {
        long millis = TimeUnit.SECONDS.toMillis(5);
        a = new sv7(millis - 2000, millis + 4000);
    }
}
