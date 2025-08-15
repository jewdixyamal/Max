package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* renamed from: p8g  reason: default package */
public abstract class p8g {
    public static final String a = a14.O("WorkerFactory");

    public abstract gm7 a(Context context, String str, WorkerParameters workerParameters);

    public final gm7 b(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        String str2 = a;
        gm7 a2 = a(context, str, workerParameters);
        if (a2 == null) {
            try {
                cls = Class.forName(str).asSubclass(gm7.class);
            } catch (Throwable th) {
                a14 u = a14.u();
                u.r(str2, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a2 = (gm7) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    a14 u2 = a14.u();
                    u2.r(str2, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a2 == null || !a2.isUsed()) {
            return a2;
        }
        throw new IllegalStateException(k7d.j("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
