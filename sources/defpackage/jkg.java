package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: jkg  reason: default package */
public final class jkg {
    public static final Object h = new Object();
    public static jkg i;
    public static HandlerThread j;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile fc9 c;
    public final xh3 d;
    public final long e;
    public final long f;
    public volatile Executor g;

    public jkg(Context context, Looper looper) {
        fud fud = new fud(2, this);
        this.b = context.getApplicationContext();
        fc9 fc9 = new fc9(looper, (Handler.Callback) fud, 5);
        Looper.getMainLooper();
        this.c = fc9;
        this.d = xh3.a();
        this.e = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        this.f = 300000;
        this.g = null;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        rjg rjg = new rjg(str, z);
        fp3.o(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                sjg sjg = (sjg) this.a.get(rjg);
                if (sjg == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(rjg.toString()));
                } else if (sjg.a.containsKey(serviceConnection)) {
                    sjg.a.remove(serviceConnection);
                    if (sjg.a.isEmpty()) {
                        this.c.sendMessageDelayed(this.c.obtainMessage(0, rjg), this.e);
                    }
                } else {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(rjg.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(rjg rjg, ehg ehg, String str) {
        boolean z;
        synchronized (this.a) {
            try {
                sjg sjg = (sjg) this.a.get(rjg);
                Executor executor = this.g;
                if (sjg == null) {
                    sjg = new sjg(this, rjg);
                    sjg.a.put(ehg, ehg);
                    sjg.a(str, executor);
                    this.a.put(rjg, sjg);
                } else {
                    this.c.removeMessages(0, rjg);
                    if (!sjg.a.containsKey(ehg)) {
                        sjg.a.put(ehg, ehg);
                        int i2 = sjg.b;
                        if (i2 == 1) {
                            ehg.onServiceConnected(sjg.Y, sjg.o);
                        } else if (i2 == 2) {
                            sjg.a(str, executor);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(rjg.toString()));
                    }
                }
                z = sjg.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
