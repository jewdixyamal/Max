package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;

/* renamed from: xe6  reason: default package */
public final class xe6 implements u8e {
    public final Context a;
    public final String b = xe6.class.getName();
    public final khe c;
    public int d;
    public int e;
    public final String f;

    public xe6(Context context, je7 je7, je7 je72) {
        this.a = context;
        this.c = new khe(new a81(this, je72, je7, 3));
        this.d = -1;
        this.e = -1;
        this.f = "Google Play Services";
    }

    public final boolean a() {
        if (this.d == -1) {
            this.d = ee6.d.b(this.a, fe6.a);
        }
        return this.d == 0;
    }

    public final Object b(tie tie) {
        FirebaseMessaging instance;
        if (a()) {
            lqc lqc = new lqc(v3c.u(tie));
            re6 re6 = FirebaseMessaging.k;
            synchronized (FirebaseMessaging.class) {
                instance = FirebaseMessaging.getInstance(fl5.b());
            }
            instance.getClass();
            qne qne = new qne();
            instance.f.execute(new nl5(instance, qne, 1));
            qne.a.i(new qz7((Object) this, 21, (Object) lqc));
            return lqc.a();
        }
        throw new StoreServicesInfo$ServicesNotAvailableException();
    }
}
