package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rr3  reason: default package */
public final class rr3 {
    public final av0 a;
    public final ztc b;
    public final el3 c;
    public final oq3 d;
    public final b0d e;
    public volatile List f = Collections.emptyList();
    public volatile List g = Collections.emptyList();
    public final ztc h;
    public final xpb i;
    public final HashSet j = new HashSet();
    public volatile String k = "";
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final AtomicBoolean n = new AtomicBoolean(true);

    public rr3(o45 o45, av0 av0, ztc ztc, ztc ztc2, el3 el3, oq3 oq3, b0d b0d) {
        this.a = av0;
        this.b = ztc;
        this.c = el3;
        this.d = oq3;
        this.e = b0d;
        this.h = ztc2;
        xpb xpb = new xpb();
        this.i = xpb;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ztc a2 = muc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        o45 o452 = o45;
        new o1a(xpb, 1, timeUnit, a2, false).n(ztc2).a(new sd7(new v02(23, this), new v02(24, o45), ft.d));
        a();
    }

    public final void a() {
        if (!this.l.get()) {
            String str = this.k;
            if (!oag.d(this.k, str)) {
                this.n.set(true);
            }
            this.k = str;
            cqc.a(new e5(5, this), this.h, (f6) null, new un0(29), (ztc) null);
            this.l.set(true);
            return;
        }
        this.i.e(0);
    }

    public final void b() {
        hm9.m("rr3", "updateDataWorker: start", new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        this.c.b();
        long currentTimeMillis2 = System.currentTimeMillis();
        long currentTimeMillis3 = System.currentTimeMillis();
        List k2 = this.c.k();
        long currentTimeMillis4 = System.currentTimeMillis();
        if (oag.t(this.k)) {
            oq3 oq3 = this.d;
            oq3.getClass();
            Collections.sort(k2, new ca3(2, oq3));
            hm9.m("rr3", "updateDataWorker: update %d contacts. fetchTime=%dms, sortTime=%dms", Integer.valueOf(k2.size()), Long.valueOf(currentTimeMillis4 - currentTimeMillis3), Long.valueOf(System.currentTimeMillis() - currentTimeMillis4));
            this.f = k2;
        } else if (this.n.compareAndSet(true, false)) {
            String str = this.k;
            b0d b0d = this.e;
            if (!oag.t(str)) {
                if (!(k2 instanceof Collection) || !k2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : k2) {
                        try {
                            if (b0d.g((uj3) next, str)) {
                                arrayList.add(next);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    k2 = arrayList;
                } else {
                    k2 = Collections.emptyList();
                }
            }
            this.d.b(k2);
            this.g = k2;
        }
        long currentTimeMillis5 = System.currentTimeMillis();
        hm9.m("rr3", "updateDataWorker: done. awaitLoading=%dms, update=%dms, total=%dms", Long.valueOf(currentTimeMillis2 - currentTimeMillis), Long.valueOf(currentTimeMillis5 - currentTimeMillis2), Long.valueOf(currentTimeMillis5 - currentTimeMillis));
        this.m.set(true);
        this.b.b(new cu1(20, this));
    }

    @uae
    public void onEvent(ut7 ut7) {
        a();
    }

    @uae
    public void onEvent(ps3 ps3) {
        this.n.set(true);
        a();
    }

    @uae
    public void onEvent(c6f c6f) {
        a();
    }
}
