package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rlf  reason: default package */
public final /* synthetic */ class rlf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bdb b;

    public /* synthetic */ rlf(bdb bdb, int i) {
        this.a = i;
        this.b = bdb;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((AtomicInteger) this.b.c).decrementAndGet();
                return;
            default:
                ((AtomicInteger) this.b.c).incrementAndGet();
                return;
        }
    }
}
