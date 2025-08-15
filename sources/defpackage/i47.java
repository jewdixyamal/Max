package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* renamed from: i47  reason: default package */
public final class i47 extends AbstractOwnableSynchronizer implements Runnable {
    public final d3f a;

    public i47(d3f d3f) {
        this.a = d3f;
    }

    public static void a(i47 i47, Thread thread) {
        i47.setExclusiveOwnerThread(thread);
    }

    public final void run() {
    }

    public final String toString() {
        return this.a.toString();
    }
}
