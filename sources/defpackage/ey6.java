package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Debug;
import java.lang.Thread;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ey6  reason: default package */
public final class ey6 implements Thread.UncaughtExceptionHandler {
    public final zi5 a;
    public final m56 b;
    public final SharedPreferences c;
    public final Thread.UncaughtExceptionHandler d = Thread.getDefaultUncaughtExceptionHandler();
    public final AtomicBoolean e = new AtomicBoolean();

    public ey6(Context context, zi5 zi5, ww9 ww9) {
        this.a = zi5;
        this.b = ww9;
        this.c = context.getSharedPreferences("app_crash_prefs", 0);
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        zi5 zi5;
        this.c.edit().putLong("pref_last_crash_time", System.currentTimeMillis()).apply();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        m56 m56 = this.b;
        if (m56 != null && ((Boolean) m56.invoke(th)).booleanValue() && this.e.compareAndSet(false, true) && (zi5 = this.a) != null) {
            Debug.dumpHprofData(((kk5) zi5).i(ey8.i(new Date().getTime(), "oneme_heap_dump_-", ".hprof")).getAbsolutePath());
        }
    }
}
