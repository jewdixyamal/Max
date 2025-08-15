package defpackage;

import android.os.Process;

/* renamed from: phc  reason: default package */
public final class phc extends Thread {
    public final int a;

    public phc(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.a = i;
    }

    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
