package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: goc  reason: default package */
public final class goc {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final qpd a = new qpd(0);
    public final Context b;
    public final l2a c;
    public final ScheduledThreadPoolExecutor d;
    public final Messenger e;
    public Messenger f;
    public sgg g;

    public goc(Context context) {
        this.b = context;
        this.c = new l2a(context);
        this.e = new Messenger(new hfg(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final ukg a(Bundle bundle) {
        String num;
        synchronized (goc.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        qne qne = new qne();
        synchronized (this.a) {
            this.a.put(num, qne);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.h() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (goc.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, cfg.a);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.e);
        if (!(this.f == null && this.g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.g.a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
            }
            qne.a.b(ok4.o, new cjg(this, num, this.d.schedule(new gwe(14, (Object) qne), 30, TimeUnit.SECONDS)));
            return qne.a;
        }
        if (this.c.h() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        qne.a.b(ok4.o, new cjg(this, num, this.d.schedule(new gwe(14, (Object) qne), 30, TimeUnit.SECONDS)));
        return qne.a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                qne qne = (qne) this.a.remove(str);
                if (qne != null) {
                    qne.b(bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
