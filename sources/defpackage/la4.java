package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: la4  reason: default package */
public final class la4 implements ide {
    public static final long a = TimeUnit.MINUTES.toMillis(5);

    public final Object get() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i = min < 16777216 ? 1048576 : min < 33554432 ? 2097152 : 4194304;
        return new mq8(i, Integer.MAX_VALUE, i, a, i / 8);
    }
}
