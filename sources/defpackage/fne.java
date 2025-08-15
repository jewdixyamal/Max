package defpackage;

import bolts.Task;
import java.util.concurrent.CancellationException;

/* renamed from: fne  reason: default package */
public final class fne implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rne b;
    public final /* synthetic */ gu3 c;
    public final /* synthetic */ Task o;

    public /* synthetic */ fne(rne rne, gu3 gu3, Task task, int i) {
        this.a = i;
        this.b = rne;
        this.c = gu3;
        this.o = task;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                rne rne = this.b;
                try {
                    rne.c(this.c.a(this.o));
                    return;
                } catch (CancellationException unused) {
                    rne.a();
                    return;
                } catch (Exception e) {
                    rne.b(e);
                    return;
                }
            default:
                rne rne2 = this.b;
                try {
                    Task task = (Task) this.c.a(this.o);
                    if (task == null) {
                        rne2.c((Object) null);
                        return;
                    } else {
                        task.continueWith(new gne(0, this));
                        return;
                    }
                } catch (CancellationException unused2) {
                    rne2.a();
                    return;
                } catch (Exception e2) {
                    rne2.b(e2);
                    return;
                }
        }
    }
}
