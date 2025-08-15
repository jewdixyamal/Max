package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: ho2  reason: default package */
public final class ho2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ho2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ho2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ho2 ho2 = new ho2(continuation, this.Y);
        ho2.X = obj;
        return ho2;
    }

    public final Object o(Object obj) {
        MessageWriteWidget G0;
        View view;
        od2.a0(obj);
        f39 f39 = (f39) this.X;
        boolean z = f39 instanceof e39;
        ChatScreen chatScreen = this.Y;
        if (z) {
            bc7[] bc7Arr = ChatScreen.k1;
            Long w = chatScreen.F0().w();
            e39 e39 = (e39) f39;
            long j = e39.a;
            if (!(w == null || w.longValue() != j || (G0 = chatScreen.G0()) == null || (view = G0.getView()) == null)) {
                view.requestFocus();
            }
            chatScreen.F0().D(new Long(e39.a));
        } else if (f39 instanceof d39) {
            bc7[] bc7Arr2 = ChatScreen.k1;
            xz8 F0 = chatScreen.F0();
            Long l = new Long(((d39) f39).a);
            MessageWriteWidget G02 = chatScreen.G0();
            Integer num = null;
            CharSequence text = G02 != null ? G02.q0().getText() : null;
            MessageWriteWidget G03 = chatScreen.G0();
            if (G03 != null) {
                num = new Integer(G03.q0().getCursorPosition());
            }
            xz8.C(F0, l, text, num, 8);
        } else if (f39 instanceof b39) {
            bc7[] bc7Arr3 = ChatScreen.k1;
            if (chatScreen.K0().getState() == cha.c || chatScreen.K0().getState() == cha.o) {
                chatScreen.K0().b();
            }
        } else if (f39 instanceof c39) {
            bc7[] bc7Arr4 = ChatScreen.k1;
            rq2 P0 = chatScreen.P0();
            String str = ((c39) f39).a;
            Long w2 = chatScreen.F0().w();
            zy8 v = chatScreen.F0().v();
            e52 e52 = (e52) P0.Y0.a.getValue();
            if (e52 != null) {
                P0.Q0.o1(P0, rq2.f1[5], j47.S(P0.a, ((w9a) P0.u()).b(), vx3.b, new vp2(str, e52, P0, w2, v, (Continuation) null)));
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
