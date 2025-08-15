package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fx9  reason: default package */
public final class fx9 extends ffe implements a66 {
    public final /* synthetic */ gx9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fx9(gx9 gx9, Continuation continuation) {
        super(2, continuation);
        this.X = gx9;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((fx9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fx9(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = gx9.C0;
        gx9 gx9 = this.X;
        jp jpVar = (jp) gx9.q();
        jpVar.l("app.notification.dontDisturbUntil", 0L);
        jpVar.j("app.notification.show.text", true);
        jpVar.m("app.notification.ringtone", (String) null);
        jpVar.j("app.notification.vibrate", true);
        jpVar.k(jpVar.v(), "app.notification.led.color");
        jpVar.k(0, "app.notification.dialogs.show");
        jpVar.j.e(0);
        jpVar.m("app.notification.dialogs.ringtone", (String) null);
        jpVar.j("app.notification.dialogs.vibrate", true);
        jpVar.k(jpVar.v(), "app.notification.dialogs.led.color");
        jpVar.s(0);
        jpVar.m("app.notification.chats.ringtone", (String) null);
        jpVar.j("app.notification.chats.vibrate", true);
        jpVar.k(jpVar.v(), "app.notification.chats.led.color");
        jpVar.m("app.group.chat.call.notification.status", "ON");
        jpVar.j("app.notification.in.app.sound", true);
        jpVar.j("app.notification.in.app.vibrate", true);
        jpVar.j("app.notification.show.new.users", true);
        jpVar.j("app.notification.show.drafts", true);
        pk pkVar = (pk) gx9.o.getValue();
        pkVar.getClass();
        ((k4a) pkVar).t((gaf) null, true);
        q0e q0e = gx9.x0;
        q0e.m((Object) null, new Integer(((Number) q0e.getValue()).intValue() + 1));
        return e5f.a;
    }
}
