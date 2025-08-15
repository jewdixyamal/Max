package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: uf6  reason: default package */
public final class uf6 implements auc, e7g, w45 {
    public static final String u0 = a14.O("GreedyScheduler");
    public final qg4 X;
    public boolean Y;
    public final Object Z;
    public final Context a;
    public final s7g b;
    public final adb c;
    public final HashSet o = new HashSet();
    public final bdb s0 = new bdb(6);
    public Boolean t0;

    public uf6(Context context, me3 me3, c8d c8d, s7g s7g) {
        this.a = context;
        this.b = s7g;
        this.c = new adb(c8d, (e7g) this);
        this.X = new qg4(this, me3.e);
        this.Z = new Object();
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l7g n = ju0.n((h8g) it.next());
            a14 u = a14.u();
            u.n(u0, "Constraints not met: Cancelling work ID " + n);
            yzd j = this.s0.j(n);
            if (j != null) {
                s7g s7g = this.b;
                s7g.d.l(new k8e(s7g, j, false));
            }
        }
    }

    public final void b(l7g l7g, boolean z) {
        this.s0.j(l7g);
        synchronized (this.Z) {
            try {
                Iterator it = this.o.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    h8g h8g = (h8g) it.next();
                    if (ju0.n(h8g).equals(l7g)) {
                        a14 u = a14.u();
                        String str = u0;
                        u.n(str, "Stopping tracking for " + l7g);
                        this.o.remove(h8g);
                        this.c.w(this.o);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        return false;
    }

    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.t0;
        s7g s7g = this.b;
        if (bool == null) {
            me3 me3 = s7g.b;
            int i = t9b.a;
            this.t0 = Boolean.valueOf(tpa.f(rk.a.a(), this.a.getApplicationInfo().processName));
        }
        boolean booleanValue = this.t0.booleanValue();
        String str2 = u0;
        if (!booleanValue) {
            a14.u().x(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.Y) {
            s7g.f.a(this);
            this.Y = true;
        }
        a14 u = a14.u();
        u.n(str2, "Cancelling work ID " + str);
        qg4 qg4 = this.X;
        if (!(qg4 == null || (runnable = (Runnable) qg4.c.remove(str)) == null)) {
            ((Handler) qg4.b.a).removeCallbacks(runnable);
        }
        for (yzd k8e : this.s0.k(str)) {
            s7g.d.l(new k8e(s7g, k8e, false));
        }
    }

    public final void e(h8g... h8gArr) {
        boolean containsKey;
        boolean containsKey2;
        if (this.t0 == null) {
            me3 me3 = this.b.b;
            int i = t9b.a;
            this.t0 = Boolean.valueOf(tpa.f(rk.a.a(), this.a.getApplicationInfo().processName));
        }
        if (!this.t0.booleanValue()) {
            a14.u().x(u0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.Y) {
            this.b.f.a(this);
            this.Y = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (h8g h8g : h8gArr) {
            l7g n = ju0.n(h8g);
            bdb bdb = this.s0;
            synchronized (bdb.b) {
                containsKey = ((LinkedHashMap) bdb.c).containsKey(n);
            }
            if (!containsKey) {
                long a2 = h8g.a();
                long currentTimeMillis = System.currentTimeMillis();
                if (h8g.b != m7g.a) {
                    continue;
                } else if (currentTimeMillis < a2) {
                    qg4 qg4 = this.X;
                    if (qg4 != null) {
                        HashMap hashMap = qg4.c;
                        Runnable runnable = (Runnable) hashMap.remove(h8g.a);
                        y8 y8Var = qg4.b;
                        if (runnable != null) {
                            ((Handler) y8Var.a).removeCallbacks(runnable);
                        }
                        h76 h76 = new h76((Object) qg4, (Object) h8g, false, 5);
                        hashMap.put(h8g.a, h76);
                        ((Handler) y8Var.a).postDelayed(h76, h8g.a() - System.currentTimeMillis());
                    }
                } else if (h8g.c()) {
                    kj3 kj3 = h8g.j;
                    if (kj3.c) {
                        a14.u().n(u0, "Ignoring " + h8g + ". Requires device idle.");
                    } else if (!kj3.h.isEmpty()) {
                        a14.u().n(u0, "Ignoring " + h8g + ". Requires ContentUri triggers.");
                    } else {
                        hashSet.add(h8g);
                        hashSet2.add(h8g.a);
                    }
                } else {
                    bdb bdb2 = this.s0;
                    l7g n2 = ju0.n(h8g);
                    synchronized (bdb2.b) {
                        containsKey2 = ((LinkedHashMap) bdb2.c).containsKey(n2);
                    }
                    if (!containsKey2) {
                        a14.u().n(u0, "Starting work for " + h8g.a);
                        this.b.h(this.s0.o(ju0.n(h8g)), (glc) null);
                    }
                }
            }
        }
        synchronized (this.Z) {
            try {
                if (!hashSet.isEmpty()) {
                    a14.u().n(u0, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    this.o.addAll(hashSet);
                    this.c.w(this.o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(List list) {
        boolean containsKey;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            l7g n = ju0.n((h8g) it.next());
            bdb bdb = this.s0;
            synchronized (bdb.b) {
                containsKey = ((LinkedHashMap) bdb.c).containsKey(n);
            }
            if (!containsKey) {
                a14 u = a14.u();
                u.n(u0, "Constraints met: Scheduling work ID " + n);
                this.b.h(bdb.o(n), (glc) null);
            }
        }
    }
}
