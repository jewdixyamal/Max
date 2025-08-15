package defpackage;

import android.os.Build;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: xw9  reason: default package */
public final class xw9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xw9(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.Y = notificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((xw9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xw9 xw9 = new xw9(continuation, this.Y);
        xw9.X = obj;
        return xw9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (((Boolean) this.X).booleanValue()) {
            NotificationsSettingsScreen notificationsSettingsScreen = this.Y;
            eua eua = (eua) notificationsSettingsScreen.o.getValue();
            l5g l5g = new l5g(notificationsSettingsScreen, 1);
            if (Build.VERSION.SDK_INT >= 33) {
                eua.d(l5g, eua.k, 177, j1c.permissions_post_notification_request_rationale, j1c.permissions_post_notification_request_title, j1c.permissions_post_notification_request_positive_button);
            } else {
                eua.getClass();
            }
        }
        return e5f.a;
    }
}
