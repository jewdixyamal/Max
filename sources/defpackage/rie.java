package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Executors;
import kotlin.coroutines.Continuation;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;

/* renamed from: rie  reason: default package */
public final class rie extends ffe implements a66 {
    public int X;
    public final /* synthetic */ xie Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rie(xie xie, Continuation continuation) {
        super(2, continuation);
        this.Y = xie;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rie) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rie(this.Y, continuation);
    }

    public final Object o(Object obj) {
        FirebaseMessaging instance;
        ukg ukg;
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        xie xie = this.Y;
        if (i == 0) {
            od2.a0(obj);
            u8e g = xie.g();
            this.X = 1;
            xe6 xe6 = (xe6) g;
            if (xe6.a()) {
                lqc lqc = new lqc(v3c.u(this));
                re6 re6 = FirebaseMessaging.k;
                synchronized (FirebaseMessaging.class) {
                    instance = FirebaseMessaging.getInstance(fl5.b());
                }
                if (instance.e() == null) {
                    ukg = j1e.r((Object) null);
                } else {
                    qne qne = new qne();
                    Executors.newSingleThreadExecutor(new cm9("Firebase-Messaging-Network-Io", 0)).execute(new nl5(instance, qne, 0));
                    ukg = qne.a;
                }
                ukg.i(new ph4((Object) lqc, (Object) xe6));
                Object a = lqc.a();
                if (a != tx3) {
                    a = e5f;
                }
                if (a == tx3) {
                    return tx3;
                }
            } else {
                throw new StoreServicesInfo$ServicesNotAvailableException();
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((hyc) xie.b()).m("user.fcmToken", (String) null);
        ((hyc) xie.b()).m("user.pushDeviceType", (String) null);
        return e5f;
    }
}
