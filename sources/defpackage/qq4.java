package defpackage;

import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: qq4  reason: default package */
public final class qq4 {
    public static final qq4 b = new qq4();
    public static final boolean c = true;
    public final ArrayBlockingQueue a = new ArrayBlockingQueue(20);

    public final void a(pq4 pq4) {
        if (c) {
            int i = 5;
            while (true) {
                ArrayBlockingQueue arrayBlockingQueue = this.a;
                if (!arrayBlockingQueue.offer(pq4) && i > 0) {
                    arrayBlockingQueue.poll();
                    i--;
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
