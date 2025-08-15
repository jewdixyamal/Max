package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsTabWidget;

/* renamed from: oya  reason: default package */
public final class oya extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsTabWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oya(PickerChatsTabWidget pickerChatsTabWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerChatsTabWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((oya) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        oya oya = new oya(this.Y, continuation);
        oya.X = obj;
        return oya;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        List list = (List) this.X;
        PickerChatsTabWidget pickerChatsTabWidget = this.Y;
        pickerChatsTabWidget.u0.g(list);
        pickerChatsTabWidget.w0.M(list);
        return e5f.a;
    }
}
