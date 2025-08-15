package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: uhe  reason: default package */
public final class uhe implements e7g, w45 {
    public static final String u0 = a14.O("SystemFgDispatcher");
    public final LinkedHashMap X;
    public final HashMap Y;
    public final HashSet Z;
    public final s7g a;
    public final wne b;
    public final Object c = new Object();
    public l7g o;
    public final adb s0;
    public the t0;

    public uhe(Context context) {
        s7g d = s7g.d(context);
        this.a = d;
        this.b = d.d;
        this.o = null;
        this.X = new LinkedHashMap();
        this.Z = new HashSet();
        this.Y = new HashMap();
        this.s0 = new adb(d.j, (e7g) this);
        d.f.a(this);
    }

    public static Intent c(Context context, l7g l7g, ay5 ay5) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", ay5.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ay5.b);
        intent.putExtra("KEY_NOTIFICATION", ay5.c);
        intent.putExtra("KEY_WORKSPEC_ID", l7g.a);
        intent.putExtra("KEY_GENERATION", l7g.b);
        return intent;
    }

    public static Intent d(Context context, l7g l7g, ay5 ay5) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", l7g.a);
        intent.putExtra("KEY_GENERATION", l7g.b);
        intent.putExtra("KEY_NOTIFICATION_ID", ay5.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ay5.b);
        intent.putExtra("KEY_NOTIFICATION", ay5.c);
        return intent;
    }

    public final void a(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                h8g h8g = (h8g) it.next();
                String str = h8g.a;
                a14.u().n(u0, wg0.i("Constraints unmet for WorkSpec ", str));
                l7g n = ju0.n(h8g);
                s7g s7g = this.a;
                s7g.d.l(new k8e(s7g, new yzd(n), true));
            }
        }
    }

    public final void b(l7g l7g, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                h8g h8g = (h8g) this.Y.remove(l7g);
                if (h8g != null ? this.Z.remove(h8g) : false) {
                    this.s0.w(this.Z);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ay5 ay5 = (ay5) this.X.remove(l7g);
        if (l7g.equals(this.o) && this.X.size() > 0) {
            Iterator it = this.X.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.o = (l7g) entry.getKey();
            if (this.t0 != null) {
                ay5 ay52 = (ay5) entry.getValue();
                the the = this.t0;
                SystemForegroundService systemForegroundService = (SystemForegroundService) the;
                systemForegroundService.b.post(new vhe(systemForegroundService, ay52.a, ay52.c, ay52.b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.t0;
                systemForegroundService2.b.post(new zj0(ay52.a, 3, systemForegroundService2));
            }
        }
        the the2 = this.t0;
        if (ay5 != null && the2 != null) {
            a14 u = a14.u();
            String str = u0;
            u.n(str, "Removing Notification (id: " + ay5.a + ", workSpecId: " + l7g + ", notificationType: " + ay5.b);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) the2;
            systemForegroundService3.b.post(new zj0(ay5.a, 3, systemForegroundService3));
        }
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        l7g l7g = new l7g(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        a14 u = a14.u();
        StringBuilder sb = new StringBuilder("Notifying with (id:");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType :");
        u.n(u0, zr6.j(sb, intExtra2, ")"));
        if (notification != null && this.t0 != null) {
            ay5 ay5 = new ay5(intExtra, notification, intExtra2);
            LinkedHashMap linkedHashMap = this.X;
            linkedHashMap.put(l7g, ay5);
            if (this.o == null) {
                this.o = l7g;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.t0;
                systemForegroundService.b.post(new vhe(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.t0;
            systemForegroundService2.b.post(new eo((Object) systemForegroundService2, intExtra, (Object) notification, 5));
            if (intExtra2 != 0) {
                for (Map.Entry value : linkedHashMap.entrySet()) {
                    i |= ((ay5) value.getValue()).b;
                }
                ay5 ay52 = (ay5) linkedHashMap.get(this.o);
                if (ay52 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.t0;
                    systemForegroundService3.b.post(new vhe(systemForegroundService3, ay52.a, ay52.c, i));
                }
            }
        }
    }

    public final void f(List list) {
    }

    public final void g() {
        this.t0 = null;
        synchronized (this.c) {
            this.s0.x();
        }
        this.a.f.e(this);
    }
}
