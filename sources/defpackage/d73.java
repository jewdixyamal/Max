package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: d73  reason: default package */
public final class d73 implements w45 {
    public static final String X = a14.O("CommandHandler");
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final bdb o;

    public d73(Context context, bdb bdb) {
        this.a = context;
        this.o = bdb;
    }

    public static l7g c(Intent intent) {
        return new l7g(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, l7g l7g) {
        intent.putExtra("KEY_WORKSPEC_ID", l7g.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", l7g.b);
    }

    public final void a(Intent intent, int i, phe phe) {
        List<yzd> list;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            a14.u().n(X, "Handling constraints changed " + intent);
            mj3 mj3 = new mj3(this.a, i, phe);
            ArrayList i2 = phe.X.c.y().i();
            String str = vi3.a;
            Iterator it = i2.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                kj3 kj3 = ((h8g) it.next()).j;
                z |= kj3.d;
                z2 |= kj3.b;
                z3 |= kj3.e;
                z4 |= kj3.a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = mj3.a;
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            adb adb = mj3.c;
            adb.w(i2);
            ArrayList arrayList = new ArrayList(i2.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = i2.iterator();
            while (it2.hasNext()) {
                h8g h8g = (h8g) it2.next();
                String str3 = h8g.a;
                if (currentTimeMillis >= h8g.a() && (!h8g.c() || adb.b(str3))) {
                    arrayList.add(h8g);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                h8g h8g2 = (h8g) it3.next();
                String str4 = h8g2.a;
                l7g n = ju0.n(h8g2);
                Intent intent3 = new Intent(context, SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, n);
                a14.u().n(mj3.d, zr6.i("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((k40) ((bkb) phe.b).c).execute(new eo((Object) phe, (Object) intent3, mj3.b, 4));
            }
            adb.x();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            a14.u().n(X, "Handling reschedule " + intent + ", " + i);
            phe.X.g();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
                a14.u().q(X, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                l7g c2 = c(intent);
                String str5 = X;
                a14.u().n(str5, "Handling schedule work for " + c2);
                WorkDatabase workDatabase = phe.X.c;
                workDatabase.c();
                try {
                    h8g l = workDatabase.y().l(c2.a);
                    if (l == null) {
                        a14.u().R(str5, "Skipping scheduling " + c2 + " because it's no longer in the DB");
                    } else if (l.b.a()) {
                        a14.u().R(str5, "Skipping scheduling " + c2 + "because it is finished.");
                    } else {
                        long a2 = l.a();
                        boolean c3 = l.c();
                        Context context2 = this.a;
                        if (!c3) {
                            a14.u().n(str5, "Setting up Alarms for " + c2 + "at " + a2);
                            mc.b(context2, workDatabase, c2, a2);
                        } else {
                            a14.u().n(str5, "Opportunistically setting an alarm for " + c2 + "at " + a2);
                            mc.b(context2, workDatabase, c2, a2);
                            Intent intent4 = new Intent(context2, SystemAlarmService.class);
                            intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                            ((k40) ((bkb) phe.b).c).execute(new eo((Object) phe, (Object) intent4, i, 4));
                        }
                        workDatabase.r();
                    }
                } finally {
                    workDatabase.l();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                synchronized (this.c) {
                    try {
                        l7g c4 = c(intent);
                        a14 u = a14.u();
                        String str6 = X;
                        u.n(str6, "Handing delay met for " + c4);
                        if (!this.b.containsKey(c4)) {
                            kg4 kg4 = new kg4(this.a, i, phe, this.o.o(c4));
                            this.b.put(c4, kg4);
                            kg4.d();
                        } else {
                            a14.u().n(str6, "WorkSpec " + c4 + " is is already being handled for ACTION_DELAY_MET");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                Bundle extras2 = intent.getExtras();
                String string = extras2.getString("KEY_WORKSPEC_ID");
                boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
                bdb bdb = this.o;
                if (containsKey) {
                    int i3 = extras2.getInt("KEY_WORKSPEC_GENERATION");
                    ArrayList arrayList2 = new ArrayList(1);
                    yzd j = bdb.j(new l7g(string, i3));
                    list = arrayList2;
                    if (j != null) {
                        arrayList2.add(j);
                        list = arrayList2;
                    }
                } else {
                    list = bdb.k(string);
                }
                for (yzd yzd : list) {
                    a14.u().n(X, wg0.i("Handing stopWork work for ", string));
                    s7g s7g = phe.X;
                    s7g.d.l(new k8e(s7g, yzd, false));
                    WorkDatabase workDatabase2 = phe.X.c;
                    l7g l7g = yzd.a;
                    String str7 = mc.a;
                    die v = workDatabase2.v();
                    cie x = v.x(l7g);
                    if (x != null) {
                        mc.a(this.a, l7g, x.c);
                        a14.u().n(mc.a, "Removing SystemIdInfo for workSpecId (" + l7g + ")");
                        ilc ilc = (ilc) v.a;
                        ilc.b();
                        zkc zkc = (zkc) v.c;
                        q36 f = zkc.f();
                        String str8 = l7g.a;
                        if (str8 == null) {
                            f.W(1);
                        } else {
                            f.f(1, str8);
                        }
                        f.j(2, (long) l7g.b);
                        ilc.c();
                        try {
                            f.n();
                            ilc.r();
                        } finally {
                            ilc.l();
                            zkc.t(f);
                        }
                    }
                    phe.b(yzd.a, false);
                }
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                l7g c5 = c(intent);
                boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
                a14.u().n(X, "Handling onExecutionCompleted " + intent + ", " + i);
                b(c5, z5);
            } else {
                a14.u().R(X, "Ignoring intent " + intent);
            }
        }
    }

    public final void b(l7g l7g, boolean z) {
        synchronized (this.c) {
            try {
                kg4 kg4 = (kg4) this.b.remove(l7g);
                this.o.j(l7g);
                if (kg4 != null) {
                    kg4.e(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
