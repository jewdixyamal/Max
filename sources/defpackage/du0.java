package defpackage;

import bolts.Task;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: du0  reason: default package */
public final class du0 {
    public final lg5 a;
    public final y7g b;
    public final sh0 c;
    public final Executor d;
    public final Executor e;
    public final pq9 f;
    public final rxd g;

    public du0(lg5 lg5, y7g y7g, sh0 sh0, Executor executor, Executor executor2, pq9 pq9) {
        this.a = lg5;
        this.b = y7g;
        this.c = sh0;
        this.d = executor;
        this.e = executor2;
        this.f = pq9;
        rxd rxd = new rxd(0);
        rxd.b = new HashMap();
        this.g = rxd;
    }

    public final void a() {
        this.g.U();
        try {
            Task.call(new l5(1, this), this.e);
        } catch (Exception e2) {
            ta5.l(e2, "Failed to schedule disk-cache clear", new Object[0]);
            Task.forError(e2);
        }
    }

    public final Task b(tpd tpd, AtomicBoolean atomicBoolean) {
        f46.I();
        g05 W = this.g.W(tpd);
        if (W == null) {
            return c(tpd, atomicBoolean);
        }
        ta5.d(du0.class, tpd.a, "Found image for %s in staging area");
        this.f.getClass();
        return Task.forResult(W);
    }

    public final Task c(tpd tpd, AtomicBoolean atomicBoolean) {
        try {
            return Task.call(new cu0(atomicBoolean, this, tpd, 0), this.d);
        } catch (Exception e2) {
            ta5.l(e2, "Failed to schedule disk-cache read for %s", tpd.a);
            return Task.forError(e2);
        }
    }

    public final void d(ww0 ww0, g05 g05) {
        f46.I();
        Executor executor = this.e;
        if (g05.m0(g05)) {
            rxd rxd = this.g;
            rxd.c0(ww0, g05);
            g05 a2 = g05.a(g05);
            try {
                executor.execute(new f5((Object) this, (Object) ww0, (Object) a2, 5));
            } catch (Exception e2) {
                ta5.l(e2, "Failed to schedule disk-cache write for %s", ww0.c());
                rxd.d0(ww0, g05);
                g05.d(a2);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final qq8 e(tpd tpd) {
        rq8 rq8;
        String str = tpd.a;
        pq9 pq9 = this.f;
        Class<du0> cls = du0.class;
        try {
            ta5.d(cls, str, "Disk cache read for %s");
            kg5 c2 = ((el4) this.a).c(tpd);
            if (c2 == null) {
                ta5.d(cls, str, "Disk cache miss for %s");
                pq9.getClass();
                return null;
            }
            ta5.d(cls, str, "Found entry in disk cache for %s");
            pq9.getClass();
            FileInputStream fileInputStream = new FileInputStream(c2.a);
            try {
                y7g y7g = this.b;
                y7g.getClass();
                rq8 = new rq8((pq8) y7g.b, (int) c2.a.length());
                ((sh0) y7g.c).i(fileInputStream, rq8);
                qq8 n = rq8.n();
                rq8.close();
                fileInputStream.close();
                ta5.d(cls, str, "Successful read from disk cache for %s");
                return n;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (IOException e2) {
            ta5.l(e2, "Exception reading from cache for %s", str);
            pq9.getClass();
            throw e2;
        }
    }

    public final void f(ww0 ww0, g05 g05) {
        Class<du0> cls = du0.class;
        ta5.d(cls, ww0.c(), "About to write to disk-cache for key %s");
        try {
            ((el4) this.a).e(ww0, new f9(g05, 4, this));
            this.f.getClass();
            ta5.d(cls, ww0.c(), "Successful disk-cache write for key %s");
        } catch (IOException e2) {
            ta5.l(e2, "Failed to write to disk-cache for key %s", ww0.c());
        }
    }
}
