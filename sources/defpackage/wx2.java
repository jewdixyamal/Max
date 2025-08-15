package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* renamed from: wx2  reason: default package */
public final class wx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((wx2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wx2 wx2 = new wx2(continuation, this.Y);
        wx2.X = obj;
        return wx2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof c64) {
            tr3.c.R1((c64) wm9);
        } else if (wm9 instanceof fyd) {
            bc7[] bc7Arr = ChatsListWidget.M0;
            fyd fyd = (fyd) wm9;
            ((rg1) this.Y.J0.getValue()).l(fyd.b, fyd.c, new by2(wm9, 0));
        } else {
            boolean z = wm9 instanceof wla;
        }
        return e5f.a;
    }
}
