package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsTabWidget;

/* renamed from: qya  reason: default package */
public final class qya extends ffe implements a66 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ PickerChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qya(PickerChatsTabWidget pickerChatsTabWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        e5f e5f = e5f.a;
        ((qya) n(bool, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qya qya = new qya(this.Y, continuation);
        qya.X = ((Boolean) obj).booleanValue();
        return qya;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        boolean z = this.X;
        int i = 0;
        PickerChatsTabWidget pickerChatsTabWidget = this.Y;
        if (z) {
            bc7[] bc7Arr = PickerChatsTabWidget.y0;
            if (pickerChatsTabWidget.n0().getCurrentItem() != 0) {
                pickerChatsTabWidget.n0().e(0, false);
            }
        }
        bc7[] bc7Arr2 = PickerChatsTabWidget.y0;
        pickerChatsTabWidget.n0().setUserInputEnabled(!z);
        c2f.a(pickerChatsTabWidget.m0(), pickerChatsTabWidget.x0);
        wja m0 = pickerChatsTabWidget.m0();
        if (!(!z)) {
            i = 8;
        }
        m0.setVisibility(i);
        return e5f.a;
    }
}
