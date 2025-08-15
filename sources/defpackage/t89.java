package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.settings.MessagesSettingsScreen;

/* renamed from: t89  reason: default package */
public final class t89 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesSettingsScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t89(Continuation continuation, MessagesSettingsScreen messagesSettingsScreen) {
        super(2, continuation);
        this.Y = messagesSettingsScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((t89) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        t89 t89 = new t89(continuation, this.Y);
        t89.X = obj;
        return t89;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof c64) {
            s89.c.R1((c64) wm9);
        }
        return e5f.a;
    }
}
