package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import one.me.android.join.JoinChatWidget;

/* renamed from: d97  reason: default package */
public final class d97 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ JoinChatWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d97(JoinChatWidget joinChatWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = joinChatWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((d97) n((j97) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        d97 d97 = new d97(this.Y, continuation);
        d97.X = obj;
        return d97;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        j97 j97 = (j97) this.X;
        bc7[] bc7Arr = JoinChatWidget.x0;
        JoinChatWidget joinChatWidget = this.Y;
        if (joinChatWidget.requireActivity() instanceof nmc) {
            joinChatWidget.getRouter().C();
            i97 i97 = i97.c;
            long longValue = ((Number) j97.a).longValue();
            f64 P1 = i97.P1();
            y7g y7g = new y7g(13);
            y7g.b = ":chats";
            y7g.D(Long.valueOf(longValue), "id");
            y7g.D("local", "type");
            P1.c(y7g.r(), (Bundle) null);
        } else {
            int i = MainActivity.a1;
            hx9.t(joinChatWidget.requireActivity(), gy2.Z1(gy2.c, ((Number) j97.a).longValue(), "local", (Long) null, (Long) null, (List) null, (String) null, (Boolean) null, false, 508), (uia) null, (q12) null, 12);
        }
        joinChatWidget.s0(false);
        return e5f.a;
    }
}
