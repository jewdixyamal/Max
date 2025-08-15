package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: zw9  reason: default package */
public final class zw9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zw9(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.Y = notificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zw9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zw9 zw9 = new zw9(continuation, this.Y);
        zw9.X = obj;
        return zw9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.X.E((List) this.X);
        return e5f.a;
    }
}
