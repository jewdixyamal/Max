package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;

/* renamed from: ll5  reason: default package */
public final /* synthetic */ class ll5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ ll5(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    public final void run() {
        ukg ukg;
        int i;
        switch (this.a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.b;
                if (firebaseMessaging.e.q() && firebaseMessaging.i(firebaseMessaging.e())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.i) {
                            firebaseMessaging.h(0);
                        }
                    }
                    return;
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging2 = this.b;
                Context context = firebaseMessaging2.b;
                tpa.x(context);
                boolean g = firebaseMessaging2.g();
                SharedPreferences q = v3c.q(context);
                if (!q.contains("proxy_retention") || q.getBoolean("proxy_retention", false) != g) {
                    goc goc = (goc) firebaseMessaging2.c.c;
                    if (goc.c.g() >= 241100000) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("proxy_retention", g);
                        pkg f = pkg.f(goc.b);
                        synchronized (f) {
                            i = f.b;
                            f.b = i + 1;
                        }
                        ukg = f.h(new ckg(i, 4, bundle, 0));
                    } else {
                        ukg = j1e.q(new IOException("SERVICE_NOT_AVAILABLE"));
                    }
                    ukg.d(new cs(2), new npb(0, context, g));
                }
                if (firebaseMessaging2.g()) {
                    firebaseMessaging2.f();
                    return;
                }
                return;
        }
    }
}
