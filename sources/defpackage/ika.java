package defpackage;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ika  reason: default package */
public final class ika implements ThreadFactory {
    public final AtomicInteger X = new AtomicInteger(1);
    public final String a;
    public final Thread.UncaughtExceptionHandler b;
    public final int c;
    public final vse o;

    public ika(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, int i, vse vse) {
        this.a = str;
        this.b = uncaughtExceptionHandler;
        this.c = i;
        this.o = vse;
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.X.getAndIncrement();
        hka hka = new hka(this.a + "-" + andIncrement, runnable);
        hka.setUncaughtExceptionHandler(this.b);
        hka.setPriority(this.c);
        hka.b = this.o;
        return hka;
    }
}
