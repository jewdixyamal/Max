package defpackage;

import bolts.Task;
import java.util.concurrent.Executor;

/* renamed from: dne  reason: default package */
public final class dne implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rne b;
    public final /* synthetic */ gu3 c;
    public final /* synthetic */ Executor d;

    public /* synthetic */ dne(rne rne, gu3 gu3, Executor executor, int i) {
        this.a = i;
        this.b = rne;
        this.c = gu3;
        this.d = executor;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                Task.completeImmediately(this.b, this.c, task, this.d, (az1) null);
                return null;
            default:
                Task.completeAfterTask(this.b, this.c, task, this.d, (az1) null);
                return null;
        }
    }
}
