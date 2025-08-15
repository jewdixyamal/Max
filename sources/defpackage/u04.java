package defpackage;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: u04  reason: default package */
public final class u04 implements ThreadFactory {
    public static final ThreadFactory X = Executors.defaultThreadFactory();
    public final AtomicLong a = new AtomicLong();
    public final String b;
    public final int c;
    public final StrictMode.ThreadPolicy o;

    public u04(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.c = i;
        this.o = threadPolicy;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = X.newThread(new wt1(this, 17, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.a.getAndIncrement();
        newThread.setName(this.b + " Thread #" + andIncrement);
        return newThread;
    }
}
