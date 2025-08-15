package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: nr7  reason: default package */
public final class nr7 implements lr7 {
    public static final /* synthetic */ int s0 = 0;
    public final jt3 X;
    public final jt3 Y;
    public final jt3 Z;
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Context o;

    public nr7(Context context, je7 je7, je7 je72) {
        this.o = context;
        Objects.requireNonNull(je7);
        this.X = new jt3((Object) new m01(1, je7));
        this.Y = new jt3((Object) new u00((Object) this, (Object) je7, (Object) context, 13));
        Objects.requireNonNull(je72);
        this.Z = new jt3((Object) new m01(2, je72));
    }

    public final void U0() {
        for (lr7 U0 : this.a) {
            U0.U0();
        }
        for (lr7 U02 : this.b) {
            U02.U0();
        }
        for (lr7 U03 : this.c) {
            U03.U0();
        }
    }

    public final void a(lr7 lr7) {
        if (!wmd.j(this.o, wmd.f)) {
            hm9.m("nr7", "start: no permissions", new Object[0]);
            lr7.U0();
            return;
        }
        re6 re6 = new re6(18, (Object) lr7);
        reg reg = ((me6) this.X.get()).a;
        reg.getClass();
        er0 er0 = new er0();
        er0.c = true;
        er0.d = yb9.Z;
        er0.b = 2414;
        ukg c2 = reg.c(0, er0.a());
        c2.i(new ke6(re6));
        c2.c(xne.a, new ke6(re6));
    }

    public final void b(lr7 lr7) {
        synchronized (this.c) {
            try {
                if (this.c.isEmpty()) {
                    ak6 ak6 = (ak6) this.Y.get();
                    ak6.getClass();
                    nd7.Q(new mr7(ak6, 1));
                    hm9.m("nr7", "requestHighAccuracyUpdates", new Object[0]);
                }
                this.c.add(lr7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(lr7 lr7) {
        synchronized (this.c) {
            try {
                this.c.remove(lr7);
                if (this.c.isEmpty() && this.Y.b != null) {
                    ak6 ak6 = (ak6) this.Y.get();
                    ak6.getClass();
                    nd7.Q(new mr7(ak6, 0));
                    hm9.m("nr7", "stopHighAccuracyUpdates", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p1(er7 er7) {
        for (lr7 p1 : this.a) {
            p1.p1(er7);
        }
        for (lr7 p12 : this.b) {
            p12.p1(er7);
        }
        for (lr7 p13 : this.c) {
            p13.p1(er7);
        }
    }
}
