package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: ml5  reason: default package */
public final /* synthetic */ class ml5 implements x3a {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ ml5(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    public final void a(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                uxe uxe = (uxe) obj;
                if (this.b.e.q() && uxe.h.a() != null) {
                    synchronized (uxe) {
                        z = uxe.g;
                    }
                    if (!z) {
                        uxe.f(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                r43 r43 = (r43) obj;
                re6 re6 = FirebaseMessaging.k;
                FirebaseMessaging firebaseMessaging = this.b;
                firebaseMessaging.getClass();
                if (r43 != null) {
                    m6d.v(r43.a);
                    firebaseMessaging.f();
                    return;
                }
                return;
        }
    }
}
