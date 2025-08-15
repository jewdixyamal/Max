package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;

/* renamed from: iza  reason: default package */
public final class iza extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerMembersListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iza(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = pickerMembersListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((iza) n((List) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        iza iza = new iza(this.Y, continuation);
        iza.X = obj;
        return iza;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        this.Y.Y.E((List) this.X);
        return e5f.a;
    }
}
