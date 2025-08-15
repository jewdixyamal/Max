package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;

/* renamed from: hm2  reason: default package */
public final class hm2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatNotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hm2(Continuation continuation, ChatNotificationsSettingsScreen chatNotificationsSettingsScreen) {
        super(2, continuation);
        this.Y = chatNotificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((hm2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hm2 hm2 = new hm2(continuation, this.Y);
        hm2.X = obj;
        return hm2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.c.E((List) this.X);
        return e5f.a;
    }
}
