package defpackage;

import java.io.Serializable;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: je3  reason: default package */
public final class je3 implements ThreadFactory {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final Serializable c;

    public je3(String str, boolean z) {
        this.c = str;
        this.b = z;
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                StringBuilder l = au1.l(this.b ? "WM.task-" : "androidx.work-");
                l.append(((AtomicInteger) this.c).incrementAndGet());
                return new Thread(runnable, l.toString());
            default:
                Thread thread = new Thread(runnable, (String) this.c);
                thread.setDaemon(this.b);
                return thread;
        }
    }

    public je3(boolean z) {
        this.b = z;
        this.c = new AtomicInteger(0);
    }
}
