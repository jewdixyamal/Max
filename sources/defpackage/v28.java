package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: v28  reason: default package */
public final class v28 extends ConcurrentLinkedQueue implements y28 {
    public int a;
    public final AtomicInteger b = new AtomicInteger();

    public final int d() {
        return this.b.get();
    }

    public final int i() {
        return this.a;
    }

    public final void k() {
        poll();
    }

    public final boolean offer(Object obj) {
        this.b.getAndIncrement();
        return super.offer(obj);
    }

    public final Object poll() {
        Object poll = super.poll();
        if (poll != null) {
            this.a++;
        }
        return poll;
    }
}
