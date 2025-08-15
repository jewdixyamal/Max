package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: sjg  reason: default package */
public final class sjg implements ServiceConnection {
    public final rjg X;
    public ComponentName Y;
    public final /* synthetic */ jkg Z;
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder o;

    public sjg(jkg jkg, rjg rjg) {
        this.Z = jkg;
        this.X = rjg;
    }

    public final void a(String str, Executor executor) {
        this.b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            jkg jkg = this.Z;
            xh3 xh3 = jkg.d;
            Context context = jkg.b;
            boolean c2 = xh3.c(context, str, this.X.a(context), this, 4225, executor);
            this.c = c2;
            if (c2) {
                this.Z.c.sendMessageDelayed(this.Z.c.obtainMessage(1, this.X), this.Z.f);
            } else {
                this.b = 2;
                try {
                    jkg jkg2 = this.Z;
                    jkg2.d.b(jkg2.b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.Z.a) {
            try {
                this.Z.c.removeMessages(1, this.X);
                this.o = iBinder;
                this.Y = componentName;
                for (ServiceConnection onServiceConnected : this.a.values()) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.Z.a) {
            try {
                this.Z.c.removeMessages(1, this.X);
                this.o = null;
                this.Y = componentName;
                for (ServiceConnection onServiceDisconnected : this.a.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
