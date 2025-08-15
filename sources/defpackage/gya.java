package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget;

/* renamed from: gya  reason: default package */
public final /* synthetic */ class gya extends p66 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gya(PickerChatsListWidget pickerChatsListWidget, int i) {
        super(1, j47.class, "isChatItem", "checkBoxItemDecoration_delegate$lambda$10$isChatItem(Lone/me/chats/picker/chats/PickerChatsListWidget;I)Z", 0);
        this.a = i;
        switch (i) {
            case 1:
                this.b = pickerChatsListWidget;
                super(1, j47.class, "isChatItem", "checkBoxItemDecoration_delegate$lambda$10$isChatItem(Lone/me/chats/picker/chats/PickerChatsListWidget;I)Z", 0);
                return;
            default:
                this.b = pickerChatsListWidget;
                return;
        }
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(PickerChatsListWidget.m0(this.b, ((Number) obj).intValue()));
            default:
                return Boolean.valueOf(PickerChatsListWidget.m0(this.b, ((Number) obj).intValue()));
        }
    }
}
