package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cm9  reason: default package */
public final class cm9 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final String b;
    public final Object c;

    public cm9(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = new AtomicInteger(1);
                return;
            default:
                this.c = Executors.defaultThreadFactory();
                this.b = str;
                return;
        }
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.c).newThread(new tqc(runnable, 3));
                newThread.setName(this.b);
                return newThread;
            default:
                do9 do9 = new do9(this, 17, runnable);
                int andIncrement = ((AtomicInteger) this.c).getAndIncrement();
                return new Thread(do9, this.b + "-" + andIncrement);
        }
    }
}
