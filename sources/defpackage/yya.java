package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* renamed from: yya  reason: default package */
public final class yya extends ffe implements a66 {
    public final /* synthetic */ PickerContactsListWidget X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yya(PickerContactsListWidget pickerContactsListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerContactsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yya) n((Set) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yya(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = PickerContactsListWidget.y0;
        PickerContactsListWidget pickerContactsListWidget = this.X;
        kp.x(pickerContactsListWidget.o0(), new xya(pickerContactsListWidget.o0(), 0));
        return e5f.a;
    }
}
