package defpackage;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.PowerManager;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: i0e  reason: default package */
public final class i0e implements Runnable {
    public final /* synthetic */ int a = 1;
    public long b;
    public final Object c;
    public final Object o;

    public i0e(vk8 vk8) {
        this.o = vk8;
        this.c = new h0e(vk8, this);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.o).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() {
        try {
            return ((FirebaseMessaging) this.o).a() != null;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                vk8 vk8 = (vk8) this.o;
                ((m56) vk8.c).invoke((h0e) this.c);
                ((Handler) vk8.k).removeCallbacks(this);
                ((Handler) vk8.k).postDelayed(this, 1000);
                this.b++;
                return;
            case 1:
                c8d r = c8d.r();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.o;
                boolean v = r.v(firebaseMessaging.b);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.c;
                if (v) {
                    wakeLock.acquire();
                }
                try {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.i = true;
                    }
                    if (!firebaseMessaging.h.i()) {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                        }
                        if (!c8d.r().v(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    } else if (!c8d.r().u(firebaseMessaging.b) || a()) {
                        if (b()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                        } else {
                            firebaseMessaging.h(this.b);
                        }
                        if (!c8d.r().v(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    } else {
                        an anVar = new an();
                        anVar.b = this;
                        ((FirebaseMessaging) ((i0e) anVar.b).o).b.registerReceiver(anVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!c8d.r().v(firebaseMessaging.b)) {
                            return;
                        }
                        wakeLock.release();
                        return;
                    }
                } catch (IOException e) {
                    try {
                        e.getMessage();
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!c8d.r().v(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        if (c8d.r().v(firebaseMessaging.b)) {
                            wakeLock.release();
                        }
                        throw th;
                    }
                }
                break;
            default:
                if (!((t0f) this.o).o) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    ((t0f) this.o).getClass();
                    long a2 = xtc.a(timeUnit);
                    long j = this.b;
                    if (j > a2) {
                        try {
                            Thread.sleep(j - a2);
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            j47.Z(e2);
                            return;
                        }
                    }
                    if (!((t0f) this.o).o) {
                        ((Runnable) this.c).run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public i0e(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cm9("firebase-iid-executor", 0));
        this.o = firebaseMessaging;
        this.b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public i0e(Runnable runnable, t0f t0f, long j) {
        this.c = runnable;
        this.o = t0f;
        this.b = j;
    }
}
