package defpackage;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.HttpStatus;

/* renamed from: mr7  reason: default package */
public final /* synthetic */ class mr7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ak6 b;

    public /* synthetic */ mr7(ak6 ak6, int i) {
        this.a = i;
        this.b = ak6;
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Object, pkg] */
    public final void run() {
        Class<le6> cls = le6.class;
        boolean z = false;
        int i = this.a;
        ak6 ak6 = this.b;
        ak6.getClass();
        switch (i) {
            case 0:
                hm9.m("ak6", "stop", new Object[0]);
                AtomicBoolean atomicBoolean = ak6.a;
                if (!atomicBoolean.get()) {
                    hm9.m("ak6", "stop: not started, return", new Object[0]);
                }
                atomicBoolean.set(false);
                me6 me6 = ak6.b;
                HashMap hashMap = me6.b;
                le6 le6 = (le6) hashMap.get(ak6);
                if (le6 != null) {
                    reg reg = me6.a;
                    reg.getClass();
                    String simpleName = cls.getSimpleName();
                    fp3.k(simpleName, "Listener type must not be empty");
                    reg.b(new hm7(le6, simpleName), 2418).j(ok4.X, oz7.X);
                    hashMap.remove(ak6);
                    return;
                }
                return;
            default:
                hm9.m("ak6", "start", new Object[0]);
                if (ak6.a.get()) {
                    hm9.m("ak6", "start: already started, return", new Object[0]);
                }
                if (!wmd.j(ak6.d, wmd.f)) {
                    hm9.m("ak6", "start: no permissions", new Object[0]);
                    ak6.c.U0();
                    return;
                }
                me6 me62 = ak6.b;
                kr7 a2 = ak6.a();
                me62.getClass();
                LocationRequest locationRequest = new LocationRequest();
                int i2 = a2.b;
                if (i2 != 0) {
                    int s = au1.s(i2);
                    int i3 = 105;
                    if (s != 0) {
                        if (s == 1) {
                            i3 = HttpStatus.SC_PROCESSING;
                        } else if (s != 2) {
                            Locale locale = Locale.ENGLISH;
                            int i4 = a2.b;
                            hm9.p("me6", "Unknown priority " + zr6.r(i4) + " set to PRIORITY_NO_POWER", (Throwable) null);
                        } else {
                            i3 = 100;
                        }
                    }
                    ay7.U(i3);
                    locationRequest.a = i3;
                }
                Long l = a2.c;
                if (l != null) {
                    long longValue = l.longValue();
                    fp3.g("intervalMillis must be greater than or equal to 0", longValue >= 0);
                    long j = locationRequest.c;
                    long j2 = locationRequest.b;
                    if (j == j2 / 6) {
                        locationRequest.c = longValue / 6;
                    }
                    if (locationRequest.t0 == j2) {
                        locationRequest.t0 = longValue;
                    }
                    locationRequest.b = longValue;
                }
                Long l2 = a2.d;
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    Object[] objArr = {l2};
                    if (longValue2 >= 0) {
                        z = true;
                    }
                    fp3.h(z, "illegal fastest interval: %d", objArr);
                    locationRequest.c = longValue2;
                }
                le6 le62 = new le6(ak6);
                reg reg2 = me62.a;
                reg2.getClass();
                Looper myLooper = Looper.myLooper();
                fp3.o(myLooper, "invalid null looper");
                rw4 rw4 = new rw4(myLooper, le62, cls.getSimpleName());
                td tdVar = new td(reg2, rw4);
                wva wva = new wva(tdVar, 18, locationRequest);
                ? obj = new Object();
                obj.a = wva;
                obj.c = tdVar;
                obj.o = rw4;
                obj.b = 2436;
                hm7 hm7 = (hm7) rw4.c;
                fp3.o(hm7, "Key must not be null");
                rw4 rw42 = (rw4) obj.o;
                int i5 = obj.b;
                bdb bdb = new bdb((pkg) obj, rw42, i5);
                nof nof = new nof(obj, hm7);
                fp3.o((hm7) rw42.c, "Listener has already been released.");
                ie6 ie6 = reg2.u0;
                ie6.getClass();
                qne qne = new qne();
                ie6.e(qne, i5, reg2);
                udg udg = new udg(new ieg(new vdg(bdb, nof), qne), ie6.t0.get(), reg2);
                fc9 fc9 = ie6.x0;
                fc9.sendMessage(fc9.obtainMessage(8, udg));
                me62.b.put(ak6, le62);
                ak6.a.set(true);
                return;
        }
    }
}
