package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: y05  reason: default package */
public final /* synthetic */ class y05 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z05 b;
    public final /* synthetic */ bm7 c;

    public /* synthetic */ y05(z05 z05, bm7 bm7, int i) {
        this.a = i;
        this.b = z05;
        this.c = bm7;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                z05 z05 = this.b;
                z05.getClass();
                bm7 bm7 = this.c;
                if (!bm7.cancel(true)) {
                    c54.p((String) null, bm7.isDone());
                    try {
                        ((f17) bm7.get()).a();
                        return;
                    } catch (InterruptedException | CancellationException | ExecutionException e) {
                        String str = z05.o.a;
                        e.toString();
                        return;
                    }
                } else {
                    return;
                }
            default:
                this.b.c.remove(this.c);
                return;
        }
    }
}
