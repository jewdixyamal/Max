package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: tn2  reason: default package */
public final class tn2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tn2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tn2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tn2 tn2 = new tn2(continuation, this.Y);
        tn2.X = obj;
        return tn2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        kpa kpa = (kpa) this.X;
        ls2 ls2 = (ls2) kpa.a;
        tzc tzc = (tzc) kpa.b;
        bc7[] bc7Arr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        if (tpa.f(chatScreen.N0().getRightActions(), nka.a) || !tpa.f(chatScreen.N0().getRightActions(), ls2.g)) {
            chatScreen.N0().setRightActions(ls2.g);
        }
        chatScreen.N0().setTitle(ls2.b);
        ChatScreen.w0(chatScreen, chatScreen.N0(), ls2.d);
        cla N0 = chatScreen.N0();
        jqe jqe = ls2.c;
        N0.setSubtitle(jqe != null ? jqe.b(chatScreen.getContext()) : null);
        chatScreen.N0().setAvatar(new tka(ls2.e, ls2.f, ls2.a, ls2.h, 8));
        boolean z = tzc instanceof qzc;
        cha cha = cha.o;
        cha cha2 = cha.c;
        if (z) {
            if (chatScreen.K0().getState() == cha2 || chatScreen.K0().getState() == cha) {
                chatScreen.K0().b();
            }
        } else if (tzc instanceof rzc) {
            if (!(chatScreen.K0().getState() == cha2 || chatScreen.K0().getState() == cha)) {
                chatScreen.N0().f(false);
                eha K0 = chatScreen.K0();
                K0.setExpandWithAnimation(((rzc) tzc).a);
                K0.c(true);
            }
        } else if (!(tzc instanceof pzc)) {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
