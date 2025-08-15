package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;

/* renamed from: gna  reason: default package */
public final class gna extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ OtherNotificationsSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gna(Continuation continuation, OtherNotificationsSettingsScreen otherNotificationsSettingsScreen) {
        super(2, continuation);
        this.Y = otherNotificationsSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((gna) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gna gna = new gna(continuation, this.Y);
        gna.X = obj;
        return gna;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.c.E((List) this.X);
        return e5f.a;
    }
}
