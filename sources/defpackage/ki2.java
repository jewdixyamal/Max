package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: ki2  reason: default package */
public final class ki2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ki2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ki2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ki2 ki2 = new ki2(continuation, this.Y);
        ki2.X = obj;
        return ki2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        cj2 cj2 = (cj2) this.X;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        int j = chatMediaViewerScreen.D0.j();
        List list = cj2.a;
        ri2 ri2 = new ri2(chatMediaViewerScreen, j, cj2);
        rg2 rg2 = chatMediaViewerScreen.D0;
        rg2.getClass();
        rg2.y0.b(list, new yh0(1, ri2));
        return e5f.a;
    }
}
