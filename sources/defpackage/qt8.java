package defpackage;

import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* renamed from: qt8  reason: default package */
public final /* synthetic */ class qt8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ qt8(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    public final Object invoke() {
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7Arr = MessageContextMenuBottomSheet.Z0;
                messageContextMenuBottomSheet.getClass();
                bc7[] bc7Arr2 = MessageContextMenuBottomSheet.Z0;
                bc7 bc7 = bc7Arr2[9];
                fs fsVar = messageContextMenuBottomSheet.K0;
                if (!((Boolean) fsVar.a(messageContextMenuBottomSheet)).booleanValue()) {
                    bc7 bc72 = bc7Arr2[9];
                    fsVar.b(messageContextMenuBottomSheet, Boolean.TRUE);
                    uu3 targetController = messageContextMenuBottomSheet.getTargetController();
                    xt3 xt3 = targetController instanceof xt3 ? (xt3) targetController : null;
                    if (xt3 != null) {
                        xt3.onDismiss();
                    }
                }
                return e5f.a;
            case 1:
                bc7[] bc7Arr3 = MessageContextMenuBottomSheet.Z0;
                bc7[] bc7Arr4 = MessageContextMenuBottomSheet.Z0;
                bc7 bc73 = bc7Arr4[6];
                long longValue = ((Number) messageContextMenuBottomSheet.H0.a(messageContextMenuBottomSheet)).longValue();
                bc7 bc74 = bc7Arr4[7];
                long longValue2 = ((Number) messageContextMenuBottomSheet.I0.a(messageContextMenuBottomSheet)).longValue();
                bc7 bc75 = bc7Arr4[8];
                return new jq8(longValue, longValue2, ((Number) messageContextMenuBottomSheet.J0.a(messageContextMenuBottomSheet)).longValue());
            default:
                bc7[] bc7Arr5 = MessageContextMenuBottomSheet.Z0;
                return Boolean.valueOf(messageContextMenuBottomSheet.E0().w());
        }
    }
}
