package defpackage;

import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: ax9  reason: default package */
public final class ax9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ax9(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.Y = notificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ax9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ax9 ax9 = new ax9(continuation, this.Y);
        ax9.X = obj;
        return ax9;
    }

    public final Object o(Object obj) {
        Object obj2;
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean z = wm9 instanceof c64;
        e5f e5f = e5f.a;
        if (z) {
            sv9.c.R1((c64) wm9);
        } else if (wm9 instanceof uw9) {
            String str = o37.a;
            Context context = this.Y.getContext();
            try {
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                context.startActivity(intent);
                obj2 = e5f;
            } catch (Throwable th) {
                obj2 = new njc(th);
            }
            Throwable a = pjc.a(obj2);
            if (a != null) {
                hm9.p(o37.a, "openNotificationsSettings: failed", a);
            }
        }
        return e5f;
    }
}
