package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget;

/* renamed from: hya  reason: default package */
public final class hya implements mxa {
    public final /* synthetic */ PickerChatsListWidget a;

    public hya(PickerChatsListWidget pickerChatsListWidget) {
        this.a = pickerChatsListWidget;
    }

    public final boolean r(long j, fza fza) {
        bc7[] bc7Arr = PickerChatsListWidget.C0;
        PickerChatsListWidget pickerChatsListWidget = this.a;
        pickerChatsListWidget.getClass();
        bc7 bc7 = PickerChatsListWidget.C0[2];
        if (((Boolean) pickerChatsListWidget.X.a(pickerChatsListWidget)).booleanValue()) {
            return false;
        }
        m56 m56 = pickerChatsListWidget.Y;
        if (m56 != null) {
            m56.invoke(Boolean.TRUE);
        }
        pickerChatsListWidget.o0().q(j, fza);
        return true;
    }

    public final void z(long j, fza fza) {
        bc7[] bc7Arr = PickerChatsListWidget.C0;
        this.a.o0().q(j, fza);
    }
}
