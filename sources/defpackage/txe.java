package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: txe  reason: default package */
public final /* synthetic */ class txe implements Callable {
    public final /* synthetic */ bwf X;
    public final /* synthetic */ Context a;
    public final /* synthetic */ ScheduledExecutorService b;
    public final /* synthetic */ FirebaseMessaging c;
    public final /* synthetic */ jjf o;

    public /* synthetic */ txe(Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, FirebaseMessaging firebaseMessaging, jjf jjf, bwf bwf) {
        this.a = context;
        this.b = scheduledThreadPoolExecutor;
        this.c = firebaseMessaging;
        this.o = jjf;
        this.X = bwf;
    }

    public final Object call() {
        sxe sxe;
        Context context = this.a;
        ScheduledExecutorService scheduledExecutorService = this.b;
        FirebaseMessaging firebaseMessaging = this.c;
        jjf jjf = this.o;
        bwf bwf = this.X;
        synchronized (sxe.class) {
            try {
                WeakReference weakReference = sxe.c;
                sxe = weakReference != null ? (sxe) weakReference.get() : null;
                if (sxe == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    sxe sxe2 = new sxe(sharedPreferences, (ScheduledThreadPoolExecutor) scheduledExecutorService);
                    synchronized (sxe2) {
                        sxe2.a = o23.f(sharedPreferences, (ScheduledThreadPoolExecutor) scheduledExecutorService);
                    }
                    sxe.c = new WeakReference(sxe2);
                    sxe = sxe2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return new uxe(firebaseMessaging, jjf, sxe, bwf, context, (ScheduledThreadPoolExecutor) scheduledExecutorService);
    }
}
