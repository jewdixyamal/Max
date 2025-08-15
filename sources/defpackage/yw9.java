package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.NotificationsSettingsScreen;

/* renamed from: yw9  reason: default package */
public final class yw9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ NotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yw9(Continuation continuation, NotificationsSettingsScreen notificationsSettingsScreen) {
        super(2, continuation);
        this.Y = notificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yw9) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yw9 yw9 = new yw9(continuation, this.Y);
        yw9.X = obj;
        return yw9;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.Z.E((List) this.X);
        return e5f.a;
    }
}
