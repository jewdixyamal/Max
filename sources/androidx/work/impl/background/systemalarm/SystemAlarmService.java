package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;

public class SystemAlarmService extends hh7 implements ohe {
    public static final String o = a14.O("SystemAlarmService");
    public phe b;
    public boolean c;

    public final void a() {
        this.c = true;
        a14.u().n(o, "All commands completed in dispatcher");
        String str = qrf.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (rrf.a) {
            linkedHashMap.putAll(rrf.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                a14 u = a14.u();
                String str3 = qrf.a;
                u.R(str3, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    public final void onCreate() {
        super.onCreate();
        phe phe = new phe(this);
        this.b = phe;
        if (phe.t0 != null) {
            a14.u().q(phe.u0, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            phe.t0 = this;
        }
        this.c = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        phe phe = this.b;
        phe.getClass();
        a14.u().n(phe.u0, "Destroying SystemAlarmDispatcher");
        phe.o.e(phe);
        phe.t0 = null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            a14.u().x(o, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            phe phe = this.b;
            phe.getClass();
            a14 u = a14.u();
            String str = phe.u0;
            u.n(str, "Destroying SystemAlarmDispatcher");
            phe.o.e(phe);
            phe.t0 = null;
            phe phe2 = new phe(this);
            this.b = phe2;
            if (phe2.t0 != null) {
                a14.u().q(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                phe2.t0 = this;
            }
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.a(intent, i2);
        return 3;
    }
}
