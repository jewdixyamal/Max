package defpackage;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import ru.ok.tamtam.ExceptionHandler$HandledException;

/* renamed from: s8g  reason: default package */
public final class s8g {
    public static final /* synthetic */ int h = 0;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;

    public s8g(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je76;
        this.g = je77;
    }

    public final void a(d8d d8d) {
        ExecutorService k;
        hm9.m("s8g", "execute task = %s", d8d);
        je7 je7 = this.b;
        je7 je72 = this.a;
        je7 je73 = this.f;
        r8g r8g = new r8g(d8d, je72, (o45) je7.getValue(), je73);
        boolean z = d8d instanceof r9d;
        je7 je74 = this.c;
        if (z) {
            hm9.m("s8g", "execute ServiceTaskTransmitTamTasks", new Object[0]);
            iba iba = (iba) je74.getValue();
            iba.getClass();
            bc7 bc7 = iba.p[5];
            ExecutorService e2 = iba.e(iba.k);
            if (e2.isShutdown() || e2.isTerminated()) {
                String str = "WARNING! SingleTransmitExecutor has broken state. isShutdown: " + e2.isShutdown() + ", isTerminated: " + e2.isTerminated();
                hm9.k0("s8g", (Exception) null, str, Arrays.copyOf(new Object[0], 0));
                ((o45) je7.getValue()).a(new ExceptionHandler$HandledException(str, "ONEME-17687", (Throwable) null));
            }
            e2.execute(r8g);
        } else if (!d8d.v() || (k = d8d.k((iba) ((e8d) je73.getValue()).D.getValue(), ((ri4) ((e8d) je73.getValue()).d.getValue()).b())) == null) {
            hm9.m("WorkerService", "normal executor will run " + d8d, new Object[0]);
            ((iba) je74.getValue()).c().execute(r8g);
        } else {
            k.execute(r8g);
        }
    }

    public final long b(d8d d8d) {
        hua hua = (hua) d8d;
        ((eoe) this.a.getValue()).g(hua, 0, 0);
        r9d.y(this);
        return hua.getId();
    }
}
