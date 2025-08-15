package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* renamed from: iya  reason: default package */
public final class iya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iya(Continuation continuation, PickerChatsListWidget pickerChatsListWidget) {
        super(2, continuation);
        this.Y = pickerChatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((iya) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        iya iya = new iya(continuation, this.Y);
        iya.X = obj;
        return iya;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        PickerChatsListWidget pickerChatsListWidget = this.Y;
        boolean n0 = PickerChatsListWidget.n0(pickerChatsListWidget);
        pickerChatsListWidget.x0.E((List) this.X);
        if (pickerChatsListWidget.getView() != null) {
            pickerChatsListWidget.p0().setRefreshingNext(n0);
        }
        return e5f.a;
    }
}
