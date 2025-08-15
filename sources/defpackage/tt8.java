package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: tt8  reason: default package */
public final class tt8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageContextMenuBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tt8(Continuation continuation, MessageContextMenuBottomSheet messageContextMenuBottomSheet) {
        super(2, continuation);
        this.Y = messageContextMenuBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tt8) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tt8 tt8 = new tt8(continuation, this.Y);
        tt8.X = obj;
        return tt8;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7Arr = MessageContextMenuBottomSheet.Z0;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.Y;
        Bundle bundle = messageContextMenuBottomSheet.getArgs().getBundle("actions");
        List f = bundle != null ? ay7.f(bundle) : null;
        if (f == null) {
            f = nz4.a;
        }
        messageContextMenuBottomSheet.W0.E(x53.t0(Collections.singletonList(new ut3(f)), list));
        return e5f.a;
    }
}
