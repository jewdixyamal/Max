package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: qn2  reason: default package */
public final class qn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((qn2) n((p35) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qn2 qn2 = new qn2(continuation, this.Y);
        qn2.X = obj;
        return qn2;
    }

    public final Object o(Object obj) {
        hc8 hc8;
        od2.a0(obj);
        bc7[] bc7Arr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        int s = au1.s(((uy8) ((p35) this.X).a).a);
        if (s != 0) {
            x29 x29 = x29.a;
            if (s == 1) {
                e52 e52 = (e52) chatScreen.P0().Y0.a.getValue();
                if (e52 != null) {
                    bc7[] bc7Arr2 = ChatScreen.k1;
                    bc7 bc7 = bc7Arr2[14];
                    q7c q7c = chatScreen.T0;
                    if (!((znc) q7c.T0(chatScreen, bc7)).n()) {
                        MediaKeyboardWidget mediaKeyboardWidget = new MediaKeyboardWidget(chatScreen.L0, e52.a, false, 4, (z84) null);
                        mediaKeyboardWidget.o = chatScreen.Z0;
                        ((znc) q7c.T0(chatScreen, bc7Arr2[14])).R(i24.e(mediaKeyboardWidget, (zu3) null, (zu3) null));
                    }
                    int i = vc7.a;
                    if (vc7.b(vc7.c)) {
                        pnf.o(chatScreen.H0().s0, x29);
                    }
                    if (chatScreen.Q0()) {
                        zmf.l(chatScreen.z0(), (q42) null);
                        zmf.l((w12) chatScreen.M0.T0(chatScreen, bc7Arr2[7]), (q42) null);
                        omf.u(chatScreen.z0(), (y2a) null);
                    }
                    chatScreen.M0().a();
                    hc8 hc82 = chatScreen.U0;
                    if (hc82 != null) {
                        hc82.f();
                    }
                }
            } else if (s == 2) {
                hc8 hc83 = chatScreen.U0;
                if (hc83 != null && hc83.l) {
                    pnf.o(chatScreen.H0().s0, x29);
                }
                MessageWriteWidget G0 = chatScreen.G0();
                if (G0 != null) {
                    G0.q0().e(true);
                }
                i24.s(new zn5(od2.Z(new xk1(vc7.f, 15), 1), new wn2((Continuation) null, chatScreen), 5), chatScreen.getViewLifecycleScope());
            } else if (s == 3 && (hc8 = chatScreen.U0) != null && hc8.l) {
                pnf.o(chatScreen.H0().s0, x29);
            }
        } else {
            hc8 hc84 = chatScreen.U0;
            if (hc84 != null) {
                bc7[] bc7Arr3 = hc8.m;
                hc84.e(true);
            }
        }
        return e5f.a;
    }
}
