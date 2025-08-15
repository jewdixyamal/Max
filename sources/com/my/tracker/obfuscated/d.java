package com.my.tracker.obfuscated;

import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class d {
    private final AtomicReference a = new AtomicReference();
    protected boolean b = false;

    public static final class a {
        public static final boolean a;

        static {
            boolean z;
            Class<mp> cls = mp.class;
            Class<lp> cls2 = lp.class;
            Class<kp> cls3 = kp.class;
            try {
                if (cls3.equals(cls3) && cls2.equals(cls2) && cls.equals(cls)) {
                    z = true;
                    a = z;
                }
            } catch (Throwable th) {
                if (th instanceof NoClassDefFoundError) {
                    y0.a("AppSetIdProvider: App Set library classes not found");
                } else {
                    y0.a("AppSetIdProvider: error occurred while working with App Set library classes", th);
                }
            }
            z = false;
            a = z;
        }
    }

    private void b(Context context) {
        ukg ukg;
        p0 a2 = p0.a(context);
        String c = a2.c();
        int d = a2.d();
        if (!TextUtils.isEmpty(c)) {
            this.a.set(new c(c, d));
        }
        if (!a.a) {
            y0.a("AppSetIdProvider: app set library is not available");
            return;
        }
        Executor a3 = h.a();
        if (a3 == null) {
            y0.b("AppSetIdProvider: background executor is not found");
            return;
        }
        try {
            b9b b9b = new b9b(context, 17);
            tjg tjg = (tjg) b9b.b;
            if (tjg.w0.b(tjg.v0, 212800000) == 0) {
                er0 er0 = new er0();
                er0.e = new pe5[]{np8.f};
                er0.d = new oq9(tjg);
                er0.c = false;
                er0.b = 27601;
                ukg = tjg.c(0, er0.a());
            } else {
                ukg = j1e.q(new ApiException(new Status(17, (String) null, (PendingIntent) null, (ph3) null)));
            }
            gpf gpf = new gpf(b9b);
            ukg.getClass();
            ukg.k(xne.a, gpf).d(a3, new id0((Object) this, d, (Object) a2, (Object) c));
        } catch (Throwable th) {
            y0.a("AppSetIdProvider: error occurred while trying to access app set id info", th);
        }
        a();
    }

    /* access modifiers changed from: private */
    public void a(int i, p0 p0Var, String str, mp mpVar) {
        int i2 = mpVar.b;
        if (i2 != i) {
            p0Var.a(i2);
        }
        String str2 = mpVar.a;
        if (!str2.equals(str)) {
            p0Var.f(str2);
            y0.a("AppSetIdProvider: new id value has been received: ".concat(str2));
        }
        if (TextUtils.isEmpty(str2) || i2 == -1) {
            this.a.set((Object) null);
        } else {
            this.a.set(new c(str2, i2));
        }
        synchronized (this.a) {
            this.a.notify();
        }
    }

    public c a(Context context) {
        if (!this.b) {
            b(context);
            this.b = true;
        }
        return (c) this.a.get();
    }

    private void a() {
        try {
            c cVar = (c) this.a.get();
            if (cVar != null) {
                y0.a("AppSetIdProvider: app set id has been collected, value: " + cVar.a);
                return;
            }
            synchronized (this.a) {
                this.a.wait(300);
            }
            y0.a("AppSetIdProvider: timeout for collecting id has exceeded");
        } catch (Throwable th) {
            y0.a("AppSetIdProvider: attempt to block thread retrieving app set id finished unsuccessfully", th);
        }
    }
}
