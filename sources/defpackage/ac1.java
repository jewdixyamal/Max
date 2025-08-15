package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* renamed from: ac1  reason: default package */
public final class ac1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallJoinLinkPreviewWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ac1(Continuation continuation, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        super(2, continuation);
        this.Y = callJoinLinkPreviewWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ac1) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ac1 ac1 = new ac1(continuation, this.Y);
        ac1.X = obj;
        return ac1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof ea1) {
            bc7[] bc7Arr = CallJoinLinkPreviewWidget.B0;
            CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.Y;
            ((rg1) callJoinLinkPreviewWidget.c.getValue()).j(((ea1) wm9).b, true, false, true, new cc1(wm9, 0, callJoinLinkPreviewWidget));
        }
        return e5f.a;
    }
}
