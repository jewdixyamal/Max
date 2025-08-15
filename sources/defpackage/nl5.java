package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: nl5  reason: default package */
public final /* synthetic */ class nl5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;
    public final /* synthetic */ qne c;

    public /* synthetic */ nl5(FirebaseMessaging firebaseMessaging, qne qne, int i) {
        this.a = i;
        this.b = firebaseMessaging;
        this.c = qne;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.b;
                qne qne = this.c;
                re6 re6 = FirebaseMessaging.k;
                firebaseMessaging.getClass();
                try {
                    bwf bwf = firebaseMessaging.c;
                    bwf.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    j1e.b(bwf.g(bwf.n(jjf.h((fl5) bwf.a), "*", bundle)));
                    re6 c2 = FirebaseMessaging.c(firebaseMessaging.b);
                    String d = firebaseMessaging.d();
                    String h = jjf.h(firebaseMessaging.a);
                    synchronized (c2) {
                        String m0 = re6.m0(d, h);
                        SharedPreferences.Editor edit = ((SharedPreferences) c2.b).edit();
                        edit.remove(m0);
                        edit.commit();
                    }
                    qne.b((Object) null);
                    return;
                } catch (Exception e) {
                    qne.a(e);
                    return;
                }
            default:
                qne qne2 = this.c;
                re6 re62 = FirebaseMessaging.k;
                FirebaseMessaging firebaseMessaging2 = this.b;
                firebaseMessaging2.getClass();
                try {
                    qne2.b(firebaseMessaging2.a());
                    return;
                } catch (Exception e2) {
                    qne2.a(e2);
                    return;
                }
        }
    }
}
