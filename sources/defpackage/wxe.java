package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.view.View;
import java.io.IOException;

/* renamed from: wxe  reason: default package */
public final class wxe implements Runnable {
    public static final Object Z = new Object();
    public static Boolean s0;
    public static Boolean t0;
    public final Object X;
    public final Object Y;
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;
    public final Object o;

    public wxe(View view, y6c y6c, View view2, v6c v6c, v5c v5c, long j) {
        this.c = y6c;
        this.o = view2;
        this.X = v6c;
        this.Y = v5c;
        this.b = j;
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (Z) {
            try {
                Boolean bool = t0;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                t0 = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context) {
        boolean booleanValue;
        synchronized (Z) {
            try {
                Boolean bool = s0;
                booleanValue = bool == null ? bool != null ? bool.booleanValue() : context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                s0 = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public synchronized boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.c).getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [vxe, android.content.BroadcastReceiver] */
    public final void run() {
        switch (this.a) {
            case 0:
                uxe uxe = (uxe) this.Y;
                Context context = (Context) this.c;
                boolean b2 = b(context);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.X;
                if (b2) {
                    wakeLock.acquire(mi3.a);
                }
                try {
                    uxe.d(true);
                    if (!((jjf) this.o).i()) {
                        uxe.d(false);
                        if (!b(context)) {
                            return;
                        }
                    } else if (!a(context) || c()) {
                        if (uxe.e()) {
                            uxe.d(false);
                        } else {
                            uxe.f(this.b);
                        }
                        if (!b(context)) {
                            return;
                        }
                    } else {
                        ? broadcastReceiver = new BroadcastReceiver();
                        broadcastReceiver.a = this;
                        context.registerReceiver(broadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!b(context)) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    e.getMessage();
                    uxe.d(false);
                    if (!b(context)) {
                        return;
                    }
                } catch (Throwable th) {
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                        }
                    }
                    throw th;
                }
                try {
                    wakeLock.release();
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            default:
                Rect c2 = y6c.c((y6c) this.c, (View) this.o);
                if (c2 != null) {
                    String str = ((y6c) this.c).d;
                    ir6 ir6 = hm9.m;
                    if (ir6 != null && ir6.c()) {
                        us7 us7 = us7.X;
                        long j = this.b;
                        ir6.d(us7, str, "Play reaction effect without pending, reaction:" + ((v5c) this.Y) + ", l:" + j, (Throwable) null);
                    }
                    v6c v6c = (v6c) this.X;
                    y6c.d((y6c) this.c, v6c.b, v6c.a, c2);
                    return;
                }
                return;
        }
    }

    public wxe(uxe uxe, Context context, jjf jjf, long j) {
        this.Y = uxe;
        this.c = context;
        this.b = j;
        this.o = jjf;
        this.X = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
