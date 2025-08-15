package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* renamed from: io2  reason: default package */
public final class io2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public io2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((io2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        io2 io2 = new io2(continuation, this.Y);
        io2.X = obj;
        return io2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        kz8 kz8 = (kz8) this.X;
        bc7[] bc7Arr = ChatScreen.k1;
        ChatScreen chatScreen = this.Y;
        chatScreen.getClass();
        if (kz8 instanceof gz8) {
            chatScreen.P0().s();
            rq2 P0 = chatScreen.P0();
            cz5 cz5 = ((gz8) kz8).a;
            e52 e52 = (e52) P0.Y0.a.getValue();
            if (e52 != null) {
                pnf.n(P0, ((w9a) P0.u()).b(), (vx3) null, new lp2(e52.a, P0, cz5, (Continuation) null), 2);
            }
        } else if (kz8 instanceof hz8) {
            rq2 P02 = chatScreen.P0();
            Uri uri = ((hz8) kz8).a;
            Long w = chatScreen.F0().w();
            P02.C(j47.S(P02.a, ((w9a) P02.u()).b(), vx3.b, new yp2(P02, uri, w, (Continuation) null)));
        } else if (kz8 instanceof iz8) {
            ((iz8) kz8).getClass();
            chatScreen.S0(true);
        } else if (tpa.f(kz8, jz8.a)) {
            chatScreen.T0();
        } else if (kz8 instanceof fz8) {
            rq2 P03 = chatScreen.P0();
            CharSequence charSequence = ((fz8) kz8).a;
            Long u = chatScreen.F0().u();
            bc7[] bc7Arr2 = rq2.f1;
            P03.t(charSequence, u, (List) null, false);
            xz8.C(chatScreen.F0(), (Long) null, (CharSequence) null, (Integer) null, 14);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return e5f.a;
    }
}
