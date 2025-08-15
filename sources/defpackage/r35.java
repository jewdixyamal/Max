package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: r35  reason: default package */
public final class r35 implements wae, zpb {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public r35() {
        s4f s4f = s4f.a;
        this.c = s4f;
    }

    public final void a(av1 av1) {
        Class<i24> cls = i24.class;
        Executor executor = this.c;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.a.containsKey(cls)) {
                    this.a.put(cls, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(cls)).put(av1, executor);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
