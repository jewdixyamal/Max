package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;

/* renamed from: kya  reason: default package */
public final class kya extends ffe implements a66 {
    public final /* synthetic */ PickerChatsListWidget X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kya(Continuation continuation, PickerChatsListWidget pickerChatsListWidget) {
        super(2, continuation);
        this.X = pickerChatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kya) n((Set) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kya(continuation, this.X);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = PickerChatsListWidget.C0;
        this.X.p0().Y();
        return e5f.a;
    }
}
