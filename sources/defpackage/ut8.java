package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: ut8  reason: default package */
public final class ut8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageContextMenuBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ut8(Continuation continuation, MessageContextMenuBottomSheet messageContextMenuBottomSheet) {
        super(2, continuation);
        this.Y = messageContextMenuBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ut8) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ut8 ut8 = new ut8(continuation, this.Y);
        ut8.X = obj;
        return ut8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        bc7[] bc7Arr = MessageContextMenuBottomSheet.Z0;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.Y;
        messageContextMenuBottomSheet.getClass();
        if (wm9 instanceof c64) {
            messageContextMenuBottomSheet.s0(true);
            kr0 kr0 = new kr0((uu3) messageContextMenuBottomSheet, (k56) new rt8(messageContextMenuBottomSheet, wm9));
            if (messageContextMenuBottomSheet.getRouter() != null) {
                messageContextMenuBottomSheet.getRouter().a(kr0);
            } else {
                messageContextMenuBottomSheet.addLifecycleListener(new o9(messageContextMenuBottomSheet, kr0, 7));
            }
        }
        return e5f.a;
    }
}
