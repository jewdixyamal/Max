package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.members.PickerMembersListWidget;

/* renamed from: kza  reason: default package */
public final class kza extends ffe implements a66 {
    public final /* synthetic */ PickerMembersListWidget X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kza(PickerMembersListWidget pickerMembersListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = pickerMembersListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kza) n((Set) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kza(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        bc7[] bc7Arr = PickerMembersListWidget.x0;
        this.X.p0().Y();
        return e5f.a;
    }
}
