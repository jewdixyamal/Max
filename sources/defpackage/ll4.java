package defpackage;

import android.util.SparseIntArray;
import androidx.work.WorkRequest;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Locale;
import java.util.NoSuchElementException;
import one.me.rlottie.RLottie;

/* renamed from: ll4  reason: default package */
public final class ll4 {
    public static final SecureRandom j = new SecureRandom();
    public final LinkedList a = new LinkedList();
    public final SparseIntArray b = new SparseIntArray();
    public final LinkedList c = new LinkedList();
    public final int d = 4;
    public int e;
    public final int f = j.nextInt();
    public int g;
    public boolean h;
    public final re i = new re(15, this);

    public final il4 a() {
        il4 il4 = new il4("rlottie-pool-" + this.f + "-" + j.nextInt());
        il4.setPriority(10);
        return il4;
    }

    public final void b(Runnable runnable) {
        il4 il4;
        LinkedList linkedList = this.c;
        boolean isEmpty = linkedList.isEmpty();
        LinkedList linkedList2 = this.a;
        int i2 = this.d;
        if (!isEmpty && (this.g / 2 <= linkedList.size() || (linkedList2.isEmpty() && this.e >= i2))) {
            try {
                il4 = (il4) linkedList.removeFirst();
            } catch (NoSuchElementException e2) {
                RLottie.getLogger().o(e2);
                il4 = null;
            }
        } else if (linkedList2.isEmpty()) {
            il4 = a();
            this.e++;
        } else {
            il4 = (il4) linkedList2.removeFirst();
        }
        if (!this.h) {
            he.e(this.i, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
            this.h = true;
        }
        if (il4 == null) {
            lm9 logger = RLottie.getLogger();
            Locale locale = Locale.US;
            int size = linkedList.size();
            int i3 = this.g;
            int size2 = linkedList2.size();
            int i4 = this.e;
            StringBuilder j2 = wg0.j("DispatchQueuePool: queue is null – busyQueues.size=", size, ", totalTasksCount=", i3, ", queues.size=");
            ms2.k(j2, size2, ", createdCount=", i4, ", maxCount=");
            j2.append(i2);
            logger.j(j2.toString(), new IllegalStateException("queue is null"));
            il4 = a();
            this.e++;
        }
        this.g++;
        linkedList.add(il4);
        SparseIntArray sparseIntArray = this.b;
        int i5 = il4.o;
        sparseIntArray.put(i5, sparseIntArray.get(i5, 0) + 1);
        if (il4.getPriority() != 10) {
            il4.setPriority(10);
        }
        il4.b(new f5((Object) this, (Object) runnable, (Object) il4, 20));
    }
}
