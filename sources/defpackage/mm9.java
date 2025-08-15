package defpackage;

import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mm9  reason: default package */
public final class mm9 {
    public final aea a;
    public final sc4 b;
    public final ExecutorService c;
    public final String d;
    public volatile boolean e;
    public final AtomicReference f = new AtomicReference(new ArrayList());
    public volatile Future g;

    public mm9(aea aea, sc4 sc4, ExecutorService executorService, String str, boolean z) {
        this.a = aea;
        this.b = sc4;
        this.c = executorService;
        this.d = str;
        this.e = z;
    }

    public final void a(nm9 nm9) {
        AtomicReference atomicReference;
        boolean z = false;
        loop0:
        while (true) {
            atomicReference = this.f;
            ArrayList arrayList = (ArrayList) atomicReference.get();
            ArrayList arrayList2 = new ArrayList(arrayList);
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else if (weakReference.get() == nm9) {
                    z = true;
                    break;
                }
            }
            while (true) {
                if (atomicReference.compareAndSet(arrayList, arrayList2)) {
                    break loop0;
                } else if (atomicReference.get() != arrayList) {
                }
            }
        }
        if (!z) {
            while (true) {
                ArrayList arrayList3 = (ArrayList) atomicReference.get();
                ArrayList arrayList4 = new ArrayList(arrayList3);
                arrayList4.add(new WeakReference(nm9));
                while (true) {
                    if (!atomicReference.compareAndSet(arrayList3, arrayList4)) {
                        if (atomicReference.get() != arrayList3) {
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void b(qm9 qm9, nm9 nm9) {
        if (qm9 != null) {
            try {
                if (qm9.b.exists()) {
                    if (qm9.b.canRead()) {
                        nm9.onFinished(this.d, qm9.b, qm9.a);
                        return;
                    }
                }
            } catch (Throwable th) {
                if (th instanceof ExecutionException) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        nm9.onFailed(cause);
                    }
                } else {
                    nm9.onFailed(th);
                }
                if (this.e) {
                    a(nm9);
                    d();
                    return;
                }
                return;
            }
        }
        if (this.e) {
            a(nm9);
            d();
        }
    }

    public final void c(File file, String str) {
        for (WeakReference weakReference : (Iterable) this.f.get()) {
            nm9 nm9 = (nm9) weakReference.get();
            if (nm9 != null) {
                nm9.onFinished(this.d, file, str);
            }
            weakReference.clear();
        }
    }

    public final void d() {
        Future future = this.g;
        if (future == null || future.isDone()) {
            this.g = this.c.submit(new l5(10, this));
        }
    }

    public final void e(nm9 nm9) {
        Future future;
        if (this.g == null || ((future = this.g) != null && !future.isDone())) {
            a(nm9);
        } else {
            this.c.execute(new vs5(this, 29, nm9));
        }
    }
}
