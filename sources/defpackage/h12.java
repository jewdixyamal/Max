package defpackage;

import java.lang.Thread;

/* renamed from: h12  reason: default package */
public final class h12 implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler a;
    public final Thread.UncaughtExceptionHandler b;

    public h12(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.a = uncaughtExceptionHandler;
        this.b = uncaughtExceptionHandler2;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        try {
            uncaughtExceptionHandler = this.a;
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } finally {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
