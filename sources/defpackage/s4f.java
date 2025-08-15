package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: s4f  reason: default package */
public enum s4f implements Executor {
    ;
    
    public static final Handler b = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, s4f] */
    static {
        b = new Handler(Looper.getMainLooper());
    }

    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
