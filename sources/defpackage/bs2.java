package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: bs2  reason: default package */
public final class bs2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatTitleIconScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bs2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.Y = chatTitleIconScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bs2) n((cs2) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bs2 bs2 = new bs2(continuation, this.Y);
        bs2.X = obj;
        return bs2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        if (tpa.f((cs2) this.X, cs2.a)) {
            bc7[] bc7Arr = ChatTitleIconScreen.z0;
            ChatTitleIconScreen chatTitleIconScreen = this.Y;
            chatTitleIconScreen.p0().setProgressEnabled(false);
            wha wha = new wha((Widget) chatTitleIconScreen);
            wha.g(new eqe(aja.b));
            wha.i();
        }
        return e5f.a;
    }
}
