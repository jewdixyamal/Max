package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nl7  reason: default package */
public final class nl7 implements bm7 {
    public final oq1 X = f8.g(new sy4(19, (Object) this));
    public lq1 Y;
    public List a;
    public ArrayList b;
    public final boolean c;
    public final AtomicInteger o;

    public nl7(ArrayList arrayList, boolean z, ok4 ok4) {
        this.a = arrayList;
        this.b = new ArrayList(arrayList.size());
        this.c = z;
        this.o = new AtomicInteger(arrayList.size());
        d(new q57(3, this), ju0.k());
        if (this.a.isEmpty()) {
            this.Y.b(new ArrayList(this.b));
            return;
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add((Object) null);
        }
        List list = this.a;
        for (int i2 = 0; i2 < list.size(); i2++) {
            bm7 bm7 = (bm7) list.get(i2);
            bm7.d(new eo((Object) this, i2, (Object) bm7, 3), ok4);
        }
    }

    public final boolean cancel(boolean z) {
        List<bm7> list = this.a;
        if (list != null) {
            for (bm7 cancel : list) {
                cancel.cancel(z);
            }
        }
        return this.X.cancel(z);
    }

    public final void d(Runnable runnable, Executor executor) {
        this.X.b.d(runnable, executor);
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.X.b.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.X.isCancelled();
    }

    public final boolean isDone() {
        return this.X.b.isDone();
    }

    public final Object get() {
        List<bm7> list = this.a;
        if (list != null && !isDone()) {
            loop0:
            for (bm7 bm7 : list) {
                while (true) {
                    if (!bm7.isDone()) {
                        try {
                            bm7.get();
                        } catch (Error e) {
                            throw e;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (Throwable unused) {
                            if (this.c) {
                                break loop0;
                            }
                        }
                    }
                }
            }
        }
        return (List) this.X.b.get();
    }
}
