package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.IBinder;
import java.util.HashMap;
import java.util.List;

/* renamed from: xo4  reason: default package */
public abstract class xo4 extends Service {
    public static final HashMap t0 = new HashMap();
    public int X;
    public boolean Y;
    public boolean Z;
    public final String a = null;
    public final int b = 0;
    public final int c = 0;
    public wo4 o;
    public boolean s0;

    public static void a(xo4 xo4, List list) {
        xo4.getClass();
    }

    public static boolean b(int i) {
        return i == 2 || i == 5 || i == 7;
    }

    public final void c() {
        wo4 wo4 = this.o;
        wo4.getClass();
        if (!wo4.b.k) {
            if (oaf.a >= 28 || !this.Z) {
                this.s0 |= stopSelfResult(this.X);
                return;
            }
            stopSelf();
            this.s0 = true;
        }
    }

    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        String str = this.a;
        if (str != null && oaf.a >= 26) {
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            notificationManager.getClass();
            NotificationChannel notificationChannel = new NotificationChannel(str, getString(this.b), 2);
            int i = this.c;
            if (i != 0) {
                notificationChannel.setDescription(getString(i));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
        Class<?> cls = getClass();
        HashMap hashMap = t0;
        wo4 wo4 = (wo4) hashMap.get(cls);
        boolean z = true;
        if (wo4 == null) {
            int i2 = oaf.a;
            so4 so4 = (so4) u88.a.getAccessor().c(so4.class);
            so4.c(false);
            wo4 wo42 = new wo4(getApplicationContext(), so4, false, cls);
            hashMap.put(cls, wo42);
            wo4 = wo42;
        }
        this.o = wo4;
        if (wo4.e != null) {
            z = false;
        }
        fm9.k(z);
        wo4.e = this;
        if (wo4.b.h) {
            oaf.p((hl4) null).postAtFrontOfQueue(new kl4((Object) wo4, 2, (Object) this));
        }
    }

    public final void onDestroy() {
        wo4 wo4 = this.o;
        wo4.getClass();
        boolean z = false;
        if (wo4.e == this) {
            z = true;
        }
        fm9.k(z);
        wo4.e = null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        String str2;
        this.X = i2;
        this.Z = false;
        if (intent != null) {
            str2 = intent.getAction();
            str = intent.getStringExtra("content_id");
            this.Y |= intent.getBooleanExtra("foreground", false) || "androidx.media3.exoplayer.downloadService.action.RESTART".equals(str2);
        } else {
            str2 = null;
            str = null;
        }
        if (str2 == null) {
            str2 = "androidx.media3.exoplayer.downloadService.action.INIT";
        }
        wo4 wo4 = this.o;
        wo4.getClass();
        so4 so4 = wo4.b;
        char c2 = 65535;
        switch (str2.hashCode()) {
            case -2068303304:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1192305801:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD")) {
                    c2 = 1;
                    break;
                }
                break;
            case -659421309:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.RESTART")) {
                    c2 = 2;
                    break;
                }
                break;
            case -238450692:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.INIT")) {
                    c2 = 3;
                    break;
                }
                break;
            case 32678949:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS")) {
                    c2 = 4;
                    break;
                }
                break;
            case 464223742:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS")) {
                    c2 = 5;
                    break;
                }
                break;
            case 829812082:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD")) {
                    c2 = 6;
                    break;
                }
                break;
            case 845668953:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1746253622:
                if (str2.equals("androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS")) {
                    c2 = 8;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                intent.getClass();
                if (intent.hasExtra("stop_reason")) {
                    int intExtra = intent.getIntExtra("stop_reason", 0);
                    so4.f++;
                    so4.c.obtainMessage(4, intExtra, 0, str).sendToTarget();
                    break;
                } else {
                    z04.u("Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                }
            case 1:
                if (str != null) {
                    so4.f++;
                    so4.c.obtainMessage(8, str).sendToTarget();
                    break;
                } else {
                    z04.u("Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                }
            case 2:
            case 3:
                break;
            case 4:
                so4.c(false);
                break;
            case 5:
                so4.f++;
                so4.c.obtainMessage(9).sendToTarget();
                break;
            case 6:
                intent.getClass();
                vo4 vo4 = (vo4) intent.getParcelableExtra("download_request");
                if (vo4 != null) {
                    int intExtra2 = intent.getIntExtra("stop_reason", 0);
                    so4.f++;
                    so4.c.obtainMessage(7, intExtra2, 0, vo4).sendToTarget();
                    break;
                } else {
                    z04.u("Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                }
            case 7:
                intent.getClass();
                zhc zhc = (zhc) intent.getParcelableExtra("requirements");
                if (zhc != null) {
                    if (!zhc.equals((zhc) so4.m.d)) {
                        gb0 gb0 = so4.m;
                        an anVar = (an) gb0.f;
                        anVar.getClass();
                        Context context = (Context) gb0.a;
                        context.unregisterReceiver(anVar);
                        gb0.f = null;
                        if (oaf.a >= 24 && ((bic) gb0.g) != null) {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            connectivityManager.getClass();
                            bic bic = (bic) gb0.g;
                            bic.getClass();
                            connectivityManager.unregisterNetworkCallback(bic);
                            gb0.g = null;
                        }
                        gb0 gb02 = new gb0(so4.a, so4.d, zhc);
                        so4.m = gb02;
                        so4.b(so4.m, gb02.d());
                        break;
                    }
                } else {
                    z04.u("Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                }
                break;
            case 8:
                so4.c(true);
                break;
            default:
                z04.u("Ignored unrecognized action: ".concat(str2));
                break;
        }
        int i3 = oaf.a;
        this.s0 = false;
        if (so4.g == 0 && so4.f == 0) {
            c();
        }
        return 1;
    }

    public final void onTaskRemoved(Intent intent) {
        this.Z = true;
    }
}
