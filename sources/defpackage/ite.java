package defpackage;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: ite  reason: default package */
public final class ite implements dab {
    public final dab a;
    public int b = 0;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final Executor d;

    public ite(Executor executor, iic iic) {
        executor.getClass();
        this.d = executor;
        this.a = iic;
    }

    public final void a(fi0 fi0, eab eab) {
        boolean z;
        ((oj0) eab).c.j(eab, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.b;
                z = true;
                if (i >= 5) {
                    this.c.add(Pair.create(fi0, eab));
                } else {
                    this.b = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z) {
            ((oj0) eab).c.a(eab, "ThrottlingProducer", (Map) null);
            this.a.a(new hte(this, fi0), eab);
        }
    }
}
