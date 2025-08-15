package defpackage;

import android.os.Looper;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: zba  reason: default package */
public final class zba implements ir6 {
    public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();

    public final boolean c() {
        return true;
    }

    public final void d(us7 us7, String str, String str2, Throwable th) {
        String valueOf;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.a;
        Thread currentThread = Thread.currentThread();
        if (((Looper) rse.a.getValue()).isCurrentThread()) {
            valueOf = "ui";
        } else {
            String name = currentThread.getName();
            valueOf = (name == null || name.length() == 0) ? String.valueOf(currentThread.getId()) : currentThread.getName();
        }
        concurrentLinkedQueue.add(new os7(us7, str, str2, valueOf, th));
    }
}
