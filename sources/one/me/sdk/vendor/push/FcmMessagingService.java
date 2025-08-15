package one.me.sdk.vendor.push;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/sdk/vendor/push/FcmMessagingService;", "", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "google_release"}, k = 1, mv = {2, 0, 0})
public final class FcmMessagingService extends FirebaseMessagingService {
    public final String s0 = "FCM";

    public final void c() {
        hm9.m(this.s0, "onDeletedMessages", new Object[0]);
        zke zke = (zke) ((b99) bcf.a.getAccessor().c(b99.class));
        hm9.m(zke.i, "onDeletedMessages", new Object[0]);
        zke.a().a().f(false, true);
        ((ad) zke.c.getValue()).f("FCM_ON_DELETED_MESSAGES");
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [qpd, us] */
    public final void d(wfc wfc) {
        long j;
        hm9.m(this.s0, "onMessageReceived", new Object[0]);
        b99 b99 = (b99) bcf.a.getAccessor().c(b99.class);
        us usVar = wfc.b;
        Bundle bundle = wfc.a;
        if (usVar == null) {
            ? qpd = new qpd(0);
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        qpd.put(next, str);
                    }
                }
            }
            wfc.b = qpd;
        }
        us usVar2 = wfc.b;
        Object obj2 = bundle.get("google.sent_time");
        if (obj2 instanceof Long) {
            j = ((Long) obj2).longValue();
        } else {
            if (obj2 instanceof String) {
                try {
                    j = Long.parseLong((String) obj2);
                } catch (NumberFormatException unused) {
                    Objects.toString(obj2);
                }
            }
            j = 0;
        }
        zke zke = (zke) b99;
        j47.T(zke.h, (lx3) null, (vx3) null, new yke(usVar2, zke, j, (Continuation) null), 3);
    }

    public final void e(String str) {
        hm9.m(this.s0, "onNewToken", new Object[0]);
        zke zke = (zke) ((b99) bcf.a.getAccessor().c(b99.class));
        ((hyc) ((q33) zke.d.getValue())).m("user.fcmToken", str);
        if (str.length() > 0 && ((f5a) zke.e.getValue()).d()) {
            ((k4a) ((pk) zke.f.getValue())).s();
        }
    }
}
