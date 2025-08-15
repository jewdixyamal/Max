package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: kg4  reason: default package */
public final class kg4 implements e7g, l8g {
    public static final String x0 = a14.O("DelayMetCommandHandler");
    public final adb X;
    public final Object Y = new Object();
    public int Z = 0;
    public final Context a;
    public final int b;
    public final l7g c;
    public final phe o;
    public final qm s0;
    public final k40 t0;
    public PowerManager.WakeLock u0;
    public boolean v0 = false;
    public final yzd w0;

    public kg4(Context context, int i, phe phe, yzd yzd) {
        this.a = context;
        this.b = i;
        this.o = phe;
        this.c = yzd.a;
        this.w0 = yzd;
        c8d c8d = phe.X.j;
        bkb bkb = (bkb) phe.b;
        this.s0 = (qm) bkb.a;
        this.t0 = (k40) bkb.c;
        this.X = new adb(c8d, (e7g) this);
    }

    public static void b(kg4 kg4) {
        l7g l7g = kg4.c;
        String str = l7g.a;
        int i = kg4.Z;
        String str2 = x0;
        if (i < 2) {
            kg4.Z = 2;
            a14 u = a14.u();
            u.n(str2, "Stopping work for WorkSpec " + str);
            Context context = kg4.a;
            Class<SystemAlarmService> cls = SystemAlarmService.class;
            Intent intent = new Intent(context, cls);
            intent.setAction("ACTION_STOP_WORK");
            d73.d(intent, l7g);
            phe phe = kg4.o;
            int i2 = kg4.b;
            eo eoVar = new eo((Object) phe, (Object) intent, i2, 4);
            k40 k40 = kg4.t0;
            k40.execute(eoVar);
            if (phe.o.d(l7g.a)) {
                a14 u2 = a14.u();
                u2.n(str2, "WorkSpec " + str + " needs to be rescheduled");
                Intent intent2 = new Intent(context, cls);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                d73.d(intent2, l7g);
                k40.execute(new eo((Object) phe, (Object) intent2, i2, 4));
                return;
            }
            a14 u3 = a14.u();
            u3.n(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        a14 u4 = a14.u();
        u4.n(str2, "Already stopped work for " + str);
    }

    public final void a(List list) {
        this.s0.execute(new jg4(this, 0));
    }

    public final void c() {
        synchronized (this.Y) {
            try {
                this.X.x();
                this.o.c.a(this.c);
                PowerManager.WakeLock wakeLock = this.u0;
                if (wakeLock != null && wakeLock.isHeld()) {
                    a14 u = a14.u();
                    String str = x0;
                    u.n(str, "Releasing wakelock " + this.u0 + "for WorkSpec " + this.c);
                    this.u0.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        String str = this.c.a;
        this.u0 = qrf.a(this.a, zr6.j(rh4.o(str, " ("), this.b, ")"));
        String str2 = x0;
        a14.u().n(str2, "Acquiring wakelock " + this.u0 + "for WorkSpec " + str);
        this.u0.acquire();
        h8g l = this.o.X.c.y().l(str);
        if (l == null) {
            this.s0.execute(new jg4(this, 0));
            return;
        }
        boolean c2 = l.c();
        this.v0 = c2;
        if (!c2) {
            a14.u().n(str2, "No constraints for " + str);
            f(Collections.singletonList(l));
            return;
        }
        this.X.w(Collections.singletonList(l));
    }

    public final void e(boolean z) {
        a14 u = a14.u();
        StringBuilder sb = new StringBuilder("onExecuted ");
        l7g l7g = this.c;
        sb.append(l7g);
        sb.append(", ");
        sb.append(z);
        u.n(x0, sb.toString());
        c();
        Class<SystemAlarmService> cls = SystemAlarmService.class;
        int i = this.b;
        phe phe = this.o;
        k40 k40 = this.t0;
        Context context = this.a;
        if (z) {
            Intent intent = new Intent(context, cls);
            intent.setAction("ACTION_SCHEDULE_WORK");
            d73.d(intent, l7g);
            k40.execute(new eo((Object) phe, (Object) intent, i, 4));
        }
        if (this.v0) {
            Intent intent2 = new Intent(context, cls);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            k40.execute(new eo((Object) phe, (Object) intent2, i, 4));
        }
    }

    public final void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (ju0.n((h8g) it.next()).equals(this.c)) {
                this.s0.execute(new jg4(this, 1));
                return;
            }
        }
    }
}
