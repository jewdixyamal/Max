package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* renamed from: gh2  reason: default package */
public final class gh2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gh2(Continuation continuation, ChatMediaTabWidget chatMediaTabWidget) {
        super(2, continuation);
        this.Y = chatMediaTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((gh2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gh2 gh2 = new gh2(continuation, this.Y);
        gh2.X = obj;
        return gh2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ch2 ch2 = (ch2) this.X;
        bc7[] bc7Arr = ChatMediaTabWidget.w0;
        ChatMediaTabWidget chatMediaTabWidget = this.Y;
        chatMediaTabWidget.getClass();
        bc7 bc7 = ChatMediaTabWidget.w0[0];
        cla cla = (cla) chatMediaTabWidget.X.getValue();
        cla.setTitle(ch2.b);
        cla.setAvatar(ch2.a);
        return e5f.a;
    }
}
