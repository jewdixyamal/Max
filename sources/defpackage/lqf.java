package defpackage;

import android.app.Application;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: lqf  reason: default package */
public final class lqf implements zp {
    public static final /* synthetic */ int n = 0;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final nx3 d;
    public final je7 e;
    public int f = 0;
    public long g;
    public int h;
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public final jvc j;
    public volatile boolean k = false;
    public volatile boolean l = true;
    public final kqf m = new kqf(this);

    public lqf(Application application, jvc jvc, je7 je7, je7 je72, je7 je73, nx3 nx3, je7 je74) {
        this.j = jvc;
        this.a = je7;
        this.b = je72;
        this.d = nx3;
        this.c = je73;
        this.e = je74;
        application.registerActivityLifecycleCallbacks(new mg0(1, this));
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.g;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "lqf", "app enter background, time=" + nu0.G(Long.valueOf(System.currentTimeMillis())) + ", interactiveTime=" + elapsedRealtime, (Throwable) null);
        }
        ((ad) this.b.getValue()).i(elapsedRealtime, "INTERACTIVE_SESSION");
        this.d.dispatch(hz4.a, new jqf(this, 1));
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((yp) it.next()).a();
        }
    }

    public final void b() {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "lqf", "app enter foreground, time = " + nu0.G(Long.valueOf(System.currentTimeMillis())), (Throwable) null);
        }
        this.g = SystemClock.elapsedRealtime();
        this.d.dispatch(hz4.a, new jqf(this, 2));
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((yp) it.next()).c();
        }
    }

    public final boolean c() {
        return this.k && this.l;
    }
}
