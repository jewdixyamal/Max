package defpackage;

import bolts.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ine  reason: default package */
public final class ine implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ rne c;

    public /* synthetic */ ine(AtomicBoolean atomicBoolean, rne rne, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = rne;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                if (this.b.compareAndSet(false, true)) {
                    this.c.c(task);
                    return null;
                }
                task.getError();
                return null;
            default:
                if (this.b.compareAndSet(false, true)) {
                    this.c.c(task);
                    return null;
                }
                task.getError();
                return null;
        }
    }
}
