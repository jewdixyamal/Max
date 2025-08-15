package ru.ok.messages.analytics;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.PowerManager;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ok/messages/analytics/DailyAnalyticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lad;", "analytics", "Lep;", "appNotifications", "Lgh3;", "connectionInfo", "Lti4;", "deviceInfo", "Lu8e;", "storeServicesInfo", "Laua;", "permissionStats", "Lje7;", "Lk24;", "dataManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lad;Lep;Lgh3;Lti4;Lu8e;Laua;Lje7;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class DailyAnalyticsWorker extends Worker {
    public static final qec t0 = new qec("\\s+");
    public final ti4 X;
    public final u8e Y;
    public final aua Z;
    public final ad b;
    public final ep c;
    public final gh3 o;
    public final je7 s0;

    public DailyAnalyticsWorker(Context context, WorkerParameters workerParameters, ad adVar, ep epVar, gh3 gh3, ti4 ti4, u8e u8e, aua aua, je7 je7) {
        super(context, workerParameters);
        this.b = adVar;
        this.c = epVar;
        this.o = gh3;
        this.X = ti4;
        this.Y = u8e;
        this.Z = aua;
        this.s0 = je7;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v12, types: [e47, java.lang.Object] */
    public final fm7 b() {
        UUID id = getId();
        hm9.m("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + id + " started", new Object[0]);
        aua aua = this.Z;
        aua.getClass();
        ky7 ky7 = new ky7();
        kl7 l = j1e.l();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            ky7 ky72 = new ky7();
            ky72.put("pType", "push");
            ky72.put("pStatus", aua.c(aua.d));
            l.add(ky72.b());
        }
        ky7 ky73 = new ky7();
        ky73.put("pType", "contacts");
        ky73.put("pStatus", aua.c(aua.e));
        l.add(ky73.b());
        ky7 ky74 = new ky7();
        ky74.put("pType", "gallery");
        dua dua = aua.f;
        ky74.put("pStatus", i < 34 ? aua.c(dua) : dua.j() ? "allowed" : aua.g.j() ? "partial" : "denied");
        l.add(ky74.b());
        ky7 ky75 = new ky7();
        ky75.put("pType", "camera");
        ky75.put("pStatus", aua.c(aua.h));
        l.add(ky75.b());
        ky7 ky76 = new ky7();
        ky76.put("pType", "microphone");
        ky76.put("pStatus", aua.c(aua.i));
        l.add(ky76.b());
        ky7 ky77 = new ky7();
        ky77.put("pType", "geo");
        ky77.put("pStatus", aua.c(aua.j));
        l.add(ky77.b());
        ky7.put("permissions", j1e.d(l));
        aua.d("permission_status", ky7.b());
        String str = "0";
        String str2 = jv9.a(this.c.a().j(false).b) ? "1" : str;
        ad adVar = this.b;
        adVar.g("ACTION_ARE_NOTIFICATIONS_ENABLED", str2);
        dt2 c2 = ((k24) this.s0.getValue()).b.c();
        c2.getClass();
        xlc a = xlc.a(0, "SELECT COUNT(*) FROM chats");
        ilc ilc = c2.a;
        ilc.b();
        Cursor o2 = ilc.o(a, (CancellationSignal) null);
        try {
            long j = o2.moveToFirst() ? o2.getLong(0) : 0;
            o2.close();
            a.n();
            String str3 = this.o.a() ? "1" : str;
            String valueOf = String.valueOf(j);
            if (!adVar.a().c()) {
                ? obj = new Object();
                obj.c = "ACTION";
                obj.o = "ACTION_IS_BACKGROUND_DATA_ENABLED";
                obj.a(str3, "value");
                obj.a(valueOf, "param1");
                adVar.j(obj.c());
            }
            ti4 ti4 = this.X;
            Context context = ti4.a;
            if (ti4.d == null) {
                ti4.d = (PowerManager) context.getSystemService("power");
            }
            boolean isIgnoringBatteryOptimizations = ti4.d.isIgnoringBatteryOptimizations(context.getPackageName());
            hm9.m("ri4", "isIgnoringBatteryOptimizations: " + isIgnoringBatteryOptimizations, new Object[0]);
            adVar.g("ACTION_IS_IGNORING_BATTERY_OPTIMIZATIONS", isIgnoringBatteryOptimizations ? "1" : str);
            xe6 xe6 = (xe6) this.Y;
            String str4 = xe6.f;
            if (xe6.a()) {
                str = "1";
            }
            adVar.g("ARE_SERVICES_AVAILABLE", t0.b("_", rh4.j(str4, "-", str).toLowerCase(Locale.ENGLISH)));
            UUID id2 = getId();
            hm9.m("ru.ok.messages.analytics.DailyAnalyticsWorker", "work " + id2 + " finished", new Object[0]);
            return fm7.b();
        } catch (Throwable th) {
            o2.close();
            a.n();
            throw th;
        }
    }
}
