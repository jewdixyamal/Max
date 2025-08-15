package defpackage;

import bolts.Task;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: vk4  reason: default package */
public final class vk4 implements gu3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public vk4(xk4 xk4, b47 b47, eab eab, fi0 fi0) {
        this.e = xk4;
        this.b = b47;
        this.c = eab;
        this.d = fi0;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                boolean isCancelled = task.isCancelled();
                fi0 fi0 = (fi0) this.d;
                hab hab = (hab) this.b;
                eab eab = (eab) this.c;
                if (isCancelled || (task.isFaulted() && (task.getError() instanceof CancellationException))) {
                    hab.k(eab, "DiskCacheProducer");
                    fi0.c();
                } else {
                    boolean isFaulted = task.isFaulted();
                    xk4 xk4 = (xk4) this.e;
                    if (isFaulted) {
                        hab.d(eab, "DiskCacheProducer", task.getError(), (Map) null);
                        xk4.d.a(fi0, eab);
                    } else {
                        g05 g05 = (g05) task.getResult();
                        if (g05 != null) {
                            hab.a(eab, "DiskCacheProducer", xk4.c((b47) hab, eab, true, g05.o()));
                            hab.e(eab, "DiskCacheProducer", true);
                            ((oj0) eab).h("disk", "default");
                            fi0.i(1.0f);
                            fi0.g(1, g05);
                            g05.close();
                        } else {
                            hab.a(eab, "DiskCacheProducer", xk4.c((b47) hab, eab, false, 0));
                            xk4.d.a(fi0, eab);
                        }
                    }
                }
                return null;
            default:
                if (!((Boolean) ((Callable) this.b).call()).booleanValue()) {
                    return Task.forResult(null);
                }
                Executor executor = (Executor) this.d;
                return Task.forResult(null).onSuccessTask((gu3) this.c, executor).onSuccessTask((gu3) ((hz1) this.e).b, executor);
        }
    }

    public vk4(Callable callable, gu3 gu3, Executor executor, hz1 hz1) {
        this.b = callable;
        this.c = gu3;
        this.d = executor;
        this.e = hz1;
    }
}
