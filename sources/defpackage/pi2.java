package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: pi2  reason: default package */
public final class pi2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pi2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((pi2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        pi2 pi2 = new pi2(continuation, this.Y);
        pi2.X = obj;
        return pi2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        mv3 mv3 = (mv3) this.X;
        bc7[] bc7Arr = ChatMediaViewerScreen.K0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        chatMediaViewerScreen.getClass();
        if (tpa.f(mv3, iv3.a)) {
            if (chatMediaViewerScreen.G0 >= 0.0f) {
                chatMediaViewerScreen.B0().g(chatMediaViewerScreen.G0);
                chatMediaViewerScreen.G0 = -1.0f;
                chatMediaViewerScreen.A0().b(false);
            } else {
                chatMediaViewerScreen.G0 = chatMediaViewerScreen.B0().e();
                chatMediaViewerScreen.B0().g(0.0f);
                chatMediaViewerScreen.A0().b(true);
            }
        } else if (tpa.f(mv3, kv3.a)) {
            chatMediaViewerScreen.H0 = true;
        } else if (mv3 instanceof lv3) {
            chatMediaViewerScreen.H0 = false;
            chatMediaViewerScreen.B0().J0((long) ((lv3) mv3).a);
        } else if (mv3 instanceof jv3) {
            ck2 D0 = chatMediaViewerScreen.D0();
            int i = ((jv3) mv3).a;
            vxd S = j47.S(D0.a, ((w9a) D0.t0).b(), vx3.b, new jj2(D0, i, (Continuation) null));
            D0.c1.o1(D0, ck2.d1[3], S);
        } else if (tpa.f(mv3, hv3.a)) {
            chatMediaViewerScreen.D0().E(k8a.c);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
