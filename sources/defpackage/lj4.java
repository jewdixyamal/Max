package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;

/* renamed from: lj4  reason: default package */
public final class lj4 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ DialogNotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lj4(Continuation continuation, DialogNotificationsSettingsScreen dialogNotificationsSettingsScreen) {
        super(2, continuation);
        this.Y = dialogNotificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((lj4) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        lj4 lj4 = new lj4(continuation, this.Y);
        lj4.X = obj;
        return lj4;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.c.E((List) this.X);
        return e5f.a;
    }
}
