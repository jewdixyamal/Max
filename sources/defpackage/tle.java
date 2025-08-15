package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: tle  reason: default package */
public final class tle implements mle {
    public static final String B0 = mle.class.getName();
    public final je7 A0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public volatile CountDownLatch b;
    public final AtomicLong c = new AtomicLong(0);
    public final CopyOnWriteArraySet o = new CopyOnWriteArraySet();
    public final je7 s0;
    public final o45 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public volatile khe y0;
    public final khe z0;

    public tle(je7 je7, je7 je72, je7 je73, je7 je74, o45 o45, je7 je75, je7 je76, je7 je77, wle wle, je7 je78, hbd hbd, je7 je79) {
        this.X = je7;
        this.Y = je72;
        this.Z = je73;
        this.s0 = je74;
        this.t0 = o45;
        this.u0 = je75;
        this.v0 = je76;
        this.w0 = je77;
        this.x0 = je78;
        this.A0 = je79;
        this.z0 = new khe(new ile(4, je75));
        this.y0 = new khe(new ile(5, je75));
        ((jbd) hbd).a(this);
        wle.o = this;
    }

    public static void a(tle tle, ol olVar) {
        tle.getClass();
        String str = B0;
        String name = olVar.getClass().getName();
        long j = olVar.a;
        hm9.m(str, "onTaskSuccess: %s, requestId: %s", name, Long.valueOf(j));
        boolean z = olVar instanceof ht7;
        je7 je7 = tle.v0;
        je7 je72 = tle.x0;
        if (z) {
            yle yle = (yle) je72.getValue();
            AtomicLong atomicLong = yle.Z;
            ((ri4) yle.o.getValue()).getClass();
            atomicLong.set(SystemClock.elapsedRealtime());
            r9d.y((s8g) je7.getValue());
        }
        if (olVar instanceof hua) {
            ((eoe) tle.X.getValue()).d(j);
        }
        if (olVar instanceof jf9) {
            r9d.y((s8g) je7.getValue());
        }
        t33 t33 = ((p7b) ((m7b) tle.Y.getValue())).a;
        t33.getClass();
        if (t33.g.getBoolean("app.forceConnection", false) && olVar.s().V()) {
            hm9.m(str, "onTaskSuccess: set force connection to false after success tam task", new Object[0]);
            t33.y(false);
        }
        if (olVar.s().V()) {
            ((ri4) tle.Z.getValue()).getClass();
            t33.l("app.lastSuccessfulRequestTime", Long.valueOf(SystemClock.elapsedRealtime()));
        }
        ((yle) je72.getValue()).h();
    }

    public final long b(ol olVar, lme lme, boolean z) {
        String str = B0;
        hm9.m(str, "executeTask: " + olVar.getClass().getName() + " isRetry=" + z, new Object[0]);
        ((yle) this.x0.getValue()).f(false);
        if (olVar instanceof ju7) {
            this.b = new CountDownLatch(1);
        }
        ((ExecutorService) this.z0.getValue()).execute(new nd8(this, olVar, z, new bkb(false, this, olVar, lme), lme));
        return olVar.a;
    }

    public final void c(int i) {
        if (i == 2) {
            lad lad = new lad(((p7b) ((m7b) this.Y.getValue())).a.o(), 0);
            b(lad, lad, false);
        }
    }

    public final long d(dle dle) {
        long currentTimeMillis = System.currentTimeMillis();
        sle sle = (sle) this.a.get(dle.getClass().getName());
        if (sle == null) {
            return currentTimeMillis;
        }
        n4c.a.getClass();
        ele P = dle.P();
        long j = sle.b;
        return P.p(sle.a, j, n4c.b.e() * 0.2f);
    }

    public final void e(boolean z) {
        x9d x9d;
        AtomicLong atomicLong = this.c;
        ((ri4) this.Z.getValue()).getClass();
        atomicLong.set(SystemClock.elapsedRealtime());
        if (z) {
            this.a.clear();
            je7 je7 = this.x0;
            if (je7.a() && (x9d = (x9d) ((yle) je7.getValue()).Y.get()) != null) {
                x9d.i.set(0);
                x9d.h.set(0);
                hm9.m(x9d.a, "resetConnectionTimeout", new Object[0]);
            }
        }
    }

    public final void f(ol olVar, pke pke) {
        String str = B0;
        yje yje = pke.X;
        String name = olVar.getClass().getName();
        long j = olVar.a;
        hm9.r(str, yje, "onTaskFailed: %s, requestId: %s, error %s", name, Long.valueOf(j), pke);
        String str2 = pke.b;
        if ("proto.ver".equals(str2)) {
            hm9.m(str, "got version error: mark current version as deprecated, close connection", new Object[0]);
            x9d x9d = (x9d) ((yle) this.x0.getValue()).Y.get();
            if (x9d != null) {
                x9d.q(false);
            }
            ((av0) this.s0.getValue()).c(new su(5));
        }
        if (olVar instanceof hua) {
            ((eoe) this.X.getValue()).c(j);
            if ("proto.payload".equals(str2)) {
                hua hua = (hua) olVar;
                try {
                    hua.d();
                } catch (Throwable th) {
                    ((cba) this.t0).c(new Exception("TaskRunnable: failed to execute onMaxFailCount method for task " + hua.getId() + " type " + hua.getType(), th), true);
                }
            }
            ((boe) this.w0.getValue()).a();
            r9d.y((s8g) this.v0.getValue());
        }
        if ((olVar instanceof ju7) && this.b != null) {
            hm9.k(str, "countDownSyncLogoutLatch");
            this.b.countDown();
        }
    }
}
