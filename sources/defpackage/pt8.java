package defpackage;

import android.view.View;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: pt8  reason: default package */
public final /* synthetic */ class pt8 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ pt8(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    public final Object invoke(Object obj) {
        e5f e5f = e5f.a;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                bc7[] bc7Arr = MessageContextMenuBottomSheet.Z0;
                messageContextMenuBottomSheet.s0(true);
                return e5f;
            case 1:
                bc7[] bc7Arr2 = MessageContextMenuBottomSheet.Z0;
                messageContextMenuBottomSheet.A0(((tt3) obj).a);
                return e5f;
            default:
                bc7[] bc7Arr3 = MessageContextMenuBottomSheet.Z0;
                messageContextMenuBottomSheet.A0(((tt3) obj).a);
                return e5f;
        }
    }
}
